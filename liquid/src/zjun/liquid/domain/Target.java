package zjun.liquid.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "liquid", name = "target")
public class Target implements Serializable {

	private static final long serialVersionUID = 3690337906736743620L;

	@EmbeddedId
	private TargetId id;

	private float quarter1;
	private float quarter2;
	private float quarter3;
	private float quarter4;
	private float total;

	public TargetId getId() {
		return id;
	}

	public void setId(TargetId id) {
		this.id = id;
	}

	public float getQuarter1() {
		return quarter1;
	}

	public void setQuarter1(float quarter1) {
		this.quarter1 = quarter1;
	}

	public float getQuarter2() {
		return quarter2;
	}

	public void setQuarter2(float quarter2) {
		this.quarter2 = quarter2;
	}

	public float getQuarter3() {
		return quarter3;
	}

	public void setQuarter3(float quarter3) {
		this.quarter3 = quarter3;
	}

	public float getQuarter4() {
		return quarter4;
	}

	public void setQuarter4(float quarter4) {
		this.quarter4 = quarter4;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
