package org.rr.terminal.resoruces;

import org.rr.terminal.models.Settings;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/settings")
public class SettingsResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Settings getSettings() {
        return Settings.builder().color("GREEN").build();
    }
}
