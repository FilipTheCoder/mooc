/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.List;
import javafx.scene.control.Button;

/**
 *
 * @author filip
 */
public class BoardAnalyzer {

    private final Button[][] board;

    public BoardAnalyzer(Button[][] board) {
        this.board = board;
    }

    public boolean check(String symbol) {
        return checkVertically(symbol) || checkHorizontally(symbol) || checkDiagonally(symbol);
    }

    private boolean checkVertically(String symbol) {
        int inColCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i].getText().equals(symbol)) {
                    inColCount++;
                } else {
                    inColCount = 0;

                }
                if (inColCount == board.length) {
                    return true;
                }

            }
            inColCount = 0;

        }
        return false;
    }

    private boolean checkHorizontally(String symbol) {
        int inRowCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getText().equals(symbol)) {
                    inRowCount++;
                } else {
                    inRowCount = 0;

                }
                if (inRowCount == board.length) {
                    return true;
                }

            }
            inRowCount = 0;

        }
        return false;
    }

    private boolean checkDiagonally(String symbol) {
        return checkDiagonallyR(symbol) || checkDiagonallyL(symbol);
    }

    private boolean checkDiagonallyR(String symbol) {
        int j = 0;
        int inDiaCount = 0;
        for (int i = 0; i < board.length; i++) {
            
            if (board[i][j].getText().equals(symbol)) {
                inDiaCount++;
            } else {
                inDiaCount = 0;

            }
            
            if (inDiaCount == board.length) {
                return true;
            }
            j++;
        }
        return false;
    }

    private boolean checkDiagonallyL(String symbol) {
        int j = board.length - 1;
        int inDiaCount = 0;
        for (int i = 0; i < board.length; i++) {
            
            if (board[i][j].getText().equals(symbol)) {
                inDiaCount++;
            } else {
                inDiaCount = 0;

            }
            
            if (inDiaCount == board.length) {
                return true;
            }
            j--;
        }
        return false;
    }

}
