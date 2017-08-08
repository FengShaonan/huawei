import java.util.Scanner;

public class a选择排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            selectSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }

        }
        input.close();
    }
    public static int[] selectSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                     int temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
