import java.util.Scanner;

public class b归并排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            mergerSort(arrInt);
            for (int i = 0; i <arrInt.length; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void mergerSort(int[] data){
        sort(data,0,data.length-1);
    }
    public static void sort(int[] data,int left,int right){
        if(left>=right){
             return;
        }
        int center=(left+right)/2;
        sort(data,left,center);
        sort(data,center+1,right);
        merger(data,left,center,right);
    }
    public static void merger(int[] data,int left,int center,int right){
        int[] tempArr=new int[data.length];
        int tempIndex=left;
        int index=left;
        int mid=center+1;
        while(left<=center&&mid<=right){
             if(data[left]<data[mid]){
                  tempArr[tempIndex++]=data[left++];
             }else{
                  tempArr[tempIndex++]=data[mid++];
             }
        }
        while(left<=center){
             tempArr[tempIndex++]=data[left++];
        }
        while(mid<=right){
             tempArr[tempIndex++]=data[mid++];
        }
        while(index<=right){
             data[index]=tempArr[index++];
        }
    }
}
