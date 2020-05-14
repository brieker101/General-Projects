/**Brian Hauck 9-7-2018
 * This program called MatchNM is a text version of a match three with numbers.
 */
import java.util.*;

public class matchNM
{
    private int[][] gameBoard;

    private int score;
    private int width;
    private int height;
    private int previousScore;

    public matchNM(int n, int m){
        gameBoard = new int[n][m];
        score = 0;
        height = m;
        width = n;
    }

    public void addScore(){
        score++;
    }

    public void showGameBoard(){
        for(int i = 0;i<height;i++){
            for(int j = 0;j<width;j++){
                System.out.print( gameBoard[i][j] + " " );
            }
            System.out.println();
        }
    }

    /**
     * This fills the game board with random numbers.
     * Throws an error if the length or width is under 3
     */
    public void fillGameBoard(){
        for(int i = 0;i<height;i++){
            for(int j = 0;j<width;j++){
                gameBoard[i][j] = (int)Math.round((Math.random()*9));
            }
        }
    }

    public void shiftDown(int n, int m, int direction){
        if(direction==0){
            if(m>0){
                for(int i = m+1;i>0;i--){
                    gameBoard[n][m-3] = gameBoard[n][i];
                }
                for(int i = m+1;i>0;i--){
                    gameBoard[n][i] = (int)(Math.round(Math.random()));
                }
            }
            else{
                for(int i = 0;i<3;i++){
                    gameBoard[n][i] = (int)(Math.round(Math.random()*9));   

                }
            }
        }
        else if(direction==1){
            if(m>0){
                for(int i = n;i<n+3;i++){
                    for(int j = m;j>0;j--){
                        gameBoard[i][j] = gameBoard[i][j+1];
                    }
                }
                for(int i = n;i<n+3;i++){
                    gameBoard[i][0] = (int)(Math.round(Math.random()));
                }
            }
            else{
                for(int i = n;i<n+3;i++){
                    gameBoard[i][0] = (int)(Math.round(Math.random()));
                }
            }
        }
        else if(direction==2){}
    }

    public void checkForThree(){
        for(int i = 0;i<width-2;i++){
            for(int j = 0; j<height-2;j++){
                if(gameBoard[width][height]==gameBoard[width][height+1]){}
            }
        }
    }

}
