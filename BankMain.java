package threadclass;
	class MyBank{
		float amt;
		
		public MyBank() {
			amt=1000;
		}
		
		synchronized public void deposit(float damt) {
		 System.out.println("Inside depoist method");
			amt=amt+damt; //1000+4000=5000
			notify();
		}

	 	synchronized public void withdraw(float wamt) throws InterruptedException {
		if(wamt>amt) {  //2000>1000
			System.out.println("Insufficient balance need to deposit fisrt");
			wait();
			System.out.println("After wait");
		   amt=amt-wamt;  //amt=5000-2000=3000
		   System.out.println("Balance after withdraw "+amt);
		}
		else {
			System.out.println("You can withdraw money");
			
			 amt=amt-wamt;
			 System.out.println("Balance after withdraw "+amt);
			
		}
	   }
	}
	public class BankMain {

		public static void main(String[] args) {
			MyBank bob=new MyBank();
			Thread t1=new Thread() {
				public void run() {
						
							try {
								bob.withdraw(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
			};
			t1.start();
			
			Thread t2=new Thread() {
				public void run() {
				
						bob.deposit(4000);
					
				}
				
			};
			t2.start();
		}

	}
