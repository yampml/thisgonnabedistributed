/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.KeyringComponentStatusRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class KeyringComponentStatus extends TableImpl<KeyringComponentStatusRecord> {

    private static final long serialVersionUID = -703123834;

    /**
     * The reference instance of <code>performance_schema.keyring_component_status</code>
     */
    public static final KeyringComponentStatus KEYRING_COMPONENT_STATUS = new KeyringComponentStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyringComponentStatusRecord> getRecordType() {
        return KeyringComponentStatusRecord.class;
    }

    /**
     * The column <code>performance_schema.keyring_component_status.STATUS_KEY</code>.
     */
    public final TableField<KeyringComponentStatusRecord, String> STATUS_KEY = createField("STATUS_KEY", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>performance_schema.keyring_component_status.STATUS_VALUE</code>.
     */
    public final TableField<KeyringComponentStatusRecord, String> STATUS_VALUE = createField("STATUS_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * Create a <code>performance_schema.keyring_component_status</code> table reference
     */
    public KeyringComponentStatus() {
        this(DSL.name("keyring_component_status"), null);
    }

    /**
     * Create an aliased <code>performance_schema.keyring_component_status</code> table reference
     */
    public KeyringComponentStatus(String alias) {
        this(DSL.name(alias), KEYRING_COMPONENT_STATUS);
    }

    /**
     * Create an aliased <code>performance_schema.keyring_component_status</code> table reference
     */
    public KeyringComponentStatus(Name alias) {
        this(alias, KEYRING_COMPONENT_STATUS);
    }

    private KeyringComponentStatus(Name alias, Table<KeyringComponentStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyringComponentStatus(Name alias, Table<KeyringComponentStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringComponentStatus as(String alias) {
        return new KeyringComponentStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringComponentStatus as(Name alias) {
        return new KeyringComponentStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyringComponentStatus rename(String name) {
        return new KeyringComponentStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyringComponentStatus rename(Name name) {
        return new KeyringComponentStatus(name, null);
    }
}