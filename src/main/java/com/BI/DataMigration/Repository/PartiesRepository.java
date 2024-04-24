package com.BI.DataMigration.Repository;

import com.BI.DataMigration.models.Parties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartiesRepository extends JpaRepository<Parties,Long> {
}
