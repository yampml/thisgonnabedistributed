/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.HostSummaryByFileIoRecord;

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
public class HostSummaryByFileIo extends TableImpl<HostSummaryByFileIoRecord> {

    private static final long serialVersionUID = 1471213605;

    /**
     * The reference instance of <code>sys.host_summary_by_file_io</code>
     */
    public static final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = new HostSummaryByFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryByFileIoRecord> getRecordType() {
        return HostSummaryByFileIoRecord.class;
    }

    /**
     * The column <code>sys.host_summary_by_file_io.host</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.host_summary_by_file_io.ios</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, BigInteger> IOS = createField("ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.host_summary_by_file_io.io_latency</code>.
     */
    public final TableField<HostSummaryByFileIoRecord, String> IO_LATENCY = createField("io_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo() {
        this(DSL.name("host_summary_by_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo(String alias) {
        this(DSL.name(alias), HOST_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_file_io</code> table reference
     */
    public HostSummaryByFileIo(Name alias) {
        this(alias, HOST_SUMMARY_BY_FILE_IO);
    }

    private HostSummaryByFileIo(Name alias, Table<HostSummaryByFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByFileIo(Name alias, Table<HostSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
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
    public HostSummaryByFileIo as(String alias) {
        return new HostSummaryByFileIo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIo as(Name alias) {
        return new HostSummaryByFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByFileIo rename(String name) {
        return new HostSummaryByFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByFileIo rename(Name name) {
        return new HostSummaryByFileIo(name, null);
    }
}
