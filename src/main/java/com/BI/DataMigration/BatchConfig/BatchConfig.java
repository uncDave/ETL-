package com.BI.DataMigration.BatchConfig;

import com.BI.DataMigration.Listener.TransactionItemReadListener;
import com.BI.DataMigration.Listener.TransactionItemWriteListener;
import com.BI.DataMigration.Listener.TransactionProcessListener;
import com.BI.DataMigration.Processors.PartiesProcessor;
import com.BI.DataMigration.Processors.TransactionProcessor;
import com.BI.DataMigration.Repository.PartiesRepository;
import com.BI.DataMigration.Repository.TransactionRepository;
import com.BI.DataMigration.mappers.PartiesRowmapper;
import com.BI.DataMigration.mappers.TransactionRowMapper;
import com.BI.DataMigration.models.Parties;
import com.BI.DataMigration.models.Transaction;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.database.*;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.database.builder.JpaItemWriterBuilder;
import org.springframework.batch.item.database.support.PostgresPagingQueryProvider;
import org.springframework.batch.item.database.support.SqlServerPagingQueryProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Configuration
//@RequiredArgsConstructor
@EnableBatchProcessing
@AllArgsConstructor
public class BatchConfig {

//    private final DataSource dataSource;
    private final TransactionRepository transactionRepository;
    private final PartiesRepository partiesRepository;
    private final PlatformTransactionManager platformTransactionManager;
    private final JobRepository jobRepository;
    private final PropertiesConfiguration configuration;





    @Bean
    public JdbcPagingItemReader<Transaction> transactionJdbcPagingItemReader() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(configuration.getString("reader_datasource_url"));
        dataSource.setUsername(configuration.getString("reader_datasource_username"));
        dataSource.setPassword(configuration.getString("reader_datasource_password"));
        dataSource.setDriverClassName(configuration.getString("reader_datasource_driver"));

        JdbcPagingItemReader<Transaction> transactionJdbcPagingItemReader = new JdbcPagingItemReader<>();

        transactionJdbcPagingItemReader.setDataSource(dataSource);
        transactionJdbcPagingItemReader.setQueryProvider(Objects.requireNonNull(queryProviderFactoryBean()));
        transactionJdbcPagingItemReader.setRowMapper(new TransactionRowMapper());
        return transactionJdbcPagingItemReader;

    }

    @Bean
    public JdbcPagingItemReader<Parties> partiesJdbcPagingItemReader() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(configuration.getString("writer_datasource_url"));
        dataSource.setUsername(configuration.getString("writer_datasource_username"));
        dataSource.setPassword(configuration.getString("writer_datasource_password"));
        dataSource.setDriverClassName(configuration.getString("writer_datasource_driver"));
        JdbcPagingItemReader<Parties> partiesJdbcPagingItemReader = new JdbcPagingItemReader<>();
        partiesJdbcPagingItemReader.setDataSource(dataSource);
        partiesJdbcPagingItemReader.setQueryProvider(Objects.requireNonNull(PartiesQueryProviderFactoryBean()));
        partiesJdbcPagingItemReader.setRowMapper(new PartiesRowmapper());
        return partiesJdbcPagingItemReader;

    }


    @Bean
    public SqlServerPagingQueryProvider queryProviderFactoryBean(){
        Map<String, Order> sort = new HashMap<>();
        sort.put("id",Order.ASCENDING);
        SqlServerPagingQueryProvider provider= new SqlServerPagingQueryProvider();
        provider.setSelectClause("Select *");
        provider.setFromClause("from transactions");
        provider.setSortKeys(sort);
        System.out.println(provider);
        return provider;
    }



    @Bean
    public SqlServerPagingQueryProvider PartiesQueryProviderFactoryBean(){
        Map<String, Order> sort = new HashMap<>();
        sort.put("id",Order.ASCENDING);
        SqlServerPagingQueryProvider provider= new SqlServerPagingQueryProvider();
        provider.setSelectClause("Select *");
        provider.setFromClause("from parties");
        provider.setSortKeys(sort);
        System.out.println(provider);
        return provider;
    }


//    @Bean
//    public RepositoryItemWriter<Transaction> write(){
//
//        RepositoryItemWriter<Transaction > writer = new RepositoryItemWriter<>();
//        writer.setRepository(transactionRepository);
//        writer.setMethodName("save");
//        return writer;
//    }

//    @Bean
//    public RepositoryItemWriter<Parties> writeToParties(){
//
//        RepositoryItemWriter<Parties > Partywriter = new RepositoryItemWriter<>();
//        Partywriter.setRepository(partiesRepository);
//        Partywriter.setMethodName("save");
//        return Partywriter;
//    }





    @Bean
    public JdbcBatchItemWriter<Transaction> TransactionItemWriter(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(configuration.getString("writer_datasource_url"));
        dataSource.setUsername(configuration.getString("writer_datasource_username"));
        dataSource.setPassword(configuration.getString("writer_datasource_password"));
        dataSource.setDriverClassName(configuration.getString("writer_datasource_driver"));

        JdbcBatchItemWriter<Transaction> ItemWriter = new JdbcBatchItemWriter<>();
        ItemWriter.setDataSource(dataSource);
        ItemWriter.setSql("INSERT INTO TRANSACTIONS(id,amount) VALUES(:id,:amount)");
        ItemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Transaction>());
        ItemWriter.afterPropertiesSet();
        return ItemWriter;




//        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
////        namedParameterJdbcTemplate.update("INSERT INTO TRANSACTIONS (id,amount) VALUES (:id,:amount)", new BeanPropertySqlParameterSource(Transaction.class));
//        namedParameterJdbcTemplate.update("INSERT INTO TRANSACTION (id, amount) VALUES (:id, :amount)", new MapSqlParameterSource(Map.of("id", transaction.getId(), "amount", transaction.getAmount())));
//
//       return new JdbcBatchItemWriterBuilder<Transaction>()
//                .namedParametersJdbcTemplate(namedParameterJdbcTemplate)
//                .build();
    }

    @Bean
    public TaskExecutor taskExecutor(){
//        try{
//            int No_of_threads  = configuration.getInt("number_of_execution_threads");
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(configuration.getInt("number_of_execution_threads"));
        return asyncTaskExecutor;
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }

@Bean
public Step importStep() throws Exception {

    return new StepBuilder("transactionMigration", jobRepository)
            .<Transaction, Transaction>chunk(configuration.getInt("transaction_chunk_size"), platformTransactionManager)
            .reader(transactionJdbcPagingItemReader())
            .processor(new TransactionProcessor())
            .writer(TransactionItemWriter())
            .faultTolerant()
            .taskExecutor(taskExecutor())
            .listener(new TransactionItemReadListener())
            .listener(new TransactionItemWriteListener())
            .listener(new TransactionProcessListener())
            .build();
}

//    @Bean
//    public Step PartyStep() throws Exception {
//        return new StepBuilder("partyMigration", jobRepository)
//                .<Parties, Parties>chunk(configuration.getInt("parties_chunk_size"), platformTransactionManager)
//                .reader(partiesJdbcPagingItemReader())
//                .processor(new PartiesProcessor())
//                .writer(writeToParties())
//                .faultTolerant()
//                .taskExecutor(taskExecutor())
//                .build();
//    }

    @Bean
    public Job runJob() throws Exception {
        return new JobBuilder("importTransaction", jobRepository)
                .start(importStep())
                .build();
    }












}
