/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.WaitsByUserByLatency;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class WaitsByUserByLatencyRecord extends TableRecordImpl<WaitsByUserByLatencyRecord> implements Record6<String, String, ULong, String, String, String> {

    private static final long serialVersionUID = -575198484;

    /**
     * Setter for <code>sys.waits_by_user_by_latency.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.waits_by_user_by_latency.event</code>.
     */
    public void setEvent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.event</code>.
     */
    public String getEvent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.waits_by_user_by_latency.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.waits_by_user_by_latency.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.waits_by_user_by_latency.avg_latency</code>.
     */
    public void setAvgLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.avg_latency</code>.
     */
    public String getAvgLatency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.waits_by_user_by_latency.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.waits_by_user_by_latency.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, ULong, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, ULong, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY.MAX_LATENCY;
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
        return getEvent();
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
    public String component4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
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
        return getEvent();
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
    public String value4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value2(String value) {
        setEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value4(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value5(String value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord value6(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitsByUserByLatencyRecord values(String value1, String value2, ULong value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WaitsByUserByLatencyRecord
     */
    public WaitsByUserByLatencyRecord() {
        super(WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY);
    }

    /**
     * Create a detached, initialised WaitsByUserByLatencyRecord
     */
    public WaitsByUserByLatencyRecord(String user, String event, ULong total, String totalLatency, String avgLatency, String maxLatency) {
        super(WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY);

        set(0, user);
        set(1, event);
        set(2, total);
        set(3, totalLatency);
        set(4, avgLatency);
        set(5, maxLatency);
    }
}
