# JFOAAS
A Java API for Fuck Off As A Service (FOAAS) - http://foaas.com/
At the moment, this API is only for giving out links to foaas.com, I will eventually add support for the actual output to a String of what the website does.

**Please note that this API is still in development. Please contribute to help fix this problem faster!**

### TODO

- [ ] Add the rest of FOAAS to the API.
- [ ] Add the ability to get the "fuckin off" as a String, and not a URL.
- [ ] Allow users to decide if they want the link to open in their browser.

## Example for URL

```java
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import me.AnUnknownMiner.JFOAAS.JFOAAS;
import me.AnUnknownMiner.JFOAAS.Type;


public class Main {

	// If you don't throw IOException and URISyntaxException at the
	// method initialization, you'll have to multi-catch.
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		JFOAAS j = new JFOAAS();
		
		// This gets the URI link as a String, NOT the actual sentence you want.
		String fuck = j.withType(Type.OUTSIDE).withName("Name").withFrom("From").build();
		
		System.out.println(fuck);
		
		// This opens your default web browser to that link.
		if(Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(fuck));
	}
}
```
