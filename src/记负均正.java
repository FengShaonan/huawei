import java.text.DecimalFormat;
import java.util.Scanner;

public class 记负均正 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sum=0.0;
        double countz=0;
        int countf=0;
        while(input.hasNext()){
            int num=Integer.parseInt(input.nextLine());
            String str=input.nextLine();
            String[] arr=str.split(" ");
            for (int i = 0; i <num; i++) {
                double n=Double.parseDouble(arr[i]);
                if(n>0){
                    sum+=n;
                    countz++;
                }else if(n<0){
                    countf++;
                }
            }

            DecimalFormat df=new DecimalFormat("0.0");
            System.out.print(countf+" ");
            if(countz==0){
                System.out.print(sum);
                System.out.println();
            }else{
                System.out.print(df.format(sum/countz));
                System.out.println();
            }
        }
        input.close();
    }
}
