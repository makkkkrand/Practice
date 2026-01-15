package com.practice.dataStructure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(10, Comparator.reverseOrder());
        q.add(5);
        q.add(1);
        q.add(4);
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.add(6);
        q.add(2);
        System.out.println(q.poll());
        System.out.println(q.poll());
        q.add(3);
        System.out.println(q.poll());
        System.out.println(q.poll());
    }

}
