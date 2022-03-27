/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.EventsErrorsSummaryByHostByError;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
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
public class EventsErrorsSummaryByHostByErrorRecord extends TableRecordImpl<EventsErrorsSummaryByHostByErrorRecord> implements Record8<String, Integer, String, String, ULong, ULong, Timestamp, Timestamp> {

    private static final long serialVersionUID = -946478350;

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.HOST</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.HOST</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NUMBER</code>.
     */
    public void setErrorNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NUMBER</code>.
     */
    public Integer getErrorNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NAME</code>.
     */
    public void setErrorName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.ERROR_NAME</code>.
     */
    public String getErrorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.SQL_STATE</code>.
     */
    public void setSqlState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.SQL_STATE</code>.
     */
    public String getSqlState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_RAISED</code>.
     */
    public void setSumErrorRaised(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_RAISED</code>.
     */
    public ULong getSumErrorRaised() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED</code>.
     */
    public void setSumErrorHandled(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED</code>.
     */
    public ULong getSumErrorHandled() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.FIRST_SEEN</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.FIRST_SEEN</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_host_by_error.LAST_SEEN</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_host_by_error.LAST_SEEN</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Integer, String, String, ULong, ULong, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Integer, String, String, ULong, ULong, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.ERROR_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.ERROR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.SQL_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.SUM_ERROR_RAISED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.SUM_ERROR_HANDLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.FIRST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR.LAST_SEEN;
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
    public Integer component2() {
        return getErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getErrorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSqlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getSumErrorRaised();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getSumErrorHandled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getLastSeen();
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
    public Integer value2() {
        return getErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getErrorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSqlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getSumErrorRaised();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getSumErrorHandled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value2(Integer value) {
        setErrorNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value3(String value) {
        setErrorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value4(String value) {
        setSqlState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value5(ULong value) {
        setSumErrorRaised(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value6(ULong value) {
        setSumErrorHandled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value7(Timestamp value) {
        setFirstSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord value8(Timestamp value) {
        setLastSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByHostByErrorRecord values(String value1, Integer value2, String value3, String value4, ULong value5, ULong value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsErrorsSummaryByHostByErrorRecord
     */
    public EventsErrorsSummaryByHostByErrorRecord() {
        super(EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR);
    }

    /**
     * Create a detached, initialised EventsErrorsSummaryByHostByErrorRecord
     */
    public EventsErrorsSummaryByHostByErrorRecord(String host, Integer errorNumber, String errorName, String sqlState, ULong sumErrorRaised, ULong sumErrorHandled, Timestamp firstSeen, Timestamp lastSeen) {
        super(EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR);

        set(0, host);
        set(1, errorNumber);
        set(2, errorName);
        set(3, sqlState);
        set(4, sumErrorRaised);
        set(5, sumErrorHandled);
        set(6, firstSeen);
        set(7, lastSeen);
    }
}
