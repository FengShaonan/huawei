import java.util.Scanner;

/**
 * Created by Shawn Feng on 25/07/2017.
 */
public class 输出N个数中最小的K个 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){

            String[] arr0=input.nextLine().split(" ");
            int num=Integer.valueOf(arr0[0]);
            int location=Integer.valueOf(arr0[1]);
            String[] arr=input.nextLine().split(" ");

            int[] arrInt=new int[num];
            for (int i = 0; i < num; i++) {
                arrInt[i]=Integer.valueOf(arr[i]);
            }
            for (int i = 0; i <num ; i++) {
                for (int j = i+1; j <num; j++) {
                    if(arrInt[i]>arrInt[j]){
                         int temp=arrInt[i];
                         arrInt[i]=arrInt[j];
                         arrInt[j]=temp;
                    }
                }
            }
            for (int i = 0; i <location-1 ; i++) {
                System.out.print(arrInt[i]+" ");
            }
            System.out.print(arrInt[location-1]);
        }
        input.close();
    }
}
