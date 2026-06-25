import java.util.*;
public class PosFib{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        int pos=1;
        while(first<n){
            int temp=first+second;
            first=second;
            second=temp;
            pos++;
        }
        if(first==n){
            System.out.print(pos);
        }
        else{
            System.out.print("Not a fibonacci number");
        }
    }
}
