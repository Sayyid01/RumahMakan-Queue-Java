package com.sayyidproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class FungsiQueueTest {
    FungsiQueue fungsi = new FungsiQueue();

    @Test
    public void isEmpty() {
        fungsi.isEmpty();
    }

    @Test
    public void enQueue() {
        ADT adt = new ADT("Naufal", "Ikan_Bakar", 1);
        fungsi.enQueue(adt);
    }

    @Test
    public void first() {
        fungsi.first();
    }

    @Test
    public void deQueue() {
        ADT adt = new ADT("Naufal", "Ikan_Bakar", 1);
        fungsi.enQueue(adt);
        fungsi.deQueue();
    }

    @Test
    public void printAll() {
        ADT adt = new ADT("Naufal", "Ikan_Bakar", 1);
        fungsi.enQueue(adt);
        fungsi.printAll();
    }
}