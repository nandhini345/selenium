package SeleniumBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException {

		String filename = "C:\\Selenium_Frameworks\\NewMaven\\src\\test\\java\\SeleniumBasics\\Sample.txt";

		FileWriter writer = new FileWriter(filename);
		BufferedWriter bufferedwriter = new BufferedWriter(writer);
		bufferedwriter.write("HI HEMA KUMAR ");
		bufferedwriter.write("this is my writing file hi dheeraj and nandhini");
		bufferedwriter.close();

	}

}
