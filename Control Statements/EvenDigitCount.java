import java.util.*;
class  EvenDigCount{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number  :");
        N=sc.nextInt();
        int count=0;
        while(N!=0){
                int rem=N%10;
		if(rem%2==0){
                	count++;
		}
                N=N/10;
        }
         System.out.println(" Even Digit Count :"+ count);

        }
}
