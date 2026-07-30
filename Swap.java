import java.util.*;
public class Swap{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i=s.nextInt();
        int j=s.nextInt();
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
