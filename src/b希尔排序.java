import java.util.Scanner;

public class b希尔排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            shellSort(arrInt);
            for (int i = 0; i <arrInt.length ; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }

    public static void shellSort(int[] data){
        int h=1;
        if(h<=data.length/3){
             h=h*3+1;
        }
        while(h>0){
            for (int i = h; i <data.length ; i+=h) {
                if(data[i]<data[i-h]){
                     int temp=data[i];
                     int j=i-h;
                     while(j>=0&&data[j]>temp){
                          data[j+h]=data[j];
                          j=j-h;
                     }
                     data[j+h]=temp;
                }
            }
             h=(h-1)/3;
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
