/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.SessionConnectAttrs;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
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
public class SessionConnectAttrsRecord extends UpdatableRecordImpl<SessionConnectAttrsRecord> implements Record4<ULong, String, String, Integer> {

    private static final long serialVersionUID = -783146497;

    /**
     * Setter for <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
     */
    public void setProcesslistId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
     */
    public ULong getProcesslistId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
     */
    public void setAttrName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
     */
    public String getAttrName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
     */
    public void setAttrValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
     */
    public String getAttrValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<ULong, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return SessionConnectAttrs.SESSION_CONNECT_ATTRS.PROCESSLIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SessionConnectAttrs.SESSION_CONNECT_ATTRS.ATTR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SessionConnectAttrs.SESSION_CONNECT_ATTRS.ATTR_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SessionConnectAttrs.SESSION_CONNECT_ATTRS.ORDINAL_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getProcesslistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAttrValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getProcesslistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAttrName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAttrValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrsRecord value1(ULong value) {
        setProcesslistId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrsRecord value2(String value) {
        setAttrName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrsRecord value3(String value) {
        setAttrValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrsRecord value4(Integer value) {
        setOrdinalPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionConnectAttrsRecord values(ULong value1, String value2, String value3, Integer value4) {
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
     * Create a detached SessionConnectAttrsRecord
     */
    public SessionConnectAttrsRecord() {
        super(SessionConnectAttrs.SESSION_CONNECT_ATTRS);
    }

    /**
     * Create a detached, initialised SessionConnectAttrsRecord
     */
    public SessionConnectAttrsRecord(ULong processlistId, String attrName, String attrValue, Integer ordinalPosition) {
        super(SessionConnectAttrs.SESSION_CONNECT_ATTRS);

        set(0, processlistId);
        set(1, attrName);
        set(2, attrValue);
        set(3, ordinalPosition);
    }
}
