import java.util.*;
class Prime{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        N=sc.nextInt();
        int i=1;
        int count=0;
        while(i<=N){
                if(N%i==0){
                       count++;
                }
                i++;
        }

        if(count==2){
                 System.out.println(N+" is prime");
        }
        else{

         System.out.println(N+" is  not prime");}
        }


}
