/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.WaitsGlobalByLatencyRecord;

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
public class WaitsGlobalByLatency extends TableImpl<WaitsGlobalByLatencyRecord> {

    private static final long serialVersionUID = 1586693962;

    /**
     * The reference instance of <code>sys.waits_global_by_latency</code>
     */
    public static final WaitsGlobalByLatency WAITS_GLOBAL_BY_LATENCY = new WaitsGlobalByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WaitsGlobalByLatencyRecord> getRecordType() {
        return WaitsGlobalByLatencyRecord.class;
    }

    /**
     * The column <code>sys.waits_global_by_latency.events</code>.
     */
    public final TableField<WaitsGlobalByLatencyRecord, String> EVENTS = createField("events", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.total</code>.
     */
    public final TableField<WaitsGlobalByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.total_latency</code>.
     */
    public final TableField<WaitsGlobalByLatencyRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.avg_latency</code>.
     */
    public final TableField<WaitsGlobalByLatencyRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.waits_global_by_latency.max_latency</code>.
     */
    public final TableField<WaitsGlobalByLatencyRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency() {
        this(DSL.name("waits_global_by_latency"), null);
    }

    /**
     * Create an aliased <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency(String alias) {
        this(DSL.name(alias), WAITS_GLOBAL_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.waits_global_by_latency</code> table reference
     */
    public WaitsGlobalByLatency(Name alias) {
        this(alias, WAITS_GLOBAL_BY_LATENCY);
    }

    private WaitsGlobalByLatency(Name alias, Table<WaitsGlobalByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private WaitsGlobalByLatency(Name alias, Table<WaitsGlobalByLatencyRecord> aliased, Field<?>[] parameters) {
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
    public WaitsGlobalByLatency as(String alias) {
        return new WaitsGlobalByLatency(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsGlobalByLatency as(Name alias) {
        return new WaitsGlobalByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsGlobalByLatency rename(String name) {
        return new WaitsGlobalByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WaitsGlobalByLatency rename(Name name) {
        return new WaitsGlobalByLatency(name, null);
    }
}