/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.ReplicationApplierGlobalFiltersConfiguredBy;
import com.nda.jooq.generated.performance_schema.tables.ReplicationApplierGlobalFilters;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class ReplicationApplierGlobalFiltersRecord extends TableRecordImpl<ReplicationApplierGlobalFiltersRecord> implements Record4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, Timestamp> {

    private static final long serialVersionUID = -1967790084;

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public void setFilterName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public String getFilterName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public void setFilterRule(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public String getFilterRule() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public void setConfiguredBy(ReplicationApplierGlobalFiltersConfiguredBy value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public ReplicationApplierGlobalFiltersConfiguredBy getConfiguredBy() {
        return (ReplicationApplierGlobalFiltersConfiguredBy) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public void setActiveSince(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public Timestamp getActiveSince() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, ReplicationApplierGlobalFiltersConfiguredBy, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.FILTER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.FILTER_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierGlobalFiltersConfiguredBy> field3() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.CONFIGURED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS.ACTIVE_SINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getFilterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFilterRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersConfiguredBy component3() {
        return getConfiguredBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getActiveSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFilterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFilterRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersConfiguredBy value3() {
        return getConfiguredBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getActiveSince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersRecord value1(String value) {
        setFilterName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersRecord value2(String value) {
        setFilterRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersRecord value3(ReplicationApplierGlobalFiltersConfiguredBy value) {
        setConfiguredBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersRecord value4(Timestamp value) {
        setActiveSince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierGlobalFiltersRecord values(String value1, String value2, ReplicationApplierGlobalFiltersConfiguredBy value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationApplierGlobalFiltersRecord
     */
    public ReplicationApplierGlobalFiltersRecord() {
        super(ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS);
    }

    /**
     * Create a detached, initialised ReplicationApplierGlobalFiltersRecord
     */
    public ReplicationApplierGlobalFiltersRecord(String filterName, String filterRule, ReplicationApplierGlobalFiltersConfiguredBy configuredBy, Timestamp activeSince) {
        super(ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS);

        set(0, filterName);
        set(1, filterRule);
        set(2, configuredBy);
        set(3, activeSince);
    }
}
