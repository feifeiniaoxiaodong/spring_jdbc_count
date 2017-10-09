package cn.itcast.Service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.OrdersDao;

@Transactional
public class OrdersService {
	
	private OrdersDao ordersdao;
	
	public void setOrdersdao(OrdersDao ordersdao) {
		this.ordersdao = ordersdao;
	}
	
	/*
	 * 业务逻辑层，写转账的业务
	 * 调用dao的方法
	 */
	public void accountMoney(){
		//小王少1000
		ordersdao.lessMoney();
		
		int a=10/0;
		//小王多1000
		ordersdao.moreMoney();
	}
}
