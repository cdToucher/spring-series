package me.codebase.jpa.entry;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * Created by chendong on 2017/5/19.
 * <p>
 * app configuration
 */
@Configuration
@EnableJpaRepositories(basePackages = {"me.codebase.jpa.repository"})
@ComponentScan("me.codebase.jpa")
public class AppConfig {

    @Bean
    public static BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://10.1.51.236:3306/Test");
        dataSource.setPassword("12345678");
        dataSource.setUsername("root");
        return dataSource;
    }

    @Bean
    public static LocalContainerEntityManagerFactoryBean getJpaFactoryBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(getDataSource());
        bean.setPackagesToScan("me.codebase.jpa");
        bean.setJpaVendorAdapter(getHibernateJpaVendorAdapter());
        return bean;
    }

    @Bean
    public static HibernateJpaVendorAdapter getHibernateJpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setShowSql(true);
        bean.setGenerateDdl(true);
        return bean;
    }

}
