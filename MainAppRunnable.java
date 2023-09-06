package rukmani2;

	//One way to create a thread is extending Thread class
	class Hello1 implements Runnable{
		//override the method run
		public void run() {
			for(int i=1;i<=5;i++) {
			System.out.println("Child thread "+Thread.currentThread());
			}
		}
	}
	public class MainAppRunnable {

		public static void main(String[] args) {
			System.out.println("Main "+Thread.currentThread());
			
			Hello1 ob = new Hello1();
		
			Thread tob=new Thread(ob);
			tob.setName("first");
			
			tob.start(); //thread can be started only once
			             //if you start more than once it will give an exception
			
			//ob.run();

		}

	}

