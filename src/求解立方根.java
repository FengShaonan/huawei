import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class 求解立方根 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            double m=Double.parseDouble(input.nextLine());
        DecimalFormat df=new DecimalFormat("0.0");
        System.out.println(df.format(Math.pow(m,1.0/3.0)));
    }
}
