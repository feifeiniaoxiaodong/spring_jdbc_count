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
	 * ҵ���߼��㣬дת�˵�ҵ��
	 * ����dao�ķ���
	 */
	public void accountMoney(){
		//С����1000
		ordersdao.lessMoney();
		
		int a=10/0;
		//С����1000
		ordersdao.moreMoney();
	}
}
