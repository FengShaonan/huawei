import java.util.Scanner;

/**
 * Created by Shawn Feng on 25/07/2017.
 */
public class 查找组成一个偶数最接近的两个素数 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=Integer.parseInt(input.nextLine());
            int max=n/2;
            int min=n/2;
            while(max<n&&min>0){
                boolean flag1=true;
                boolean flag2=true;

                for (int i = 2; i <max; i++) {
                    if(max%i==0){
                        flag2=false;
                         break;
                    }
                }
                for (int i = 2; i <min; i++) {
                    if(min%i==0){
                        flag2=false;
                        break;
                    }
                }
                if(flag1==true&&flag2==true){
                    System.out.println(min);
                    System.out.println(max);
                    break;
                }
                max++;
                min--;
            }
        }
        input.close();
    }
}
