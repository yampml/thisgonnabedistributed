/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.EventsWaitsSummaryByUserByEventNameRecord;

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
public class EventsWaitsSummaryByUserByEventName extends TableImpl<EventsWaitsSummaryByUserByEventNameRecord> {

    private static final long serialVersionUID = 1315890430;

    /**
     * The reference instance of <code>performance_schema.events_waits_summary_by_user_by_event_name</code>
     */
    public static final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = new EventsWaitsSummaryByUserByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryByUserByEventNameRecord> getRecordType() {
        return EventsWaitsSummaryByUserByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByUserByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_waits_summary_by_user_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByUserByEventName() {
        this(DSL.name("events_waits_summary_by_user_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_user_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByUserByEventName(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_user_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByUserByEventName(Name alias) {
        this(alias, EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    private EventsWaitsSummaryByUserByEventName(Name alias, Table<EventsWaitsSummaryByUserByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsSummaryByUserByEventName(Name alias, Table<EventsWaitsSummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventsWaitsSummaryByUserByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsWaitsSummaryByUserByEventNameRecord>>asList(Keys.KEY_EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByUserByEventName as(String alias) {
        return new EventsWaitsSummaryByUserByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByUserByEventName as(Name alias) {
        return new EventsWaitsSummaryByUserByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByUserByEventName rename(String name) {
        return new EventsWaitsSummaryByUserByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByUserByEventName rename(Name name) {
        return new EventsWaitsSummaryByUserByEventName(name, null);
    }
}
