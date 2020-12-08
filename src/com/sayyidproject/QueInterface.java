package com.sayyidproject;

public interface QueInterface<T> {

    public boolean isEmpty();

    //masuk antrian
    public void enQueue(T data);

    //menghapus dan ngembaliin nilai antrian
    public void deQueue();

    //cek proses awal
    public void first();

    public void printAll();
}
