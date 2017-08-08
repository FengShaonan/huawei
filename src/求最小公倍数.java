import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class 求最小公倍数 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=Integer.parseInt(input.nextLine());
            int m=Integer.parseInt(input.nextLine());
            int a=Math.max(n,m);
            while (a>0){
                if (a%n==0&&a%m==0){
                    System.out.println(a);
                    break;
                }
                a++;
            }
        }
        input.close();
    }
}
