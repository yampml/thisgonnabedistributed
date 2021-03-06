/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * Indicates what is the channel policy regarding tables having primary keys 
 * on create and alter table queries
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReplicationApplierConfigurationRequireTablePrimaryKeyCheck implements EnumType {

    STREAM("STREAM"),

    ON("ON"),

    OFF("OFF");

    private final String literal;

    private ReplicationApplierConfigurationRequireTablePrimaryKeyCheck(String literal) {
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
        return "replication_applier_configuration_REQUIRE_TABLE_PRIMARY_KEY_CHECK";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
