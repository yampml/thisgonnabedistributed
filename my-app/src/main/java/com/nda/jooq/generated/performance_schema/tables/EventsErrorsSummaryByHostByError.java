/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.EventsErrorsSummaryByHostByErrorRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class EventsErrorsSummaryByHostByError extends TableImpl<EventsErrorsSummaryByHostByErrorRecord> {

    private static final long serialVersionUID = 1124440310;

    /**
     * The reference instance of <code>performance_schema.events_errors_summary_by_host_by_error</code>
     */
    public static final EventsErrorsSummaryByHostByError EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR = new EventsErrorsSummaryByHostByError();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsErrorsSummaryByHostByErrorRecord> getRecordType() {
        return EventsErrorsSummaryByHostByErrorRecord.class;
    }

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.HOST</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NUMBER</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, Integer> ERROR_NUMBER = createField("ERROR_NUMBER", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NAME</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, String> ERROR_NAME = createField("ERROR_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.SQL_STATE</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, String> SQL_STATE = createField("SQL_STATE", org.jooq.impl.SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_RAISED</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, ULong> SUM_ERROR_RAISED = createField("SUM_ERROR_RAISED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, ULong> SUM_ERROR_HANDLED = createField("SUM_ERROR_HANDLED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.FIRST_SEEN</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, Timestamp> FIRST_SEEN = createField("FIRST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>performance_schema.events_errors_summary_by_host_by_error.LAST_SEEN</code>.
     */
    public final TableField<EventsErrorsSummaryByHostByErrorRecord, Timestamp> LAST_SEEN = createField("LAST_SEEN", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>performance_schema.events_errors_summary_by_host_by_error</code> table reference
     */
    public EventsErrorsSummaryByHostByError() {
        this(DSL.name("events_errors_summary_by_host_by_error"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_errors_summary_by_host_by_error</code> table reference
     */
    public EventsErrorsSummaryByHostByError(String alias) {
        this(DSL.name(alias), EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR);
    }

    /**
     * Create an aliased <code>performance_schema.events_errors_summary_by_host_by_error</code> table reference
     */
    public EventsErrorsSummaryByHostByError(Name alias) {
        this(alias, EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR);
    }

    private EventsErrorsSummaryByHostByError(Name alias, Table<EventsErrorsSummaryByHostByErrorRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsErrorsSummaryByHostByError(Name alias, Table<EventsErrorsSummaryByHostByErrorRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR_HOST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventsErrorsSummaryByHostByErrorRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsErrorsSummaryByHostByErrorRecord>>asList(Keys.KEY_EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR_HOST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByError as(String alias) {
        return new EventsErrorsSummaryByHostByError(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByError as(Name alias) {
        return new EventsErrorsSummaryByHostByError(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByHostByError rename(String name) {
        return new EventsErrorsSummaryByHostByError(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsErrorsSummaryByHostByError rename(Name name) {
        return new EventsErrorsSummaryByHostByError(name, null);
    }
}
