class Shape{
    public void aarea(){
        System.out.println("DISPLAYS AREA");
    }
}

class Traingle extends Shape{
    public void area(int l,int h){
        System.out.println("Area="+(l*h)/2);
    }
}

class EquilateralTraingle extends Traingle{
    public void area(){
        System.out.println("DISPLAYS AREA OF EQUILATERAL TAINGLE");
    }
}

public class HeirarchialInheritance{
    public static void main(String[]args){
        
        EquilateralTraingle c1=new EquilateralTraingle();
        c1.area();
        c1.area(2,5);
        c1.aarea();
    
    //NOTE:- derived class access the property of above derived classes along with parent class
        
    }
}
