class Solution {
  public void setZeroes(int[][] matrix) {
    boolean col=false;
        int R= matrix.length;
        int C=matrix[0].length;

        for(int i=0;i<R;i++){
            if(matrix[i][0]==0)
                col=true;
    
            for(int j=1;j<C;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;}
            }
        }
        
        for(int i=1;i<R;i++){
            for(int j=1;j<C;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(matrix[0][0]==0){
            for(int i=0;i<C;i++){
                matrix[0][i]=0;
            }
        }

        if(col){
            for(int i=0;i<R;i++){
                matrix[i][0]=0;
            }
        }
  }
}