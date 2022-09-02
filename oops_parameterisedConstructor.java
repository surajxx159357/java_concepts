
    
    // we have to create class for Student
    class Student{
        String name;
        int age;
        
        // here we have create printInfo()
        // after public there wouldn't be static keyword , otherwise it'll show error 
        
        public void printInfo(){
            System.out.println("Name:"+this.name);
            System.out.println("Age:"+this.age);
        }
        
        // Here we have created constructor 
        
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
    
    // main method
    public class ParameterisedConstructor{
        
    public static void main(String[]args){
        Student s1=new Student("suraj", 21);
        s1.printInfo();
    }
}
