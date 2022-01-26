public class PC {
    //Declaring variables for each of the object's fields (states)
    String pcName;
    String processorType;
    String hardDrive;
    int price;

    //constructor for the PC object. Fields are initialised here.
    public PC(String pcName, String processorType, String hardDrive, int price) {
        this.pcName = pcName;
        this.processorType = processorType;
        this.hardDrive = hardDrive;
        this.price = price;
    }

    //getter methods for each field to be used in the Test Class to view the object's states.
    public String getPcName() {
        return pcName;
    }

    public String getProcessorType() {
        return processorType;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public int getPrice() {
        return price;
    }

    //setter method to allow the price to be set within the test class.
    public void setPrice(int price) {
        this.price = price;
    }

    // display method to display the object's states in the console window when program is run.
    public void Display() {
        System.out.println("PC Name: " + pcName);
        System.out.println("Processor Type " + processorType);
        System.out.println("Hard Drive: " + hardDrive);
        System.out.println("Price: €" + price);
    }
}
