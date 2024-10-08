import java.util.*;
class Factorial{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you want to find factorial:");
        N=sc.nextInt();
        int i=1;
        int fac=1;
        while(i<=N){
                fac=fac*i;
                i++;
        }
         System.out.println("Factorial of "+N+" :"+fac);

        }


}
