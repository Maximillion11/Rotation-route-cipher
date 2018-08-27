package com.maxt.rotationroutecipher;

public class cypher {

    public static void main(String args[]) {
        cyphera("wearediscoveredfleeatonce", 9, 3, true);
    }

    public cypher (String inputText, int gridX, int gridY, boolean rotateClockwise) {

    }

    public static void cyphera (String inputText, int gridX, int gridY, boolean rotateClockwise) {
        char[][] inputGrid = generateGrid(inputText.toUpperCase(), gridX, gridY);
        String outputString = "";
        int xMoveAmount = gridX;
        int yMoveAmount = gridY;

        for (int y = 0; y < yMoveAmount; y++) {
            for (int x = 0; x < xMoveAmount; x++) {
                outputString += inputGrid[x][y];
            }
        }

        System.out.println(outputString);
    }

    private static char[][] generateGrid (String inputText, int gridX, int gridY) {
        char[][] inputGrid = new char[gridX][gridY];

        for (int y = 0; y < gridY; y++) {
            for (int x = 0; x < gridX; x++) {
                int inputCharacter = x + (gridX * y);
                if (inputCharacter < inputText.length()) {
                    inputGrid[x][y] = inputText.charAt(inputCharacter);
                } else {
                    inputGrid[x][y] = 'X';
                }
            }
        }

        return inputGrid;
    }
}
