package com.BI.DataMigration.BatchConfig;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.JdbcTransactionManager;

import javax.sql.DataSource;
@AllArgsConstructor
@Configuration
public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=Uvas;encrypt=true;trustServerCertificate=true");
//        dataSource.setUsername("SA");
//        dataSource.setPassword("<YourStrongPassword!>");
//        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return dataSource;
//    }
//    @Qualifier("postgres")
//    @Bean(name = "postgres")
//    public DataSource postgresDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/gateway_db");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("1234");
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        return dataSource;
//    }

//    @Bean
//    public JdbcTransactionManager batchTransactionManager(DataSource postgresDataSource) {
//        return new JdbcTransactionManager(postgresDataSource);
//    }
}
