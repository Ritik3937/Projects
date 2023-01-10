package balajiconstruction;

public class Plot {

    private double length;
    private double width;
    private String sectorName;
    private String plotId;
    private boolean subsidyStatus = false;
    private int parkingQuantity;
    private int quantity=0;
    public int setquantity(){
        return parkingQuantity;
    }
    public void getQuantity(int quantity){
        this.quantity=quantity;
    }
    public boolean isSubsidyStatus() {
        return subsidyStatus;
    }

    public void setSubsidyStatus(boolean subsidyStatus) {
        this.subsidyStatus = subsidyStatus;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public String getPlotId() {
        return plotId;
    }

    public void setPlotId(String plotId) {
        this.plotId = plotId;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Plot(double length, double width, String sectorName, String plotId) {
        this.length = length;
        this.width = width;
        this.sectorName = sectorName;
        this.plotId = plotId;
    }

    public Plot() {

    }

    public Plot(double length, String sectorName, String plotId) {
        this.length = length;
        this.sectorName = sectorName;
        this.plotId = plotId;
        width = 20;

    }

    public Plot(String sectorName, String plotId) {
        this.sectorName = sectorName;
        this.plotId = plotId;
        length = 50;
        width = 20;
    }

    public double getPlotArea() {
        return length * width;
    }
}
