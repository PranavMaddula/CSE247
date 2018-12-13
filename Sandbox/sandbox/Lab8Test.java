package sandbox;

public class Lab8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = Integer.MAX_VALUE / 8;
//		int max = 1000;
//		for (int i = 0; i <= x; i++) {
//			int tmp = toIndex(i);
//			if (tmp < max) {
//				max = tmp;
//			}
//
//		}
//		System.out.println(max);

		String[] testStrings = { "abcdefg", "bcdefgh", "cdefghix", "defghij", "efghijkxx", "fghijkl", "ghijklm",
				"hijklmnxxx", "ijklmno", "jklmnop", "klmnopqxxxx", "mnopqrs", "nopqrst", "opqrstuxxxxx", "pqrstuv",
				"qrstuvwxxxxxx" };

//		for (int i = 0; i < testStrings.length; i++) {
//			String str = testStrings[i];
//			int hash = stringToHashCode(str);
//			int index = toIndex(hash);
//			System.out.println(index);
//		}

		String str = "bcdefgh";
		int hash = stringToHashCode(str);
		int index = toIndex(hash);
		System.out.println(index);
		System.out.println(index);

	}

	private static int toIndex(int hashcode) {
		// Fill in your own hash function here

		double a = .8980502334058976;
		int m = 4;

		double key = (hashcode * a) % 1.0;
		System.out.println(key);
		int index = (int) (key * m);
		System.out.println(index);

		return index ;
	}

	static int stringToHashCode(String key) {
		int A = 1952786893;

		int v = A;
		for (int j = 0; j < key.length(); j++) {
			char c = key.charAt(j);
			v = A * (v + (int) c + j) >> 16;
		}

		return v;
	}
}
