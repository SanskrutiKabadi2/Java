import java.util.*;
class Operators17{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B,Ans;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
                Ans=++A+B+++A++;
                System.out.println("Ans = "+Ans);
                System.out.println("A = "+A);
                System.out.println("B = "+B);

        }

}
