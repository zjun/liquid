package zjun.liquid.dao;

import zjun.liquid.domain.Event;

public class EventDao extends BaseDao<Event> {

	@Override
	protected Class getObjectClass() {
		return Event.class;
	}

}
