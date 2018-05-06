package copy4.designsmell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import common.Util;

public class Keyboard implements InterfaceReader {

	public String read() throws IOException {
		Util.outputInLine("Keyboard - Enter String:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}

}