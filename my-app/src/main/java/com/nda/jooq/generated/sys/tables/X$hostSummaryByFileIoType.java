/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.X$hostSummaryByFileIoTypeRecord;

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
public class X$hostSummaryByFileIoType extends TableImpl<X$hostSummaryByFileIoTypeRecord> {

    private static final long serialVersionUID = -539333448;

    /**
     * The reference instance of <code>sys.x$host_summary_by_file_io_type</code>
     */
    public static final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = new X$hostSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByFileIoTypeRecord> getRecordType() {
        return X$hostSummaryByFileIoTypeRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType() {
        this(DSL.name("x$host_summary_by_file_io_type"), null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType(String alias) {
        this(DSL.name(alias), X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType(Name alias) {
        this(alias, X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    private X$hostSummaryByFileIoType(Name alias, Table<X$hostSummaryByFileIoTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByFileIoType(Name alias, Table<X$hostSummaryByFileIoTypeRecord> aliased, Field<?>[] parameters) {
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
    public X$hostSummaryByFileIoType as(String alias) {
        return new X$hostSummaryByFileIoType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoType as(Name alias) {
        return new X$hostSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIoType rename(String name) {
        return new X$hostSummaryByFileIoType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIoType rename(Name name) {
        return new X$hostSummaryByFileIoType(name, null);
    }
}
