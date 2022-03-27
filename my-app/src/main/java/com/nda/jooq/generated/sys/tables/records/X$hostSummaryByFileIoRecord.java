/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.X$hostSummaryByFileIo;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class X$hostSummaryByFileIoRecord extends TableRecordImpl<X$hostSummaryByFileIoRecord> implements Record3<String, BigInteger, BigInteger> {

    private static final long serialVersionUID = 468692343;

    /**
     * Setter for <code>sys.x$host_summary_by_file_io.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io.ios</code>.
     */
    public void setIos(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io.ios</code>.
     */
    public BigInteger getIos() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io.io_latency</code>.
     */
    public void setIoLatency(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io.io_latency</code>.
     */
    public BigInteger getIoLatency() {
        return (BigInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, BigInteger, BigInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, BigInteger, BigInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO.IOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO.IO_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getIos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component3() {
        return getIoLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getIos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getIoLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoRecord value2(BigInteger value) {
        setIos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoRecord value3(BigInteger value) {
        setIoLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoRecord values(String value1, BigInteger value2, BigInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$hostSummaryByFileIoRecord
     */
    public X$hostSummaryByFileIoRecord() {
        super(X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO);
    }

    /**
     * Create a detached, initialised X$hostSummaryByFileIoRecord
     */
    public X$hostSummaryByFileIoRecord(String host, BigInteger ios, BigInteger ioLatency) {
        super(X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO);

        set(0, host);
        set(1, ios);
        set(2, ioLatency);
    }
}
