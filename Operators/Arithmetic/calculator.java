import java.util.*;
class Operators10{
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                int A,B;
		char Operator;

                System.out.println("enter first number :");
                A=Sc.nextInt();
                System.out.println("enter second number :");
                B=Sc.nextInt();
	        System.out.println("enter the operation +,-,*,/,% :");
                Operator=Sc.next().charAt(0);
		if(Operator=='+'){
			 System.out.println("A+B = "+(A+B));	
		}
		else if(Operator=='-'){
			 System.out.println("A-B = "+(A-B));
		}
		else if(Operator=='*'){
                       System.out.println("A*B = "+(A*B));
                }
		else if(Operator=='/'){
                       System.out.println("A/B = "+(A/B));
                }
		else{
			 System.out.println("A%B = "+(A%B));
		}

        }

}
