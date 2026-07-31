import java.util.*;
public class SecLar{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int max1=0;
    int max2=0;
    if(arr[0]>arr[1]){
        max1=arr[0];
        max2=arr[1];
    }
    else{
        max1=arr[1];
        max2=arr[0];
    }
    for(int i=2;i<arr.length;i++){
        if(arr[i]>max1){
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i]>max2&&arr[i]!=max1){
            max2=arr[i];
        }
    }
    System.out.print(max2);
}
}
