package balajiconstruction;
import java.util.Scanner;

public class Operations {
public static double parkinQuantity;
    public static void printCustomerPlotDetails(Plot plot, Customer customer) {
        System.out.println("Name " + customer.getName());
        System.out.println("Mobile Number " + customer.getMobileNumber());
        System.out.println("Plot Id" + plot.getPlotId());
        System.out.println("Sector Name" + plot.getSectorName());
        System.out.println("Plot Length" + plot.getLength());
        System.out.println("Plot Width" + plot.getWidth());
    }

    public static double getTotalPrice(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return plot.getPlotArea() * Rate.sectorARates;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return plot.getPlotArea() * Rate.sectorBRates;
        } else {
            return plot.getPlotArea() * Rate.sectorCRates;
        }
    }

    public static double getSubsidy(Plot plot, double totalPrice) {
        if (totalPrice <= Rate.subsidyEligibility) {
            plot.setSubsidyStatus(true);
            return totalPrice - Rate.subsidyAmount;
        } else {
            return totalPrice;
        }
    }

    public static double getRegistryPrice(Plot plot,double totalPrice) {
        if (plot.isSubsidyStatus()) {
            return (totalPrice*Rate.subsidisedRegistryCharges)/100;

        } else {
            return (totalPrice * Rate.registryChargesPercentage) / 100;

        }
    }

   public static double getCGSTCharges(double registryAmount) {
        return ((registryAmount * Rate.CGSTChargesPercentage) / 100);
    }

    public static  double getSGSTCharges(double registryAmount) {
        return ((registryAmount * Rate.SGSTChargesPercentage) / 100);
    }
    
    public static double getsocietyMaintenance(double totalPrice){
        if(totalPrice<=5000000){
            return Rate.societyCharges;
        }else{
            return 0;
        }
    }
    public static double getParkingCharges(Plot plot){
         
    if(plot.isSubsidyStatus()){
    
          return Rate.parkingCharges;
     }else{
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Parking Quantity");
        int quantity = sc.nextInt();
    
       return quantity*Rate.parkingCharges;
        
    }
        
    }
   
    
    
    

}
