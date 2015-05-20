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

	private String url = "www.foaas.com/";
	private Type type = Type.OFF;
	private String name, from;
	
	
	/**
	 * Sets the type of fucking off.
	 * 
	 * @param type - The type of fuck off.
	 * @return
	 */
	
	public JFOAAS withType(Type type) {
		
		this.type = type;
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
	
	/**
	 * Creates a String representation of a fuck off link.
	 * 
	 * @return The String that represents the FOAAS link.
	 */
	
	public String build() {
		
		switch(type) {
		
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
			
			default: return null;
		}
	}
	
	
}
