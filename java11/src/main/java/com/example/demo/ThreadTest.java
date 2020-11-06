package com.example.demo;

class MyThread extends Thread {
    @Override
    public void run() {
	for (int i = 0; i < 10; i++) {
	    System.out.println("MyThread");

	    try {
		sleep(10);
	    } catch (InterruptedException e) { // TODO Auto-generated
		// catch block
		e.printStackTrace();
		
	    }

	}

    }
}

public class ThreadTest {

    public ThreadTest() {
	// TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws InterruptedException {
	Runnable t1 = () -> {
	    for (int i = 0; i < 10; i++) {
		System.out.println("runnable");
	    }

	};
	MyThread t2 = new MyThread();
	Thread runnabel = new Thread(t1);
	t2.start();
	// t2.run();
	runnabel.start();
	runnabel.join();

    }

}
