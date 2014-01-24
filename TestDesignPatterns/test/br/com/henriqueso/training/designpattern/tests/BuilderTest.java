package br.com.henriqueso.training.designpattern.tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import br.com.henriqueso.training.constructionpatters.builder.Reservation;

public class BuilderTest {

	private static final int HEAD_COUNT = 50;
	private static final double DOLLARS_PER_HEAD = 50.0;
	private static final String CITY = "Porto Alegre";

	@Test
	public void testBuilder() {
		Reservation reservation = new Reservation.Builder(new Date(), CITY)
		.withDollarsPerHead(DOLLARS_PER_HEAD)
		.withHeadcount(HEAD_COUNT)
		.withSiteBooked(true)
		.build();
		
		assertEquals("", 
				CITY, 
				reservation.getCity());
		
		assertEquals("", 
				DOLLARS_PER_HEAD, 
				reservation.getDollarsPerHead(), 
				0.0d);
		
		assertEquals("", 
				HEAD_COUNT, 
				reservation.getHeadcount());
		
		assertTrue("", 
				reservation.isSiteBooked());
	}

}
