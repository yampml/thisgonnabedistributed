/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.DataLocksRecord;

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
public class DataLocks extends TableImpl<DataLocksRecord> {

    private static final long serialVersionUID = -1368394405;

    /**
     * The reference instance of <code>performance_schema.data_locks</code>
     */
    public static final DataLocks DATA_LOCKS = new DataLocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataLocksRecord> getRecordType() {
        return DataLocksRecord.class;
    }

    /**
     * The column <code>performance_schema.data_locks.ENGINE</code>.
     */
    public final TableField<DataLocksRecord, String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.ENGINE_LOCK_ID</code>.
     */
    public final TableField<DataLocksRecord, String> ENGINE_LOCK_ID = createField("ENGINE_LOCK_ID", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.ENGINE_TRANSACTION_ID</code>.
     */
    public final TableField<DataLocksRecord, ULong> ENGINE_TRANSACTION_ID = createField("ENGINE_TRANSACTION_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.data_locks.THREAD_ID</code>.
     */
    public final TableField<DataLocksRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.data_locks.EVENT_ID</code>.
     */
    public final TableField<DataLocksRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.data_locks.OBJECT_SCHEMA</code>.
     */
    public final TableField<DataLocksRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.data_locks.OBJECT_NAME</code>.
     */
    public final TableField<DataLocksRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.data_locks.PARTITION_NAME</code>.
     */
    public final TableField<DataLocksRecord, String> PARTITION_NAME = createField("PARTITION_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.data_locks.SUBPARTITION_NAME</code>.
     */
    public final TableField<DataLocksRecord, String> SUBPARTITION_NAME = createField("SUBPARTITION_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.data_locks.INDEX_NAME</code>.
     */
    public final TableField<DataLocksRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.data_locks.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<DataLocksRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.LOCK_TYPE</code>.
     */
    public final TableField<DataLocksRecord, String> LOCK_TYPE = createField("LOCK_TYPE", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.LOCK_MODE</code>.
     */
    public final TableField<DataLocksRecord, String> LOCK_MODE = createField("LOCK_MODE", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.LOCK_STATUS</code>.
     */
    public final TableField<DataLocksRecord, String> LOCK_STATUS = createField("LOCK_STATUS", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.data_locks.LOCK_DATA</code>.
     */
    public final TableField<DataLocksRecord, String> LOCK_DATA = createField("LOCK_DATA", org.jooq.impl.SQLDataType.VARCHAR(8192), this, "");

    /**
     * Create a <code>performance_schema.data_locks</code> table reference
     */
    public DataLocks() {
        this(DSL.name("data_locks"), null);
    }

    /**
     * Create an aliased <code>performance_schema.data_locks</code> table reference
     */
    public DataLocks(String alias) {
        this(DSL.name(alias), DATA_LOCKS);
    }

    /**
     * Create an aliased <code>performance_schema.data_locks</code> table reference
     */
    public DataLocks(Name alias) {
        this(alias, DATA_LOCKS);
    }

    private DataLocks(Name alias, Table<DataLocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataLocks(Name alias, Table<DataLocksRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DATA_LOCKS_ENGINE_TRANSACTION_ID, Indexes.DATA_LOCKS_OBJECT_SCHEMA, Indexes.DATA_LOCKS_PRIMARY, Indexes.DATA_LOCKS_THREAD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DataLocksRecord> getPrimaryKey() {
        return Keys.KEY_DATA_LOCKS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DataLocksRecord>> getKeys() {
        return Arrays.<UniqueKey<DataLocksRecord>>asList(Keys.KEY_DATA_LOCKS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLocks as(String alias) {
        return new DataLocks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLocks as(Name alias) {
        return new DataLocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataLocks rename(String name) {
        return new DataLocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataLocks rename(Name name) {
        return new DataLocks(name, null);
    }
}
