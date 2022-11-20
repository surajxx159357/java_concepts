public class Arrays3D{
    public static void main(String[]args){
        
        int[][][] a,b;  // here this is declaration of 2D array where we have created 2 variables for 2D Arrays
       
        // Jagged Arrays ( Number of rows and coulumns are not equals)
        
        b=new int[2][][];
        
        b[0]=new int[2][];
        b[0][0]=new int[3];
        b[0][1]=new int[1];
        b[0][0][0]=20;
        b[0][0][1]=30;
        b[0][0][2]=40;
        b[0][1][0]=50;
        
        
        b[1]=new int[2][];
        b[1][0]=new int[2];
        b[1][1]=new int[1];
        
        b[1][0][0]=40;
        b[1][0][1]=50;
        b[1][1][0]=60;
        
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                for(int k=0;k<b[i][j].length;k++){
                System.out.print(b[i][j][k]+"\t");
            }
            System.out.println();
            }
            System.out.println();
        }
    }
}
