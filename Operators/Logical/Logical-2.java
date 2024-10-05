import java.util.*;
class Operators19{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B;
                boolean Ans;
                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
                 Ans=A>B && B<A;  
                System.out.println("Ans = "+Ans);

        }

}
