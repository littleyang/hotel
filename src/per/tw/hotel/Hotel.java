package per.tw.hotel;

public class Hotel {
	
	private String hotelName;
	
	private float weekdayRegularPrice;
	
	private float weekdayRewardsPrice;
	
	private float weekendayRegularPrice;
	
	private float weekendayRewardsPrice;

	

	public Hotel(String hotelName, float weekdayRegularPrice,
			float weekdayRewardsPrice, float weekendayRegularPrice,
			float weekendayRewardsPrice) {
		super();
		this.hotelName = hotelName;
		this.weekdayRegularPrice = weekdayRegularPrice;
		this.weekdayRewardsPrice = weekdayRewardsPrice;
		this.weekendayRegularPrice = weekendayRegularPrice;
		this.weekendayRewardsPrice = weekendayRewardsPrice;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public float getWeekdayRegularPrice() {
		return weekdayRegularPrice;
	}

	public void setWeekdayRegularPrice(float weekdayRegularPrice) {
		this.weekdayRegularPrice = weekdayRegularPrice;
	}

	public float getWeekendayRegularPrice() {
		return weekendayRegularPrice;
	}

	public void setWeekendayRegularPrice(float weekendayRegularPrice) {
		this.weekendayRegularPrice = weekendayRegularPrice;
	}

	public float getWeekdayRewardsPrice() {
		return weekdayRewardsPrice;
	}

	public void setWeekdayRewardsPrice(float weekdayRewardsPrice) {
		this.weekdayRewardsPrice = weekdayRewardsPrice;
	}

	public float getWeekendayRewardsPrice() {
		return weekendayRewardsPrice;
	}

	public void setWeekendayRewardsPrice(float weekendayRewardsPrice) {
		this.weekendayRewardsPrice = weekendayRewardsPrice;
	}
	
	public Hotel returnTotalCostByCustomerTypeAndTime(String customerType,String[] customrDate){
		
		return null;
	}
}
