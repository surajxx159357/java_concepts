public class ExceptionHandling{
    public static void main (String []args){
        
        // Normal case
        
        System.out.println("This is Normal Case");
        System.out.print(1+"\t");
        System.out.print(2+"\t");
        System.out.print(3+"\t");
        System.out.print(4+"\t");
        System.out.print(5+"\t");
        System.out.print(100/2+"\t");
        System.out.print(6+"\t");
        System.out.print(7+"\t");
        System.out.print(8+"\t");
        System.out.print(9+"\t");
        System.out.print(10+"\t");
        System.out.println();
        
        // Exception case
        
        System.out.println("This is Exception Case");
        System.out.print(1+"\t");
        System.out.print(2+"\t");
        System.out.print(3+"\t");
        System.out.print(4+"\t");
        System.out.print(5+"\t");
        System.out.print(100/0+"\t");
        System.out.print(6+"\t");
        System.out.print(7+"\t");
        System.out.print(8+"\t");
        System.out.print(9+"\t");
        System.out.print(10+"\t");
    }
}

