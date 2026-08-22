import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    int age;
    String address;
    Student(int id,String name,int age,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        
    }
}
public class Main{
    
	public static void main(String[] args) throws IOException{
	    Student s=new Student(1,"Sanskruti",23,"Pune");
	    FileOutputStream f=new FileOutputStream("StudentInfo.txt");
	    ObjectOutputStream o=new ObjectOutputStream(f);
	    o.writeObject(s);
	
	}
}
