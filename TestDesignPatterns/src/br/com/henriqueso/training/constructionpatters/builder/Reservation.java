package br.com.henriqueso.training.constructionpatters.builder;

import java.util.Date;

/**
 * The Class Reservation.
 * 
 * @author henrique.so@gmail.com
 */
public class Reservation {

	/** The date. */
	private Date date;
	
	/** The headcount. */
	private int headcount;
	
	/** The city. */
	private String city;
	
	/** The dollars per head. */
	private double dollarsPerHead;
	
	/** The site booked. */
	private boolean siteBooked;
	
	/**
	 * Instantiates a new reservation.
	 *
	 * @param date the date
	 * @param city the city
	 */
	private Reservation(Date date, String city) {
		this.date = date;
		this.city = city;
	}
	
	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		/** Object to be build. */
		private Reservation reservation;
		
		/**
		 * Instantiates a new builder.
		 *
		 * @param date the date
		 * @param city the city
		 */
		public Builder(Date date, String city) {
			this.reservation = new Reservation(date, city);
		}
		
		/**
		 * With headcount.
		 *
		 * @param headcount the headcount
		 * @return the builder
		 */
		public Builder withHeadcount(int headcount) {
			reservation.headcount = headcount;
			return this;
		}
		
		/**
		 * With dollars per head.
		 *
		 * @param dollarysPerHead the dollarys per head
		 * @return the builder
		 */
		public Builder withDollarsPerHead(double dollarysPerHead) {
			reservation.dollarsPerHead = dollarysPerHead;
			return this;
		}
		
		/**
		 * With site booked.
		 *
		 * @param siteBooked the site booked
		 * @return the builder
		 */
		public Builder withSiteBooked(boolean siteBooked) {
			reservation.siteBooked = siteBooked;
			return this;
		}
		
		/**
		 * Builds the reservation.
		 *
		 * @return the reservation
		 */
		public Reservation build() {
			return reservation;
		}
	}

	public Date getDate() {
		return date;
	}

	public int getHeadcount() {
		return headcount;
	}

	public String getCity() {
		return city;
	}

	public double getDollarsPerHead() {
		return dollarsPerHead;
	}

	public boolean isSiteBooked() {
		return siteBooked;
	}
	
}
