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

import java.net.MalformedURLException;

public class JFOAAS {

    private Fuck fuck = Fuck.OFF;
    private Output output = Output.STRING;
	private String url = "http://www.foaas.com";
	private String name, from, reference = "", tool = "", company = "",
			noun = "", language = "", thing = "", reaction = "", 
			behavior = "", _do = "", something = "";
	private ResponseType responseType = ResponseType.PLAIN_TEXT;

    public JFOAAS() {
        this("", "");
    }

    public JFOAAS(String from) {
        this(from, "");
    }

    /**
     * @param from - Name of who is giving the fucks
     * @param name - Name of who is receiving the fucks
     */
    public JFOAAS(String from, String name) {
        this.name = name;
        this.from = from;
    }


    /**
     * Sets the type of fucking off.
     *
     * @param fuck - The type of fuck off.
     * @return The instance of this class
     */
    public JFOAAS withFuck(Fuck fuck) {
        this.fuck = fuck;
        return this;
    }

    /**
     * Now defined in the constructor, since at "name" is commonly used, the user should have to define it. You may
     * still use this method if you wish.
     *
     * Sets the name of the poor person that is being told to fuck off.
     * @param name - To whom the fucks are given.
     * @return The instance of this class
     *
     */
    public JFOAAS withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Now defined in the constructor, since at least "from" is needed for all operations, the user should
     * have to define these. You may still use this method if you wish
     *
     * Sets the name of the person that sending the fuck off.
     * @param from - Who gave the fucks
     * @return The instance of this class
     */
    public JFOAAS withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Used solely for Fuck.CAN_I_USE
     * @param tool - the tool you are asking to use
     * @return The instance of this class
     */
    public JFOAAS withTool(String tool) {
        this.tool = tool;
        return this;
    }


    /**
     * Used solely for Fuck.FIELD
     * @param reference - the reference the quote is from
     * @return The instance of this class
     */
    public JFOAAS withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * @param responseType - the type of response you want to return when making the request
     * @return The instance of this class
     */
    public JFOAAS withResponseType(ResponseType responseType) {
         this.responseType = responseType;
         return this;
    }

    /**
     * Used solely for Fuck.BALLMER and Fuck.ANYWAY
     * @param company - The company you will kill
     * @return The instance of this class
     */
    public JFOAAS withCompany(String company) {
        this.company = company;
        return this;
    }
    
    /**
     * Used solely for Fuck.GREED
     * @param noun - A fucking noun
     * @return The instance of this class
     */
    public JFOAAS withNoun(String noun) {
    	this.noun = noun;
    	return this;
    }
    
    /**
     * Used solely for Fuck.PULP
     * @param language - The kind of language you want.
     * @return The instance of this class
     */
    public JFOAAS withLanguage(String language) {
    	this.language = language;
		return this;
    }
    
    /**
     * Used solely for Fuck.THING
     * @param thing - The thing you fucking hate, like cancer and
     * pineapples, fuck them!
     * @return The instance of this class
     */
    public JFOAAS withThing(String thing) {
    	this.thing = thing;
    	return this;
    }
    
    public JFOAAS withReaction(String reaction) {
    	this.reaction = reaction;
    	return this;
    }
    
    /**
     * Used solely for FUCK.OFF_WITH
     * @param behavior - The behavior being told to fuck off.
     * @return The instance of this class
     */
    public JFOAAS withBehavior(String behavior) {
    	this.behavior = behavior;
    	return this;
    }
    
    /**
     * Used solely for FUCK.DOSOMETHING
     * @param _do - The kind of action that you want to perform.
     * @param something - The thing that your action is performed on.
     * @return The instance of this class
     */
    public JFOAAS withDosomething(String _do, String something) {
    	this._do = _do;
    	this.something = something;
    	return this;
    }

    /**
     * Determines what kind of output you want.
     * @param output - The kind of output.
     * @return The instance of this class.
     */
    @Deprecated
    public JFOAAS withOutput(Output output) {
        this.output = output;
        return this;
    }

    /**
     * Builds the URL string
     *
     * @return The String that represents the FOAAS link.
     */
    private String buildString() {
        return fuck.getPath().replace(":name", name)
                .replace(":from", from)
                .replace(":company", company)
                .replace(":reference", reference)
                .replace(":tool", tool)
                .replace(":language", language)
                .replace(":noun", noun)
                .replace(":thing", thing)
                .replace(":reaction", reaction)
        	.replace(":behavior", behavior)
        	.replace(":do", _do)
        	.replace(":something", something);
    }


    /**
     * @return The request from the website
     */
    public String build() {
        try {
            return new HTTPClient(url(), responseType).getResponse();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * @return a UTF-8 encoded URL string
     */
    public String url() {
        return url + buildString();
    }


}
