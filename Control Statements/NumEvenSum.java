import java.util.*;
class EvenSum{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int evenSum=0;
        while(N!=0){
                int rem=N%10;
                if(rem%2==0){
                        evenSum= evenSum+rem;
                }

                N=N/10;
        }
         System.out.println("Even Number Sum :"+ evenSum);

        }
}
