package copy4.designsmell;

import common.Util;

public class Database implements InterfaceWriter {

	public void write(String value) {
		Util.output(" *Database: " + value);
	}



}