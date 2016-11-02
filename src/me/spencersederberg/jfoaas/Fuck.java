/**
*The MIT License (MIT)
*
*Copyright (c) 2016 Spencer Sederberg
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

package me.spencersederberg.jfoaas;

public enum Fuck {

	VERSION("/version"),
	OPERATIONS("/operations"),
	ANYWAY("/anyway/:company/:from"),
	AWESOME("/awesome/:from"),
	BACK("/back/:name/:from"),
	BAG("/bag/:from"),
	BALLMER("/ballmer/:name/:company/:from"),
	BDAY("/bday/:name/:from"),
	BECAUSE("/because/:from"),
	BLACKADDER("/blackadder/:name/:from"),
	BM("/bm/:name/:from"),
	BUCKET("/bucket/:from"),
	BUS("/bus/:name/:from"),
	BYE("/bye/:from"),
	CANIUSE("/caniuse/:tool/:from"),
	CHAINSAW("/chainsaw/:name/:from"),
	COCKSPLAT("/cocksplat/:name/:from"),
	COOL("/cool/:from"),
	DALTON("/dalton/:name/:from"),
	DERAADT("/deraadt/:name/:from"),
	DIABETES("/diabetes/:from"),
	DONUT("/donut/:name/:from"),
	DOSOMETHING("/dosomething/:do/:something/:from"),
	EVERYONE("/everyone/:from"),
	EVERYTHING("/everything/:from"),
	FAMILY("/family/:from"),
	FASCINATING("/fascinating/:from"),
	FIELD("/field/:name/:from/:reference"),
	FLYING("/flying/:from"),
	GFY("/gfy/:name/:from"),
	GIVE("/give/:from"),
	GREED("/greed/:noun/:from"),
	HORSE("/horse/:from"),
	ING("/ing/:name/:from"),
	KEEP("/keep/:name/:from"),
	KEEPCALM("/keepcalm/:reaction/:from"),
	KING("/king/:name/:from"),
	LIFE("/life/:from"),
	LINUS("/linus/:name/:from"),
	LOOK("/look/:name/:from"),
	LOOKING("/looking/:from"),
	MADISON("/madison/:name/:from"),
	MAYBE("/maybe/:from"),
	ME("/me/:from"),
	MORNIN("/mornin/:from"),
	NO("/no/:from"),
	NUGGET("/nugget/:name/:from"),
	OFF("/off/:name/:from"),
	OFFWITH("/off-with/:behavior/:from"),
	OUTSIDE("/outside/:name/:from"),
	PARTICULAR("/particular/:thing/:from"),
	PINK("/pink/:from"),
	PROBLEM("/problem/:name/:from"),
	PULP("/pulp/:language/:from"),
	RETARD("/retard/:from"),
	RIDICULOUS("/ridiculous/:from"),
	RTFM("/rtfm/:from"),
	SAKE("/sake/:from"),
	SHAKESPEARE("/shakespeare/:name/:from"),
	SHIT("/shit/:from"),
	SHUTUP("/shutup/:name/:from"),
	SINGLE("/single/:from"),
	THANKS("/thanks/:from"),
	THAT("/that/:from"),
	THINK("/think/:name/:from"),
	THINKING("/thinking/:name/:from"),
	THIS("/this/:from"),
	THUMBS("/thumbs/:name/:from"),
	TOO("/too/:from"),
	TUCKER("/tucker/:from"),
	WHAT("/what/:from"),
	XMAS("/xmas/:name/:from"),
	YODA("/yoda/:name/:from"),
	YOU("/you/:name/:from"),
	ZAYN("/zayn/:from"),
	ZERO("/zero/:from");
	

	/**
	 * The URL path representation
	 */
	private String path;

	Fuck(String path) {
		this.path = path;
	}


	public String getPath() {
		return path;
	}


}
