import java.util.Scanner;

public class b折半插入排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String[] arrStr=input.nextLine().split(" ");
            int[] arrInt=new int[arrStr.length];
            for (int i = 0; i <arrInt.length ; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            binaryInsertSort(arrInt);
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(arrInt[i]+" ");
            }
        }
        input.close();
    }
    public static void binaryInsertSort(int[] data){
        for (int i = 1; i <data.length ; i++) {
            if(data[i]<data[i-1]){
                 int temp=data[i];
                 int low=0;
                 int high=i-1;
                 while(low<=high){
                      int mid=(low+high)/2;
                      if (data[mid]<temp){
                          low=mid+1;
                      }else{
                           high=mid-1;
                      }
                 }
                for (int j = i; j >low ; j--) {
                    data[j]=data[j-1];
                }
                data[low]=temp;
            }
        }
    }
}
