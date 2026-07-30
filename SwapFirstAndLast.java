import java.util.*;
public class SwapFirstAndLast{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i=0;
        int j=n-1;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        System.out.print(Arrays.toString(arr));
    }
}
/**or
int i=s.nextInt();
int j=s.nextInt();
int temp=arr[0];
arr[0]=arr[n-1];
arr[n-1]=temp;
*/
