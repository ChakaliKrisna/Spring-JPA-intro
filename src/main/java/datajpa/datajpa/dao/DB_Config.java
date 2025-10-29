package datajpa.datajpa.dao;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
public class DB_Config {

	// conneciton
	@Bean
	public DriverManagerDataSource datasource() {

		DriverManagerDataSource datasource = new DriverManagerDataSource();

//		  datasource.seturl("")
		datasource.setUrl("jdbc:mysql://localhost:3306/krishna_first_db");
		datasource.setUsername("root");
		datasource.setPassword("9848656308");
		return datasource;
	}
	
	
	@Bean 
	public LocalContainerEntityManagerFactoryBean LocalContainerEntityManagerFactory() {
		
		
		LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasource());
		emf.setPackagesToScan("datajpa.datajpa.entity");
//		emf.setPersistenceConfiguration(
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPersistenceUnitName("mysql");
;
		
		
		
		return emf;
		
	}
	
	
	@Bean
	public JpaTransactionManager transactionManager(@Autowired EntityManagerFactory emf) {
		
		
		
		JpaTransactionManager jpatransactionmanager=new JpaTransactionManager(emf);
		return jpatransactionmanager;
		
	}
	
	@Bean
	public StudentDaoImp studentdaoimp()
	{
		return new StudentDaoImp();
	}
	
	
	

}
