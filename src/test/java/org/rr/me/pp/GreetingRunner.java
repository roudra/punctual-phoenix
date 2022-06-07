package org.rr.me.pp;

import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;

//@QuarkusTest
class GreetingRunner {

//    @Karate.Test
    Karate testGreetingResource(){
        return Karate.run("greeting").relativeTo(getClass());
    }

}
