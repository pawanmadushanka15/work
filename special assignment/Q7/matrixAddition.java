public class matrixAddition{
    public static void main(String[] args){
        int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2={{10,11,12},{13,14,15},{16,17,18}};

        int rows=matrix1.length;
        int cols=matrix2[0].length;

        int[][] sum=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}