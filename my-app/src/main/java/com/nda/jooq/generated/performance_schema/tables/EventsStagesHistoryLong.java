/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.enums.EventsStagesHistoryLongNestingEventType;
import com.nda.jooq.generated.performance_schema.tables.records.EventsStagesHistoryLongRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class EventsStagesHistoryLong extends TableImpl<EventsStagesHistoryLongRecord> {

    private static final long serialVersionUID = -1078965443;

    /**
     * The reference instance of <code>performance_schema.events_stages_history_long</code>
     */
    public static final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = new EventsStagesHistoryLong();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStagesHistoryLongRecord> getRecordType() {
        return EventsStagesHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_stages_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.SOURCE</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_START</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_END</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.WORK_COMPLETED</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> WORK_COMPLETED = createField("WORK_COMPLETED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.WORK_ESTIMATED</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> WORK_ESTIMATED = createField("WORK_ESTIMATED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_stages_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStagesHistoryLongRecord, EventsStagesHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.nda.jooq.generated.performance_schema.enums.EventsStagesHistoryLongNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_stages_history_long</code> table reference
     */
    public EventsStagesHistoryLong() {
        this(DSL.name("events_stages_history_long"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_history_long</code> table reference
     */
    public EventsStagesHistoryLong(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_HISTORY_LONG);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_history_long</code> table reference
     */
    public EventsStagesHistoryLong(Name alias) {
        this(alias, EVENTS_STAGES_HISTORY_LONG);
    }

    private EventsStagesHistoryLong(Name alias, Table<EventsStagesHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesHistoryLong(Name alias, Table<EventsStagesHistoryLongRecord> aliased, Field<?>[] parameters) {
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
    public EventsStagesHistoryLong as(String alias) {
        return new EventsStagesHistoryLong(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesHistoryLong as(Name alias) {
        return new EventsStagesHistoryLong(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesHistoryLong rename(String name) {
        return new EventsStagesHistoryLong(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesHistoryLong rename(Name name) {
        return new EventsStagesHistoryLong(name, null);
    }
}
