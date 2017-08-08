import java.util.Scanner;

/**
 * Created by Shawn Feng on 24/07/2017.
 */
public class 计算字符串的距离 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String arrA=scanner.nextLine();
            String arrB=scanner.nextLine();
            int result =calStringDistance(arrA,arrB);
            System.out.println(result);
        }
    }
    public static int calStringDistance(String arrA,String arrB){
        int n=arrA.length();
        int m=arrB.length();
        char[] chA=arrA.toCharArray();
        char[] chB=arrB.toCharArray();
        int[][] dis=new int[n+1][m+1];
        if (n==0)
            return n;
        if (m==0)
            return m;
        //init准备
        for (int i = 0; i <n+1 ; i++) {
            dis[i][0]=i;
        }
        for (int i = 0; i <m+1 ; i++) {
            dis[0][i]=i;
        }

        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <m+1 ; j++) {
                if (chA[i-1]==chB[j-1]){
                    dis[i][j]=dis[i-1][j-1];
                }else {
                    dis[i][j]=Math.min(dis[i-1][j]+1,Math.min(dis[i][j-1]+1,dis[i-1][j-1]+1));
                }
            }
        }
        return dis[n][m];
    }
}
