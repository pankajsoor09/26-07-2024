package pack1;

public class Assignment {

	public static void main(String[] args) {

		String str = new String("Nayan");
		String reversed = new String();
		System.out.println("Length of str : " + str.length());
		System.out.println("str toUpperCase : " + str.toUpperCase());
		System.out.println("str toLowerCase : " + str.toLowerCase());

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		System.out.println("Reverse of str : " + reversed);

		if (str.compareToIgnoreCase(reversed) == 0) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
		System.out.println("---------------------------------");

		String str1 = "madam";
		String reversed1 = "";

		System.out.println("Length of str : " + str1.length());
		System.out.println("str toUpperCase : " + str1.toUpperCase());
		System.out.println("str toLowerCase : " + str1.toLowerCase());

		for (int i = str1.length() - 1; i >= 0; i--) {
			reversed1 += str1.charAt(i);
		}
		System.out.println("Reverse of str : " + reversed1);

		if (str1.toLowerCase().equals(reversed1.toLowerCase())) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
	}

}
