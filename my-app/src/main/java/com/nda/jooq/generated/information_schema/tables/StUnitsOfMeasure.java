/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.information_schema.tables;


import com.nda.jooq.generated.information_schema.InformationSchema;
import com.nda.jooq.generated.information_schema.tables.records.StUnitsOfMeasureRecord;

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
public class StUnitsOfMeasure extends TableImpl<StUnitsOfMeasureRecord> {

    private static final long serialVersionUID = 1463625841;

    /**
     * The reference instance of <code>information_schema.ST_UNITS_OF_MEASURE</code>
     */
    public static final StUnitsOfMeasure ST_UNITS_OF_MEASURE = new StUnitsOfMeasure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StUnitsOfMeasureRecord> getRecordType() {
        return StUnitsOfMeasureRecord.class;
    }

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_NAME</code>.
     */
    public final TableField<StUnitsOfMeasureRecord, String> UNIT_NAME = createField("UNIT_NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.UNIT_TYPE</code>.
     */
    public final TableField<StUnitsOfMeasureRecord, String> UNIT_TYPE = createField("UNIT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.CONVERSION_FACTOR</code>.
     */
    public final TableField<StUnitsOfMeasureRecord, Double> CONVERSION_FACTOR = createField("CONVERSION_FACTOR", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>information_schema.ST_UNITS_OF_MEASURE.DESCRIPTION</code>.
     */
    public final TableField<StUnitsOfMeasureRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>information_schema.ST_UNITS_OF_MEASURE</code> table reference
     */
    public StUnitsOfMeasure() {
        this(DSL.name("ST_UNITS_OF_MEASURE"), null);
    }

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code> table reference
     */
    public StUnitsOfMeasure(String alias) {
        this(DSL.name(alias), ST_UNITS_OF_MEASURE);
    }

    /**
     * Create an aliased <code>information_schema.ST_UNITS_OF_MEASURE</code> table reference
     */
    public StUnitsOfMeasure(Name alias) {
        this(alias, ST_UNITS_OF_MEASURE);
    }

    private StUnitsOfMeasure(Name alias, Table<StUnitsOfMeasureRecord> aliased) {
        this(alias, aliased, null);
    }

    private StUnitsOfMeasure(Name alias, Table<StUnitsOfMeasureRecord> aliased, Field<?>[] parameters) {
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
    public StUnitsOfMeasure as(String alias) {
        return new StUnitsOfMeasure(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StUnitsOfMeasure as(Name alias) {
        return new StUnitsOfMeasure(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StUnitsOfMeasure rename(String name) {
        return new StUnitsOfMeasure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StUnitsOfMeasure rename(Name name) {
        return new StUnitsOfMeasure(name, null);
    }
}