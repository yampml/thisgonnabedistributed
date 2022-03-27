/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.information_schema.tables;


import com.nda.jooq.generated.information_schema.InformationSchema;
import com.nda.jooq.generated.information_schema.tables.records.SchemataExtensionsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SchemataExtensions extends TableImpl<SchemataExtensionsRecord> {

    private static final long serialVersionUID = 1734026643;

    /**
     * The reference instance of <code>information_schema.SCHEMATA_EXTENSIONS</code>
     */
    public static final SchemataExtensions SCHEMATA_EXTENSIONS = new SchemataExtensions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemataExtensionsRecord> getRecordType() {
        return SchemataExtensionsRecord.class;
    }

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.CATALOG_NAME</code>.
     */
    public final TableField<SchemataExtensionsRecord, String> CATALOG_NAME = createField("CATALOG_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.SCHEMA_NAME</code>.
     */
    public final TableField<SchemataExtensionsRecord, String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA_EXTENSIONS.OPTIONS</code>.
     */
    public final TableField<SchemataExtensionsRecord, String> OPTIONS = createField("OPTIONS", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>information_schema.SCHEMATA_EXTENSIONS</code> table reference
     */
    public SchemataExtensions() {
        this(DSL.name("SCHEMATA_EXTENSIONS"), null);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code> table reference
     */
    public SchemataExtensions(String alias) {
        this(DSL.name(alias), SCHEMATA_EXTENSIONS);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA_EXTENSIONS</code> table reference
     */
    public SchemataExtensions(Name alias) {
        this(alias, SCHEMATA_EXTENSIONS);
    }

    private SchemataExtensions(Name alias, Table<SchemataExtensionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemataExtensions(Name alias, Table<SchemataExtensionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataExtensions as(String alias) {
        return new SchemataExtensions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataExtensions as(Name alias) {
        return new SchemataExtensions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemataExtensions rename(String name) {
        return new SchemataExtensions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemataExtensions rename(Name name) {
        return new SchemataExtensions(name, null);
    }
}
