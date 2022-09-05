class Shape{
    public void area(){
        System.out.println("DISPLAYS AREA");
    }
}

class Traingle extends Shape{
    public void area(int l,int h){
        System.out.println("Area="+(l*h)/2);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area="+(3.14)*r*r);
    }
}

public class HeirarchialInheritance{
    public static void main(String[]args){
        Traingle t1=new Traingle();
        t1.area();
        t1.area(2,5);
        
        Circle c1=new Circle();
        c1.area();
        c1.area(2);
    }
}
