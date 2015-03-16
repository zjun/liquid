package zjun.liquid.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerService {

	@GET
	public String getMessage() {
		return "Hello Player!!!!!!!!!!!!!!!";
	}
}
