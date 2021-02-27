package SeleniumBasics;

import java.util.ArrayList;
//import java.util.Collection;

public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> mydata = new ArrayList<String>();
		String firtname = "nandhini";
		String lastname = "mardham";
		String address = "13-13";
		String zipcode = "75063";

		String ob[] = { firtname, lastname, address, zipcode };
		for (String i : ob) {
			mydata.add(i);
		}
		System.out.println(mydata);
	}
}