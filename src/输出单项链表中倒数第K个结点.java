import java.util.Scanner;

/**
 * Created by Shawn Feng on 23/07/2017.
 */
class Node{
    int data;
    Node next=null;
    public Node(int data){
        this.data=data;
    }
}
public class 输出单项链表中倒数第K个结点 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()){
            int num=Integer.valueOf(scanner.nextLine());
            String[] datas=scanner.nextLine().split(" ");
            int k=Integer.valueOf(scanner.nextInt());
            //初始化链表
            Node head=createList(datas);
            //找到倒数第K个链表节点
            if (k==0){
                System.out.println(0);
            }else {
                Node result=findElem(head,k);
                System.out.println(result.data);
            }
        }
    }
     public static Node createList(String[] datas){
         if(datas.length<=0){
             return null;
         }
         Node head=new Node(Integer.valueOf(datas[0]));//创建头结点
         Node temp=head;
         for (int i = 1; i < datas.length; i++) {
             temp.next=new Node(Integer.valueOf(datas[i]));
             temp=temp.next;
         }
         return  head;
     }
     public static  Node findElem(Node head,int k){
         Node fast=head;
         Node slow=head;
         for (int i = 0; i <k-1 ; i++) {
             fast=fast.next;
         }
         while (fast.next!=null){
             fast=fast.next;
             slow=slow.next;
         }
         return slow;
     }
}
