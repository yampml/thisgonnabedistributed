/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.LatestFileIoRecord;

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
public class LatestFileIo extends TableImpl<LatestFileIoRecord> {

    private static final long serialVersionUID = -516749705;

    /**
     * The reference instance of <code>sys.latest_file_io</code>
     */
    public static final LatestFileIo LATEST_FILE_IO = new LatestFileIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LatestFileIoRecord> getRecordType() {
        return LatestFileIoRecord.class;
    }

    /**
     * The column <code>sys.latest_file_io.thread</code>.
     */
    public final TableField<LatestFileIoRecord, String> THREAD = createField("thread", org.jooq.impl.SQLDataType.VARCHAR(317), this, "");

    /**
     * The column <code>sys.latest_file_io.file</code>.
     */
    public final TableField<LatestFileIoRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>sys.latest_file_io.latency</code>.
     */
    public final TableField<LatestFileIoRecord, String> LATENCY = createField("latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.latest_file_io.operation</code>.
     */
    public final TableField<LatestFileIoRecord, String> OPERATION = createField("operation", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.latest_file_io.requested</code>.
     */
    public final TableField<LatestFileIoRecord, String> REQUESTED = createField("requested", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.latest_file_io</code> table reference
     */
    public LatestFileIo() {
        this(DSL.name("latest_file_io"), null);
    }

    /**
     * Create an aliased <code>sys.latest_file_io</code> table reference
     */
    public LatestFileIo(String alias) {
        this(DSL.name(alias), LATEST_FILE_IO);
    }

    /**
     * Create an aliased <code>sys.latest_file_io</code> table reference
     */
    public LatestFileIo(Name alias) {
        this(alias, LATEST_FILE_IO);
    }

    private LatestFileIo(Name alias, Table<LatestFileIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private LatestFileIo(Name alias, Table<LatestFileIoRecord> aliased, Field<?>[] parameters) {
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
    public LatestFileIo as(String alias) {
        return new LatestFileIo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIo as(Name alias) {
        return new LatestFileIo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LatestFileIo rename(String name) {
        return new LatestFileIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LatestFileIo rename(Name name) {
        return new LatestFileIo(name, null);
    }
}