package per.tw.source.back.not.used;
import java.util.Comparator;

/**
 * 
 * @author jenny
 *
 */
public class CompatorHotelCollection implements Comparator<Object> {

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object beanOne, Object beanTwo) {
		// TODO Auto-generated method stub
		
		
		// cast the object one,two to HotelCollectionBean 
		HotelCollectionBean beanTempOne = (HotelCollectionBean)beanOne;
		HotelCollectionBean beanTempTwo = (HotelCollectionBean)beanTwo;
		
		
		// compare the total afford ,if same,compare the hotel rate
		int comparatorFlag = beanTempOne.getTotalAffordByCustomer().compareTo(beanTempTwo.getTotalAffordByCustomer());
		if( comparatorFlag == 0){
			return beanTempTwo.getHotelRate().compareTo(beanTempOne.getHotelRate());
		}else{
			return comparatorFlag;
		}
		
	}

}
