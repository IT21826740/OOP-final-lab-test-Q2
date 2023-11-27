import java.util.Scanner;

public class TestString {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String input = scanner.nextLine();

      String reversed = StringObjectives.reverseString(input);
      int vowelCount = StringObjectives.countVowels(input);

      System.out.println("Reverse String: " + reversed);
      System.out.println("Number of vowels: " + vowelCount);
  }
}
