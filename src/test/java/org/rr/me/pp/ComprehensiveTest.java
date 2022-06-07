package org.rr.me.pp;

import com.intuit.karate.junit5.Karate;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ComprehensiveTest {

    @Karate.Test
    Karate testGreetingResource(){
        return Karate.run("greeting").relativeTo(getClass());
    }

}
