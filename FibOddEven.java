import java.util.*;
public class FibOddEven {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        int evenSum=0;
        int oddSum=0;
        for(int i=1;i<=n;i++){
            if(first%2==0){
                evenSum=evenSum+first;
            }
            else{
                oddSum=oddSum+first;
            }
        int temp=first+second;
        first=second;
        second=temp;
        }
    System.out.println("Even Count is "+ evenSum);
    System.out.println("Odd count is "+ oddSum);
    }
}
