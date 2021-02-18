 interface TollBooth{
	 public void displayData();
	 public void calculateToll(Truck T);
 }
	
   interface Truck
   {
	   public int getAxels();
	   public int getWeight();
   }
   
    class Truck1  implements Truck
    {
    	int axels;
    	int weight;
    	
    	Truck1(int axels,int weight)
    	{
    		this.axels=axels;
    		this.weight=weight;
    		
    	}
    	 public int getAxels()
    	 {
    		 return axels;
    	 }
    	 
    	 public int getWeight()
    	 {
    		 return weight;
    	 }
    	 
    }
    class Toll implements TollBooth
      {
    	 	 int truckcount = 0;
			 long receipt = 0;
    		 
        public void calculateToll(Truck T)
    		 {
    		
    		     int axels=T.getAxels();
    			 int Weight=T.getWeight();
    			 
    			 System.out.println("No of Axles: "+ axels);
    			 System.out.println("Weight of the truck" + " "   +Weight+    "kg");
    			 
    			 long tollpaid=(axels*5)+(10*(Weight/500));
    		        System.out.println("Total toll paid is"+ " "   +tollpaid);
    			 
    			 truckcount=truckcount+1;
    			 receipt=receipt +tollpaid;
    		 }
    		 
    		 public void displayData()
    		      {
    			 System.out.println("No of truck pass the toll"+ " " +truckcount);
				System.out.println("Total number of receipt when"+ " " +truckcount+ "Truck pass the toll:" +receipt);
    			 }

	}
    	 
  public class TestToolBooth {
      public static void main(String[] args) {
    	  TollBooth booth=new Toll();
    	  
    	  Truck1 Ford=new Truck1(5,12500);
    	  Truck1 Nissan=new Truck1(5,12500);
    	  Truck1 Daewoo=new Truck1(5,12500);
    	  
    	  System.out.println("FORD TRUCK ");
    	  booth.calculateToll(Ford);
    	  booth.displayData();
    	  
    	  System.out.println("----------------------------");
    	  
    	  System.out.println("NISSAN TRUCK ");
    	  booth.calculateToll(Nissan);
    	  booth.displayData();
    	  
    	  System.out.println("----------------------------");
    	  
    	  System.out.println("DAEWOO TRUCK ");
    	  booth.calculateToll(Daewoo);
    	  booth.displayData();
    	 
      }
}
