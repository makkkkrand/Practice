package com.practice.dataStructure;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(10, true);

        blockingQueue.put(1);
        blockingQueue.put(2);
        blockingQueue.put(3);
        blockingQueue.put(4);
        blockingQueue.put(5);
        blockingQueue.put(6);
        blockingQueue.put(7);
        blockingQueue.put(8);
        blockingQueue.put(9);
        blockingQueue.put(0);
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        blockingQueue.put(10);
        blockingQueue.put(11);


        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        blockingQueue.put(12);
        blockingQueue.put(13);
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        blockingQueue.put(13);
        System.out.println(blockingQueue.take());

        System.out.println("Size:"+blockingQueue.size());


    }

}
