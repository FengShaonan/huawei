import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class 查找最长公共子串002 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String st1=input.nextLine();
            String st2=input.nextLine();
            System.out.println(lcst1(st1,st2));
        }
        input.close();
    }
    public static String lcst1(String str1,String str2){
        if(str1==null||str2==null||str1==""||str2==""){
             return "";
        }
        char[] cha1=str1.toCharArray();
        char[] cha2=str2.toCharArray();
        int[][] dp=getdp(cha1,cha2);
        int index=0;
        int max=0;
        for (int i = 0; i <cha1.length ; i++) {
            for (int j = 0; j <cha2.length; j++) {
                if(dp[i][j]>max){
                     index=i;
                     max=dp[i][j];
                }
            }
        }
        return str1.substring(index-max+1,index+1);
    }

    public static int[][] getdp(char[] ch1,char[] ch2){
        int[][] dp=new int[ch1.length][ch2.length];
        for (int i = 0; i <ch1.length ; i++) {
            if(ch1[i]==ch2[0]){
                 dp[i][0]=1;
            }
        }
        for (int i = 1; i <ch2.length ; i++) {
            if (ch1[0]==ch2[i]){
                dp[0][i]=1;
            }
        }
        for (int i = 1; i <ch1.length ; i++) {
            for (int j = 1; j <ch2.length ; j++) {
                if(ch1[i]==ch2[j]){
                     dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
        return dp;
    }
}
