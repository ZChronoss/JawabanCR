package data_clumps.before;

import java.util.Date;

public class RentalDuration {
	private Date start;
	private Date end;
	
	public RentalDuration(Date start, Date end) {
		super();
		if(start.after(end)) {
			System.out.println("Tanggal start tidak bisa lebih besar dari end");
		}else {			
			this.start = start;
			this.end = end;
		}
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	
}
