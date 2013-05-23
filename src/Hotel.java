/**
 * 
 * @author yangyang
 *
 */
public class Hotel {
	
	// define the hotel name
	private String hotelName;
	
	// define the hotel weekday regular price
	private float weekdayRegularPrice;
	
	// define the hotel weekday regular price
	private float weekdayRewardsPrice;
	
	// define the weekend regular price
	private float weekendRegularPrice;
	
	// define the weekend reward price
	private float weekendRewardsPrice;

	// define the total
	

	public Hotel(String hotelName, float weekdayRegularPrice,
			float weekdayRewardsPrice, float weekendRegularPrice,
			float weekendRewardsPrice) {
		super();
		this.hotelName = hotelName;
		this.weekdayRegularPrice = weekdayRegularPrice;
		this.weekdayRewardsPrice = weekdayRewardsPrice;
		this.weekendRegularPrice = weekendRegularPrice;
		this.weekendRewardsPrice = weekendRewardsPrice;
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

	public float getWeekendRegularPrice() {
		return weekendRegularPrice;
	}

	public void setWeekendRegularPrice(float weekendayRegularPrice) {
		this.weekendRegularPrice = weekendayRegularPrice;
	}

	public float getWeekdayRewardsPrice() {
		return weekdayRewardsPrice;
	}

	public void setWeekdayRewardsPrice(float weekdayRewardsPrice) {
		this.weekdayRewardsPrice = weekdayRewardsPrice;
	}

	public float getWeekendRewardsPrice() {
		return weekendRewardsPrice;
	}

	public void setWeekendRewardsPrice(float weekendayRewardsPrice) {
		this.weekendRewardsPrice = weekendayRewardsPrice;
	}
	
	/**
	 * every hotel should have the method to calculate the total afford according to customerType and 
	 * customerDate and return to the customer
	 * @param customerType
	 * @param customrDate
	 * @return totalAfford
	 */
	public float returnTotalCostByCustomerTypeAndTime(String customerType,int[] customrDate){
		float totalAfford = 0;
		if(customerType=="Rewards"){
			for(int i=0;i<customrDate.length;i++){
				if(0<customrDate[i]&&customrDate[i]<6){
					totalAfford = totalAfford + getWeekdayRewardsPrice();
				}
				else{
					totalAfford = totalAfford + getWeekendRewardsPrice();
				}
			}
		}else{
			for(int i=0;i<customrDate.length;i++){
				if(0<customrDate[i]&&customrDate[i]<6){
					totalAfford = totalAfford + getWeekdayRegularPrice();
				}
				else{
					totalAfford = totalAfford + getWeekendRegularPrice();
				}
			}
		}
		return totalAfford;
	}
}
