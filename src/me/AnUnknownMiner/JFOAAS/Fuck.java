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

package me.AnUnknownMiner.JFOAAS;

public enum Fuck {

	OFF("/off/:name/:from"),
	YOU("/you/:name/:from"),
	THIS("/this/:from"),
	THAT("/that/:from"),
	EVERYTHING("/everything/:from"),
	EVERYONE("/everyone/:from"),
	DONUT("/donut/:name/:from"),
	SHAKESPEARE("/shakespeare/:name/:from"),
	LINUS("/linus/:name/:from"),
	KING("/king/:name/:from"),
	PINK("/pink/:from"),
	LIFE("life/:from"),
	CHAINSAW("/chainsaw/:name/:from"),
	OUTSIDE("/outside/:name/:from"),
	THING("/:thing/:from"),
	THANKS("/thanks/:from"),
	FLYING("/flying/:from"),
	FASCINATING("/fascinating/:from"),
	MADISON("/madison/:name/:from"),
	COOL("/cool/:from"),
	FIELD("/field/:name/:from/:reference"),
	NUGGET("/nugget/:name/:from"),
	YODA("/yoda/:name/:from"),
	WHAT("/what/:from"),
	BECAUSE("/because/:from"),
	BYE("/bye/:from"),
	DIABETES("/diabetes/:from"),
	BUS("/bus/:name/:from"),
	XMAS("/xmas/:name/:from"),
	AWESOME("/awesome/:from"),
	TUCKER("tucker/:from"),
	BUCKET("/bucket/:from"),
	BALLMER("/ballmer/:name/:company/:from"),
	CAN_I_USE("/caniuse/:tool/:from"),
	B_DAY("/bday/:name/:from"),
	KEEP_CALM("/keepcalm/:reaction/:from"),
	MORNIN("/mornin/:from"),
	GREED("/greed/:noun/:from"),
	BM("/bm/:name/:from"),
	GFY("/gfy/:name/:from"),
	ME("/me/:from"),
	BACK("/back/:name/:from"),
	THINK("/think/:name/:from"),
	KEEP("/keep/:name/:from"),
	SINGLE("/single/:from"),
	LOOK("/look/:name/:from"),
	LOOKING("/looking/:from"),
	NO("/no/:from"),
	GIVE("/give/:from"),
	ZERO("/zero/:from"),
	PULP("/pulp/:language/:from"),
	SAKE("/sake/:from"),
	ANYWAY("/anyway/:company/:from"),
	RETARD("/retard/:from");
	

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
