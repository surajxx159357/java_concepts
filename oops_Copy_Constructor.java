
// here we have to create Student class 
class Student{
    String name;
    int age;
    
    // here we have created printInfo() method to print the information of student
    
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // here we have created copy constructer in which we have pass one constructor inside another
    
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){
        // this empty constructor is very important to create otherwise it'll show error
    }
}


public class CopyConstructor{
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="suraj";
        s1.age=21;
        
        Student s2=new Student(s1);  // here in this line of code new object s2 will take the same property as object s1 using copy constructor
        s2.printInfo();
    }
}
