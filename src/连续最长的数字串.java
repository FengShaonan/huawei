import java.util.Scanner;

public class 连续最长的数字串 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            int[] dp=new int[str.length()];
            int max=0;
            char[] arr=str.toCharArray();
            if(arr[0]>='0'&&arr[0]<='9'){
                 dp[0]=1;
            }else{
                 dp[0]=0;
            }
            for (int i = 1; i <arr.length; i++) {
                if(arr[i]>='0'&&arr[i]<='9'){
                     dp[i]=dp[i-1]+1;
                }else{
                     dp[i]=0;
                }
            }
            for (int i = 0; i <arr.length ; i++) {
                if(max<dp[i]){
                     max=dp[i];
                }
            }
            String s="";
            for (int i = 0; i <arr.length ; i++) {
                if(max==dp[i]){
                     s+=str.substring(i-max+1,i+1);
                }
            }
            System.out.println(s+","+max);

        }
        input.close();
    }
}
