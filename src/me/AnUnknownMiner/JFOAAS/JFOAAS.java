/**
*The MIT License (MIT)
*
*Copyright (c) 2015 Spencer Sederberg
*
*Permission is hereby granted, free of charge, to any person obtaining a copy
*of this software and associated documentation files (the "Software"), to deal
*in the Software without restriction, including without limitation the rights
*to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*copies of the Software, and to permit persons to whom the Software is
*furnished to do so, subject to the following conditions:
*
*The above copyright notice and this permission notice shall be included in all
*copies or substantial portions of the Software.
*
*THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*SOFTWARE.
*/

package me.AnUnknownMiner.JFOAAS;

public class JFOAAS {

	private Fuck fuck = Fuck.OFF;
	private Output output = Output.STRING;
	private String url = "www.foaas.com/";
	private String name, from;
	
	
	/**
	 * Sets the type of fucking off.
	 * 
	 * @param type - The type of fuck off.
	 * @return
	 */
	
	public JFOAAS withFuck(Fuck fuck) {
		
		this.fuck = fuck;
		return this;
	}
	
	/**
	 * Sets the name of the poor person that is being told to fuck off.
	 * @param name - the name of the victim.
	 * @return
	 */
	
	public JFOAAS withName(String name) {
		
		this.name = name;
		return this;
	}
	
	/**
	 * Sets the name of the person that sending the fuck off.
	 * @param from
	 * @return
	 */
	
	public JFOAAS withFrom(String from) {
		
		this.from = from;
		return this;
	}
	
	public JFOAAS withOutput(Output output) {
		
		this.output = output;
		return this;
	}
	
	/**
	 * Creates a String representation of a fuck off link or the actual sentence.
	 * 
	 * @return The String that represents the FOAAS link.
	 */
	
	public String build() {
		
		if(this.output == Output.URL) {
			
			switch(fuck) {
			
			case OFF: return url + "off/" + name + "/" + from;
			
			case YOU: return url + "you/" + name + "/" + from;
			
			case THIS: return url + "this/" + from;
			
			case THAT: return url + "that/" + from;
			
			case EVERYTHING: return url + "everything/" + from;
			
			case EVERYONE: return url + "everyone/" + from;
			
			case DONUT: return url + "donut/" + name + "/" + from;
			
			case SHAKESPEARE: return url + "shakespeare/" +  name + "/" + from;
			
			case LINUS: return url + "linus/" + name + "/" + from;
			
			case KING: return url + "king/" + name + "/" + from;
			
			case PINK: return url + "pink/" + from;
			
			case LIFE: return url + "life/" + from;
			
			case CHAINSAW: return url + "chainsaw/" +  name + "/" + from;
			
			case OUTSIDE: return url + "outside/" + name + "/" + from;
			
			case THING: return url + "thing/" + from;
			
			case THANKS: return url + "thanks/" + from;
			
			case FLYING: return url + "flying/" + from;
			
			case FASCINATING: return url + "fascinating/" + from;
			
			case MADISON: return url + "madison/" + from;
			
			case COOL: return url + "cool/" + from;
			
			case NUGGET: return url + "nugget/" + name + "/" + from;
			
			case YODA: return url + "yoda/" + name + "/" + from;
			
			case WHAT: return url + "what/" + from;
			
			case BECAUSE: return url + "because/" + from;
			
			case BYE: return url + "bye/" + from;
			
			case DIABETES: return url + "diabetes/" + from;
			
			case BUS: return url + "bus/" + name + "/" + from;
			
			case XMAS: return url + "xmas/" + name + "/" + from;
			
			case AWESOME: return url + "awesome/" + from;
			
			case TUCKER: return url + "tucker/" + from;
			
			case BUCKET: return url + "bucket/" + from;
			
			default: return null;
			
		   }
	   } else if(this.output == Output.STRING) {
		   
		   switch(fuck) {
		   
		   case OFF: return "Fuck off, " + name + "~ " + from;
		   
		   case YOU: return "Fuck you. ~ " + from;
		   
		   case THIS: return "Fuck this. ~ " + from;
		   
		   case THAT: return "Fuck that. ~ " + from;
		   
		   case EVERYTHING: return "Fuck everything. ~ " + from;
		   
		   case EVERYONE: return "Everyone can go and fuck off ~ " + from;
		   
		   case DONUT: return name + ", go and take a flying fuck at a rolling donut. ~ " + from;
		   
		   case SHAKESPEARE: return name + ", Thou clay-brained guts, thou knotty-pated fool, thou whoreson obscene greasy tallow-catch! ~ " + from;
		   
		   case LINUS: return name + ", there aren't enough swear-words in the English language, "
		   		+ "so now I'll have to call you perkeleen vittup‰‰ just to express my disgust and frustration with this crap. ~ " + from;
		   
		   case KING: return "Oh fuck off, just really fuck off you total dickface. Christ " + name + ", you are fucking thick. ~ " + from;
		   
		   case PINK: return "Well, Fuck me pink. ~ " + from;
		   
		   case LIFE: return "Fuck my life. ~ " + from;
		   
		   case CHAINSAW: return "Fuck me gently with a chainsaw," + name + ". Do I look like Mother Teresa? ~ " + from;
		   
		   case OUTSIDE: return name + ", why don't you go outside and play hide-and-go-fuck-yourself? ~ " + from;
		   
		   case THANKS: return "Fuck you very much. ~ " + from;
		   
		   case FLYING: return "I don't give a flying fuck. ~ " + from;
		   
		   case FASCINATING: return "Fascinating story, in what chapter do you shut the fuck up? ~ " + from;
		   
		   case MADISON: return "What you've just said is one of the most insanely idiotic things I have ever heard," + name 
				   + ". At no point in your rambling, incoherent response were you even close to anything that could be considered a rational thought. Everyone in this room is now dumber for having listened to it. "
				   + "I award you no points :name, and may God have mercy on your soul. ~ " + from;
		   
		   case COOL: return "Cool story, bro. ~ " + from;
		   
		   case NUGGET: return "Well " + name + ", aren't you a shining example of a rancid fuck-nugget. ~ " + from;
		   
		   case YODA: return "Fuck off, you must, " + name + ". ~ " + from;
		   
		   case WHAT: return "What the fuck?! ~ " + from;
		   
		   case BECAUSE: return "Why? Because Fuck you, that's why. ~ " + from;
		   
		   case BYE: return "Fuckity bye! ~ " + from;
		   
		   case DIABETES: return "I'd love to stop and chat to you but I'd rather have type 2 diabetes. ~ " + from;
		   
		   case BUS: return "Christ on a bendy-bus," + name + ", don't be such a fucking faff-arse. ~ " + from;
		   
		   case XMAS: return "Merry Fucking Christmas, " + name + ". ~ " + from;
		   
		   case AWESOME: return "This is Fucking Awesome. ~ " + from;
		   
		   case TUCKER: return "Come the fuck in or fuck the fuck off. ~ " + from;
		   
		   case BUCKET: return "Please choke on a bucket of cocks. ~ " + from;

		   default: return null;
		   }
		   
	   }
		
		return null;
   }
}
