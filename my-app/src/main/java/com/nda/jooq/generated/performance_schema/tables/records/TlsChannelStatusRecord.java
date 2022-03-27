/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.TlsChannelStatus;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class TlsChannelStatusRecord extends TableRecordImpl<TlsChannelStatusRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -354086719;

    /**
     * Setter for <code>performance_schema.tls_channel_status.CHANNEL</code>.
     */
    public void setChannel(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.CHANNEL</code>.
     */
    public String getChannel() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.tls_channel_status.PROPERTY</code>.
     */
    public void setProperty(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.PROPERTY</code>.
     */
    public String getProperty() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.tls_channel_status.VALUE</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.tls_channel_status.VALUE</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.PROPERTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TlsChannelStatus.TLS_CHANNEL_STATUS.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProperty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProperty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TlsChannelStatusRecord value1(String value) {
        setChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TlsChannelStatusRecord value2(String value) {
        setProperty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TlsChannelStatusRecord value3(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TlsChannelStatusRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TlsChannelStatusRecord
     */
    public TlsChannelStatusRecord() {
        super(TlsChannelStatus.TLS_CHANNEL_STATUS);
    }

    /**
     * Create a detached, initialised TlsChannelStatusRecord
     */
    public TlsChannelStatusRecord(String channel, String property, String value) {
        super(TlsChannelStatus.TLS_CHANNEL_STATUS);

        set(0, channel);
        set(1, property);
        set(2, value);
    }
}
