import java.util.Scanner;

/**
 * Created by Shawn Feng on 24/07/2017.
 */
public class 杨辉三角的变形 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if (n<=2){
                System.out.println(-1);
            }else if (n%2==1){
                System.out.println(2);
            }else{
                if (n%4==0)
                    System.out.println(3);
                else
                    System.out.println(4);
            }
        }
        scanner.close();
    }
}
