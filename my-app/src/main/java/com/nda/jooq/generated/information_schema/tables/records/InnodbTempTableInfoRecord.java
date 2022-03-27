/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.information_schema.tables.records;


import com.nda.jooq.generated.information_schema.tables.InnodbTempTableInfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
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
public class InnodbTempTableInfoRecord extends TableRecordImpl<InnodbTempTableInfoRecord> implements Record4<ULong, String, UInteger, UInteger> {

    private static final long serialVersionUID = 1403962024;

    /**
     * Setter for <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    public void setTableId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    public void setNCols(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.N_COLS</code>.
     */
    public UInteger getNCols() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    public void setSpace(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TEMP_TABLE_INFO.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, UInteger, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, UInteger, UInteger> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO.TABLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO.N_COLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getNCols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component4() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getTableId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getNCols();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTempTableInfoRecord value1(ULong value) {
        setTableId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTempTableInfoRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTempTableInfoRecord value3(UInteger value) {
        setNCols(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTempTableInfoRecord value4(UInteger value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTempTableInfoRecord values(ULong value1, String value2, UInteger value3, UInteger value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbTempTableInfoRecord
     */
    public InnodbTempTableInfoRecord() {
        super(InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO);
    }

    /**
     * Create a detached, initialised InnodbTempTableInfoRecord
     */
    public InnodbTempTableInfoRecord(ULong tableId, String name, UInteger nCols, UInteger space) {
        super(InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO);

        set(0, tableId);
        set(1, name);
        set(2, nCols);
        set(3, space);
    }
}
