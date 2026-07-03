import java.util.*;
public class MissingNumber{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<n-1;i++){
            int num=s.nextInt();
            actualSum=actualSum+num;
        }
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);
    }
}
