package com.kvvssut.interviews.threads;

import java.util.LinkedList;

public class VirtualProducer implements Runnable {

	private LinkedList<String> itemsQueue;
	private final int MAX_BUCKET_SIZE;

	public VirtualProducer(LinkedList<String> itemsQueue, final int MAX_BUCKET_SIZE) {
		this.itemsQueue = itemsQueue;
		this.MAX_BUCKET_SIZE = MAX_BUCKET_SIZE;
	}

	@Override
	public void run() {
		int itemCounter = 0;
		while (true) {
			try {
				produce(itemCounter++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(int itemCounter) throws InterruptedException {
		synchronized (itemsQueue) {
			if (itemsQueue.size() == MAX_BUCKET_SIZE) {
				System.out.println("Bucket is full! So waiting for items to get consumed.");
				itemsQueue.wait();
			}

			Thread.sleep(1000);
			itemsQueue.add("Item" + itemCounter);
			System.out.println("Produced - Item" + itemCounter);
			itemsQueue.notify();
		}

	}

}
