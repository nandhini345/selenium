package SeleniumBasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {

		String FileName = "C:\\Selenium_Frameworks\\NewMaven\\src\\test\\java\\SeleniumBasics\\Sample.txt";
		String line = null;
		FileReader reader = new FileReader(FileName);
		BufferedReader bufferedreader = new BufferedReader(reader);

		try {
			while ((line = bufferedreader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedreader.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}