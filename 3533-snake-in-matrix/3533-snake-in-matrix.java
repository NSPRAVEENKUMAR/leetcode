class Solution {
    public int finalPositionOfSnake(int n, List<String> cammands) {
        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = (row * n) + col;
            }
        }

        int x = 0, y = 0;
        int k = cammands.size();

        for (int row = 0; row < k; row++) {
            String direction = cammands.get(row);

            if (direction.equals("UP")) {
                x -= 1;
            } else if (direction.equals("RIGHT")) {
                y += 1;
            } else if (direction.equals("DOWN")) {
                x += 1;
            } else if (direction.equals("LEFT")) {
                y -= 1;
            }
        }

        return arr[x][y];
    }
}
