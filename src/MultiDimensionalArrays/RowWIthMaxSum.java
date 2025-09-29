package MultiDimensionalArrays;

public class RowWIthMaxSum {
    public static void main(String[] args) {
        int[][] arr ={{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int row=-1;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++){
                rowSum+=arr[i][j];
            }
            if(rowSum>maxSum){
                maxSum=rowSum;
                row=i;
            }
        }
        System.out.println(row+" "+maxSum);
    }
}
