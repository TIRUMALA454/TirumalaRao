package Day3;

/*
 * Multitaksing 
 * Multiprocessing -
 *  Working with multiple application at the same time 
 *    ex: notepad, mp3 player
 *  OS Specific
 *  Each process requires its own memory
 *                 
 * Multithreading - 
 *  One application - many tasks performing simultaneously
 *  all tasks are independent each other.
 *  ex: Gaming applications, animations, sending web requests to servers, 
 *  advantage - improves performance
 *  memory shared by all threads
 *  inter-thread communication will be faster 
 *    wait(), notify(), notifyAll()
 *    
 * Thread Life cycle / states:
 *    New - new keyword - When thread is instantiated, then state of the thread is in New state
 *    Runnable - start() - state of thread will be Runnable 
 *    Running - Once thread scheduler allocates resources
 *    blocked/Timed Waiting - wait(), yield(), suspend(), join()
 *        - blocked to running state - resume(), notify() & notifyAll()
 *    Dead/Terminate - execution of run() is over. 
 *                   - other threads interrupted current thread execution 
 *    
 * * Thread scheduler is responsible for allocating resources or managing threads
 * * default priority of thread - 5
 * * By default main thread will be created by JVM
 * 
 * Way to create threads
 *  2 ways
 *   1. Implementing Runnable interface
 *      step 1: Create class that should implements Runnable interface
 *      step 2: Override void run() 
 *      step 3: Create Thread object using Runnable interface obj.
 *      step 4: call start() method 
 *                    - register thread with thread scheduler
 *                    - calls run() method 
 *                     
 *   2. Extending Thread class (pkg - java.lang)
 *       step 1: Create class that should extends Thread class
 *       step 2: Override run() method of thread class
 *       step 3: Create Thread class object
 *       step 4: call start() method
 *      
 */
public class ThreadRunnableDemo implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		
		ThreadRunnableDemo td1 = new ThreadRunnableDemo();
		Thread t1 = new Thread(td1); // State - New
		Thread t2 = new Thread(td1);
		System.out.println("Before calling start method: " + Thread.activeCount()); // returns number of threads
		System.out.println("Thread Name: "+ Thread.currentThread().getName()); // returns name of thread
	    
		t1.start();// state - Runnable
		//t2.start();
		
		t1.setName("MyThread-0");  // Changes thread name
		System.out.println("After calling start method: "+Thread.activeCount()); // returns number of threads
		// number of threads - 2 threads - main thread & t1 thread
		
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()); // prints current thread name
			Thread.sleep(1000);
		}
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()); // prints current thread name
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

//public class ThreadRunnableDemo {

