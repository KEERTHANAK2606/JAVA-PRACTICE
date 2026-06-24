import java.util.*;
public class NthFibbo{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0;
        int second=1;
        if(n==1){
            System.out.println(first);
        }
        else if(n==2){
            System.out.println(second);
        }
        else{
            for(int i=3;i<=n;i++){
                int temp=first+second;
                first=second;
                second=temp;
            }
            System.out.print(second);
        }
    }
}
