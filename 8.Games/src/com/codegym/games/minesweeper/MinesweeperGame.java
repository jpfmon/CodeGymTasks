package com.codegym.games.minesweeper;
import com.codegym.engine.cell.*;

import javax.print.attribute.standard.Sides;

//Requirements:
//        1. The MinesweeperGame class must have a private GameObject[][] gameField matrix (two-dimensional array) whose dimensions are SIDExSIDE.
//        2. The MinesweeperGame class must have a private void createGame() method.
//        3. In the createGame method(), you need to populate each cell of the gameField array with a new GameObject object with corresponding x and y coordinates.
//        4. In the createGame() method, for each cell in the gameField array, you need to call the setCellColor(int, int, Color) method with the following arguments: x and y coordinates, as well as any color (for example, Color.ORANGE).
//        5. The createGame() method must be called in the initialize() method.


public class MinesweeperGame extends Game{

    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];


    public  void initialize(){

        setScreenSize(SIDE,SIDE);
        createGame();
    };
    private void createGame(){

        for(int x=0;x<SIDE;x++){
            for(int y=0;y<SIDE;y++){
                gameField[y][x] = new GameObject(x,y);
            }
        }


    }

}
