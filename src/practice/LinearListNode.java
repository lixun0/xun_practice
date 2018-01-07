package practice;

import java.util.Scanner;

public class LinearListNode {
    private Integer data;
    private LinearListNode next;

    public LinearListNode(Integer data) {
        this.data = data;
        this.next = null;
    }


    public void setNext(LinearListNode node) {
        this.next = node;
    }

    public LinearListNode getNext() {
        return this.next;
    }

    public Integer getData() {
        return data;
    }

    @Override
    public String toString(){
        return this.data.toString();
    }
}

class ListRunner {
    public static void ListRunne(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinearListNode head = new LinearListNode(0);
        LinearListNode tmp_head = head;
        for (int i = 0; i < N; i++) {
            int data = scanner.nextInt();
            LinearListNode node = new LinearListNode(data);
            tmp_head.setNext(node);
            tmp_head = node;
        }

        LinearListNode node = head.getNext();

        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }
}