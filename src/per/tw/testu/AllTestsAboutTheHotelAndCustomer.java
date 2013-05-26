package per.tw.testu;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import per.tw.compator.CompatorHotelCollectionTest;
import per.tw.customer.CustomerTest;
import per.tw.databean.HotelCollectionBeanTest;
import per.tw.hotelmodel.HotelTest;

@RunWith(Suite.class)
@SuiteClasses({
	HotelTest.class,
	CustomerTest.class,
	HotelCollectionBeanTest.class,
	CompatorHotelCollectionTest.class
})
public class AllTestsAboutTheHotelAndCustomer {

}
