package com.sample.app.problemSolving.linkedList;


public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(new Node("1"));
        linkedList.add(new Node("2"));
        linkedList.add(new Node("3"));
        linkedList.add(new Node("4"));
        linkedList.add(new Node("5"));
        linkedList.add(new Node("6"));
        linkedList.add(new Node("7"));

        linkedList.traverse();

        linkedList.delete(new Node("2"));
        linkedList.delete(new Node("2"));

        linkedList.delete(new Node("7"));

        linkedList.traverse();
        linkedList.search(new Node("6"));
    }
}