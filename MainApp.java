package threadclass;


	

	class MyThread extends Thread{
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println("Thread "+Thread.currentThread());
				
			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
			}
		}


	public class MainApp {

		public static void main(String[] args) throws InterruptedException {
			MyThread tob1=new MyThread();
			MyThread tob2=new MyThread();
			tob2.setName("second");
			tob1.setName("first");
			tob1.setPriority(10);
			
			System.out.println("first isalive "+tob1.isAlive());
			System.out.println("second isalive "+tob2.isAlive());
			tob2.start();
			System.out.println("second isalive "+tob2.isAlive());
			tob2.join();
			System.out.println("second isalive "+tob2.isAlive());
			System.out.println("first isalive "+tob1.isAlive());
			tob1.start();
			System.out.println("first isalive "+tob1.isAlive());

		}

	}







