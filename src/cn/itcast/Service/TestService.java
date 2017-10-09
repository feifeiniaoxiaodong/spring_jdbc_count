package cn.itcast.Service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	@Test
	public void testservice(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("bean1.xml");
		OrdersService ordersservice=(OrdersService)context.getBean("ordersservice");
		
		ordersservice.accountMoney();
	}

}
