class MaxIslandArea {
    Set<Pair> visitedSet = new HashSet<Pair>();
    int maxarea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int rowlength = grid.length;
        if(rowlength == 0) {
            return 0;
        }
        int collength = grid[0].length;
        if(collength == 0) {
            return 0;
        }

        for(int i = 0;i<rowlength;i++) {
            for(int j = 0;j<collength;j++) {
                Pair temp = new Pair(i, j);
                if(!visitedSet.contains(temp) && grid[i][j]!=0) {
                    System.out.println("inside with i " + i + " with j " + j);
                    Set<Pair> currentSet = new HashSet<Pair>();
                    search(grid, i, j, rowlength, collength, currentSet);
                }
            }
        }

        return maxarea;






    }

    public void search(int[][] grid, int i, int j, int rows, int cols, Set<Pair> currentSet) {
        Pair p = new Pair(i, j);
        if(currentSet.contains(p) || visitedSet.contains(p) || i<0 || i >= rows || j < 0 || j >=cols || grid[i][j] == 0) {
            return;
        }


        currentSet.add(p);
        visitedSet.add(p);
        maxarea = Math.max(maxarea, currentSet.size());

        search(grid, i+1, j, rows, cols, currentSet);
        search(grid, i-1, j, rows, cols, currentSet);
        search(grid, i, j-1, rows, cols, currentSet);
        search(grid, i, j+1, rows, cols, currentSet);


    }


    private class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object ot) {
            Pair oth = (Pair)ot;
            if(oth.x == x && oth.y == y) {
                return true;
            } else {
                return false;
            }
        }

        @Override public int hashCode() {
            return x*91 + y;
        }
    }
}
