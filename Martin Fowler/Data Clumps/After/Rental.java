package data_clumps.before;

import java.util.*;

public class Rental {
	private Movies movie;
	private RentalDuration rd;
	
	public Rental(Movies movie, Date start, Date end) {
		super();
		this.movie = movie;
		this.rd = new RentalDuration(start, end);
	}
	
	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public RentalDuration getRd() {
		return rd;
	}

	public void setRd(RentalDuration rd) {
		this.rd = rd;
	}
	
	
}
