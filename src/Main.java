public class Main {
    public static void main(String[] args) {
        int springCost = 350;
        int summerCost = 410;
        int fallCost = 335;
        int winterCost = 430;
        int yearCost;

        yearCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your maintenance costs, Spring: $" + springCost + " Summer: $" + summerCost + " Fall: $" + fallCost + " Winter: $" + winterCost + " which totals out to $" + yearCost + " for the year.");

    }
}