package com.BI.DataMigration.Listener;

import com.BI.DataMigration.models.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemProcessListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TransactionProcessListener implements ItemProcessListener<Transaction, Transaction> {
    @Override
    public void beforeProcess(Transaction input) {
        log.info("Person record has been read: " + input);
    }

    @Override
    public void afterProcess(Transaction input, Transaction result) {
        log.info("Person record has been processed to : " + result);
    }

    @Override
    public void onProcessError(Transaction input, Exception e) {
        log.error("Error in reading the person record : " + input);
        log.error("Error in reading the person record : " + e);
    }
}
