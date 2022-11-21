public class Bubblesort{
    public static void main(String[]args){
        
        int[] a={30,40,10,20,5};
        
        int temp;
        
        for(int i=0;i<a.length;i++){   // first loop is used for making rounds for interchanging the places of elements
             for(int j=0;j<a.length-1;j++){ // second loop is used for interchanging neighbouring elements with each other , here minus one length is used to satisfy the condition a[j]>a[j+1]
                 if(a[j]>a[j+1]){
                     temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
        }
        for(int i=0;i<a.length;i++){ // this for loop is used to retrieve the elements of an array
            System.out.print(a[i]+" ");
        }
    }
}
