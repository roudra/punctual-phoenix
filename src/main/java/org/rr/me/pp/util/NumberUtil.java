package org.rr.me.pp.util;

import javax.inject.Singleton;
import java.util.Random;

@Singleton
public class NumberUtil {

    final Random ran;

    public NumberUtil(){
        ran= new Random();
    }

    public int getPrime(){
        return this.getPrime(ran.nextInt(100));
    }

    public int getPrime(Integer minimum){
        if(isPrime(minimum))
            return minimum;
        else
            return getPrime(++minimum);
    }

    public boolean isPrime(Integer test) {
        if (test < 2)
            return false;
        if (test == 2)
            return true;
        for (int factor = 2; factor < test; factor++) {
            if (test % factor == 0)
                return false;
        }
        return true;
    }

}
