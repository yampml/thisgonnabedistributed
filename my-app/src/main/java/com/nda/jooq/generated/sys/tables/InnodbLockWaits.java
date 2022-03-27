/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.InnodbLockWaitsRecord;

import java.sql.Time;
import java.sql.Timestamp;

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
public class InnodbLockWaits extends TableImpl<InnodbLockWaitsRecord> {

    private static final long serialVersionUID = -1214872669;

    /**
     * The reference instance of <code>sys.innodb_lock_waits</code>
     */
    public static final InnodbLockWaits INNODB_LOCK_WAITS = new InnodbLockWaits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbLockWaitsRecord> getRecordType() {
        return InnodbLockWaitsRecord.class;
    }

    /**
     * The column <code>sys.innodb_lock_waits.wait_started</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Timestamp> WAIT_STARTED = createField("wait_started", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.wait_age</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Time> WAIT_AGE = createField("wait_age", org.jooq.impl.SQLDataType.TIME, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.wait_age_secs</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Long> WAIT_AGE_SECS = createField("wait_age_secs", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_table</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TABLE = createField("locked_table", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_table_schema</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TABLE_SCHEMA = createField("locked_table_schema", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_table_name</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TABLE_NAME = createField("locked_table_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_table_partition</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TABLE_PARTITION = createField("locked_table_partition", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_table_subpartition</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TABLE_SUBPARTITION = createField("locked_table_subpartition", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_index</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_INDEX = createField("locked_index", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.locked_type</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> LOCKED_TYPE = createField("locked_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_trx_id</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> WAITING_TRX_ID = createField("waiting_trx_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_trx_started</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Timestamp> WAITING_TRX_STARTED = createField("waiting_trx_started", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_trx_age</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Time> WAITING_TRX_AGE = createField("waiting_trx_age", org.jooq.impl.SQLDataType.TIME, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_trx_rows_locked</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> WAITING_TRX_ROWS_LOCKED = createField("waiting_trx_rows_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_trx_rows_modified</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> WAITING_TRX_ROWS_MODIFIED = createField("waiting_trx_rows_modified", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_pid</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> WAITING_PID = createField("waiting_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_query</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> WAITING_QUERY = createField("waiting_query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_lock_id</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> WAITING_LOCK_ID = createField("waiting_lock_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.waiting_lock_mode</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> WAITING_LOCK_MODE = createField("waiting_lock_mode", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_trx_id</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> BLOCKING_TRX_ID = createField("blocking_trx_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_pid</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> BLOCKING_PID = createField("blocking_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_query</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> BLOCKING_QUERY = createField("blocking_query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_lock_id</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> BLOCKING_LOCK_ID = createField("blocking_lock_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_lock_mode</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> BLOCKING_LOCK_MODE = createField("blocking_lock_mode", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_trx_started</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Timestamp> BLOCKING_TRX_STARTED = createField("blocking_trx_started", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_trx_age</code>.
     */
    public final TableField<InnodbLockWaitsRecord, Time> BLOCKING_TRX_AGE = createField("blocking_trx_age", org.jooq.impl.SQLDataType.TIME, this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_trx_rows_locked</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> BLOCKING_TRX_ROWS_LOCKED = createField("blocking_trx_rows_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.blocking_trx_rows_modified</code>.
     */
    public final TableField<InnodbLockWaitsRecord, ULong> BLOCKING_TRX_ROWS_MODIFIED = createField("blocking_trx_rows_modified", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.sql_kill_blocking_query</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField("sql_kill_blocking_query", org.jooq.impl.SQLDataType.VARCHAR(33).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.innodb_lock_waits.sql_kill_blocking_connection</code>.
     */
    public final TableField<InnodbLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField("sql_kill_blocking_connection", org.jooq.impl.SQLDataType.VARCHAR(27).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>sys.innodb_lock_waits</code> table reference
     */
    public InnodbLockWaits() {
        this(DSL.name("innodb_lock_waits"), null);
    }

    /**
     * Create an aliased <code>sys.innodb_lock_waits</code> table reference
     */
    public InnodbLockWaits(String alias) {
        this(DSL.name(alias), INNODB_LOCK_WAITS);
    }

    /**
     * Create an aliased <code>sys.innodb_lock_waits</code> table reference
     */
    public InnodbLockWaits(Name alias) {
        this(alias, INNODB_LOCK_WAITS);
    }

    private InnodbLockWaits(Name alias, Table<InnodbLockWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbLockWaits(Name alias, Table<InnodbLockWaitsRecord> aliased, Field<?>[] parameters) {
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
    public InnodbLockWaits as(String alias) {
        return new InnodbLockWaits(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbLockWaits as(Name alias) {
        return new InnodbLockWaits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbLockWaits rename(String name) {
        return new InnodbLockWaits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbLockWaits rename(Name name) {
        return new InnodbLockWaits(name, null);
    }
}
