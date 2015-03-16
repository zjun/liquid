package test.liquid.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import zjun.liquid.dao.EventDao;
import zjun.liquid.domain.Event;

public class TestEvent {

	@Test
	public void testCreate() {
		Event event = new Event();
		event.setId("001");
		event.setBillable(1000);
		event.setPassed(true);
		event.setPlayer("1");
		event.setQuarter(1);
		event.setResult(Event.RESULT_1ST);
		event.setSubmitted(true);
		event.setYear(2015);

		EventDao dao = new EventDao();
		dao.create(event);
		Event event1 = dao.getById("001");
		Assert.assertNotNull(event1);
		Assert.assertTrue(1000 == event1.getBillable());
	}

	@Test
	public void testGetById() {
		EventDao dao = new EventDao();
		Event event1 = dao.getById("001");
		Assert.assertNotNull(event1);
		Assert.assertTrue(1000 == event1.getBillable());
	}

	@Test
	public void testUpdate() {
		EventDao dao = new EventDao();
		Event event1 = dao.getById("001");
		event1.setBillable(2000);
		dao.update(event1);
		Event event2 = dao.getById("001");
		Assert.assertNotNull(event2);
		Assert.assertTrue(2000 == event1.getBillable());
	}

	@Test
	public void testList() {
		EventDao dao = new EventDao();
		List<Event> list = dao.list();
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
	}

	@Test
	public void testDeleteById() {
		EventDao dao = new EventDao();
		dao.deleteById("001");
		Event event1 = dao.getById("001");
		Assert.assertNull(event1);
	}

}
