package copy4.designsmell;



public class Copier {
	
	public static void copy() throws Exception {		
		
		InterfaceReader reader = new Keyboard();
//		InterfaceReader reader = new Scanner(); 
		InterfaceWriter writer = new Database();
//		InterfaceWriter writer = new Printer();
		
		String inputValue = "";		
		while (!(inputValue = reader.read()).equals("-1")) {
			writer.write(inputValue);
		}	
	}
}