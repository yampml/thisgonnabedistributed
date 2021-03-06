/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.Indexes;
import com.nda.jooq.generated.performance_schema.Keys;
import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.CondInstancesRecord;

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
public class CondInstances extends TableImpl<CondInstancesRecord> {

    private static final long serialVersionUID = -368360237;

    /**
     * The reference instance of <code>performance_schema.cond_instances</code>
     */
    public static final CondInstances COND_INSTANCES = new CondInstances();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CondInstancesRecord> getRecordType() {
        return CondInstancesRecord.class;
    }

    /**
     * The column <code>performance_schema.cond_instances.NAME</code>.
     */
    public final TableField<CondInstancesRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.cond_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<CondInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.cond_instances</code> table reference
     */
    public CondInstances() {
        this(DSL.name("cond_instances"), null);
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table reference
     */
    public CondInstances(String alias) {
        this(DSL.name(alias), COND_INSTANCES);
    }

    /**
     * Create an aliased <code>performance_schema.cond_instances</code> table reference
     */
    public CondInstances(Name alias) {
        this(alias, COND_INSTANCES);
    }

    private CondInstances(Name alias, Table<CondInstancesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CondInstances(Name alias, Table<CondInstancesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.COND_INSTANCES_NAME, Indexes.COND_INSTANCES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CondInstancesRecord> getPrimaryKey() {
        return Keys.KEY_COND_INSTANCES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CondInstancesRecord>> getKeys() {
        return Arrays.<UniqueKey<CondInstancesRecord>>asList(Keys.KEY_COND_INSTANCES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CondInstances as(String alias) {
        return new CondInstances(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CondInstances as(Name alias) {
        return new CondInstances(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CondInstances rename(String name) {
        return new CondInstances(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CondInstances rename(Name name) {
        return new CondInstances(name, null);
    }
}
