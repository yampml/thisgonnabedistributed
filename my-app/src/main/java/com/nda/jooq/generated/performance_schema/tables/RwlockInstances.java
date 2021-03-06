/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.RwlockInstancesRecord;

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
import org.jooq.types.UInteger;
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
public class RwlockInstances extends TableImpl<RwlockInstancesRecord> {

    private static final long serialVersionUID = -843502591;

    /**
     * The reference instance of <code>performance_schema.rwlock_instances</code>
     */
    public static final RwlockInstances RWLOCK_INSTANCES = new RwlockInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RwlockInstancesRecord> getRecordType() {
        return RwlockInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.rwlock_instances.NAME</code>.
     */
    public final TableField<RwlockInstancesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<RwlockInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.WRITE_LOCKED_BY_THREAD_ID</code>.
     */
    public final TableField<RwlockInstancesRecord, ULong> WRITE_LOCKED_BY_THREAD_ID = createField("WRITE_LOCKED_BY_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.rwlock_instances.READ_LOCKED_BY_COUNT</code>.
     */
    public final TableField<RwlockInstancesRecord, UInteger> READ_LOCKED_BY_COUNT = createField("READ_LOCKED_BY_COUNT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances() {
        this(DSL.name("rwlock_instances"), null);
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(String alias) {
        this(DSL.name(alias), RWLOCK_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.rwlock_instances</code> table reference
     */
    public RwlockInstances(Name alias) {
        this(alias, RWLOCK_INSTANCES);
    }

    private RwlockInstances(Name alias, Table<RwlockInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RwlockInstances(Name alias, Table<RwlockInstancesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.RWLOCK_INSTANCES_NAME, Indexes.RWLOCK_INSTANCES_PRIMARY, Indexes.RWLOCK_INSTANCES_WRITE_LOCKED_BY_THREAD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RwlockInstancesRecord> getPrimaryKey() {
        return Keys.KEY_RWLOCK_INSTANCES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RwlockInstancesRecord>> getKeys() {
        return Arrays.<UniqueKey<RwlockInstancesRecord>>asList(Keys.KEY_RWLOCK_INSTANCES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RwlockInstances as(String alias) {
        return new RwlockInstances(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RwlockInstances as(Name alias) {
        return new RwlockInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(String name) {
        return new RwlockInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RwlockInstances rename(Name name) {
        return new RwlockInstances(name, null);
    }
}
