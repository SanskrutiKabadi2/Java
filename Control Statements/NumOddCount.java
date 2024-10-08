import java.util.*;
class NumOddCount{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int oddCount=0;
        while(N!=0){
                int rem=N%10;
                if(rem%2!=0){
                        oddCount++;
                }

                N=N/10;
        }
         System.out.println("Odd Number Count :"+ oddCount);

        }
}
