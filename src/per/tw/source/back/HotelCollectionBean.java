package per.tw.source.back;

/**
 * 
 * @author jenny
 *
 */
public class HotelCollectionBean  {
	
	// define the hotel total afford
	private String totalAffordByCustomer;
	
	// set hotel rate
	private String hotelRate;
	
	// define the respondent hotel
	private String hotelName;

	/*
	 * define the set and get methods for hotel and total afford
	 */
	public String getTotalAffordByCustomer() {
		return totalAffordByCustomer;
	}

	public void setTotalAffordByCustomer(String totalAffordByCustomer) {
		this.totalAffordByCustomer = totalAffordByCustomer;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelRate() {
		return hotelRate;
	}

	public void setHotelRate(String hotelRate) {
		this.hotelRate = hotelRate;
	}


}
