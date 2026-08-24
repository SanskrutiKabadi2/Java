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
    
	public static void main(String[] args) throws IOException , ClassNotFoundException{
	    FileInputStream f=new FileInputStream("StudentInfo.txt");
	    ObjectInputStream o=new ObjectInputStream(f);
	    Student s1=(Student)o.readObject();
	    System.out.println("id : "+s1.id);
	    System.out.println("name : "+s1.name);
	    System.out.println("age : "+s1.age);
	    System.out.println("address : "+s1.address);
	    
	    o.close();
        f.close();
	
	}
}
