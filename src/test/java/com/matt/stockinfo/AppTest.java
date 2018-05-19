package com.matt.stockinfo;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppTest {

	@Test
	public void dbTest() {
		try {
			//Class.forName("org.sqlite.JDBC");
			
			DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
	        dataSourceBuilder.url("jdbc:sqlite:src/main/resources/stocks.db");
	        dataSourceBuilder.type(org.sqlite.SQLiteDataSource.class);
	        DataSource dataSource = dataSourceBuilder.build();
	        
	        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	        List<Map<String,Object>> res = jdbcTemplate.queryForList("SELECT * from nasdaq limit 10");
	        
	        assertNotNull(res);
	        
	        for(Map m : res) {
	        	for(Object s : m.keySet()) {
	        		System.out.println(s);
	        	}
	        }
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
