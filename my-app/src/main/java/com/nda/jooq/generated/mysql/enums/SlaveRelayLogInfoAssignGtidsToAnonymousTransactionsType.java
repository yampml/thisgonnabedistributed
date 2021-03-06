/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * Indicates whether the channel will generate a new GTID for anonymous transactions. 
 * OFF means that anonymous transactions will remain anonymous. LOCAL means 
 * that anonymous transactions will be assigned a newly generated GTID based 
 * on server_uuid. UUID indicates that anonymous transactions will be assigned 
 * a newly generated GTID based on Assign_gtids_to_anonymous_transactions_value
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType implements EnumType {

    OFF("OFF"),

    LOCAL("LOCAL"),

    UUID("UUID");

    private final String literal;

    private SlaveRelayLogInfoAssignGtidsToAnonymousTransactionsType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "slave_relay_log_info_Assign_gtids_to_anonymous_transactions_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
