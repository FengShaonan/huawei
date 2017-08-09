import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            while(input.hasNext()){


            }
            input.close();
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
