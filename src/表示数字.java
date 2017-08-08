import java.util.Scanner;

public class 表示数字 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            System.out.println(markNum(str));
        }
        input.close();
    }
    public static  String markNum(String str){
        char[] ch=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <ch.length ; i++) {
            if((ch[i]-'0'>=0)&&(ch[i]-'0'<=9)){
                 sb.append("*"+ch[i]+"*");
            }else{
                 sb.append(ch[i]);
            }
        }
        return sb.toString().replaceAll("\\*\\*","");
    }
}
