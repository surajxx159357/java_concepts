public class ArraysAnonymous{
    public static void main(String[]args){
        
    //   Anonymous Array is a type of array in java without any name 
    //   It is an array just for creating and using instantly , 
    //   Anonymous Array must declare and intialize in single line
    //   It can be 1D,2D and 3D and it is only for single use 
    
    ArraysAnonymous.sum(new int[]{10,20,30});  // here we create anonymous array and alocate their memory using new keyword 
    }
    
    // NOTE: IN THIS PROGRAM WE HAVE CREATED A METHOD "sum" INSIDE THE CLASS ArraysAnonymous make sure the method should be outside of the main method 
    
     static void sum(int[]num){        // here we have created static method for static context if the given method is not static it'll show errors
        int total=0;
        for(int i:num){
            total=total+i;
          
        }  
        System.out.println(total);
    }
    
    
}
