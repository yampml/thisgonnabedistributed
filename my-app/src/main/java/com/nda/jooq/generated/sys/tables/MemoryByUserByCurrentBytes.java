/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.MemoryByUserByCurrentBytesRecord;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemoryByUserByCurrentBytes extends TableImpl<MemoryByUserByCurrentBytesRecord> {

    private static final long serialVersionUID = 1650941942;

    /**
     * The reference instance of <code>sys.memory_by_user_by_current_bytes</code>
     */
    public static final MemoryByUserByCurrentBytes MEMORY_BY_USER_BY_CURRENT_BYTES = new MemoryByUserByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemoryByUserByCurrentBytesRecord> getRecordType() {
        return MemoryByUserByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.user</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.current_count_used</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, BigInteger> CURRENT_COUNT_USED = createField("current_count_used", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.current_allocated</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, String> CURRENT_ALLOCATED = createField("current_allocated", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, String> CURRENT_AVG_ALLOC = createField("current_avg_alloc", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, String> CURRENT_MAX_ALLOC = createField("current_max_alloc", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.memory_by_user_by_current_bytes.total_allocated</code>.
     */
    public final TableField<MemoryByUserByCurrentBytesRecord, String> TOTAL_ALLOCATED = createField("total_allocated", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.memory_by_user_by_current_bytes</code> table reference
     */
    public MemoryByUserByCurrentBytes() {
        this(DSL.name("memory_by_user_by_current_bytes"), null);
    }

    /**
     * Create an aliased <code>sys.memory_by_user_by_current_bytes</code> table reference
     */
    public MemoryByUserByCurrentBytes(String alias) {
        this(DSL.name(alias), MEMORY_BY_USER_BY_CURRENT_BYTES);
    }

    /**
     * Create an aliased <code>sys.memory_by_user_by_current_bytes</code> table reference
     */
    public MemoryByUserByCurrentBytes(Name alias) {
        this(alias, MEMORY_BY_USER_BY_CURRENT_BYTES);
    }

    private MemoryByUserByCurrentBytes(Name alias, Table<MemoryByUserByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemoryByUserByCurrentBytes(Name alias, Table<MemoryByUserByCurrentBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByUserByCurrentBytes as(String alias) {
        return new MemoryByUserByCurrentBytes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MemoryByUserByCurrentBytes as(Name alias) {
        return new MemoryByUserByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByUserByCurrentBytes rename(String name) {
        return new MemoryByUserByCurrentBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByUserByCurrentBytes rename(Name name) {
        return new MemoryByUserByCurrentBytes(name, null);
    }
}
