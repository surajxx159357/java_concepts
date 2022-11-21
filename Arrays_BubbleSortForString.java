public class Bubblesort{
    public static void main(String[]args){
        
        String[] names={"suraj","ajay","ram","durga"};
        
        String temp;
        
        for(int i=0;i<names.length;i++){
             for(int j=0;j<names.length-1-i;j++){
                 if(names[j].compareTo(names[j+1])>0){  // here we have used .compareTo method which convert characters of String into unicodes and then compare it with each other according to that it arranges all the string/words
                     temp=names[j];
                     names[j]=names[j+1];
                     names[j+1]=temp;
                 }
             }
        }
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
    }
}
