/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.EventsTransactionsSummaryByAccountByEventNameRecord;

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
public class EventsTransactionsSummaryByAccountByEventName extends TableImpl<EventsTransactionsSummaryByAccountByEventNameRecord> {

    private static final long serialVersionUID = -600743536;

    /**
     * The reference instance of <code>performance_schema.events_transactions_summary_by_account_by_event_name</code>
     */
    public static final EventsTransactionsSummaryByAccountByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = new EventsTransactionsSummaryByAccountByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsSummaryByAccountByEventNameRecord> getRecordType() {
        return EventsTransactionsSummaryByAccountByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.USER</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.HOST</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.COUNT_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> COUNT_READ_WRITE = createField("COUNT_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> SUM_TIMER_READ_WRITE = createField("SUM_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MIN_TIMER_READ_WRITE = createField("MIN_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> AVG_TIMER_READ_WRITE = createField("AVG_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MAX_TIMER_READ_WRITE = createField("MAX_TIMER_READ_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.COUNT_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> COUNT_READ_ONLY = createField("COUNT_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> SUM_TIMER_READ_ONLY = createField("SUM_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MIN_TIMER_READ_ONLY = createField("MIN_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> AVG_TIMER_READ_ONLY = createField("AVG_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_summary_by_account_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public final TableField<EventsTransactionsSummaryByAccountByEventNameRecord, ULong> MAX_TIMER_READ_ONLY = createField("MAX_TIMER_READ_ONLY", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_summary_by_account_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByAccountByEventName() {
        this(DSL.name("events_transactions_summary_by_account_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_account_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByAccountByEventName(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_summary_by_account_by_event_name</code> table reference
     */
    public EventsTransactionsSummaryByAccountByEventName(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME);
    }

    private EventsTransactionsSummaryByAccountByEventName(Name alias, Table<EventsTransactionsSummaryByAccountByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsSummaryByAccountByEventName(Name alias, Table<EventsTransactionsSummaryByAccountByEventNameRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME_ACCOUNT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventsTransactionsSummaryByAccountByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsTransactionsSummaryByAccountByEventNameRecord>>asList(Keys.KEY_EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME_ACCOUNT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByAccountByEventName as(String alias) {
        return new EventsTransactionsSummaryByAccountByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByAccountByEventName as(Name alias) {
        return new EventsTransactionsSummaryByAccountByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByAccountByEventName rename(String name) {
        return new EventsTransactionsSummaryByAccountByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsSummaryByAccountByEventName rename(Name name) {
        return new EventsTransactionsSummaryByAccountByEventName(name, null);
    }
}
