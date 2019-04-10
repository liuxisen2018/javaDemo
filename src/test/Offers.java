package test;

import java.util.Scanner;

/**
 * @author: liuxs
 * @date: Created in 6:55 PM  2019/4/9
 */
public class Offers {
    private static class Node{
        private char data;
        private Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head=null;
    static Node tem = null;
    public void addNode(char d){
        Node N = new Node(d);
        if(head==null){
            head = N;
            return;
        }
        tem = head;
        while(tem.next!=null){
            tem = tem.next;
        }
        tem.next = N;
    }
    public static boolean isLoop(Node head){
        Node slow = head;
        Node fast = head;

        if(fast == null){
            return false;
        }
        while(fast!=null&&fast.next!=null){
            //写在if前面会导致空指针异常 因为无环时 fast.next.next 可能为空，我下面重新写了个方法。
            slow = slow.next;
            fast = fast.next.next;
            if(fast.data==slow.data){
                return true;
            }
        }
        return false;
    }

    public static boolean isLoopNode(Node head){
      if(head == null){
          return false;

      }
      if(head.next == null){
          return false;
      }
        Node slow = head.next;
        Node fast = head.next.next;
        //如果因为fast==null 跳出循环  则肯定没有环
        while(fast!=null)
        {

            if(slow.data == fast.data){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return false;
    }

    public static void main(String[] args){

        //构建数据   addNode方法不能构建有环链表，暂时舍弃，造了点数据
        Node node1 = new Node('a');
        Node node2 = new Node('b');
        Node node3 = new Node('c');
        Node node4 = new Node('d');
        Node node5 = new Node('e');
        Node node6 = new Node('f');

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        //设置为有环链表
        node6.next = node4;
        head = node1;
        System.out.println(isLoopNode(head));

    }

}
