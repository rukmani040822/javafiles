package rukmani2;


	 abstract class Shape{
	    //abstract void area();
		 int i;
		 
		 Shape(){
			 
		 }
		abstract void area() ;
	   void display(){
	           System.out.println("Display parent shape");
	   }
	}

	abstract class Triangle extends Shape{

		
	      
		void display(){
	        System.out.println("Display child");
	}
		
	}

	class MyClass extends Triangle{

		@Override
		void area() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public class AbstractExtends {
	public static void main(String[] args) {
//		Shape sob=new Shape();//no object for abstract
		MyClass tob=new MyClass();
		tob.area();
		tob.display();
	}
	}	

