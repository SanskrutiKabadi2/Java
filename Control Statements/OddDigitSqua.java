import java.util.*;
class  OddDigSquare{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        System.out.println("Odd digit square : ");
        while(N!=0){
                int rem=N%10;
                if(rem%2!=0){
                     System.out.println(rem*rem);
                }
                N=N/10;
        }


        }
}
