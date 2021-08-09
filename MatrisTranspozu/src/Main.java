public class Main {

    public static int [][] transpozeMatrix(int row, int column, int [][] matrix) {
        int[][] transpozeMatrix = new int[column][row];
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++) {
                transpozeMatrix[i][j] = matrix[j][i];
            }
        }
        return transpozeMatrix;
    }

    public static void displayMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{2,3,4}, {5,6,4}};
        System.out.println("Matris : ");
        displayMatrix(matrix);
        System.out.println("Transpoze : ");
        displayMatrix(transpozeMatrix(2,3,matrix));
    }
}
