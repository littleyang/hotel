package per.tw.source.back;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Customer {
	
	// define the customer type
	private String customerType;
	// define the customer date time
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
	
	
	/**
	 * 
	 * @param str
	 */
	public void setTypeAndTimeData(String str){
		
		String[] tempStr = str.split(":");
		
		// according to the  data string to get the customer type 
		setCustomerType(tempStr[0]);
		
		// according to the  data string to get the customer date time
		setReservationDateTime(analysisTheDataStringAndGetTheDateTime(tempStr[1]));
		
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public int[] analysisTheDataStringAndGetTheDateTime(String str){
		
		String[] tempDateTime = str.split(",");
		int[] returnResultDateTime = new int[tempDateTime.length];
		for(int i=0;i<tempDateTime.length;i++){
			returnResultDateTime[i] = parseTheDateStringToWeekDay(tempDateTime[i]);
		}
		return returnResultDateTime;
	}
	
	/**
	 * 
	 * @param str
	 * @return: int day
	 */
	public int parseTheDateStringToWeekDay(String str){
		int day = 0;
		Matcher m = Pattern.compile("\\(([^)]*)\\)").matcher(str);
		while (m.find()) {
           switch(m.group(1)){
        	   case "mon": day = 1; break;
        	   case "tues": day = 2; break;
        	   case "wed": day = 3; break;
        	   case "thur": day = 4; break;
        	   case "fri": day = 5; break;
        	   case "sat": day = 6; break;
        	   case "sun": day = 7; break;
           }
		}
		return day;
	}
	
	/**
	 * 
	 * @param hotelList
	 * @return
	 */
	public String searchHotelAndFindAndReturnCheapestAndBestOne(List<Hotel> hotelList){
		
		// the compator for the list
		CompatorHotelCollection hotelCompator = new CompatorHotelCollection();
		List<HotelCollectionBean> tempList = new ArrayList<HotelCollectionBean>();	
		
		for(Hotel hotel:hotelList){
			
			HotelCollectionBean bean = new HotelCollectionBean();
			bean.setTotalAffordByCustomer(Float.toString(hotel.returnTotalCostByCustomerTypeAndTime(getCustomerType(), getReservationDateTime())));
			bean.setHotelName(hotel.getHotelName());
			bean.setHotelRate(hotel.getHotelRate());
			tempList.add(bean);
		}
		
		// sort the hotel temp list
		Collections.sort(tempList,hotelCompator);
		// get the cheapest one and the best one
//		for(int i=0;i<tempList.size();i++){
//			System.out.println(tempList.get(i).getHotelName()+" "+tempList.get(i).getHotelRate()+" "+tempList.get(i).getTotalAffordByCustomer());
//		}
		return tempList.get(0).getHotelName();
		
	}
	
}
