import java.util.*;
class  EvenMul{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int EvenMul=1;
        while(N!=0){
                int rem=N%10;
                if(rem%2==0){
                        EvenMul= EvenMul*rem;
                }

                N=N/10;
        }
         System.out.println("Even Number Multiplication :"+ EvenMul);

        }
}
