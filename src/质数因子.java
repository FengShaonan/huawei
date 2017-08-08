import java.util.Scanner;

public class 质数因子 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int m=Integer.parseInt(input.nextLine());
            String st="";
            for (int i = 2; i <=m; i++) {
                int l=m;
                boolean result=zhishu(i);
                while (result==true&&l%i==0){
                        st=st+i+" ";
                        l=l/i;
                }
            }
            System.out.print(st);
        }
        input.close();
    }
    public static  boolean zhishu(int n){
        boolean zt=true;
        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                 zt=false;
                 break;
            }
        }
        return zt;
    }
}
