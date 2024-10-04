import java.util.*;
class Operators15{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B,Ans1,Ans2;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
             
                Ans1=++A+A++;
		Ans2=--B+B--;
		System.out.println("Ans1 = "+Ans1);
		System.out.println("Ans2 = "+Ans2);
		System.out.println("A = "+A);
		System.out.println("B = "+B);

        }

}
