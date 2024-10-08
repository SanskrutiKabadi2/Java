import java.util.*;
class OddMul{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int oddMul=1;
        while(N!=0){
                int rem=N%10;
                if(rem%2!=0){
                        oddMul= oddMul*rem;
                }

                N=N/10;
        }
         System.out.println("Odd Number Multiplication :"+ oddMul);

        }
}
