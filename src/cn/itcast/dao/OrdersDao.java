package cn.itcast.dao;



import com.mchange.v2.c3p0.ComboPooledDataSource;


import org.springframework.jdbc.core.JdbcTemplate;

public class OrdersDao {
	
	JdbcTemplate  jdbctemplate;
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
//	ComboPooledDataSource datasource;
	/*
	 * �������ݿ�Ĳ�����������дҵ�����
	 */
	//��Ǯ�ķ���
	public void lessMoney(){
		String sql="update account set salary=salary-? where username=?";
		jdbctemplate.update(sql,1000,"С��");
	
	}
	
	//��Ǯ�ķ���
	public void moreMoney(){
		String sql="update account set salary=salary+? where username=?";
		jdbctemplate.update(sql,1000,"С��");
	
	}

}
