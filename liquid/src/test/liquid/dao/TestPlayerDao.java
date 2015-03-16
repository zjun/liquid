package test.liquid.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import zjun.liquid.dao.PlayerDao;
import zjun.liquid.domain.Player;

public class TestPlayerDao {

	@Test
	public void testCreate() {
		Player player = new Player();
		player.setSn("1");
		player.setName("test");
		player.setBand("7A");

		PlayerDao dao = new PlayerDao();
		dao.create(player);
		Player player1 = dao.getById("1");
		Assert.assertNotNull(player1);
		Assert.assertEquals("test", player1.getName());
	}

	@Test
	public void testGetById() {
		PlayerDao dao = new PlayerDao();
		Player player1 = dao.getById("1");
		Assert.assertNotNull(player1);
		Assert.assertEquals("test", player1.getName());
	}

	@Test
	public void testUpdate() {
		PlayerDao dao = new PlayerDao();
		Player player1 = dao.getById("1");
		player1.setName("test1");
		dao.update(player1);
		Player player2 = dao.getById("1");
		Assert.assertNotNull(player2);
		Assert.assertEquals("test1", player2.getName());
	}

	@Test
	public void testList() {
		PlayerDao dao = new PlayerDao();
		List<Player> list = dao.list();
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
	}

	@Test
	public void testDeleteById() {
		PlayerDao dao = new PlayerDao();
		dao.deleteById("1");
		Player player2 = dao.getById("1");
		Assert.assertNull(player2);
	}

}
