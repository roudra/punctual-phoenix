package org.rr.me.pp.rest;

import org.rr.me.pp.util.NumberUtil;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/prime")
public class PrimeResource {

    @Inject
    NumberUtil nu;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int getRandomPrime() {
        return nu.getPrime();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{number}")
    public boolean isPrime(int number) {
        return nu.isPrime(number);
    }
}
