
// printing the months 


public class One_D_Arrays{
    public static void main(String []args){
        
        // String[] month=new String[12];  // Declaration and Creation
        // month[1]="january";            //  Initialization
        
        String[] month= {"january","february","march","april","may","june","july","august","September","october","november","december"}; // Declartion, creation and initialization
        
        for(int i=0;i<month.length;i++)
        System.out.println(month[i]);  // retrieving the values of an arrays 
        
        
        // Using for-each loop
        
        for(String name:month)  // here name variable takes all the values of month array index by index
            System.out.println(name);
    }
}
