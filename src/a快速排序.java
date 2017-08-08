import java.util.Scanner;

public class a快速排序 {
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
        int i=start+1;
        int j=end;
        while(true){
             while(i<=end&&data[i]<index){
                  i++;
             }
             while(j>start&&data[j]>index){
                  j--;
             }
             if(i<j){
                swap(data,i,j);
             }else{
                  break;
             }
        }
        swap(data,start,j);
        sort(data,start,j-1);
        sort(data,j+1,end);
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
