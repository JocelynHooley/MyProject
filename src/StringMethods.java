
public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "London is Capital of United Kingdom";
		String s2 = "London";
		String s3 = "london";
		int 	x = 5;
		String s4 = String.valueOf(x);
				
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.indexOf("o",2));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.replace('a', 'x'));
		System.out.println(s1.startsWith("London"));
		System.out.println("Ends with m: " + s1.endsWith("m"));
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s4);
		
		
	}

}
