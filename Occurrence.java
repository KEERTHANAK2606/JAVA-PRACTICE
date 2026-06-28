import java.util.*;
public class Occurrence{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long check=s.nextLong();
        long divisor=1;
        int count=0;
        long temp=check;
        if(check==0){
            divisor=10;
        }
        else{//to calculate the divisor
            while(temp>0){
                divisor=divisor*10;
                temp=temp/10;
            }
        }
        while(n>0){//to remove last num of digit 
              long rem=n%divisor;
              if(rem==check){
                count++;
              }
              n=n/10;//slidig window to remove last digit
        }
        System.out.print(count);
    }
}
