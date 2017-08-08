import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class 查找最长公共子串 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String st1=input.nextLine();
            String st2=input.nextLine();
            System.out.println(zichuan(st1,st2));
        }
        input.close();
    }
    public static  String zichuan(String str1,String str2){
        if(str1==null||str2==null||str1==""||str2==""){
             return "";
        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int row=0;//开始行
        int col=str2.length()-1;//开始列
        int max=0;
        int index=0;
        while(row<str1.length()){
             int len=0;
             int i=row;
             int j=col;
             while(i<ch1.length&&j<ch2.length){
                  if(ch1[i]!=ch2[j]){
                       len=0;
                  }else{
                       len++;
                  }
                  if(max<len){
                       max=len;
                       index=i;
                  }
                  i++;
                  j++;
             }
             if(col>0){
                  col--;
             }else{
                 row++;
             }
        }
        return  str1.substring(index-max+1,index+1);
    }
}
