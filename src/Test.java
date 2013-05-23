import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;


public class Test {
	
	public static void main(String[] args){
		
		Hotel lakewoodHotel = new Hotel("Lakewood",110,80,90,80);
		Hotel bridgewoodHotel = new Hotel("Bridgewood",160,110,60,50);
		Hotel ridgewoodHotel = new Hotel("Ridgewood",220,100,150,40);
		
		Date today = new Date();
		
		Customer cs = new Customer();
		cs.setTypeAndTimeData("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
		System.out.println(cs.getCustomerType());
		
		Customer tcs = new Customer();
		tcs.setTypeAndTimeData("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
		System.out.println(tcs.getCustomerType());
//		try {
//			FileReader data = new FileReader(new File("C:\\Users\\jenny\\workspace\\Hotel\\bin\\data.txt"));
//			@SuppressWarnings("resource")
//			BufferedReader dataBuffer = new BufferedReader(data);
//			String str = null;
//			while((str = dataBuffer.readLine()) != null) {
//			
//				System.out.println(str.split(":")[1].split(",")[1]);
//			
//			}
//			
//			data.close();
//			dataBuffer.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			
//		}
		
	}

}
