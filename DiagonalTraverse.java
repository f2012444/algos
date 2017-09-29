class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int count = 0;
        int row = matrix.length;
        if(row == 0) {
            return new int[0];
        }
        
        int col = matrix[0].length;
        if(col == 0) {
            return new int[0];
        }
        
        int size = 0;
        int [] res = new int[row*col];
        int temp = 0;
        boolean val = false;
        while(temp < row*col && size < (row+col-1)) {
           if(val) {
                int curcol = Math.min(size, col-1);
                int currow = size-curcol;
                
            while(curcol>=0 && currow <row && temp < row*col) {
                // System.out.println("cur row is " + currow);
                // System.out.println("cur col is " + curcol);
                // System.out.println("size " + size);
                res[temp] = matrix[currow][curcol];
                temp++;
                currow++;
                curcol--;
            }
               
               
        } else {
             int currow = Math.min(size, row-1);
             int curcol = size - currow;
             
             while(curcol < col && currow >= 0 && temp < row*col) {
                //  System.out.println("cur row is " + currow);
                // System.out.println("cur col is " + curcol);
                // System.out.println("size " + size);
                res[temp] = matrix[currow][curcol];
                temp++;
                currow--;
                curcol++;
             } 
        }
            size++;
            val = val ^ true;
        }
        
        return res;
        
    }
}
