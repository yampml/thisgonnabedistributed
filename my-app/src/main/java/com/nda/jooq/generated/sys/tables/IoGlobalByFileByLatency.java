/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.IoGlobalByFileByLatencyRecord;

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
public class IoGlobalByFileByLatency extends TableImpl<IoGlobalByFileByLatencyRecord> {

    private static final long serialVersionUID = 1941680301;

    /**
     * The reference instance of <code>sys.io_global_by_file_by_latency</code>
     */
    public static final IoGlobalByFileByLatency IO_GLOBAL_BY_FILE_BY_LATENCY = new IoGlobalByFileByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IoGlobalByFileByLatencyRecord> getRecordType() {
        return IoGlobalByFileByLatencyRecord.class;
    }

    /**
     * The column <code>sys.io_global_by_file_by_latency.file</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.total</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.total_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_read</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.read_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> READ_LATENCY = createField("read_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_write</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.write_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> WRITE_LATENCY = createField("write_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.count_misc</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, ULong> COUNT_MISC = createField("count_misc", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_file_by_latency.misc_latency</code>.
     */
    public final TableField<IoGlobalByFileByLatencyRecord, String> MISC_LATENCY = createField("misc_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency() {
        this(DSL.name("io_global_by_file_by_latency"), null);
    }

    /**
     * Create an aliased <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency(String alias) {
        this(DSL.name(alias), IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.io_global_by_file_by_latency</code> table reference
     */
    public IoGlobalByFileByLatency(Name alias) {
        this(alias, IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    private IoGlobalByFileByLatency(Name alias, Table<IoGlobalByFileByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByFileByLatency(Name alias, Table<IoGlobalByFileByLatencyRecord> aliased, Field<?>[] parameters) {
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
    public IoGlobalByFileByLatency as(String alias) {
        return new IoGlobalByFileByLatency(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoGlobalByFileByLatency as(Name alias) {
        return new IoGlobalByFileByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByFileByLatency rename(String name) {
        return new IoGlobalByFileByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByFileByLatency rename(Name name) {
        return new IoGlobalByFileByLatency(name, null);
    }
}
