package rukmani1;

	abstract class Bank1{
		 abstract  float rateOfInterest();
		}

		class HdfcBank1 extends Bank1{
		      float rateOfInterest(){
		             return 6.3f;
		      }
		      
		      void calCompInterest() {
		    	  System.out.println("calCompInterest");
		      }
		}

		class SbiBank1 extends Bank1{
		      float rateOfInterest(){
		             return 7.5f;
		      }
		}
		class CitiBank1 extends Bank1{
		      float rateOfInterest(){
		             return 8f;
		      }
		}
		public class BankMain1{
	        public static void main(String args[]){
	        	Bank1 bob;
	        	//HdfcBank hob=new HdfcBank();
	        
	        	bob=new HdfcBank1();
	        	
	        	System.out.println("Rate of interest of Hdfc "+bob.rateOfInterest());
	        	//SbiBank sob=new SbiBank();
	        	bob=new SbiBank1();
	        	System.out.println("Rate of interest of SBI "+bob.rateOfInterest());
	        	//CitiBank cob=new CitiBank();
	        	bob=new CitiBank1();
	        	System.out.println("Rate of interest of Citi "+bob.rateOfInterest());
	      }
	}
