# JFOAAS
A Java API for Fuck Off As A Service (FOAAS) - http://foaas.com/

**Please note that this API is still in development. Please contribute to help fix this problem faster!**

### TODO

- [x] Add the (supported) rest of FOAAS to the API.
- [ ] Add the rest of FOAAS to the API that isn't supported.
- [x] Allow users to decide if they want the link to open in their browser.

## Example

```java
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import me.AnUnknownMiner.JFOAAS.Fuck;
import me.AnUnknownMiner.JFOAAS.JFOAAS;
import me.AnUnknownMiner.JFOAAS.Output;

public class Example {

	public static void main(String[] args) throws IOException, URISyntaxException {
		JFOAAS j = new JFOAAS("From", "Name");
		
		String fuck = j.withFuck(Fuck.DONUT).build();
		
		System.out.println(fuck + "\n");
		
		// You can directly print without using a String!
		System.out.println(j.withFrom("From11").withName("Name11").withFuck(Fuck.DIABETES).build());
		
		String uri = j.url();
		
		// Opens the default browser to the URI.
		if(Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(uri));
	}
}

```
