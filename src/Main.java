import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Asking the user for info on the tip and other related things
        Scanner s = new Scanner(System.in);
        System.out.print("What is the total bill: ");
        String totalBill = s.nextLine();
        System.out.print("What is the tip percentage: ");
        String tipPercent = s.nextLine();
        System.out.print("How many people are there: ");
        String numOfPeople = s.nextLine();

        //Turning the user inputs into usable numbers
        double totalBillD = Double.parseDouble(totalBill);
        double tipPercentD = Double.parseDouble(tipPercent);
        int numOfPeopleD = Integer.parseInt(numOfPeople);
        tipPercentD = tipPercentD/100;

        //Doing the calculations in order to display them
        double totalTip = totalBillD * tipPercentD;
        double totalTipAndBill = totalTip + totalBillD;
        double totalTipPerPerson = totalTip / numOfPeopleD;
        double totalTipAndBillPerPerson = totalTipAndBill / numOfPeopleD;

        //Rounding the calculation so that they have two decimal points
        totalTip = Math.round(totalTip*Math.pow(10,2))/Math.pow(10,2);
        totalTipAndBill = Math.round(totalTipAndBill*Math.pow(10,2))/Math.pow(10,2);
        totalTipPerPerson = Math.round(totalTipPerPerson*Math.pow(10,2))/Math.pow(10,2);
        totalTipAndBillPerPerson = Math.round(totalTipAndBillPerPerson*Math.pow(10,2))/Math.pow(10,2);

        //Printing info to the user
        System.out.println();
        System.out.println("As the bill is " + totalBillD + ", and the tip percentage is " + tipPercent + "%:");
        System.out.println("The total tip amount is " + totalTip);
        System.out.println("Each person will pay this much in tips: " + totalTipPerPerson);
        System.out.println("The total tip including the bill is " + totalTipAndBill);
        System.out.println("And so each person overall will be paying: " + totalTipAndBillPerPerson);
    }
}
