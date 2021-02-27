package SeleniumBasics;

import java.util.Hashtable;

public class InputData {

	Hashtable<String, String> contacts;

	public InputData() {
		contacts = new Hashtable<String, String>();
	}

	public boolean hasName(String name) {
		return contacts.containsKey(name);
	}

	public boolean hasEmailAddress(String emailAddress) {
		return contacts.containsValue(emailAddress);
	}

	public String findEmailAddress(String name) {
		String emailAddress = contacts.get(name);
		if (emailAddress != null) {
			System.out.println("[" + name + "]: [" + emailAddress + "]");
			return emailAddress;
		} else {
			System.out.println("Contact for [" + name + "] not found");
			return null;
		}
	}

	public int addContact(String name, String emailAddress) {
		if (hasEmailAddress(emailAddress)) {
			System.out.println("Cannot add [" + name + "] Email address [" + emailAddress + "] existed");
			return 0;
		} else if (hasName(name)) {
			System.out.println("Name [" + name + "] existed");
			return 0;
		} else {
			contacts.put(name, emailAddress);
			System.out.println("A new contact for [" + name + "] added");
			return 1;
		}
	}

	public int deleteContact(String name) {
		if (hasName(name)) {
			contacts.remove(name);
			System.out.println("Contact for [" + name + "] removed");
			return 1;
		} else {
			System.out.println("Contact for [" + name + "] not found");
			return 0;
		}
	}

	public void listAllContacts() {
		System.out.printf("> Current contact list\n");
		System.out.printf("%-10s|%-20s\n", "Name", "Email Address");
		for (String name : contacts.keySet()) {
			String emailAddress = contacts.get(name);
			System.out.printf("%-10s|%-20s\n", name, emailAddress);
		}
	}

}
