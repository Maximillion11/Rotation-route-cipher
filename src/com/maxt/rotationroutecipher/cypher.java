package com.maxt.rotationroutecipher;

public class cypher {

    public static void main(String args[]) {
        cyphera("wearediscoveredfleeatonce", 9, 3, true);
    }

    public cypher (String inputText, int gridX, int gridY, boolean rotateClockwise) {

    }

    public static void cyphera (String inputText, int gridX, int gridY, boolean rotateClockwise) {
        int[] gridDimensions = { gridX, gridY };
        char[] inputGrid = generateGrid(inputText.toUpperCase(), gridDimensions);

        String outputString = "";
        int index = 0;
        if (rotateClockwise) {
            //Clockwise
            for (int y = 0; y < gridDimensions[1]; y++) {
                index = (gridDimensions[0] * (y + 1)) - 1;
                outputString += inputGrid[index];
            }
            for (int x = gridDimensions[0] - 2; x >= 0; x--) {
                index = x + (gridDimensions[0] * (gridDimensions[1] - 1));
                outputString += inputGrid[index];
            }
            for (int y = gridDimensions[1] - 2; y >= 0; y--) {
                index = y * gridDimensions[0];
                outputString += inputGrid[index];
            }
            for (int x = 1; x < gridDimensions[0] - 1; x++) {
                index = x;
                outputString += inputGrid[index];
            }

            System.out.println(outputString);
        } else {
            //Anti-Clockwise

        }
    }

    private static char[] generateGrid (String inputText, int[] gridDimensions) {
        char[] inputGrid = new char[gridDimensions[0] * gridDimensions[1]];

        for (int i = 0; i < inputGrid.length; i++) {
            if (i < inputText.length()) {
                inputGrid[i] = inputText.charAt(i);
            } else {
                inputGrid[i] = 'X';
            }
        }

        return inputGrid;
    }
}
