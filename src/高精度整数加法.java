import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Shawn Feng on 25/07/2017.
 */
public class 高精度整数加法 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.next();
            String str2=scanner.next();
            BigInteger b1=new BigInteger(str1);
            BigInteger b2=new BigInteger(str2);
            BigInteger sum=b1.add(b2);
            System.out.println(sum);
        }
        scanner.close();
    }
}
