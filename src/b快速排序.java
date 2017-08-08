import java.util.Scanner;

public class b快速排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            quickSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void quickSort(int[] data){
        sort(data,0,data.length-1);
    }
    public static void sort(int[] data,int start,int end){
        if(start>end){
             return;
        }
        int index=data[start];
        int left=start+1;
        int right=end;
        while(true){
             while(left<=end&&data[left]<index){
                  left++;
             }
             while(right>start&&data[right]>index){
                  right--;
             }
             if(left<right){
                  swap(data,left,right);
             }else{
                  break;
             }
        }
        swap(data,start,right);
        sort(data,start,right-1);
        sort(data,right+1,end);
    }
    public static void swap(int[] data,int i,int j){
        if(i==j){
             return;
        }
        int temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
}
