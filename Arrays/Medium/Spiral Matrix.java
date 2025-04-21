import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cr = 0;
        int er = matrix.length - 1;
        int cc = 0;
        int ec = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while(cr<=er && cc<=ec){
            for(int i=cc;i<=ec;i++){
                list.add(matrix[cr][i]);
            }
            cr++;
            for(int i=cr;i<=er;i++){
                list.add(matrix[i][ec]);
            }
            ec--;
            if(cr<=er){
                for(int i=ec;i>=cc;i--){
                    list.add(matrix[er][i]);
                }
                er--;
            }
            if(cc<=ec){
                for(int i=er;i>=cr;i--){
                    list.add(matrix[i][cc]);
                }
            }
            cc++;
        }

        return list;
    }
}
