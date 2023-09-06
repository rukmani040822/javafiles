package rukmani1;

	abstract class Bank{
		 abstract  float rateOfInterest();
		}

		class HdfcBank extends Bank{
		      float rateOfInterest(){
		             return 6.3f;
		      }
		}

		class SbiBank extends Bank{
		      float rateOfInterest(){
		             return 7.5f;
		      }
		}
		class CitiBank extends Bank{
		      float rateOfInterest(){
		             return 8f;
		      }
		}
		public class BankMain{
		        
			public static void main(String args[]){
				
                HdfcBank hob=new HdfcBank();
                System.out.println( "Rate of interest of Hdfc"+ hob.rateOfInterest());
		        SbiBank sob=new SbiBank();
		        System.out.println("Rate of interest of SBI"+ sob.rateOfInterest());
		        CitiBank cob=new CitiBank();
		        System.out.println("Rate of interest of CitiBank"+ cob.rateOfInterest());
		        
		        }
		}

