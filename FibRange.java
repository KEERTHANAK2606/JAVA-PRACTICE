import java.util.*;
public class FibRange {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int first=0;
        int second=1;
        int start=s.nextInt();
        int end=s.nextInt();
        while(first<=end){
            if(first>=start){
                System.out.print(first+" ");
            }
            int temp=first+second;
            first=second;
            second=temp;
        }
    }
}
