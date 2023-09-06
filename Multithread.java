package rukmani2;
	//One way to create a thread is extending Thread class
	class Hello extends Thread{
		//override the method run
		public void run() {
			for(int i=1;i<=5;i++) {
			System.out.println("Child thread "+Thread.currentThread());
			}
		}
	}
	public class Multithread {

		public static void main(String[] args) {
			System.out.println("Main "+Thread.currentThread());
			Hello ob = new Hello();
			Hello ob1 = new Hello();
			ob.setName("First");
			ob1.setName("Second");
			ob.start(); //thread can be" started only once
			             //if you start more than once it will give an exception
			ob1.start();

		}

	}





