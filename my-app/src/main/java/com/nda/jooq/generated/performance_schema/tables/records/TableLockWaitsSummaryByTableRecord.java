/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.TableLockWaitsSummaryByTable;

import javax.annotation.Generated;

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
public class TableLockWaitsSummaryByTableRecord extends TableRecordImpl<TableLockWaitsSummaryByTableRecord> {

    private static final long serialVersionUID = 107147448;

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
     */
    public void setCountRead(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
     */
    public void setSumTimerRead(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ</code>.
     */
    public ULong getSumTimerRead() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
     */
    public void setMinTimerRead(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ</code>.
     */
    public ULong getMinTimerRead() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
     */
    public void setAvgTimerRead(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ</code>.
     */
    public ULong getAvgTimerRead() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
     */
    public void setMaxTimerRead(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ</code>.
     */
    public ULong getMaxTimerRead() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
     */
    public void setCountWrite(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
     */
    public void setSumTimerWrite(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE</code>.
     */
    public ULong getSumTimerWrite() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
     */
    public void setMinTimerWrite(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE</code>.
     */
    public ULong getMinTimerWrite() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
     */
    public void setAvgTimerWrite(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE</code>.
     */
    public ULong getAvgTimerWrite() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
     */
    public void setMaxTimerWrite(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE</code>.
     */
    public ULong getMaxTimerWrite() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
     */
    public void setCountReadNormal(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NORMAL</code>.
     */
    public ULong getCountReadNormal() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
     */
    public void setSumTimerReadNormal(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NORMAL</code>.
     */
    public ULong getSumTimerReadNormal() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
     */
    public void setMinTimerReadNormal(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NORMAL</code>.
     */
    public ULong getMinTimerReadNormal() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
     */
    public void setAvgTimerReadNormal(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NORMAL</code>.
     */
    public ULong getAvgTimerReadNormal() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
     */
    public void setMaxTimerReadNormal(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NORMAL</code>.
     */
    public ULong getMaxTimerReadNormal() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
     */
    public void setCountReadWithSharedLocks(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_WITH_SHARED_LOCKS</code>.
     */
    public ULong getCountReadWithSharedLocks() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public void setSumTimerReadWithSharedLocks(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public ULong getSumTimerReadWithSharedLocks() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public void setMinTimerReadWithSharedLocks(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public ULong getMinTimerReadWithSharedLocks() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public void setAvgTimerReadWithSharedLocks(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public ULong getAvgTimerReadWithSharedLocks() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public void setMaxTimerReadWithSharedLocks(ULong value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_WITH_SHARED_LOCKS</code>.
     */
    public ULong getMaxTimerReadWithSharedLocks() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
     */
    public void setCountReadHighPriority(ULong value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_HIGH_PRIORITY</code>.
     */
    public ULong getCountReadHighPriority() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public void setSumTimerReadHighPriority(ULong value) {
        set(29, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public ULong getSumTimerReadHighPriority() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public void setMinTimerReadHighPriority(ULong value) {
        set(30, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public ULong getMinTimerReadHighPriority() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public void setAvgTimerReadHighPriority(ULong value) {
        set(31, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public ULong getAvgTimerReadHighPriority() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public void setMaxTimerReadHighPriority(ULong value) {
        set(32, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_HIGH_PRIORITY</code>.
     */
    public ULong getMaxTimerReadHighPriority() {
        return (ULong) get(32);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
     */
    public void setCountReadNoInsert(ULong value) {
        set(33, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_NO_INSERT</code>.
     */
    public ULong getCountReadNoInsert() {
        return (ULong) get(33);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
     */
    public void setSumTimerReadNoInsert(ULong value) {
        set(34, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_NO_INSERT</code>.
     */
    public ULong getSumTimerReadNoInsert() {
        return (ULong) get(34);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
     */
    public void setMinTimerReadNoInsert(ULong value) {
        set(35, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_NO_INSERT</code>.
     */
    public ULong getMinTimerReadNoInsert() {
        return (ULong) get(35);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
     */
    public void setAvgTimerReadNoInsert(ULong value) {
        set(36, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_NO_INSERT</code>.
     */
    public ULong getAvgTimerReadNoInsert() {
        return (ULong) get(36);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
     */
    public void setMaxTimerReadNoInsert(ULong value) {
        set(37, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_NO_INSERT</code>.
     */
    public ULong getMaxTimerReadNoInsert() {
        return (ULong) get(37);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
     */
    public void setCountReadExternal(ULong value) {
        set(38, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_READ_EXTERNAL</code>.
     */
    public ULong getCountReadExternal() {
        return (ULong) get(38);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
     */
    public void setSumTimerReadExternal(ULong value) {
        set(39, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_READ_EXTERNAL</code>.
     */
    public ULong getSumTimerReadExternal() {
        return (ULong) get(39);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
     */
    public void setMinTimerReadExternal(ULong value) {
        set(40, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_READ_EXTERNAL</code>.
     */
    public ULong getMinTimerReadExternal() {
        return (ULong) get(40);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
     */
    public void setAvgTimerReadExternal(ULong value) {
        set(41, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_READ_EXTERNAL</code>.
     */
    public ULong getAvgTimerReadExternal() {
        return (ULong) get(41);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
     */
    public void setMaxTimerReadExternal(ULong value) {
        set(42, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_READ_EXTERNAL</code>.
     */
    public ULong getMaxTimerReadExternal() {
        return (ULong) get(42);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
     */
    public void setCountWriteAllowWrite(ULong value) {
        set(43, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_ALLOW_WRITE</code>.
     */
    public ULong getCountWriteAllowWrite() {
        return (ULong) get(43);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public void setSumTimerWriteAllowWrite(ULong value) {
        set(44, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public ULong getSumTimerWriteAllowWrite() {
        return (ULong) get(44);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public void setMinTimerWriteAllowWrite(ULong value) {
        set(45, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public ULong getMinTimerWriteAllowWrite() {
        return (ULong) get(45);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public void setAvgTimerWriteAllowWrite(ULong value) {
        set(46, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public ULong getAvgTimerWriteAllowWrite() {
        return (ULong) get(46);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public void setMaxTimerWriteAllowWrite(ULong value) {
        set(47, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_ALLOW_WRITE</code>.
     */
    public ULong getMaxTimerWriteAllowWrite() {
        return (ULong) get(47);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
     */
    public void setCountWriteConcurrentInsert(ULong value) {
        set(48, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_CONCURRENT_INSERT</code>.
     */
    public ULong getCountWriteConcurrentInsert() {
        return (ULong) get(48);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public void setSumTimerWriteConcurrentInsert(ULong value) {
        set(49, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public ULong getSumTimerWriteConcurrentInsert() {
        return (ULong) get(49);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public void setMinTimerWriteConcurrentInsert(ULong value) {
        set(50, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public ULong getMinTimerWriteConcurrentInsert() {
        return (ULong) get(50);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public void setAvgTimerWriteConcurrentInsert(ULong value) {
        set(51, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public ULong getAvgTimerWriteConcurrentInsert() {
        return (ULong) get(51);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public void setMaxTimerWriteConcurrentInsert(ULong value) {
        set(52, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_CONCURRENT_INSERT</code>.
     */
    public ULong getMaxTimerWriteConcurrentInsert() {
        return (ULong) get(52);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
     */
    public void setCountWriteLowPriority(ULong value) {
        set(53, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_LOW_PRIORITY</code>.
     */
    public ULong getCountWriteLowPriority() {
        return (ULong) get(53);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public void setSumTimerWriteLowPriority(ULong value) {
        set(54, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public ULong getSumTimerWriteLowPriority() {
        return (ULong) get(54);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public void setMinTimerWriteLowPriority(ULong value) {
        set(55, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public ULong getMinTimerWriteLowPriority() {
        return (ULong) get(55);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public void setAvgTimerWriteLowPriority(ULong value) {
        set(56, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public ULong getAvgTimerWriteLowPriority() {
        return (ULong) get(56);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public void setMaxTimerWriteLowPriority(ULong value) {
        set(57, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_LOW_PRIORITY</code>.
     */
    public ULong getMaxTimerWriteLowPriority() {
        return (ULong) get(57);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
     */
    public void setCountWriteNormal(ULong value) {
        set(58, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_NORMAL</code>.
     */
    public ULong getCountWriteNormal() {
        return (ULong) get(58);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
     */
    public void setSumTimerWriteNormal(ULong value) {
        set(59, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_NORMAL</code>.
     */
    public ULong getSumTimerWriteNormal() {
        return (ULong) get(59);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
     */
    public void setMinTimerWriteNormal(ULong value) {
        set(60, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_NORMAL</code>.
     */
    public ULong getMinTimerWriteNormal() {
        return (ULong) get(60);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
     */
    public void setAvgTimerWriteNormal(ULong value) {
        set(61, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_NORMAL</code>.
     */
    public ULong getAvgTimerWriteNormal() {
        return (ULong) get(61);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
     */
    public void setMaxTimerWriteNormal(ULong value) {
        set(62, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_NORMAL</code>.
     */
    public ULong getMaxTimerWriteNormal() {
        return (ULong) get(62);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
     */
    public void setCountWriteExternal(ULong value) {
        set(63, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.COUNT_WRITE_EXTERNAL</code>.
     */
    public ULong getCountWriteExternal() {
        return (ULong) get(63);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
     */
    public void setSumTimerWriteExternal(ULong value) {
        set(64, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.SUM_TIMER_WRITE_EXTERNAL</code>.
     */
    public ULong getSumTimerWriteExternal() {
        return (ULong) get(64);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
     */
    public void setMinTimerWriteExternal(ULong value) {
        set(65, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MIN_TIMER_WRITE_EXTERNAL</code>.
     */
    public ULong getMinTimerWriteExternal() {
        return (ULong) get(65);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
     */
    public void setAvgTimerWriteExternal(ULong value) {
        set(66, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.AVG_TIMER_WRITE_EXTERNAL</code>.
     */
    public ULong getAvgTimerWriteExternal() {
        return (ULong) get(66);
    }

    /**
     * Setter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
     */
    public void setMaxTimerWriteExternal(ULong value) {
        set(67, value);
    }

    /**
     * Getter for <code>performance_schema.table_lock_waits_summary_by_table.MAX_TIMER_WRITE_EXTERNAL</code>.
     */
    public ULong getMaxTimerWriteExternal() {
        return (ULong) get(67);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableLockWaitsSummaryByTableRecord
     */
    public TableLockWaitsSummaryByTableRecord() {
        super(TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE);
    }

    /**
     * Create a detached, initialised TableLockWaitsSummaryByTableRecord
     */
    public TableLockWaitsSummaryByTableRecord(String objectType, String objectSchema, String objectName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong countReadNormal, ULong sumTimerReadNormal, ULong minTimerReadNormal, ULong avgTimerReadNormal, ULong maxTimerReadNormal, ULong countReadWithSharedLocks, ULong sumTimerReadWithSharedLocks, ULong minTimerReadWithSharedLocks, ULong avgTimerReadWithSharedLocks, ULong maxTimerReadWithSharedLocks, ULong countReadHighPriority, ULong sumTimerReadHighPriority, ULong minTimerReadHighPriority, ULong avgTimerReadHighPriority, ULong maxTimerReadHighPriority, ULong countReadNoInsert, ULong sumTimerReadNoInsert, ULong minTimerReadNoInsert, ULong avgTimerReadNoInsert, ULong maxTimerReadNoInsert, ULong countReadExternal, ULong sumTimerReadExternal, ULong minTimerReadExternal, ULong avgTimerReadExternal, ULong maxTimerReadExternal, ULong countWriteAllowWrite, ULong sumTimerWriteAllowWrite, ULong minTimerWriteAllowWrite, ULong avgTimerWriteAllowWrite, ULong maxTimerWriteAllowWrite, ULong countWriteConcurrentInsert, ULong sumTimerWriteConcurrentInsert, ULong minTimerWriteConcurrentInsert, ULong avgTimerWriteConcurrentInsert, ULong maxTimerWriteConcurrentInsert, ULong countWriteLowPriority, ULong sumTimerWriteLowPriority, ULong minTimerWriteLowPriority, ULong avgTimerWriteLowPriority, ULong maxTimerWriteLowPriority, ULong countWriteNormal, ULong sumTimerWriteNormal, ULong minTimerWriteNormal, ULong avgTimerWriteNormal, ULong maxTimerWriteNormal, ULong countWriteExternal, ULong sumTimerWriteExternal, ULong minTimerWriteExternal, ULong avgTimerWriteExternal, ULong maxTimerWriteExternal) {
        super(TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE);

        set(0, objectType);
        set(1, objectSchema);
        set(2, objectName);
        set(3, countStar);
        set(4, sumTimerWait);
        set(5, minTimerWait);
        set(6, avgTimerWait);
        set(7, maxTimerWait);
        set(8, countRead);
        set(9, sumTimerRead);
        set(10, minTimerRead);
        set(11, avgTimerRead);
        set(12, maxTimerRead);
        set(13, countWrite);
        set(14, sumTimerWrite);
        set(15, minTimerWrite);
        set(16, avgTimerWrite);
        set(17, maxTimerWrite);
        set(18, countReadNormal);
        set(19, sumTimerReadNormal);
        set(20, minTimerReadNormal);
        set(21, avgTimerReadNormal);
        set(22, maxTimerReadNormal);
        set(23, countReadWithSharedLocks);
        set(24, sumTimerReadWithSharedLocks);
        set(25, minTimerReadWithSharedLocks);
        set(26, avgTimerReadWithSharedLocks);
        set(27, maxTimerReadWithSharedLocks);
        set(28, countReadHighPriority);
        set(29, sumTimerReadHighPriority);
        set(30, minTimerReadHighPriority);
        set(31, avgTimerReadHighPriority);
        set(32, maxTimerReadHighPriority);
        set(33, countReadNoInsert);
        set(34, sumTimerReadNoInsert);
        set(35, minTimerReadNoInsert);
        set(36, avgTimerReadNoInsert);
        set(37, maxTimerReadNoInsert);
        set(38, countReadExternal);
        set(39, sumTimerReadExternal);
        set(40, minTimerReadExternal);
        set(41, avgTimerReadExternal);
        set(42, maxTimerReadExternal);
        set(43, countWriteAllowWrite);
        set(44, sumTimerWriteAllowWrite);
        set(45, minTimerWriteAllowWrite);
        set(46, avgTimerWriteAllowWrite);
        set(47, maxTimerWriteAllowWrite);
        set(48, countWriteConcurrentInsert);
        set(49, sumTimerWriteConcurrentInsert);
        set(50, minTimerWriteConcurrentInsert);
        set(51, avgTimerWriteConcurrentInsert);
        set(52, maxTimerWriteConcurrentInsert);
        set(53, countWriteLowPriority);
        set(54, sumTimerWriteLowPriority);
        set(55, minTimerWriteLowPriority);
        set(56, avgTimerWriteLowPriority);
        set(57, maxTimerWriteLowPriority);
        set(58, countWriteNormal);
        set(59, sumTimerWriteNormal);
        set(60, minTimerWriteNormal);
        set(61, avgTimerWriteNormal);
        set(62, maxTimerWriteNormal);
        set(63, countWriteExternal);
        set(64, sumTimerWriteExternal);
        set(65, minTimerWriteExternal);
        set(66, avgTimerWriteExternal);
        set(67, maxTimerWriteExternal);
    }
}
