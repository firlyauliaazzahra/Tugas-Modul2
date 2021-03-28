package Matriks;
public class NO2 {
    public static void main(String[] args){
        int[][] A = {
            {8,7},
            {6,4},
            {9,2}
        };
        
        int[][] B = {
            {5,6},
            {3,8},
            {4,1}
        };
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int [A.length][A[0].length];
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C[i][j]+ " ");
                }
            System.out.println();
            }
        }
        else{
            System.out.print("ukuran matriks tidak sama");
        }
    }
}
