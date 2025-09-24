package Strings;

public class SumOfAllSubstrings {
    public static void main(String[] args) {
        String str = "6759";
        int n = str.length();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = str.substring(i,j+1);
                sum+=Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
