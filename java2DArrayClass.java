public class java2DArrayClass {
    public static class TwoDimenstionalArray{
        int[][] data ; 
        int r;
        int c;
         //sets the value of the element at the specified row and column
        public void set(int row , int col, int d){
            if(row <= r && col <= c){
                 data[row][col] = d;
            }
        }
        public void get(int row, int col){
            if(row <= r && col <= c){
              System.out.println(data[row][col]);
           }
        }
        public void print(){}
        TwoDimenstionalArray(int row,int col){
            if(row <= r && col <= c){
                for(int i=0; i<row; i++){
                 for(int j=0; i<col; j++){
                    System.out.println(data[i][j]);
                 }   
                }
               
             }
        }
    }
    public static void main(String[] args) {
        TwoDimenstionalArray test = new TwoDimenstionalArray(3, 3);
        test.set(0, 0, 0);
        test.get(0, 0);
        test.print();
       
    }


}
