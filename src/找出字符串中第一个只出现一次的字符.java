import java.util.Scanner;

/**
 * Created by Shawn Feng on 25/07/2017.
 */
public class 找出字符串中第一个只出现一次的字符 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       while(input.hasNext()){
           String str=input.nextLine();
           int n=str.length();
           for (int i = 0; i < n; i++) {
               char ch=str.charAt(i);
               String s=ch+"";
               if((n-str.replaceAll(s,"").length())==1){
                   System.out.println(str.charAt(i));
                   break;
               }else{
                   System.out.println(-1);
               }
           }
       }
       input.close();
    }
}
