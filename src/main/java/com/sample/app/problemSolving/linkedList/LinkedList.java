package com.sample.app.problemSolving.linkedList;

public class LinkedList {
    /**
     * LinkedList using java
     */

    private Node node = null;

    public void add(Node node) {
        node.setNext(null);

        if (this.node == null) {
            this.node = node;
        } else {
            Node next = this.node;
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(node);
        }
    }

    public Integer traverse() {
        if (this.node == null) {
            System.out.println("Linked list empty");
            return 0;
        } else {
            Node next = this.node;
            System.out.print("Linked List :: ");
            do {
                System.out.print(next.getData() + (next.getNext() != null ? " -> " : " "));
                next = next.getNext();
            } while (next != null);
            System.out.println();
            return 1;
        }
    }

    public Integer delete(Node node) {
        if (this.node == null) {
            System.out.println("Linked list empty");
            return 0;
        } else {
            Node root = this.node;
            do {
                if (root.getNext().getData() == node.getData()) {
                    root.setNext(root.getNext().getNext());
                    System.out.println(node.getData() + " deleted ");
                    return 1;
                } else {
                    root = root.getNext();
                }
            } while (root.getNext() != null);

            System.out.println(node.getData() + " not found in list");
            return -1;
        }
    }

    public Integer search(Node node) {
        if (this.node == null) {
            System.out.println("Linked list empty");
            return 0;
        } else {
            Node next = this.node;
            int index = 0;
            do {
                System.out.print(next.getData() + (next.getNext() != null ? " -> " : " "));
                if (next.getData().equalsIgnoreCase(node.getData())) {
                    System.out.println("\n" + node.getData() + " found at " + (++index));
                    return index;
                } else {
                    next = next.getNext();
                    index++;
                }
            } while (next != null);

            System.out.println(node.getData() + " not found");
            return -1;
        }
    }


}

class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                '}';
    }
}
