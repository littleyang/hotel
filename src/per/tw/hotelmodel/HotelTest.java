package per.tw.hotelmodel;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;



public class HotelTest {

	@BeforeClass
	public static void testSetup(){
		
	}
	
	@AfterClass
	public static void testCleanup(){
		
	}
	
	@Test
	public void testHotel() {
		Hotel hotel = new Hotel("test", 4, 100, 100, 100, 100);
		assertNotNull("when create an hotel and hotel should not null!",hotel);
	}

	@Test
	public void testGetHotelName() {
		Hotel hotel = new Hotel("test", 4, 100, 100, 100, 100);
		assertSame("the get hotel name method should be right!","test", hotel.getHotelName());
	}

	@Test
	public void testSetHotelName() {
		Hotel hotel = new Hotel("", 4, 100, 100, 100, 100);
		hotel.setHotelName("test");
		assertSame("the set hotel name method should be right!","test", hotel.getHotelName());
	}

	@Test
	public void testGetWeekdayRegularPrice() {
		Hotel hotel = new Hotel("test", 4, 100, 100, 100, 100);
		assertEquals("the get hotel weekday regular price method should be right!",100.0, hotel.getWeekdayRegularPrice(),0);
	}

	@Test
	public void testSetWeekdayRegularPrice() {
		Hotel hotel = new Hotel("test", 4, 0, 100, 100, 100);
		hotel.setWeekdayRegularPrice(110);
		assertEquals("the set hotel weekday regular price method should be right!",110.0, hotel.getWeekdayRegularPrice(),0);
	}

	@Test
	public void testGetWeekendRegularPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetWeekendRegularPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWeekdayRewardsPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetWeekdayRewardsPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWeekendRewardsPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetWeekendRewardsPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHotelRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetHotelRate() {
		fail("Not yet implemented");
	}

	@Test
	public void testReturnTotalCostByCustomerTypeAndTime() {
		fail("Not yet implemented");
	}

}
