import java.util.*;

public class MineSweeper {
    private int rowNumber;
    private int colNumber;
    private int numOfMine;
    private char[][] mineBoard;
    private char[][] gameMineBoard;
    private int[] mineIndexesRow;
    private int[] mineIndexesCol;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineBoard = new char[rowNumber][colNumber];
        this.gameMineBoard = new char[rowNumber][colNumber];
        this.numOfMine = (this.rowNumber * this.colNumber) / 4;
        this.mineIndexesRow = new int[this.numOfMine];
        this.mineIndexesCol= new int[this.numOfMine];
    }

    public void run() {
         // this function works fine.
        Scanner input = new Scanner(System.in);
        int enteredRowNumber, enteredColNumber;
        int counter=this.colNumber * this.rowNumber - this.numOfMine;

        createMineBoard();
        setDefaultMineBoard(this.gameMineBoard);
        System.out.println("Mayınların Konumu");
        displayMineBoard(this.mineBoard);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        while(true){
            displayGameBoard();
            System.out.print("Satır Giriniz : ");
            enteredRowNumber = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            enteredColNumber = input.nextInt();
            if(enteredRowNumber < 0 || enteredColNumber < 0 || enteredRowNumber >= this.rowNumber
                || enteredColNumber >= this.colNumber){
                System.out.println("Geçersiz koordinat !");
                continue;
            }
            if(this.mineBoard[enteredRowNumber][enteredColNumber] == '*'){
                System.out.println("Game Over!!");
                System.out.println("================");
                break;
            }

            this.gameMineBoard[enteredRowNumber][enteredColNumber] =
                    this.mineBoard[enteredRowNumber][enteredColNumber];

            counter--;
            if(counter == 0) {
                System.out.println("Oyunu Kazandınız !");
                displayGameBoard();
                break;
            }


        }



    }

    public void createMineBoard() {
        setDefaultMineBoard(this.mineBoard);
        createRandomMineIndexes();

        for(int i=0; i < this.numOfMine; i++){
            mineBoard[mineIndexesRow[i]][mineIndexesCol[i]] = '*';
        }
        for(int i = 0; i < this.rowNumber; i++){
            for(int j = 0; j < this.colNumber; j++){
                int numOfCloseMines = 0;
                if (this.mineBoard[i][j] == '*') {
                    continue;
                } else {
                    for(int k = i-1; k<=i+1; k++){
                        for(int l = j-1; l <= j+1; l++){
                            if(k==i && l == j){
                                continue;
                            }
                            if(k<0 || l<0 || k>=this.rowNumber || l>=this.colNumber) {
                                continue;
                            }
                            if(this.mineBoard[k][l] == '*'){
                                numOfCloseMines++;
                            }
                        }
                    }
                }

                this.mineBoard[i][j] = (char) (numOfCloseMines+'0');
            }
        }
    }

    public void createRandomMineIndexes() {
        boolean duplicateChecker = false;
        Arrays.fill(this.mineIndexesRow, 0);
        Arrays.fill(this.mineIndexesCol, 0);
        int randColIndex, randRowIndex;
        Random rand = new Random();

        for(int i=0; i < this.numOfMine; i++) {
            randColIndex = rand.nextInt(this.colNumber);
            randRowIndex = rand.nextInt(this.rowNumber);
            if(i == 0){
                this.mineIndexesRow[i] = randRowIndex;
                this.mineIndexesCol[i] = randColIndex;
                continue;
            }
            for(int j=0; j < i; j++) {
                if((this.mineIndexesRow[j] == randRowIndex) &&
                    this.mineIndexesCol[j] == randColIndex) {
                    duplicateChecker = true;
                    break;
                }
            }
            if(duplicateChecker){
                duplicateChecker = false;
                i--;
                continue;
            } else {
                this.mineIndexesRow[i] = randRowIndex;
                this.mineIndexesCol[i] = randColIndex;
            }

        }
    }

    public void setDefaultMineBoard(char[][] mineBoard) {
        for(int i=0; i < this.rowNumber; i++){
            for(int j=0; j < this.colNumber; j++){
                mineBoard[i][j] = '-';
            }
        }
    }

    public void displayMineBoard(char[][] mineBoard) {
        for(int i=0; i < this.rowNumber; i++){
            for(int j=0; j < this.colNumber; j++){
                if(mineBoard[i][j] == '*'){
                    System.out.print(mineBoard[i][j] + " ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println("");
        }
        System.out.println("==================");
    }

    public void displayGameBoard(){
        for(int i=0; i < this.rowNumber; i++){
            for(int j=0; j < this.colNumber; j++){
                System.out.print(this.gameMineBoard[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("==================");
    }
}
