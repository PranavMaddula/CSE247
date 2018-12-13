package sandbox;

public class Lab8StringHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s = "lolwut";
		String s = "0123";
		System.out.println(hashCode(s));
		// System.out.println(s.charAt(1));

		//System.out.println(Integer.MAX_VALUE);

	}

	public static int hashCode(String s) {
		int h = 0;
		for (int i = 0; i < s.length(); i++) {
			h = h * 128 + s.charAt(i);
			
			System.out.println(s.charAt(i)+ " " + h);
		}
		return h;
	}

	
	
	
	
	
	
	
	
}
