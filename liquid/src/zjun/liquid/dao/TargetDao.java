package zjun.liquid.dao;

import zjun.liquid.domain.Target;

public class TargetDao extends BaseDao<Target> {

	@Override
	protected Class getObjectClass() {
		return Target.class;
	}

}
