class Shape{
    public void area(){
        System.out.println("DISPLAYS THE AREA");
    }
}

class Traingle extends Shape{
    public void area(int l,int h){
        System.out.println("Area="+(l*h)/2);
    }
}

public class SingleInheritance{
    public static void main(String []args){
        Traingle t1=new Traingle();
        t1.area();
        t1.area(2,5);
    }
}
