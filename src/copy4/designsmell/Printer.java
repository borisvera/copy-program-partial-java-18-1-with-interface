package copy4.designsmell;

import common.Util;

public class Printer implements InterfaceWriter{

	public void write(String value) {
		Util.output(" *Printer: " + value);
	}

}