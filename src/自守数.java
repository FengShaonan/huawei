import java.util.Scanner;

public class 自守数 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int num=Integer.parseInt(input.nextLine());
            int count=0;
            for (int i = 0; i <=num ; i++) {
                if(Cal(i)){
                     count++;
                }
            }
            System.out.println(count);
        }
        input.close();
    }
    public static boolean Cal(int n) {
        int h = (int) Math.pow(n, 2);
        while (n > 0) {
            int a = n % 10;
            int b = h % 10;
            n /= 10;
            h /= 10;
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
