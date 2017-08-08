import java.util.Scanner;

public class Redraiment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=Integer.parseInt(input.nextLine());
            int[] arr=new int[n];
            int[] dp2=new int[arr.length];
            int max=0;
            String[] arrstr=input.nextLine().split(" ");
            for (int i = 0; i <n; i++) {
                arr[i]=Integer.parseInt(arrstr[i]);
            }
           dp2= getdp(arr);
            for (int i = 0; i <n ; i++) {
                if(dp2[i]>max){
                     max=dp2[i];
                }
            }
            System.out.println(max);
        }
        input.close();
    }
    public static int[] getdp(int[] arr){
        if(arr==null||arr.length==0){
             return null;
        }
        int[] dp=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if(arr[i]>arr[j]){
                     dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;
    }
}
