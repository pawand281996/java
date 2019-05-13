package com.codingblocks.Heaps;

public class Main {
    public static void main(String[] args) {
        MinHeap_intro<Integer> heap = new MinHeap_intro<>();

        for (int i = 0; i < 10 ; i++) {
            int rand = (int)(Math.random() * 10);
            heap.insert(rand);
        }

        while (!heap.isEmpty()) {
            System.out.print(heap.remove());
        }
    }
}
