package pratical_program;

public class Revers {

	public static void main(String[] args)
	{
		String str1 = "Welcome into new company";
        String str2 = "";

        // Reverse the string using charAt()
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }

        System.out.println("Reversed string: " + str2);

        if (str1.equals(str2)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");

	}
	}}
