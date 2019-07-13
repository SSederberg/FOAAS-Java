/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2016 Spencer Sederberg
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.spencersederberg.jfoaas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class HTTPClient {

    private FutureTask<String> result;

    private final URL url;

    private final ResponseType responseType;

    public HTTPClient(String url, ResponseType responseType) throws MalformedURLException {
         this.url = new URL(url);
         this.responseType = responseType;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public URL getUrl() {
        return url;
    }


    public Future<String> makeGet() {
        try {
            result = new FutureTask<>(() -> {
                StringBuilder result = new StringBuilder();

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Make a get request
                connection.setRequestMethod("GET");
                // Set the user agent and the Accept value
                connection.addRequestProperty("User-Agent", "Mozilla/5.0");
                connection.addRequestProperty("Accept", responseType.getAcceptKey());
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String l;
                while ((l = reader.readLine()) != null) {
                    result.append(l).append('\n');
                }
                return result.toString();
            });
            result.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public String getResponse() {
        try {
            return makeGet().get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
