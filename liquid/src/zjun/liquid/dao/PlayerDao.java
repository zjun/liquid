package zjun.liquid.dao;

import zjun.liquid.domain.Player;

public class PlayerDao extends BaseDao<Player> {

	@Override
	protected Class getObjectClass() {
		return Player.class;
	}

}
