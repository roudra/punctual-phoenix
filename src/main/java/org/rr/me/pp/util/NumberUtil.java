package org.rr.me.pp.util;

import javax.inject.Singleton;

@Singleton
public class NumberUtil {

    public int getPrime(){
        return this.getPrime((int) (Math.random()*10));
    }

    public int getPrime(Integer minimum){
        if(isPrime(minimum))
            return minimum;
        else
            return getPrime(minimum++);
    }

    public boolean isPrime(Integer test) {
        if (test < 2)
            return false;
        for (int factor = 2; factor < test; factor++) {
            if (test % factor == 0)
                return false;
        }
        return true;
    }

}
