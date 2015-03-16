package zjun.liquid.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T> {

	public void create(T t);

	public void update(T t);

	public void delete(T t);

	public void deleteById(Serializable id);

	public T getById(Serializable id);

	public List<T> list();

}
