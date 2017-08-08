import java.util.Scanner;

public class a桶式排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            bucketSort(arrInt,0,arrInt.length+1);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void bucketSort(int[] data,int min,int max){
        // 缓存数组
        int[] tempArr=new int[data.length];
        // buckets用于记录待排序元素的信息
        // buckets数组定义了max-min个桶
        int[] buckets=new int[max-min];
        // 计算每个元素在序列出现的次数
        for (int i = 0; i <data.length ; i++) {
            buckets[data[i]-min]++;
        }
        // 计算“落入”各桶内的元素在有序序列中的位置
        for (int i = 1; i <max-min ; i++) {
            buckets[i]=buckets[i]+buckets[i-1];
        }
        // 将data中的元素完全复制到tmp数组中
        System.arraycopy(data,0,tempArr,0,data.length);
        // 根据buckets数组中的信息将待排序列的各元素放入相应位置
        for (int i = data.length-1; i >=0 ; i--) {
            data[--buckets[tempArr[i]-min]]=tempArr[i];
        }
    }
}
