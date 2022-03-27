/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.SysConfig;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SysConfigRecord extends UpdatableRecordImpl<SysConfigRecord> implements Record4<String, String, Timestamp, String> {

    private static final long serialVersionUID = 1846957438;

    /**
     * Setter for <code>sys.sys_config.variable</code>.
     */
    public void setVariable(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.sys_config.variable</code>.
     */
    public String getVariable() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.sys_config.value</code>.
     */
    public void setValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.sys_config.value</code>.
     */
    public String getValue() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.sys_config.set_time</code>.
     */
    public void setSetTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.sys_config.set_time</code>.
     */
    public Timestamp getSetTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sys.sys_config.set_by</code>.
     */
    public void setSetBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.sys_config.set_by</code>.
     */
    public String getSetBy() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysConfig.SYS_CONFIG.VARIABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysConfig.SYS_CONFIG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SysConfig.SYS_CONFIG.SET_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysConfig.SYS_CONFIG.SET_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getVariable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getSetTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSetBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getVariable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getSetTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSetBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value1(String value) {
        setVariable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value2(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value3(Timestamp value) {
        setSetTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord value4(String value) {
        setSetBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfigRecord values(String value1, String value2, Timestamp value3, String value4) {
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
     * Create a detached SysConfigRecord
     */
    public SysConfigRecord() {
        super(SysConfig.SYS_CONFIG);
    }

    /**
     * Create a detached, initialised SysConfigRecord
     */
    public SysConfigRecord(String variable, String value, Timestamp setTime, String setBy) {
        super(SysConfig.SYS_CONFIG);

        set(0, variable);
        set(1, value);
        set(2, setTime);
        set(3, setBy);
    }
}
