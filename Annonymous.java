package threadclass;

public class Annonymous {

	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("Run Method1");
			}
		};
		t1.start();
		
		
		new Thread() {
			public void run() {
				System.out.println("Run Method2");
			}
		}.start();

	}

}
