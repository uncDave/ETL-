package com.BI.DataMigration.Processors;

import com.BI.DataMigration.models.Parties;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PartiesProcessor implements ItemProcessor<Parties,Parties> {


    @Override
    public Parties process(Parties item) throws Exception {
        return item;
    }
}
