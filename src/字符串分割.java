import java.util.Scanner;

public class 字符串分割 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = Integer.parseInt(input.nextLine());
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]= input.nextLine();
            }
            for (int i = 0; i <n ; i++) {
                strSplit(arr[i]);
            }

        }
        input.close();
    }
    public static void strSplit(String str){
        if(str==null){
             return;
        }
        int m=str.length()%8;
        StringBuilder sb=new StringBuilder(str);
        if(m!=0){
            for (int i = 8-m; i >0 ; i--) {
                sb.append('0');
            }
        }
        //System.out.println();
        str=sb.toString();
        for (int i = 0; i <str.length() ; i+=8) {
            System.out.println(sb.substring(i,i+8));
        }
    }
}