package balajiconstruction;

public class BalajiConstruction {

    public static void main(String[] args) {

        Customer customer = new Customer();
        Plot plot = new Plot();
        UserInformation.consolUserInput(customer, plot);
        Operations.printCustomerPlotDetails(plot, customer);
        double plotArea=plot.getPlotArea();
        System.out.println("Area of Plot "+plotArea);
      double totalPrice=Operations.getTotalPrice(plot);
      System.out.println("totalPrice " + totalPrice);
      double subsidyAmount = Operations.getSubsidy(plot, totalPrice);
      System.out.println("Subsidy "+ subsidyAmount);
      double registryPrice= Operations.getRegistryPrice(plot, totalPrice);
      System.out.println("Registry Charges "+registryPrice);
      double Cgst = Operations.getCGSTCharges(registryPrice);
      System.out.println("CGST Charges " +Cgst);
      double Sgst = Operations.getSGSTCharges(registryPrice);
      System.out.println("SGST Charges " +Sgst);
      double parking = Operations.getParkingCharges(plot);
      System.out.println("Parking Charges " +parking);
      double societyCharges = Operations.getsocietyMaintenance(totalPrice);
      System.out.println(" Society maintainance" +Operations.getsocietyMaintenance(0));
 
 
 
 
 
    }

}
