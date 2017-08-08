import java.util.Scanner;

public class b桶式排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            bucketSort(arrInt);
            for (int i = 0; i <arrInt.length; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void bucketSort(int[] data){
        sort(data,0,data.length+1);
    }
    public static void sort(int[] data,int min,int max){
        int[] tempArr=new int[data.length];
        int[] bucket=new int[max-min];
        for (int i = 0; i <data.length ; i++) {
            bucket[data[i]-min]++;
        }
        for (int i = 1; i <max-min ; i++) {
            bucket[i]=bucket[i]+bucket[i-1];
        }
        System.arraycopy(data,0,tempArr,0,data.length);
        for (int i = data.length-1; i >=0 ; i--) {
            data[--bucket[tempArr[i]-min]]=tempArr[i];
        }
    }
}
