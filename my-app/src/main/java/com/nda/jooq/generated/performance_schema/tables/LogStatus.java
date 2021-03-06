/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.LogStatusRecord;

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
public class LogStatus extends TableImpl<LogStatusRecord> {

    private static final long serialVersionUID = -1816060481;

    /**
     * The reference instance of <code>performance_schema.log_status</code>
     */
    public static final LogStatus LOG_STATUS = new LogStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogStatusRecord> getRecordType() {
        return LogStatusRecord.class;
    }

    /**
     * The column <code>performance_schema.log_status.SERVER_UUID</code>.
     */
    public final TableField<LogStatusRecord, String> SERVER_UUID = createField("SERVER_UUID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<LogStatusRecord, Object> LOCAL = createField("LOCAL", org.jooq.impl.DefaultDataType.getDefaultDataType("json"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<LogStatusRecord, Object> REPLICATION = createField("REPLICATION", org.jooq.impl.DefaultDataType.getDefaultDataType("json"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<LogStatusRecord, Object> STORAGE_ENGINES = createField("STORAGE_ENGINES", org.jooq.impl.DefaultDataType.getDefaultDataType("json"), this, "");

    /**
     * Create a <code>performance_schema.log_status</code> table reference
     */
    public LogStatus() {
        this(DSL.name("log_status"), null);
    }

    /**
     * Create an aliased <code>performance_schema.log_status</code> table reference
     */
    public LogStatus(String alias) {
        this(DSL.name(alias), LOG_STATUS);
    }

    /**
     * Create an aliased <code>performance_schema.log_status</code> table reference
     */
    public LogStatus(Name alias) {
        this(alias, LOG_STATUS);
    }

    private LogStatus(Name alias, Table<LogStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private LogStatus(Name alias, Table<LogStatusRecord> aliased, Field<?>[] parameters) {
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
    public LogStatus as(String alias) {
        return new LogStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogStatus as(Name alias) {
        return new LogStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LogStatus rename(String name) {
        return new LogStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LogStatus rename(Name name) {
        return new LogStatus(name, null);
    }
}
