// class Animal{
//     public void walk(){
        
//     }
// }

// here class Animal has no use because it is only blueprint of animal we are making other animals using blueprint 
// and each animal have that walk() method inside it
// so we have to rename that class as "abstract"
// and we can't use the below class for making object it'll show error /Abstract.java:: error: Animal is abstract; cannot be instantiated


abstract class Animal{
    public void walk(){
        
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on four Legs");
    }
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("Walks on two Legs");
    }
}

public class Abstract{
    public static void main(String[]args){
        Horse horse=new Horse();
        horse.walk();
        // Animal animal=new Animal();   // Abstract.java:: error: Animal is abstract; cannot be instantiated
        // animal.walk();
    }
}




// Note:- by creating     ----> Animal animal object it'll not show errors during compilation time but it'll show error during run time 




// Abstraction is achieved in two ways
// 1)Abstraction class
// 2)Interfaces(pure Abstraction)

// Properties of Abstraction
// 1)Abstraction Class

// i)   Abstraction class must be declared with abstract keyword
// ii)  It can have abstract or non-abstract method
// iii) It can be Instantiated
// iv)  It can have contructors and static methods also
// v)   It can have final method which will force subclass not to change the body of the method
        
      
