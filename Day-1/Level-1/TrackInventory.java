import java.util.Scanner;

public class TrackInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating the object of Item method
        Item item1= new Item(101,"Laptop",75890.0);
        item1.displayDetails();
        System.out.println("Enter The quantity of the product: ");
        int quantity =sc.nextInt();
        System.out.println("The price of " +quantity+" products are "+item1.cost(quantity));

    }
}

class Item{
      int itemCode;
      String itemName;
      double price;
      //constructor
      Item(int itemCode,String itemName,double price){
          this.itemCode=itemCode;
          this.itemName=itemName;
          this.price=price;

      }
      //Method for displaying the details of the product
      public void displayDetails(){
          System.out.println("Product Details:");
          System.out.println("Item Code: "+itemCode);
          System.out.println("Item Name: "+itemName);
          System.out.println("Item Price:"+price);


      }
      //Method for calculating the cost of the product
      public double cost(int quantity){
          double cost;
          cost=quantity*price;
          return cost;
      }
}