import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class 查找输入整数二进制中1的个数 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int m=input.nextInt();
            System.out.println(findNumberOf1(m));
        }
        input.close();
    }
    public static  int findNumberOf1(int num){
        int count=0;
        while(num>0){
             count++;
             num&=(num-1);
        }
        return  count;
    }
}
