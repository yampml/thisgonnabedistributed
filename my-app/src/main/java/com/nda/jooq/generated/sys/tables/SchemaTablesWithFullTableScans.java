/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.SchemaTablesWithFullTableScansRecord;

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
public class SchemaTablesWithFullTableScans extends TableImpl<SchemaTablesWithFullTableScansRecord> {

    private static final long serialVersionUID = -1970488141;

    /**
     * The reference instance of <code>sys.schema_tables_with_full_table_scans</code>
     */
    public static final SchemaTablesWithFullTableScans SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = new SchemaTablesWithFullTableScans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaTablesWithFullTableScansRecord> getRecordType() {
        return SchemaTablesWithFullTableScansRecord.class;
    }

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
     */
    public final TableField<SchemaTablesWithFullTableScansRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.object_name</code>.
     */
    public final TableField<SchemaTablesWithFullTableScansRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public final TableField<SchemaTablesWithFullTableScansRecord, ULong> ROWS_FULL_SCANNED = createField("rows_full_scanned", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_tables_with_full_table_scans.latency</code>.
     */
    public final TableField<SchemaTablesWithFullTableScansRecord, String> LATENCY = createField("latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans() {
        this(DSL.name("schema_tables_with_full_table_scans"), null);
    }

    /**
     * Create an aliased <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans(String alias) {
        this(DSL.name(alias), SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create an aliased <code>sys.schema_tables_with_full_table_scans</code> table reference
     */
    public SchemaTablesWithFullTableScans(Name alias) {
        this(alias, SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    private SchemaTablesWithFullTableScans(Name alias, Table<SchemaTablesWithFullTableScansRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaTablesWithFullTableScans(Name alias, Table<SchemaTablesWithFullTableScansRecord> aliased, Field<?>[] parameters) {
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
    public SchemaTablesWithFullTableScans as(String alias) {
        return new SchemaTablesWithFullTableScans(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTablesWithFullTableScans as(Name alias) {
        return new SchemaTablesWithFullTableScans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTablesWithFullTableScans rename(String name) {
        return new SchemaTablesWithFullTableScans(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTablesWithFullTableScans rename(Name name) {
        return new SchemaTablesWithFullTableScans(name, null);
    }
}
