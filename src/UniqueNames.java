import java.awt.Component;
import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	private ArrayList<String> names = new ArrayList<String>();

	public void run() {
		askNames();
		writeNames();
	}

	private void askNames() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals(""))
				break;
			if (names.contains(name) == false) {
				names.add(name);
			}
		}
	}

	// prints all the names in the array
	private void writeNames() {
		println("Unique name list contains:");
		for (int i = 0; i < names.size(); i++) {
			println(names.get(i));
		}
	}

}
