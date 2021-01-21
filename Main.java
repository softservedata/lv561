package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(45);
        queue.add(76);
        queue.add(23);
        queue.add(56);
        queue.add(72);
        queue.add(16);
        queue.add(94);
        queue.add(24);
        queue.add(86);
//
        System.out.println("Original list: " + queue);
    }
}
