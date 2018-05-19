package com.matt.stockinfo;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.matt.stockinfo"} )
public class AppConfig {
	
	@Bean
	JdbcTemplate jdbcTemplate() {
		
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:src/main/resources/stocks.db");
        dataSourceBuilder.type(org.sqlite.SQLiteDataSource.class);
        DataSource dataSource = dataSourceBuilder.build();
        
        return new JdbcTemplate(dataSource);
	}

}
