# JFOAAS
A Java API for Fuck Off As A Service (FOAAS) - http://foaas.com/ - [Link to Github Repo](https://github.com/tomdionysus/foaas)

**Please note that this API tends to lag behind on updates. Feel free to submit a pull request to fix my lazyness*

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

## Disclaimer

FUCK OFF AS A SERVICE-JAVA WAS MADE IN THE SPIRIT OF SOCIAL CODING AND OPEN SOURCE SOFTWARE DEVELOPMENT, 
IT DOES NOT NECESSARILY REFLECT THE PERSONAL OPINIONS AND VIEWS OF SPENCER SEDERBERG, OR ANY CONTRIBUTERS 
OF THIS PROJECT.
