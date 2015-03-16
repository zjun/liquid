package zjun.liquid;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import zjun.liquid.service.EventService;
import zjun.liquid.service.PlayerService;

public class LiquidApp extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(PlayerService.class);
		classes.add(EventService.class);
		return classes;
	}

}
