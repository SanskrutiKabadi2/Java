import java.util.*;
class ReverseNum{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you want to reverse :");
        N=sc.nextInt();
        int rev=0;
        while(N!=0){
		int rem=N%10;
                rev=(rev*10)+rem;
                N=N/10;
        }
         System.out.println("Reversed Number:"+rev);

        }
}
