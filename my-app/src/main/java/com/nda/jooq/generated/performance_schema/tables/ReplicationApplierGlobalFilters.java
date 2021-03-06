/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.enums.ReplicationApplierGlobalFiltersConfiguredBy;
import com.nda.jooq.generated.performance_schema.tables.records.ReplicationApplierGlobalFiltersRecord;

import java.sql.Timestamp;

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
public class ReplicationApplierGlobalFilters extends TableImpl<ReplicationApplierGlobalFiltersRecord> {

    private static final long serialVersionUID = 1056034458;

    /**
     * The reference instance of <code>performance_schema.replication_applier_global_filters</code>
     */
    public static final ReplicationApplierGlobalFilters REPLICATION_APPLIER_GLOBAL_FILTERS = new ReplicationApplierGlobalFilters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationApplierGlobalFiltersRecord> getRecordType() {
        return ReplicationApplierGlobalFiltersRecord.class;
    }

    /**
     * The column <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public final TableField<ReplicationApplierGlobalFiltersRecord, String> FILTER_NAME = createField("FILTER_NAME", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public final TableField<ReplicationApplierGlobalFiltersRecord, String> FILTER_RULE = createField("FILTER_RULE", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public final TableField<ReplicationApplierGlobalFiltersRecord, ReplicationApplierGlobalFiltersConfiguredBy> CONFIGURED_BY = createField("CONFIGURED_BY", org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false).asEnumDataType(com.nda.jooq.generated.performance_schema.enums.ReplicationApplierGlobalFiltersConfiguredBy.class), this, "");

    /**
     * The column <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public final TableField<ReplicationApplierGlobalFiltersRecord, Timestamp> ACTIVE_SINCE = createField("ACTIVE_SINCE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.replication_applier_global_filters</code> table reference
     */
    public ReplicationApplierGlobalFilters() {
        this(DSL.name("replication_applier_global_filters"), null);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_global_filters</code> table reference
     */
    public ReplicationApplierGlobalFilters(String alias) {
        this(DSL.name(alias), REPLICATION_APPLIER_GLOBAL_FILTERS);
    }

    /**
     * Create an aliased <code>performance_schema.replication_applier_global_filters</code> table reference
     */
    public ReplicationApplierGlobalFilters(Name alias) {
        this(alias, REPLICATION_APPLIER_GLOBAL_FILTERS);
    }

    private ReplicationApplierGlobalFilters(Name alias, Table<ReplicationApplierGlobalFiltersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationApplierGlobalFilters(Name alias, Table<ReplicationApplierGlobalFiltersRecord> aliased, Field<?>[] parameters) {
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
    public ReplicationApplierGlobalFilters as(String alias) {
        return new ReplicationApplierGlobalFilters(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFilters as(Name alias) {
        return new ReplicationApplierGlobalFilters(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierGlobalFilters rename(String name) {
        return new ReplicationApplierGlobalFilters(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationApplierGlobalFilters rename(Name name) {
        return new ReplicationApplierGlobalFilters(name, null);
    }
}
