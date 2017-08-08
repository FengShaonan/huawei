import java.util.Scanner;

public class a冒泡排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            bubbleSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for (int i = arr.length; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
