public class Arrays2D{
    public static void main(String[]args){
        
        int[][] a,b;  // here this is declaration of 2D array where we have created 2 variables for 2D Arrays
        a=new int[2][3];
        // b=new int[4][];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                
            System.out.print(a[i][j]+"\t");
        }
        System.out.println();
        }
    }
}
