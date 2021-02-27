package SeleniumBasics;

public class HashtableTest {

	public static void main(String[] args) {

		InputData book = new InputData();
		book.addContact("viraj", "nandhini@gmail.com");
		book.addContact("hema", "hema@gmail.com");
		book.deleteContact("viraj");
	}

}
