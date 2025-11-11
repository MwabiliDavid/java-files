import java.util.Scanner;
public class calculatetotalcost {
    public static double calculatetotalcost(double accomodationcost, double mealcost, double activitycost){
        return accomodationcost +mealcost +activitycost;
    }
  public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);

      System.out.println("Enter accomodation cost: ");
      double accomodationcost= scanner.nextDouble();

      System.out.println("Enter meals cost: ");
      double mealcost=scanner.nextDouble();

      System.out.println("Enter activities cost:");
      double activitycost=scanner.nextDouble();

      // calculate total cost

      double totalcost = calculatetotalcost(accomodationcost,mealcost,activitycost);

      System.out.println("Total vacation cost:$"+totalcost);


  }

}
