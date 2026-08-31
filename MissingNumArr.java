import java.util.*;
public class MissingNumArr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int expectedSum=n*(n+1)/2;
        int arr[]=new int[n-1];
        int actualSum=0;
        for(int i=0;i<n-1;i++){
            arr[i]=s.nextInt();
            actualSum=actualSum+arr[i];
        }
        int missingNumber=expectedSum-actualSum;
        System.out.print(missingNumber);
    }
}
