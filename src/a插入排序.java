import java.util.Scanner;

public class a插入排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            InsertSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }

        }
        input.close();
    }
    public static int[] InsertSort(int[] arr){
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1]>arr[j]){
                     int temp=arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
