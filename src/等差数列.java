import java.util.Scanner;

public class 等差数列 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int m=Integer.parseInt(input.nextLine());
            int result=m*2+m*(m-1)*3/2;
            System.out.println(result);
        }
        input.close();
    }
}
