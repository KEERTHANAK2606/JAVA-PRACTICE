import java.util.*;
public class ArmStrong{
        static boolean isArmStrong(int n){
           int ori=n;
           int sum=0;
           while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;;
            n=n/10;
           }
           return sum==ori;
        }
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            System.out.print(isArmStrong(n));
        }
    }
