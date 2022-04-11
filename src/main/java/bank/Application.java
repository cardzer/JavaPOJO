package bank;

public class Application {
    public static void main(String[] args) {
        // this is going to create a new bank object.
        Bank bank = new Bank();
        // this is going to call the calculateBalance method inside the bank
        // class. This class extends the abstract class money. Because this extends
        // money, it gives you access to the generateMoney method inside and can
        // be referenced from within the bank class.
        Integer money = bank.calculateBalance();
        System.out.println("Current balance value: " + money);

        // this is going to call the change money method inside the money class.
        money = bank.changeMoney(money);
        System.out.println("Current balance value after change: " + money);

        // this is going to determine whether or not a number is odd or even.
        // it does this by calling the
        bank.positiveOrNegative(money);

        // this is going to select a random country from a list of strings.
        System.out.println(bank.selectCountry());

        // this is going to check to see if money is equal to 3; if it is,
        // then it is going to throw an exception which will then be
        // caught inside the catch block and log out the exception
        money = 3;
        try {
            if (money == 3) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
