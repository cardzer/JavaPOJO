package bank;

import java.util.*;

public class Bank extends Money {
    public Integer calculateBalance() {
        return generateMoney();
    }

    // this is going to work out whether a number is odd or even
    @Override
    public void positiveOrNegative(Integer money) {
        if (money % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    // this is going to select random list of strings
    @Override
    public String selectCountry() {
        List<String> list = Arrays.asList("UK", "Spain", "France");
        Random random = new Random();

        return list.get(random.nextInt(2));
    }
}
