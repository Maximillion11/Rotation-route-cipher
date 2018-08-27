package com.maxt.rotationroutecipher;

public class cypher {

    public cypher (String inputText, int gridX, int gridY, boolean rotateClockwise) {
        int[] gridDimensions = { gridX, gridY };
        char[] inputGrid = generateGrid(inputText, gridDimensions);

        for (int x = 0; x < gridDimensions[0]; x++) {
            for (int y = 0; y < gridDimensions[1]; y++) {

            }
        }
    }

    private char[] generateGrid (String inputText, int[] gridDimensions) {
        char[] inputGrid = new char[gridDimensions[0] * gridDimensions[1]];

        for (int i = 0; i < inputGrid.length; i++) {
            inputGrid[i] = inputText.charAt(i);
        }

        return inputGrid;
    }
}
