import java.util.Scanner;

public class 十六进制转十进制 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            String str1=str.substring(2,str.length());

            int result=Integer.parseInt(str1,16);
            System.out.println(result);
        }
        input.close();
    }
}
