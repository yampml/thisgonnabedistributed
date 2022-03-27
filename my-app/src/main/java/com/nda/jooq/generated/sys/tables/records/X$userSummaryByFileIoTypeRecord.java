/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.X$userSummaryByFileIoType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
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
public class X$userSummaryByFileIoTypeRecord extends TableRecordImpl<X$userSummaryByFileIoTypeRecord> implements Record5<String, String, ULong, ULong, ULong> {

    private static final long serialVersionUID = 711496537;

    /**
     * Setter for <code>sys.x$user_summary_by_file_io_type.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_file_io_type.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_file_io_type.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_file_io_type.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_file_io_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_file_io_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_file_io_type.latency</code>.
     */
    public void setLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_file_io_type.latency</code>.
     */
    public ULong getLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$user_summary_by_file_io_type.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$user_summary_by_file_io_type.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, ULong, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE.LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord value4(ULong value) {
        setLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByFileIoTypeRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$userSummaryByFileIoTypeRecord
     */
    public X$userSummaryByFileIoTypeRecord() {
        super(X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a detached, initialised X$userSummaryByFileIoTypeRecord
     */
    public X$userSummaryByFileIoTypeRecord(String user, String eventName, ULong total, ULong latency, ULong maxLatency) {
        super(X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE);

        set(0, user);
        set(1, eventName);
        set(2, total);
        set(3, latency);
        set(4, maxLatency);
    }
}
