import java.util.Scanner;
import java.util.Stack;

public class StringObjectives {
   public static String reverseString(String input) {
     Stack<Character> stack = new Stack<>();
     for (char c : input.toCharArray()) {
        stack.push(c);
      }
     
     StringBuilder reversed = new StringBuilder();
     while (!stack.isEmpty()) {
          reversed.append(stack.pop());
     }
     
     return reversed.toString();
  }
  
public static int countVowels(String input) {
   int count = 0;
   String lowercaseInput = input.toLowerCase();
  
   for (char c : lowercaseInput.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
         count++;
      }
   }
   return count;
  }
}
