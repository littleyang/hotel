import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Customer {
	
	private String customerType;
	
	private int[] reservationDateTime;

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int[] getReservationDateTime() {
		return reservationDateTime;
	}

	public void setReservationDateTime(int[] reservationDateTime) {
		this.reservationDateTime = reservationDateTime;
	}
	
	
	
	public void setTypeAndTimeData(String str){
		
		
	}
	
	public String searchHotelAndFindAndReturnCheapestAndBestOne(List<Hotel> hotelList){
		
		// 不知道是不是应该在这里用到观察这模式呢？
		List<Map<Float,Object>> tempList = new ArrayList<>();
		
		float[] totalList = new float[hotelList.size()];
		
		for(int k=0;k<hotelList.size();k++){
			
			Map<Float,Object> temp = new HashMap<>();
			
			totalList[k]=hotelList.get(k).returnTotalCostByCustomerTypeAndTime(getCustomerType(), getReservationDateTime());
			
			temp.put(hotelList.get(k).returnTotalCostByCustomerTypeAndTime(getCustomerType(), getReservationDateTime()), hotelList.get(k));
			
			tempList.add(temp);
		}
		
		return null;
		
	}
	
	
}
