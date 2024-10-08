import java.util.*;
class  Strong{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number  :");
                N=sc.nextInt();
		int temp=N;
                int sum=0;
                
                while(N!=0){
                      int rem=N%10;
		      int x=rem;
		      int fac=1;
		      for(int i=x;i>0;i--){
		      	fac=fac*i;
		      }  
                      sum=sum+fac;
		      N=N/10;

                }
                if(sum==temp){
                         System.out.println(temp+" is Strong number");
		}
		else{
			System.out.println(temp+" is  not Strong number");
		}



        }
}
