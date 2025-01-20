import java.util.Scanner;

public class CheckPalindrome{
   public  boolean isPalindrome(String str){
      boolean isPalindrome = false;
      int left=0;
      int right =str.length()-1;
      while(left<right){
          if(str.charAt(left)!=str.charAt(right)){
              isPalindrome=false;
          }
          left++;
          right--;
      }
      return isPalindrome;
   }
}

class UseIsPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String str = sc.next();
        CheckPalindrome cp = new CheckPalindrome();

        if(cp.isPalindrome(str)){
            System.out.println("Text is Palindrome!");
        }else{
            System.out.println("Text is Not Palindrome!");
        }
    }
}