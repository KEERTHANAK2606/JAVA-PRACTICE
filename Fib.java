import java.util.*;
public class Fib{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        while(first<=n){
            System.out.print(first+" ");
            int temp=first+second;
            first=second;
            second=temp;
        }
    }
}
