import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        int original=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.print("Palindrome number");
        }
        else{
            System.out.print("Not a palindrome number");
        }
    }
}
