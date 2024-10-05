import java.util.*;
class Operators21{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B;
                boolean Ans1,Ans2;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();

                Ans1=A<B && B<A;
		Ans2=A<B || B<A;
                System.out.println("Ans1 = "+Ans1);
		System.out.println("Ans2 = "+Ans2);

        }

}
