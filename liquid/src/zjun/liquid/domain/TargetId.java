package zjun.liquid.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TargetId implements Serializable {
	private static final long serialVersionUID = -12925960169700531L;

	private Integer year;
	private String sn;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

}
