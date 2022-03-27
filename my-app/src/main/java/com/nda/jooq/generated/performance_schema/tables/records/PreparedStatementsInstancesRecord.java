/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.PreparedStatementsInstancesOwnerObjectType;
import com.nda.jooq.generated.performance_schema.tables.PreparedStatementsInstances;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class PreparedStatementsInstancesRecord extends UpdatableRecordImpl<PreparedStatementsInstancesRecord> {

    private static final long serialVersionUID = -1113074574;

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
     */
    public void setStatementId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
     */
    public ULong getStatementId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
     */
    public void setStatementName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
     */
    public String getStatementName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
     */
    public void setSqlText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
     */
    public String getSqlText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
     */
    public void setOwnerThreadId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
     */
    public ULong getOwnerThreadId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
     */
    public void setOwnerEventId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
     */
    public ULong getOwnerEventId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
     */
    public void setOwnerObjectType(PreparedStatementsInstancesOwnerObjectType value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
     */
    public PreparedStatementsInstancesOwnerObjectType getOwnerObjectType() {
        return (PreparedStatementsInstancesOwnerObjectType) get(6);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
     */
    public void setOwnerObjectSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
     */
    public String getOwnerObjectSchema() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
     */
    public void setOwnerObjectName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
     */
    public String getOwnerObjectName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
     */
    public void setTimerPrepare(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
     */
    public ULong getTimerPrepare() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
     */
    public void setCountReprepare(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
     */
    public ULong getCountReprepare() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
     */
    public void setCountExecute(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
     */
    public ULong getCountExecute() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
     */
    public void setSumTimerExecute(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
     */
    public ULong getSumTimerExecute() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
     */
    public void setMinTimerExecute(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
     */
    public ULong getMinTimerExecute() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
     */
    public void setAvgTimerExecute(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
     */
    public ULong getAvgTimerExecute() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
     */
    public void setMaxTimerExecute(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
     */
    public ULong getMaxTimerExecute() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
     */
    public void setSumLockTime(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
     */
    public ULong getSumLockTime() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
     */
    public void setSumErrors(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
     */
    public ULong getSumErrors() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
     */
    public void setSumWarnings(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
     */
    public ULong getSumWarnings() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
     */
    public void setSumRowsAffected(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
     */
    public ULong getSumRowsAffected() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
     */
    public void setSumRowsSent(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
     */
    public ULong getSumRowsSent() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
     */
    public void setSumRowsExamined(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
     */
    public ULong getSumRowsExamined() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public void setSumCreatedTmpDiskTables(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public ULong getSumCreatedTmpDiskTables() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
     */
    public void setSumCreatedTmpTables(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
     */
    public ULong getSumCreatedTmpTables() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
     */
    public void setSumSelectFullJoin(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
     */
    public ULong getSumSelectFullJoin() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public void setSumSelectFullRangeJoin(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public ULong getSumSelectFullRangeJoin() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
     */
    public void setSumSelectRange(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
     */
    public ULong getSumSelectRange() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
     */
    public void setSumSelectRangeCheck(ULong value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
     */
    public ULong getSumSelectRangeCheck() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
     */
    public void setSumSelectScan(ULong value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
     */
    public ULong getSumSelectScan() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
     */
    public void setSumSortMergePasses(ULong value) {
        set(29, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
     */
    public ULong getSumSortMergePasses() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
     */
    public void setSumSortRange(ULong value) {
        set(30, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
     */
    public ULong getSumSortRange() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
     */
    public void setSumSortRows(ULong value) {
        set(31, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
     */
    public ULong getSumSortRows() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
     */
    public void setSumSortScan(ULong value) {
        set(32, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
     */
    public ULong getSumSortScan() {
        return (ULong) get(32);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
     */
    public void setSumNoIndexUsed(ULong value) {
        set(33, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
     */
    public ULong getSumNoIndexUsed() {
        return (ULong) get(33);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public void setSumNoGoodIndexUsed(ULong value) {
        set(34, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public ULong getSumNoGoodIndexUsed() {
        return (ULong) get(34);
    }

    /**
     * Setter for <code>performance_schema.prepared_statements_instances.SUM_CPU_TIME</code>.
     */
    public void setSumCpuTime(ULong value) {
        set(35, value);
    }

    /**
     * Getter for <code>performance_schema.prepared_statements_instances.SUM_CPU_TIME</code>.
     */
    public ULong getSumCpuTime() {
        return (ULong) get(35);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PreparedStatementsInstancesRecord
     */
    public PreparedStatementsInstancesRecord() {
        super(PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES);
    }

    /**
     * Create a detached, initialised PreparedStatementsInstancesRecord
     */
    public PreparedStatementsInstancesRecord(ULong objectInstanceBegin, ULong statementId, String statementName, String sqlText, ULong ownerThreadId, ULong ownerEventId, PreparedStatementsInstancesOwnerObjectType ownerObjectType, String ownerObjectSchema, String ownerObjectName, ULong timerPrepare, ULong countReprepare, ULong countExecute, ULong sumTimerExecute, ULong minTimerExecute, ULong avgTimerExecute, ULong maxTimerExecute, ULong sumLockTime, ULong sumErrors, ULong sumWarnings, ULong sumRowsAffected, ULong sumRowsSent, ULong sumRowsExamined, ULong sumCreatedTmpDiskTables, ULong sumCreatedTmpTables, ULong sumSelectFullJoin, ULong sumSelectFullRangeJoin, ULong sumSelectRange, ULong sumSelectRangeCheck, ULong sumSelectScan, ULong sumSortMergePasses, ULong sumSortRange, ULong sumSortRows, ULong sumSortScan, ULong sumNoIndexUsed, ULong sumNoGoodIndexUsed, ULong sumCpuTime) {
        super(PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES);

        set(0, objectInstanceBegin);
        set(1, statementId);
        set(2, statementName);
        set(3, sqlText);
        set(4, ownerThreadId);
        set(5, ownerEventId);
        set(6, ownerObjectType);
        set(7, ownerObjectSchema);
        set(8, ownerObjectName);
        set(9, timerPrepare);
        set(10, countReprepare);
        set(11, countExecute);
        set(12, sumTimerExecute);
        set(13, minTimerExecute);
        set(14, avgTimerExecute);
        set(15, maxTimerExecute);
        set(16, sumLockTime);
        set(17, sumErrors);
        set(18, sumWarnings);
        set(19, sumRowsAffected);
        set(20, sumRowsSent);
        set(21, sumRowsExamined);
        set(22, sumCreatedTmpDiskTables);
        set(23, sumCreatedTmpTables);
        set(24, sumSelectFullJoin);
        set(25, sumSelectFullRangeJoin);
        set(26, sumSelectRange);
        set(27, sumSelectRangeCheck);
        set(28, sumSelectScan);
        set(29, sumSortMergePasses);
        set(30, sumSortRange);
        set(31, sumSortRows);
        set(32, sumSortScan);
        set(33, sumNoIndexUsed);
        set(34, sumNoGoodIndexUsed);
        set(35, sumCpuTime);
    }
}
