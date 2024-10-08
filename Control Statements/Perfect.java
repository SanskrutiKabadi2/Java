import java.util.*;
class Perfect{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        N=sc.nextInt();
	int temp=N;
        int i=1;
        int sum=0;
        while(i<N){
		if(N%i==0){
                	sum=sum+i;
		}
                i++;
        }
       
	if(N==sum){
		 System.out.println(temp+" is perfect");
	}
	else{
	
	 System.out.println(temp+" is  not perfect");}
        }


}
