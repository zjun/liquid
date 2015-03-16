package zjun.liquid.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "liquid", name = "event")
public class Event {

	public static final int RESULT_NONE = 0;
	public static final int RESULT_1ST = 1;
	public static final int RESULT_2ND = 2;

	@Id
	private String id;
	private boolean submitted;
	private boolean passed;
	private int result;
	private float billable;
	private int quarter;
	private int year;
	private String player;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isSubmitted() {
		return submitted;
	}

	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public float getBillable() {
		return billable;
	}

	public void setBillable(float billable) {
		this.billable = billable;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

}
