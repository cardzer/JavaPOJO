package bank;

import java.util.Random;

abstract public class Money implements Currency, Country{
    // this is going to generate a random value and return it
    // to the calling method
    public Integer generateMoney() {
        Random random = new Random();
        return random.nextInt(50);
    }

    // this is going to multiply the parameter coming into the method
    public Integer changeMoney(Integer money) {
        return Math.multiplyExact(money, 2);
    }
}
