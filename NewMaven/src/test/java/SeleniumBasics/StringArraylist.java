package SeleniumBasics;

import java.util.ArrayList;

public class StringArraylist {

	public static void main(String[] args) {

		String[] dresstypes = new String[] { "nan", "ban", "nan", "ban", "can", "ran" };

		ArrayList<String> storingvaluestothearry = new ArrayList<String>();

		for (int j = 0; j < dresstypes.length; j++) {

			if (!(storingvaluestothearry.contains(dresstypes[j]))) {
				storingvaluestothearry.add(dresstypes[j]);
				System.out.println("the values that have been added are" + storingvaluestothearry);
			}
		}

	}

}
