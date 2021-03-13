package com.softserve.project.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private final char empty = '.';
    private final char cross = 'X';
    private final char zero = 'O';
    private final char[][] field;

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    //    Constructor
    protected TicTacToe() {
        field = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = empty;
            }
        }
    }

    //    Game logics
    protected void ttt() {
        while (true) {
            cMove();
            if (isWin(zero)) {
                System.out.println("You lose");
                fieldOutput();
                break;
            }
            if (isDraw()) {
                System.out.println("Draw");
                fieldOutput();
                break;
            }

            fieldOutput();
            mMove();
            if (isWin(cross)) {
                System.out.println("You win");
                fieldOutput();
                break;
            }
            if (isDraw()) {
                System.out.println("Draw");
                fieldOutput();
                break;
            }
        }
    }

    //    Man's move
    protected void mMove() {
        int a, b;
        try {
            do {
                System.out.println("Enter 2 coordinates between 0 and 2");
                a = sc.nextInt();
                b = sc.nextInt();
            } while (isCoordValid(a, b));
            field[a][b] = cross;

        } catch (Exception e) {
            System.out.println("Wrong value");
        }
    }

    //    Computer move
    protected void cMove() {
        ///*-
        int a, b;
        do {
            a = rd.nextInt(3);
            b = rd.nextInt(3);
            } while (isCoordValid(a, b));
        field[a][b] = zero;
    //*/
       /*- int a = -1, b = 0;
        if (field[1][1] == empty) {
            field[1][1] = zero;
        } else {
            do {
                if (!isCoordValid(0, 0) || !isCoordValid(0, 2)) {
                    a = 0, b = 1
                }
                if (!isCoordValid(2, 2) || !isCoordValid(2, 0)) {
                    a = 2, b = 1
                }

            } while (isCoordValid(a,b));
            field[a][b] = cross;
        }*/
    }


    //    Victory check
    protected boolean isWin(char sing) {
        boolean result = false;
        for (int i = 0; i < 3; i++)
            if ((field[i][0] == sing && field[i][1] == sing && field[i][2] == sing) ||
                    (field[0][i] == sing && field[1][i] == sing && field[2][i] == sing)) {
                result = true;
                break;
            }
        for (int i = 0; i < 3; i++)
            if ((field[0][0] == sing && field[1][1] == sing && field[2][2] == sing) ||
                    (field[0][2] == sing && field[1][1] == sing && field[2][0] == sing)) {
                result = true;
                break;
            }
        return result;
    }

    //    Draw check
    protected boolean isDraw() {
        boolean result = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (field[i][j] == empty) {
                    result = false;
                    break;
                }
        return result;
    }

    //    Field output
    protected void fieldOutput() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    //    Check valid
    protected boolean isCoordValid(int a, int b) {
        boolean result = true;
        if (a < 0 || b < 0 || a > 2 || b > 2 || field[a][b] != empty) result = false;
        return !result;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.ttt();
    }
}
