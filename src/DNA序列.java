import java.util.Scanner;

/**
 * Created by Shawn Feng on 26/07/2017.
 */
public class DNA序列 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            int n=input.nextInt();
            System.out.println(zichun(str,n));
        }
        input.close();
    }
    public static String zichun(String str,int num){
        int max=0;
        int index=0;

        for (int i = 0; i <str.length()-num ; i++) {
            int count=0;
            for (int j = i; j <i+num ; j++) {
                if(str.charAt(j)=='G'||str.charAt(j)=='C'){
                     count++;
                }
            }
            if(count>max){
                 max=count;
                 index=i;
            }
        }
        return  str.substring(index,index+num);
    }
}
