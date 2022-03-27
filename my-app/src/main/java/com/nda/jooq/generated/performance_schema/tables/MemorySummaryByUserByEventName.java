/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.MemorySummaryByUserByEventNameRecord;

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
public class MemorySummaryByUserByEventName extends TableImpl<MemorySummaryByUserByEventNameRecord> {

    private static final long serialVersionUID = -1696775800;

    /**
     * The reference instance of <code>performance_schema.memory_summary_by_user_by_event_name</code>
     */
    public static final MemorySummaryByUserByEventName MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME = new MemorySummaryByUserByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemorySummaryByUserByEventNameRecord> getRecordType() {
        return MemorySummaryByUserByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.USER</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR(32), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_ALLOC</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, ULong> COUNT_ALLOC = createField("COUNT_ALLOC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.COUNT_FREE</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, ULong> COUNT_FREE = createField("COUNT_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_ALLOC = createField("SUM_NUMBER_OF_BYTES_ALLOC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, ULong> SUM_NUMBER_OF_BYTES_FREE = createField("SUM_NUMBER_OF_BYTES_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.LOW_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> LOW_COUNT_USED = createField("LOW_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> CURRENT_COUNT_USED = createField("CURRENT_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_COUNT_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> HIGH_COUNT_USED = createField("HIGH_COUNT_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> LOW_NUMBER_OF_BYTES_USED = createField("LOW_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> CURRENT_NUMBER_OF_BYTES_USED = createField("CURRENT_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.memory_summary_by_user_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public final TableField<MemorySummaryByUserByEventNameRecord, Long> HIGH_NUMBER_OF_BYTES_USED = createField("HIGH_NUMBER_OF_BYTES_USED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.memory_summary_by_user_by_event_name</code> table reference
     */
    public MemorySummaryByUserByEventName() {
        this(DSL.name("memory_summary_by_user_by_event_name"), null);
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_user_by_event_name</code> table reference
     */
    public MemorySummaryByUserByEventName(String alias) {
        this(DSL.name(alias), MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create an aliased <code>performance_schema.memory_summary_by_user_by_event_name</code> table reference
     */
    public MemorySummaryByUserByEventName(Name alias) {
        this(alias, MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    private MemorySummaryByUserByEventName(Name alias, Table<MemorySummaryByUserByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemorySummaryByUserByEventName(Name alias, Table<MemorySummaryByUserByEventNameRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MemorySummaryByUserByEventNameRecord>> getKeys() {
        return Arrays.<UniqueKey<MemorySummaryByUserByEventNameRecord>>asList(Keys.KEY_MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryByUserByEventName as(String alias) {
        return new MemorySummaryByUserByEventName(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemorySummaryByUserByEventName as(Name alias) {
        return new MemorySummaryByUserByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByUserByEventName rename(String name) {
        return new MemorySummaryByUserByEventName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemorySummaryByUserByEventName rename(Name name) {
        return new MemorySummaryByUserByEventName(name, null);
    }
}
