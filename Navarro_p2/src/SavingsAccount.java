public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public double amount2(){
        return savingsBalance;
    }

    public void calculateMonthlyInterest(double savings, double rand) {
        double monthlyInterest = (savings * rand) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double rand) {

        annualInterestRate = rand;
    }

    public void amount(double amount){

       savingsBalance = amount;
    }

    public void print(){
        System.out.println("Savings balance this month is now " + savingsBalance);

    }
    public static void main(String[] args){
        int i;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver2.amount(3000.00);
        saver1.amount(2000.00);

        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);

        System.out.println("FOR SAVINGS1 ACCOUNT WITH 4% INTEREST");
        for(i = 1; i <=12; ++i){
            saver1.calculateMonthlyInterest(saver1.amount2(), .04);
            System.out.println("Month " + (i));
            saver1.print();
            System.out.println("\n");

        }
        System.out.println("FOR SAVINGS2 ACCOUNT WITH 4% INTEREST");
        for(i = 1; i <=12; ++i){
            saver2.calculateMonthlyInterest(saver2.amount2(), .04);
            System.out.println("Month " + (i));
            saver2.print();
            System.out.println("\n");

        }

        saver1.calculateMonthlyInterest(saver1.amount2(), .05);
        saver2.calculateMonthlyInterest(saver2.amount2(), .05);

        System.out.println("THE NEXT MONTH FOR SAVER1");
        saver1.print();
        System.out.println("\n\n");


        System.out.println("THE NEXT MONT FOR SAVE2");
        saver2.print();
        System.out.println("\n\n");




    }
}
