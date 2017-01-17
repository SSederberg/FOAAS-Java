# JFOAAS
A Java API for Fuck Off As A Service (FOAAS) - http://foaas.com/ - [Link to Github Repo](https://github.com/tomdionysus/foaas)

**Please note that this API tends to lag behind on updates. Feel free to submit a pull request to fix my lazyness*

## Getting Started

Download JFOAAS from the [releases](https://github.com/SSederberg/FOAAS-Java/releases) tab and add JFOAAS as an external library to your project.

**JFOAAS currently is not hosted on any Gradle, Maven, or other software hosting repositories**

JFOAAS is designed to be simple enough for even beginning Java programmers, the example provided below is what a JFOAAS method should look like, and the multiple ways you could take to get the same conclusion.

**Be aware that different operations within JFOAAS might need multiple parameters, failing to currently fulfill them will result in JFOAAS throwing an Exception**

## Contributing
JFOAAS is simple to contribute to, a majority of new FOAAS operations can be added by modifying [Fuck.java](https://github.com/SSederberg/FOAAS-Java/blob/master/src/me/spencersederberg/jfoaas/Fuck.java), and adding the correct parameters, which a majority of the time, already have a String value dedicated for another operation.

## Support
Please feel free to open a issue if your are having trouble, I am willing to help anyone with any issue that relates to JFOAAS.

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
		JFOAAS j = new JFOAAS("From", "Name"); // Does the same as .withName() and .withFom()
		
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
