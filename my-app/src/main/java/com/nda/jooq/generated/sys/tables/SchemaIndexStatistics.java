/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.SchemaIndexStatisticsRecord;

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
public class SchemaIndexStatistics extends TableImpl<SchemaIndexStatisticsRecord> {

    private static final long serialVersionUID = 1607843182;

    /**
     * The reference instance of <code>sys.schema_index_statistics</code>
     */
    public static final SchemaIndexStatistics SCHEMA_INDEX_STATISTICS = new SchemaIndexStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaIndexStatisticsRecord> getRecordType() {
        return SchemaIndexStatisticsRecord.class;
    }

    /**
     * The column <code>sys.schema_index_statistics.table_schema</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.table_name</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.index_name</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_selected</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, ULong> ROWS_SELECTED = createField("rows_selected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.select_latency</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> SELECT_LATENCY = createField("select_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_inserted</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, ULong> ROWS_INSERTED = createField("rows_inserted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.insert_latency</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> INSERT_LATENCY = createField("insert_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_updated</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, ULong> ROWS_UPDATED = createField("rows_updated", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.update_latency</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> UPDATE_LATENCY = createField("update_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.schema_index_statistics.rows_deleted</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, ULong> ROWS_DELETED = createField("rows_deleted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_index_statistics.delete_latency</code>.
     */
    public final TableField<SchemaIndexStatisticsRecord, String> DELETE_LATENCY = createField("delete_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.schema_index_statistics</code> table reference
     */
    public SchemaIndexStatistics() {
        this(DSL.name("schema_index_statistics"), null);
    }

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table reference
     */
    public SchemaIndexStatistics(String alias) {
        this(DSL.name(alias), SCHEMA_INDEX_STATISTICS);
    }

    /**
     * Create an aliased <code>sys.schema_index_statistics</code> table reference
     */
    public SchemaIndexStatistics(Name alias) {
        this(alias, SCHEMA_INDEX_STATISTICS);
    }

    private SchemaIndexStatistics(Name alias, Table<SchemaIndexStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaIndexStatistics(Name alias, Table<SchemaIndexStatisticsRecord> aliased, Field<?>[] parameters) {
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
    public SchemaIndexStatistics as(String alias) {
        return new SchemaIndexStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaIndexStatistics as(Name alias) {
        return new SchemaIndexStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaIndexStatistics rename(String name) {
        return new SchemaIndexStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaIndexStatistics rename(Name name) {
        return new SchemaIndexStatistics(name, null);
    }
}
