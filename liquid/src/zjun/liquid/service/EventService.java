package zjun.liquid.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/event")
public class EventService {
	@GET
	public String getMessage() {
		return "Hello Event!!!!!!!!!!!!!!!";
	}
}
