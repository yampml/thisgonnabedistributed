/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.X$userSummaryByFileIoRecord;

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
public class X$userSummaryByFileIo extends TableImpl<X$userSummaryByFileIoRecord> {

    private static final long serialVersionUID = -2040497091;

    /**
     * The reference instance of <code>sys.x$user_summary_by_file_io</code>
     */
    public static final X$userSummaryByFileIo X$USER_SUMMARY_BY_FILE_IO = new X$userSummaryByFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$userSummaryByFileIoRecord> getRecordType() {
        return X$userSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_file_io.user</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io.ios</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, BigInteger> IOS = createField("ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$user_summary_by_file_io.io_latency</code>.
     */
    public final TableField<X$userSummaryByFileIoRecord, BigInteger> IO_LATENCY = createField("io_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * Create a <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$userSummaryByFileIo() {
        this(DSL.name("x$user_summary_by_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$userSummaryByFileIo(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_file_io</code> table reference
     */
    public X$userSummaryByFileIo(Name alias) {
        this(alias, X$USER_SUMMARY_BY_FILE_IO);
    }

    private X$userSummaryByFileIo(Name alias, Table<X$userSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummaryByFileIo(Name alias, Table<X$userSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
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
    public X$userSummaryByFileIo as(String alias) {
        return new X$userSummaryByFileIo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIo as(Name alias) {
        return new X$userSummaryByFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByFileIo rename(String name) {
        return new X$userSummaryByFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByFileIo rename(Name name) {
        return new X$userSummaryByFileIo(name, null);
    }
}
