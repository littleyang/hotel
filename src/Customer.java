import java.util.List;


public class Customer {
	
	private String customerType;
	
	private String[] reservationDateTime;

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String[] getReservationDateTime() {
		return reservationDateTime;
	}

	public void setReservationDateTime(String[] reservationDateTime) {
		this.reservationDateTime = reservationDateTime;
	}
	
	
	
	public void setTypeAndTimeData(String str){
		
	}
	
	public String searchHotelAndReturn(List<Hotel> hotelList){
		
		return null;
		
	}
	
	
}
