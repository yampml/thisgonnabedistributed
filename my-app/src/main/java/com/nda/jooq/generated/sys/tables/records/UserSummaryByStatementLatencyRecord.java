/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.UserSummaryByStatementLatency;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class UserSummaryByStatementLatencyRecord extends TableRecordImpl<UserSummaryByStatementLatencyRecord> implements Record10<String, BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, BigInteger> {

    private static final long serialVersionUID = 1493953545;

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.total</code>.
     */
    public void setTotal(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.total</code>.
     */
    public BigInteger getTotal() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.lock_latency</code>.
     */
    public void setLockLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.lock_latency</code>.
     */
    public String getLockLatency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.cpu_latency</code>.
     */
    public void setCpuLatency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.cpu_latency</code>.
     */
    public String getCpuLatency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.rows_sent</code>.
     */
    public void setRowsSent(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.rows_sent</code>.
     */
    public BigInteger getRowsSent() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.rows_examined</code>.
     */
    public void setRowsExamined(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.rows_examined</code>.
     */
    public BigInteger getRowsExamined() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.rows_affected</code>.
     */
    public void setRowsAffected(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.rows_affected</code>.
     */
    public BigInteger getRowsAffected() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>sys.user_summary_by_statement_latency.full_scans</code>.
     */
    public void setFullScans(BigInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.user_summary_by_statement_latency.full_scans</code>.
     */
    public BigInteger getFullScans() {
        return (BigInteger) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, BigInteger> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, BigInteger, String, String, String, String, BigInteger, BigInteger, BigInteger, BigInteger> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.LOCK_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.CPU_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field7() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.ROWS_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field8() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.ROWS_EXAMINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field9() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.ROWS_AFFECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field10() {
        return UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY.FULL_SCANS;
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
    public BigInteger component2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLockLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCpuLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component7() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component8() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component9() {
        return getRowsAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component10() {
        return getFullScans();
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
    public BigInteger value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLockLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCpuLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value7() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value8() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value9() {
        return getRowsAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value10() {
        return getFullScans();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value2(BigInteger value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value3(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value4(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value5(String value) {
        setLockLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value6(String value) {
        setCpuLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value7(BigInteger value) {
        setRowsSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value8(BigInteger value) {
        setRowsExamined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value9(BigInteger value) {
        setRowsAffected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord value10(BigInteger value) {
        setFullScans(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStatementLatencyRecord values(String value1, BigInteger value2, String value3, String value4, String value5, String value6, BigInteger value7, BigInteger value8, BigInteger value9, BigInteger value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserSummaryByStatementLatencyRecord
     */
    public UserSummaryByStatementLatencyRecord() {
        super(UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY);
    }

    /**
     * Create a detached, initialised UserSummaryByStatementLatencyRecord
     */
    public UserSummaryByStatementLatencyRecord(String user, BigInteger total, String totalLatency, String maxLatency, String lockLatency, String cpuLatency, BigInteger rowsSent, BigInteger rowsExamined, BigInteger rowsAffected, BigInteger fullScans) {
        super(UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY);

        set(0, user);
        set(1, total);
        set(2, totalLatency);
        set(3, maxLatency);
        set(4, lockLatency);
        set(5, cpuLatency);
        set(6, rowsSent);
        set(7, rowsExamined);
        set(8, rowsAffected);
        set(9, fullScans);
    }
}
