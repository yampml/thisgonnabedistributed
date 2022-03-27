/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.enums.SetupThreadsEnabled;
import com.nda.jooq.generated.performance_schema.enums.SetupThreadsHistory;
import com.nda.jooq.generated.performance_schema.tables.records.SetupThreadsRecord;

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
public class SetupThreads extends TableImpl<SetupThreadsRecord> {

    private static final long serialVersionUID = -200205973;

    /**
     * The reference instance of <code>performance_schema.setup_threads</code>
     */
    public static final SetupThreads SETUP_THREADS = new SetupThreads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupThreadsRecord> getRecordType() {
        return SetupThreadsRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_threads.NAME</code>.
     */
    public final TableField<SetupThreadsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_threads.ENABLED</code>.
     */
    public final TableField<SetupThreadsRecord, SetupThreadsEnabled> ENABLED = createField("ENABLED", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.nda.jooq.generated.performance_schema.enums.SetupThreadsEnabled.class), this, "");

    /**
     * The column <code>performance_schema.setup_threads.HISTORY</code>.
     */
    public final TableField<SetupThreadsRecord, SetupThreadsHistory> HISTORY = createField("HISTORY", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.nda.jooq.generated.performance_schema.enums.SetupThreadsHistory.class), this, "");

    /**
     * The column <code>performance_schema.setup_threads.PROPERTIES</code>.
     */
    public final TableField<SetupThreadsRecord, String> PROPERTIES = createField("PROPERTIES", org.jooq.impl.SQLDataType.VARCHAR(14).nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_threads.VOLATILITY</code>.
     */
    public final TableField<SetupThreadsRecord, Integer> VOLATILITY = createField("VOLATILITY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_threads.DOCUMENTATION</code>.
     */
    public final TableField<SetupThreadsRecord, String> DOCUMENTATION = createField("DOCUMENTATION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>performance_schema.setup_threads</code> table reference
     */
    public SetupThreads() {
        this(DSL.name("setup_threads"), null);
    }

    /**
     * Create an aliased <code>performance_schema.setup_threads</code> table reference
     */
    public SetupThreads(String alias) {
        this(DSL.name(alias), SETUP_THREADS);
    }

    /**
     * Create an aliased <code>performance_schema.setup_threads</code> table reference
     */
    public SetupThreads(Name alias) {
        this(alias, SETUP_THREADS);
    }

    private SetupThreads(Name alias, Table<SetupThreadsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupThreads(Name alias, Table<SetupThreadsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.SETUP_THREADS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SetupThreadsRecord> getPrimaryKey() {
        return Keys.KEY_SETUP_THREADS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SetupThreadsRecord>> getKeys() {
        return Arrays.<UniqueKey<SetupThreadsRecord>>asList(Keys.KEY_SETUP_THREADS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupThreads as(String alias) {
        return new SetupThreads(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupThreads as(Name alias) {
        return new SetupThreads(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupThreads rename(String name) {
        return new SetupThreads(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupThreads rename(Name name) {
        return new SetupThreads(name, null);
    }
}
