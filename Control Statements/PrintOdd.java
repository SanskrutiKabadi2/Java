import java.util.*;
class PrintOdd{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number:");
                N=sc.nextInt();
                int i=1;
                System.out.println("Odd Number  between "+1+" to "+N+":");
                while(i<=N){
                        if(i%2!=0){
                                System.out.println(i);
                        }

                        i++;
                 }


        }
}
