package threadclass;

class MultiTable{
	synchronized void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}
class MyThread1 extends Thread{
	MultiTable t1;
	public MyThread1(MultiTable table) {
		this.t1=table;
	}

	public void run() {
		t1.table(2);
	}
}
class MyThread2 extends Thread{
	MultiTable t2;
	public MyThread2(MultiTable table) {
		this.t2=table;
	}

	public void run() {
		t2.table(5);
	}
}
public class SynchApp {

	public static void main(String[] args) {
		MultiTable table = new MultiTable();
		MyThread1 tob1=new MyThread1(table);
		tob1.start();
		MyThread2 tob2=new MyThread2(table);
		tob2.start();
	}

}

