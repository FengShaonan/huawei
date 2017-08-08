import java.util.Scanner;


public class 字符逆序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String st=input.nextLine();
            char[] arr=st.toCharArray();
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.print(arr[i]);
            }
        }
        input.close();
    }
}
