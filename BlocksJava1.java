package rukmani;
	

	public class BlocksJava1 {
		static int staticvalue;
		int nonstaticvalue;
		
		public BlocksJava1(){
			System.out.println("constuctor");
			staticvalue=10;
			nonstaticvalue=20;
			
		}
		void add() {
			staticvalue=staticvalue+1;
			nonstaticvalue=nonstaticvalue+1;
			
		}
		
		 void display() {
			System.out.println("staticvalue="+staticvalue);
			System.out.println("nonstaticvalue="+nonstaticvalue);
		}
		public static void main(String[] args) {
			BlocksJava1 ob=new BlocksJava1();
			BlocksJava1 ob1=new BlocksJava1();
			ob.add(); //11   21
			ob1.add(); //12   21
			ob.display();
			ob1.display();
			

		}

	}

