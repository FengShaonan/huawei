import java.util.Scanner;

public class 升序或降序进行排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=Integer.parseInt(input.nextLine());
            String[] arrStr=input.nextLine().split(" ");
            int biaoshi=Integer.parseInt(input.nextLine());
            int[] arrInt=new int[n];
            for (int i = 0; i < n; i++) {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
            sheng(arrInt);
            if(biaoshi==0){
                for (int i = 0; i < arrInt.length-1; i++) {
                    System.out.print(arrInt[i]+" ");
                }
                System.out.println(arrInt[arrInt.length-1]);
            }else if(biaoshi==1){
                for (int i = arrInt.length-1; i >0 ; i--) {
                    System.out.print(arrInt[i]+" ");
                }
                System.out.println(arrInt[0]);
            }
        }
        input.close();
    }
    public static  int[] sheng(int[] args){
        int m=args.length;
        for (int i = 0; i <m ; i++) {
            for (int j = i+1; j <m ; j++) {
                if(args[i]>args[j]){
                     int temp=args[i];
                     args[i]=args[j];
                     args[j]=temp;
                }
            }
        }
        return args;
    }
}
