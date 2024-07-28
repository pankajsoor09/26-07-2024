package pack1;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		System.out.println("s1 : " + s1);
		
		System.out.println();

		String s2 = new String("hello");
		System.out.println("s2 : " + s2);

		System.out.println();

		char ch = s1.charAt(2);
		System.out.println("character at 2nd index in s1 : " + ch);

		System.out.println();

		int i = s1.compareTo(s2);
		System.out.println("s1 compare to s2 : " + i);

		System.out.println();

		i = s1.compareToIgnoreCase(s2);
		System.out.println("s1 compareToIgonore to s2 : " + i);

		System.out.println();

		i = s1.compareTo("Hi");
		System.out.println("s1 compareTo Hi : " + i);

		System.out.println();

		boolean status = s1.equals(s2);
		System.out.println("s1 equal to s2 : " + status);

		System.out.println();

		status = s1.equalsIgnoreCase(s2);
		System.out.println("s1 equalToIgnore case to s2 : " + status);

		System.out.println();

		String s3 = new String("Hello");
		System.out.println("s3 : " + s3);

		System.out.println();

		status = s1.equals(s3);
		System.out.println("s1 equals s3 : " + status);

		System.out.println();

		status = s1 == s3;
		System.out.println("s1 == s3 : " + status);

		System.out.println();

		String s4 = "Hello";
		status = s1.equals(s4);
		System.out.println("s1 equals s4 : " + status);

		System.out.println();

		status = s1 == s4;
		System.out.println("s1 == s4 : " + status);

		System.out.println();

		String s5 = "Hello";
		status = s5.equals(s4);
		System.out.println("s5 equals s4 : " + status);

		System.out.println();

		status = s5 == s4;
		System.out.println("s5 == s4 : " + status);

		System.out.println();

		s4 = s4.concat("Hi");
		System.out.println("s4 concat(Hi) : " + s4);

		System.out.println();

		s4 = s4 + "WELCOME";
		System.out.println("s4 + WELCOME : " + s4);

		System.out.println();

		String s = s4.substring(7);
		System.out.println("s4 substring(7) : " + s);

		System.out.println();

		s = s4.substring(5, 7);
		System.out.println("s4 substring(5,7) : " + s);

		System.out.println();

		s = s4.substring(0, 5);
		System.out.println("s4 substring(0,5) : " + s);

		System.out.println();

		s = s4.toLowerCase();
		System.out.println("s4 toLowerCase() : " + s);

		System.out.println();

		s = s4.toUpperCase();
		System.out.println("s4 toUpperCase() : " + s);

	}

}
