import java.util.*;
class OddsCount{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to find odd no count :");
        N=sc.nextInt();
        int oddCount=0;
	int i=1;
        while(i<=N){
        	if(i%2!=0){
	        	oddCount++;
		}
                
               i++;
        }
         System.out.println("Odd Number count between"+1+" to "+N+":"+oddCount);

        }
}
