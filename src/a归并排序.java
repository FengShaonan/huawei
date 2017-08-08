import java.util.Scanner;

public class a归并排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            mergeSort(arrInt);
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(arrInt[i]);
            }
        }
        input.close();
    }
    public static void mergeSort(int[] data){
        sort(data,0,data.length-1);
    }
    public static void sort(int[] data,int left,int right){
        if(left>=right){
             return;
        }
        int center=(left+right)/2;
        sort(data,left,center);
        sort(data,center+1,right);
        merge(data,left,center,right);
    }
    public static void merge(int[] data,int left,int center,int right){
        int[] tempArr=new int[data.length];
        int mid=center+1;
        int tempLeft=left;
        int tempIndex=left;

        while(left<=center&&mid<=right){
             if(data[left]<data[mid]){
                  tempArr[tempLeft++]=data[left++];
             }else{
                  tempArr[tempLeft++]=data[mid++];
             }
        }
        while(left<=center){
             tempArr[tempLeft++]=data[left++];
        }
        while(mid<=right){
             tempArr[tempLeft++]=data[mid++];
        }
        while(tempIndex<=right){
             data[tempIndex]=tempArr[tempIndex++];
        }

    }
}
