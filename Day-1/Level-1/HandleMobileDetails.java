//This is the main class
public class HandleMobileDetails {
    public static void main(String[] args) {
        //Creating an object for iphone
      MobilePhone iphone = new MobilePhone("iphone","iphone15Pro",145000.0);
      iphone.displayPhoneDetails();
      //Creating another object for samsung
      MobilePhone samsung = new MobilePhone("Samsung","SamsungS24Ultra",140000.0);
      samsung.displayPhoneDetails();
    }
}

//Another class
class MobilePhone{
    String brand;
    String model;
    double price;

    MobilePhone(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;

    }
    //Method for displaying the details of mobile phone
    public void displayPhoneDetails(){
        System.out.println("Details of the product is: ");
        System.out.println("Brand of the Mobile Phone is: "+brand);
        System.out.println("Model of the Mobile Phone is: "+model);
        System.out.println("Price of the Mobile Phone is: "+price);
    }
}