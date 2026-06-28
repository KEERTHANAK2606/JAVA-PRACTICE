import java.util.*;
public class RepNum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int check=s.nextInt();
        int count=0;
        if(n==0){
            if(check==0){
                System.out.print(1);
            }
            else{
            System.out.print(0);
            }
            return;
        }
        while(n>0){
            int rem=n%10;
            if(rem==check){
                count++;
            }
            n=n/10;
        }
        System.out.print(count);
    }
}
