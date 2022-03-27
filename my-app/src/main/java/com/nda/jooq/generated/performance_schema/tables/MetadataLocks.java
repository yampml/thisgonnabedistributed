/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.MetadataLocksRecord;

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
public class MetadataLocks extends TableImpl<MetadataLocksRecord> {

    private static final long serialVersionUID = -1946356321;

    /**
     * The reference instance of <code>performance_schema.metadata_locks</code>
     */
    public static final MetadataLocks METADATA_LOCKS = new MetadataLocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetadataLocksRecord> getRecordType() {
        return MetadataLocksRecord.class;
    }

    /**
     * The column <code>performance_schema.metadata_locks.OBJECT_TYPE</code>.
     */
    public final TableField<MetadataLocksRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.OBJECT_SCHEMA</code>.
     */
    public final TableField<MetadataLocksRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.OBJECT_NAME</code>.
     */
    public final TableField<MetadataLocksRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.COLUMN_NAME</code>.
     */
    public final TableField<MetadataLocksRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<MetadataLocksRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.LOCK_TYPE</code>.
     */
    public final TableField<MetadataLocksRecord, String> LOCK_TYPE = createField("LOCK_TYPE", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.LOCK_DURATION</code>.
     */
    public final TableField<MetadataLocksRecord, String> LOCK_DURATION = createField("LOCK_DURATION", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.LOCK_STATUS</code>.
     */
    public final TableField<MetadataLocksRecord, String> LOCK_STATUS = createField("LOCK_STATUS", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.SOURCE</code>.
     */
    public final TableField<MetadataLocksRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.metadata_locks.OWNER_THREAD_ID</code>.
     */
    public final TableField<MetadataLocksRecord, ULong> OWNER_THREAD_ID = createField("OWNER_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.metadata_locks.OWNER_EVENT_ID</code>.
     */
    public final TableField<MetadataLocksRecord, ULong> OWNER_EVENT_ID = createField("OWNER_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>performance_schema.metadata_locks</code> table reference
     */
    public MetadataLocks() {
        this(DSL.name("metadata_locks"), null);
    }

    /**
     * Create an aliased <code>performance_schema.metadata_locks</code> table reference
     */
    public MetadataLocks(String alias) {
        this(DSL.name(alias), METADATA_LOCKS);
    }

    /**
     * Create an aliased <code>performance_schema.metadata_locks</code> table reference
     */
    public MetadataLocks(Name alias) {
        this(alias, METADATA_LOCKS);
    }

    private MetadataLocks(Name alias, Table<MetadataLocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private MetadataLocks(Name alias, Table<MetadataLocksRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.METADATA_LOCKS_OBJECT_TYPE, Indexes.METADATA_LOCKS_OWNER_THREAD_ID, Indexes.METADATA_LOCKS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MetadataLocksRecord> getPrimaryKey() {
        return Keys.KEY_METADATA_LOCKS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MetadataLocksRecord>> getKeys() {
        return Arrays.<UniqueKey<MetadataLocksRecord>>asList(Keys.KEY_METADATA_LOCKS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocks as(String alias) {
        return new MetadataLocks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocks as(Name alias) {
        return new MetadataLocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MetadataLocks rename(String name) {
        return new MetadataLocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MetadataLocks rename(Name name) {
        return new MetadataLocks(name, null);
    }
}
