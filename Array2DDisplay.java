import java.util.*;
public class Array2DDisplay{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        int cols=s.nextInt();
        int[][]arr=new int[rows][cols];
        System.out.print("Enter the number of elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
