package com.BI.DataMigration.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class mssqlToPostgresJob {

//    private static final String INSERT_QUERY = """
//      insert into Transaction (first_name, last_name, age, is_active)
//      values (:firstName,:lastName,:age,:active)""";
//    private final JobRepository jobRepository;
//
//    public mssqlToPostgresJob(JobRepository jobRepository) {
//        this.jobRepository = jobRepository;
//    }

//    @Bean(name="insertIntoDbFromMsqlJob")
//    public Job insertIntoDbFrommssqlJob(Step step1, Step step2) {
//
//        var name = "Persons Import Job";
//        var builder = new JobBuilder(name, jobRepository);
//
//        return builder.start(step1)
//                //.next(step2)
////                .listener(new JobCompletionNotificationListener(new Resource[]{inputFeed}))
//                .build();
//    }

//    @Bean
//    public Step step1(ItemReader<Transaction> reader,
//                      ItemWriter<Transaction> writer,
//                      ItemProcessor<Transaction, Transaction> processor,
//                      PlatformTransactionManager txManager) {
//        var name = "INSERT MSSQL RECORDS To DB Step";
//        var builder = new StepBuilder(name, jobRepository);
//        return builder
//                .<Transaction, Transaction>chunk(5, txManager)
//                /*.faultTolerant()
//                .retryLimit(3).retry(DeadlockLoserDataAccessException.class)*/
//                .reader(reader)
//                .listener(new TransactionProcessListener())
////                .processor(processor)
//                //.listener(new PersonItemProcessor())
//                .writer(writer)
//                //.listener(new PersonItemWriteListener())
//                .build();
//    }
}
