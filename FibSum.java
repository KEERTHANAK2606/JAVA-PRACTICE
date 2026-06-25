import java.util.*;
public class FibSum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+first;
            int temp=first+second;
            first=second;
            second=temp;
        }
        System.out.print(sum);
    }
}
