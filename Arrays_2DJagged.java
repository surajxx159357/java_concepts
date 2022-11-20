public class Arrays2DJagged{
    public static void main(String[]args){
        
        int[][] a,b;  // here this is declaration of 2D array where we have created 2 variables for 2D Arrays
       
        // Jagged Arrays ( Number of rows and coulumns are not equals)
        
        b=new int[2][];
        
        b[0]=new int[2];
        b[1]=new int[3];
        b[0][0]=10;
        b[0][1]=20;
        b[1][0]=30;
        b[1][1]=40;
        b[1][2]=50;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
