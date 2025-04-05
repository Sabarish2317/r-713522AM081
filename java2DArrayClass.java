public class java2DArrayClass {
    public static class TwoDimenstionalArray{
        int[][] data ; 
        int r;
        int c;
         //sets the value of the element at the specified row and column
        public void set(int row , int col, int d){
            if(row <= r && col <= c){
                 data[row][col] = data;
            } 

        }
        public void get(int row, int col){}
        public void print(){}
        TwoDimenstionalArray(int r,int c){
            this.c = c;
            this.r = r;
            data = new int[r][c];
        }
    }
    public static void main(String[] args) {
        TwoDimenstionalArray test = new TwoDimenstionalArray(3, 3);
        test.set(0, 0, 0);
       
    }


}
