package SeleniumBasics;

public class twoDimensionalArray {

	public static void main(String[] args) {

		String[][] result = function2DArray();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(result[i][j]);
			}
		}

		System.out.println("the array values are" + result[1][1]);

	}

	public static String[][] function2DArray() {
		String[][] data = { { "nandhu", "nandhini123" }, { "viraj", "viraj123" } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(data[i][j]);
			}
		}

		return data;

	}

}
