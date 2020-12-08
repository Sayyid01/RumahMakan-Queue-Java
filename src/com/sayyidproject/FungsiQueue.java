package com.sayyidproject;

public class FungsiQueue<T> implements QueInterface<T> {
    private Node front;
    private Node rear;
    private int size;

    public FungsiQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    private class Node{
        private T data;
        private Node next;

        public Node(T data ){
            this(data, null);
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        if(front == null && rear == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void enQueue(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    @Override
    public void deQueue() {
    Node temp ;
    if (!isEmpty()) {
        temp = front;
        front = front.getNext();
        temp.setNext(null);
;
        System.out.println("Antrian telah diproses !");
    }else {
        System.out.println("Antrian Kosong");
    }
    }

    @Override
    public void first() {
        if (!isEmpty()){
            ((ADT)front.getData()).print();
        }else {
            System.out.println("Antrian kosong");
        }
    }

    @Override
    public void printAll() {
        if (size == 0){
            System.out.println("Antrian kosong");
            System.out.println(" ");
        }else {
            System.out.println("Jumlah Antrian : " + size);
            System.out.println("=========== Daftar Antrian ===========\n");
            Node temp = front;
            while (temp != null){
                ((ADT)temp.getData()).print();
                temp = temp.getNext();
            }
        }
    }
}
