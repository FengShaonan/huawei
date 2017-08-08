import java.util.Scanner;

public class a堆排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            heapSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void heapSort(int[] data){
        for (int i = 0; i <data.length ; i++) {
            createMaxHeap(data,data.length-1-i);
            swap(data,0,data.length-1-i);
        }
    }
    public static void createMaxHeap(int[] data,int lastIndex){
        for (int i = (lastIndex-1)/2; i >=0 ; i--) {
            int k=i;
            while(2*k+1<=lastIndex){
                 int biggerIndex=2*k+1;
                 if(biggerIndex<lastIndex){
                      if(data[biggerIndex]<data[biggerIndex+1]){
                           biggerIndex++;
                      }
                 }
                 if(data[k]<data[biggerIndex]){
                      swap(data,k,biggerIndex);
                      k=biggerIndex;
                 }else{
                      break;
                 }
            }
        }
    }
    public static void swap(int[] data,int i,int j){
        if(i==j){
             return;
        }
        data[i]=data[i]+data[j];
        data[j]=data[i]-data[j];
        data[i]=data[i]-data[j];
    }
}
