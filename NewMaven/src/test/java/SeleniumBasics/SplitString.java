package SeleniumBasics;

public class SplitString {

	public static void main(String[] args) {

//		String strColumns = "FirstName#LastName#Age#Email#Salary#Department";
//		String[] arrColumns = strColumns.split("#");
//		for (int i = 0; i < 6; i++) {
//			System.out.println("the coulmns are" + arrColumns[i]);
//		}

		String str = "SHOPPING-CART SUMMARY" + "\n" + "Your shopping cart contains: 1 Product";

		String str1 = str.replace("\n", "");

		System.out.println(str + "\n" + str1);

//		String str = "@nandhini@hemakumar.";
//		String str2;
//		int pos1, pos2;
//		pos1 = str.indexOf('@');
//		pos2 = str.lastIndexOf('@');
//		str2 = str.substring(pos2);
//		System.out.println("the value" + str2);
//		System.out.println("the value" + pos1 + pos2);
//		str2 = str.substring(pos1 + 1);
//		System.out.println("the value \t" + str2);
//		str2 = str.substring(pos1 + 1, pos2 - 2);
//		System.out.println("the value \t" + str2);

	}

}
