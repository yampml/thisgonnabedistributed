/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.X$hostSummaryByStatementType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class X$hostSummaryByStatementTypeRecord extends TableRecordImpl<X$hostSummaryByStatementTypeRecord> implements Record11<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1888682575;

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.statement</code>.
     */
    public void setStatement(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.statement</code>.
     */
    public String getStatement() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.lock_latency</code>.
     */
    public void setLockLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.lock_latency</code>.
     */
    public ULong getLockLatency() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.cpu_latency</code>.
     */
    public void setCpuLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.cpu_latency</code>.
     */
    public ULong getCpuLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.rows_affected</code>.
     */
    public void setRowsAffected(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.rows_affected</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_statement_type.full_scans</code>.
     */
    public void setFullScans(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_statement_type.full_scans</code>.
     */
    public ULong getFullScans() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.STATEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.LOCK_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.CPU_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.ROWS_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.ROWS_EXAMINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.ROWS_AFFECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE.FULL_SCANS;
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
    public String component2() {
        return getStatement();
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
        return getTotalLatency();
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
    public ULong component6() {
        return getLockLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getCpuLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getRowsAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getFullScans();
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
    public String value2() {
        return getStatement();
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
        return getTotalLatency();
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
    public ULong value6() {
        return getLockLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getCpuLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getRowsAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getFullScans();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value2(String value) {
        setStatement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value6(ULong value) {
        setLockLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value7(ULong value) {
        setCpuLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value8(ULong value) {
        setRowsSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value9(ULong value) {
        setRowsExamined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value10(ULong value) {
        setRowsAffected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord value11(ULong value) {
        setFullScans(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByStatementTypeRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$hostSummaryByStatementTypeRecord
     */
    public X$hostSummaryByStatementTypeRecord() {
        super(X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create a detached, initialised X$hostSummaryByStatementTypeRecord
     */
    public X$hostSummaryByStatementTypeRecord(String host, String statement, ULong total, ULong totalLatency, ULong maxLatency, ULong lockLatency, ULong cpuLatency, ULong rowsSent, ULong rowsExamined, ULong rowsAffected, ULong fullScans) {
        super(X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE);

        set(0, host);
        set(1, statement);
        set(2, total);
        set(3, totalLatency);
        set(4, maxLatency);
        set(5, lockLatency);
        set(6, cpuLatency);
        set(7, rowsSent);
        set(8, rowsExamined);
        set(9, rowsAffected);
        set(10, fullScans);
    }
}
