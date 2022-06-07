package org.rr.me.pp;

import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;

//@QuarkusTest
class SettingRunner {

//    @Karate.Test
    Karate testPositive(){
        return Karate.run("setting").relativeTo(getClass());
    }

}
