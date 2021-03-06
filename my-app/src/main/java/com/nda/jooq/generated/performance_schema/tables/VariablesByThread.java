/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.VariablesByThreadRecord;

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
public class VariablesByThread extends TableImpl<VariablesByThreadRecord> {

    private static final long serialVersionUID = 22782992;

    /**
     * The reference instance of <code>performance_schema.variables_by_thread</code>
     */
    public static final VariablesByThread VARIABLES_BY_THREAD = new VariablesByThread();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariablesByThreadRecord> getRecordType() {
        return VariablesByThreadRecord.class;
    }

    /**
     * The column <code>performance_schema.variables_by_thread.THREAD_ID</code>.
     */
    public final TableField<VariablesByThreadRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.variables_by_thread.VARIABLE_NAME</code>.
     */
    public final TableField<VariablesByThreadRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.variables_by_thread.VARIABLE_VALUE</code>.
     */
    public final TableField<VariablesByThreadRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>performance_schema.variables_by_thread</code> table reference
     */
    public VariablesByThread() {
        this(DSL.name("variables_by_thread"), null);
    }

    /**
     * Create an aliased <code>performance_schema.variables_by_thread</code> table reference
     */
    public VariablesByThread(String alias) {
        this(DSL.name(alias), VARIABLES_BY_THREAD);
    }

    /**
     * Create an aliased <code>performance_schema.variables_by_thread</code> table reference
     */
    public VariablesByThread(Name alias) {
        this(alias, VARIABLES_BY_THREAD);
    }

    private VariablesByThread(Name alias, Table<VariablesByThreadRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariablesByThread(Name alias, Table<VariablesByThreadRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.VARIABLES_BY_THREAD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VariablesByThreadRecord> getPrimaryKey() {
        return Keys.KEY_VARIABLES_BY_THREAD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VariablesByThreadRecord>> getKeys() {
        return Arrays.<UniqueKey<VariablesByThreadRecord>>asList(Keys.KEY_VARIABLES_BY_THREAD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariablesByThread as(String alias) {
        return new VariablesByThread(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VariablesByThread as(Name alias) {
        return new VariablesByThread(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesByThread rename(String name) {
        return new VariablesByThread(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesByThread rename(Name name) {
        return new VariablesByThread(name, null);
    }
}
