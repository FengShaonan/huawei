import java.util.Scanner;

/**
 * Created by Shawn Feng on 25/07/2017.
 */
public class 挑7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if (n>30000){
                break;
            }
            int count=0;
            for (int i = 1; i <= n; i++) {
                if (i%7==0||i%10==7||i/10%10==7||i/100%10==7||i/1000%10==7||i/10000%10==7){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
