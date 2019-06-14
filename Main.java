
import java.util.Scanner;
import java.util.Random;
public class Main {

/**
 * @param args
 */
public static void main(String[] args) {
    // TODO Auto-generated method stub

    char[][] gridArray = new char[10][10];
    int randomRow;
    int randomCol;
    int randomRow2;
    int randomCol2;
    String moveSelect;
    boolean validInput = true;

    int min = 0;
    int max = 9;

    Random tRNG = new Random();
    randomRow = tRNG.nextInt(max - min + 1) + min;
    randomCol = tRNG.nextInt(max - min + 1) + min;
    randomRow2 = tRNG.nextInt(max - min + 1) + min;
    randomCol2 = tRNG.nextInt(max - min + 1) + min;

    gridArray[randomRow][randomCol] = 'o';
    gridArray[randomRow2][randomCol2] = 'X';

    for (int i = 0; i < gridArray.length; i++)
    {
        for (int j = 0; j < gridArray.length; j++)
        {       
            if (gridArray[i][j] != gridArray[randomRow][randomCol] && gridArray[i][j] != gridArray[randomRow2][randomCol2])
            {
                gridArray[i][j] = '.';
            }
            System.out.print(gridArray[i][j]);
        }
        System.out.println("");  
    }

    System.out.println("Enter a movement choice W A S or D");
    do{

        Scanner keyboard = new Scanner(System.in);
        moveSelect = keyboard.nextLine();

        if ( moveSelect.equals("W"))
        {
            gridArray[randomRow][randomCol] = gridArray[randomRow+1][randomCol];
            gridArray[randomRow][randomCol] = ' ';
            validInput = true;      
        }

        else if ( moveSelect.equals("A"))
        {
            gridArray[randomRow][randomCol] = gridArray[randomRow][randomCol-1];
            gridArray[randomRow][randomCol] = ' ';
            validInput = true;
        }

        else if ( moveSelect.equals("S"))
        {
            gridArray[randomRow][randomCol] = gridArray[randomRow-1][randomCol];
            gridArray[randomRow][randomCol] = ' ';
            validInput = true;
        }

        else if (moveSelect.equals("D"))
        {
            gridArray[randomRow][randomCol] = gridArray[randomRow][randomCol+1];
            gridArray[randomRow][randomCol] = ' ';
            validInput = true;
        }

        else
        {
            System.out.println("Invalid Entry. Try again.");
            validInput = false;
        }

    } while (validInput == false);
}

}