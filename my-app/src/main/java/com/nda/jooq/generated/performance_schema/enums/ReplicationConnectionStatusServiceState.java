/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReplicationConnectionStatusServiceState implements EnumType {

    ON("ON"),

    OFF("OFF"),

    CONNECTING("CONNECTING");

    private final String literal;

    private ReplicationConnectionStatusServiceState(String literal) {
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
        return "replication_connection_status_SERVICE_STATE";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}