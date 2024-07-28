package pack1;

public class ReverseString {

	public static void main(String[] args) {
		String str = new String("Hi I'm Pankaj");
		String reversed = "";//null

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Reverse of Hi I'm Pankaj : " + reversed);
	}

}

/*
 * int i = str.length() - 1 initializes the loop variable i to the index of
 * the last character in the string.
 * i >= 0 ensures the loop runs until the
 * first character of the string.
 * i-- decrements the loop variable to move from the end to the beginning of the string.
 * 
 * Inside the loop, reversed += str.charAt(i) appends(add) the character at index i of str to 
 * the reversed string.
 */

/*public class ReverseString {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }
     public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
*/