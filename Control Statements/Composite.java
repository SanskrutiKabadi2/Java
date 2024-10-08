import java.util.*;
class  Composite{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number  :");
                N=sc.nextInt();
		int count=0;
                int i=N;
                while(i>0){
			if(N%i==0){
				count++;
			}
			if(count>2){
				break;
			}
                        i--;
                        
                }
                if(count>2){
			 System.out.println(N+" is composite");	
		}
		else{
			System.out.println(N+" is  not composite");
		}
        }
}
