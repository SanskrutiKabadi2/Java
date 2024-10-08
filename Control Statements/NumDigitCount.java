import java.util.*;
class  DigitCount{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int count=0;
        while(N!=0){
                int rem=N%10;
          	count++;

                N=N/10;
        }
         System.out.println("Digit Count :"+ count);

        }
}
