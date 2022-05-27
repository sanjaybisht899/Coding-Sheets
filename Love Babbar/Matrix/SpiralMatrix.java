/**
 * SpiralMatrix
 */
import java.util.*;
public class SpiralMatrix {

    public static void main(String[] args) {
        int row = 2, column = 3;
        
        int    matrix[][] = {
            {5,11,30},
            {5,19,19},

        };
        
        ArrayList<Integer> spirallyTraverse = new ArrayList<>();
        int count=0;
        int total= row*column;
        int rowStart=0;
        int rowEnd=row-1;
        int colStart=0;
        int colEnd=column-1;
              
        while(count<total){
            //print first row
            for (int i = colStart; i <= colEnd && count<total; i++) {
                spirallyTraverse.add(matrix[rowStart][i]);
                count++;   
            }
            rowStart++;
            //print last col
            for (int i = rowStart; i <= rowEnd && count<total; i++) {
                spirallyTraverse.add(matrix[i][colEnd]);   
                count++;   
            }
            colEnd--;
            //print last row
            for (int i = colEnd; i >=colStart && count<total; i--) {
                spirallyTraverse.add(matrix[rowEnd][i]);   
                count++;   
            }
            rowEnd--;
            //print first col
            for (int i = rowEnd; i >=rowStart && count<total; i--) {
                spirallyTraverse.add(matrix[i][colStart]);   
                count++;   
            }
            colStart++;
            
        }
        System.out.println(spirallyTraverse);

        
        
    }
}