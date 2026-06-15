import java.util.*;
public class EvenOdd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0){
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }
}
