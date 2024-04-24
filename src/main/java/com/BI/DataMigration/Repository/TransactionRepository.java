package com.BI.DataMigration.Repository;

import com.BI.DataMigration.models.Transaction;
import org.springframework.batch.item.database.orm.JpaQueryProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
