package test.liquid.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import zjun.liquid.dao.TargetDao;
import zjun.liquid.domain.Target;
import zjun.liquid.domain.TargetId;

public class TestTargetDao {

	@Test
	public void testCreate() {
		Target target = new Target();
		TargetId id = new TargetId();
		id.setYear(2015);
		id.setSn("1");
		target.setId(id);
		target.setQuarter1(100);
		target.setQuarter2(200);
		target.setQuarter3(300);
		target.setQuarter4(400);
		target.setTotal(1000);

		TargetDao dao = new TargetDao();
		dao.create(target);

		Target target1 = dao.getById(id);
		Assert.assertNotNull(target1);
		Assert.assertTrue(2015 == target1.getId().getYear());
	}

	@Test
	public void testGetById() {
		TargetId id = new TargetId();
		id.setYear(2015);
		id.setSn("1");

		TargetDao dao = new TargetDao();
		Target target1 = dao.getById(id);
		Assert.assertNotNull(target1);
		Assert.assertTrue(2015 == target1.getId().getYear());
	}

	@Test
	public void testUpdate() {
		TargetId id = new TargetId();
		id.setYear(2015);
		id.setSn("1");

		TargetDao dao = new TargetDao();
		Target target1 = dao.getById(id);
		target1.setTotal(2000);
		dao.update(target1);
		target1 = dao.getById(id);
		Assert.assertNotNull(target1);
		Assert.assertTrue(2000 == target1.getTotal());
	}

	@Test
	public void testList() {

		TargetDao dao = new TargetDao();
		List<Target> list = dao.list();
		Assert.assertNotNull(list);
		Assert.assertTrue(1 == list.size());
	}

	@Test
	public void testDeleteById() {
		TargetId id = new TargetId();
		id.setYear(2015);
		id.setSn("1");
		TargetDao dao = new TargetDao();
		dao.deleteById(id);
		Target target1 = dao.getById(id);
		Assert.assertNull(target1);
	}

}
