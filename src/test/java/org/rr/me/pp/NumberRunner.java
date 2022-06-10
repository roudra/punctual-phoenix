package org.rr.me.pp;

import com.intuit.karate.junit5.Karate;

//@QuarkusTest
class NumberRunner {

//    @Karate.Test
    Karate testGreetingResource(){
        return Karate.run("number").relativeTo(getClass());
    }

}
