//Author: Adrian Sharpless
//Last modification date: 10/10/2017
package mygame;

public class Map {
  
    public static void main(String[] args) {

        
    int[][] arryNumbers  = new int[6][5];
    arryNumbers[0][0] = 10;    arryNumbers[1][0] = 20;
    arryNumbers[0][1] = 12;    arryNumbers[1][1] = 45;
    arryNumbers[0][2] = 43;    arryNumbers[1][2] = 56;    
    arryNumbers[0][3] = 11;    arryNumbers[1][3] = 1;
    arryNumbers[0][4] = 22;    arryNumbers[1][4] = 33;
    
    arryNumbers[2][0] = 30;    arryNumbers[3][0] = 40;
    arryNumbers[2][1] = 67;    arryNumbers[3][1] = 12;
    arryNumbers[2][2] = 32;    arryNumbers[3][2] = 87;
    arryNumbers[2][3] = 14;    arryNumbers[3][3] = 14;
    arryNumbers[2][4] = 44;    arryNumbers[3][4] = 55;
    
    arryNumbers[4][0] = 50;    arryNumbers[5][0] = 60;
    arryNumbers[4][1] = 86;    arryNumbers[5][1] = 53;
    arryNumbers[4][2] = 66;    arryNumbers[5][2] = 44;
    arryNumbers[4][3] = 13;    arryNumbers[5][3] = 12;
    arryNumbers[4][4] = 66;    arryNumbers[5][4] = 11;
    
    int rows = 6;
    int columns = 5;
    int i,j;
    for ( i = 0; i < rows; i++)
    {
        for (j = 0; j < columns; j++)
        {
            System.out.print(arryNumbers[i][j]+ " ");
        }
        System.out.println("");
    }
    }      
}
