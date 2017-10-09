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
	 * 做对数据库的操作方法，不写业务操作
	 */
	//少钱的方法
	public void lessMoney(){
		String sql="update account set salary=salary-? where username=?";
		jdbctemplate.update(sql,1000,"小王");
	
	}
	
	//多钱的方法
	public void moreMoney(){
		String sql="update account set salary=salary+? where username=?";
		jdbctemplate.update(sql,1000,"小马");
	
	}

}
