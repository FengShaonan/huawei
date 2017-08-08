import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 字符统计 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=br.readLine())!=null){
            System.out.println(fun(line));
        }

    }
    private static  String fun(String str){
        char[] chs=str.toCharArray();
        int[] num=new int[200];
        for(char c: chs){
             int i=(int)c;
             num[i]++;
        }
        int max=0;
        for(int i=0;i<num.length;i++){
             if(max<num[i]){
                  max=num[i];
             }
        }
        StringBuffer sb=new StringBuffer();
        while(max!=0){
            for (int i = 0; i <num.length ; i++) {
                if(max==num[i]){
                     sb.append((char) i);
                }
            }
            max--;
        }
        return sb.toString();
    }
}
