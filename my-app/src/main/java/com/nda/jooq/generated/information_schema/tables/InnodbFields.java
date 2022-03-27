/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.information_schema.tables;


import com.nda.jooq.generated.information_schema.InformationSchema;
import com.nda.jooq.generated.information_schema.tables.records.InnodbFieldsRecord;

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
public class InnodbFields extends TableImpl<InnodbFieldsRecord> {

    private static final long serialVersionUID = 750622019;

    /**
     * The reference instance of <code>information_schema.INNODB_FIELDS</code>
     */
    public static final InnodbFields INNODB_FIELDS = new InnodbFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFieldsRecord> getRecordType() {
        return InnodbFieldsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbFieldsRecord, byte[]> INDEX_ID = createField("INDEX_ID", org.jooq.impl.SQLDataType.VARBINARY(256), this, "");

    /**
     * The column <code>information_schema.INNODB_FIELDS.NAME</code>.
     */
    public final TableField<InnodbFieldsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_FIELDS.POS</code>.
     */
    public final TableField<InnodbFieldsRecord, ULong> POS = createField("POS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_FIELDS</code> table reference
     */
    public InnodbFields() {
        this(DSL.name("INNODB_FIELDS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FIELDS</code> table reference
     */
    public InnodbFields(String alias) {
        this(DSL.name(alias), INNODB_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FIELDS</code> table reference
     */
    public InnodbFields(Name alias) {
        this(alias, INNODB_FIELDS);
    }

    private InnodbFields(Name alias, Table<InnodbFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFields(Name alias, Table<InnodbFieldsRecord> aliased, Field<?>[] parameters) {
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
    public InnodbFields as(String alias) {
        return new InnodbFields(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbFields as(Name alias) {
        return new InnodbFields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFields rename(String name) {
        return new InnodbFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFields rename(Name name) {
        return new InnodbFields(name, null);
    }
}
