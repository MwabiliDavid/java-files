import java.util.Scanner;
public class calculatetotalcost {
  public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
      double accomdation;
      double meals;
      double activities;

      System.out.println("Enter accomodation cost: ");
      accomdation= scanner.nextDouble();

      System.out.println("Enter meals cost: ");
      meals=scanner.nextDouble();

      System.out.println("Enter activities cost:");
      activities=scanner.nextDouble();

      // calculate total cost

      double totalcost=accomdation+meals+activities;

      System.out.println("total cost:"+totalcost);


  }

}
