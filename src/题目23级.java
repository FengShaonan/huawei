import java.util.Scanner;

public class 题目23级 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] str=input.nextLine().split(" ");
            int m=Integer.parseInt(str[0]);
            int n=Integer.parseInt(str[1]);
            int[][] dp=new int[m+1][n+1];
            for (int i = 0; i <dp.length ; i++) {
                dp[i][0]=1;
            }
            for (int i = 0; i <dp[0].length ; i++) {
                dp[0][i]=1;
            }
            for (int i = 1; i <dp.length ; i++) {
                for (int j = 1; j <dp[0].length ; j++) {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
            System.out.println(dp[m][n]);
        }
        input.close();
    }
}
