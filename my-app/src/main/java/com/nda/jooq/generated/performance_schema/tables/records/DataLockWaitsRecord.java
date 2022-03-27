/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.DataLockWaits;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class DataLockWaitsRecord extends TableRecordImpl<DataLockWaitsRecord> implements Record11<String, String, ULong, ULong, ULong, ULong, String, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1399914262;

    /**
     * Setter for <code>performance_schema.data_lock_waits.ENGINE</code>.
     */
    public void setEngine(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.ENGINE</code>.
     */
    public String getEngine() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.REQUESTING_ENGINE_LOCK_ID</code>.
     */
    public void setRequestingEngineLockId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.REQUESTING_ENGINE_LOCK_ID</code>.
     */
    public String getRequestingEngineLockId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID</code>.
     */
    public void setRequestingEngineTransactionId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID</code>.
     */
    public ULong getRequestingEngineTransactionId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.REQUESTING_THREAD_ID</code>.
     */
    public void setRequestingThreadId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.REQUESTING_THREAD_ID</code>.
     */
    public ULong getRequestingThreadId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.REQUESTING_EVENT_ID</code>.
     */
    public void setRequestingEventId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.REQUESTING_EVENT_ID</code>.
     */
    public ULong getRequestingEventId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setRequestingObjectInstanceBegin(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getRequestingObjectInstanceBegin() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.BLOCKING_ENGINE_LOCK_ID</code>.
     */
    public void setBlockingEngineLockId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.BLOCKING_ENGINE_LOCK_ID</code>.
     */
    public String getBlockingEngineLockId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID</code>.
     */
    public void setBlockingEngineTransactionId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID</code>.
     */
    public ULong getBlockingEngineTransactionId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.BLOCKING_THREAD_ID</code>.
     */
    public void setBlockingThreadId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.BLOCKING_THREAD_ID</code>.
     */
    public ULong getBlockingThreadId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.BLOCKING_EVENT_ID</code>.
     */
    public void setBlockingEventId(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.BLOCKING_EVENT_ID</code>.
     */
    public ULong getBlockingEventId() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setBlockingObjectInstanceBegin(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getBlockingObjectInstanceBegin() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, ULong, ULong, ULong, String, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, ULong, ULong, ULong, ULong, String, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DataLockWaits.DATA_LOCK_WAITS.ENGINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DataLockWaits.DATA_LOCK_WAITS.REQUESTING_ENGINE_LOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return DataLockWaits.DATA_LOCK_WAITS.REQUESTING_ENGINE_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return DataLockWaits.DATA_LOCK_WAITS.REQUESTING_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return DataLockWaits.DATA_LOCK_WAITS.REQUESTING_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return DataLockWaits.DATA_LOCK_WAITS.REQUESTING_OBJECT_INSTANCE_BEGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DataLockWaits.DATA_LOCK_WAITS.BLOCKING_ENGINE_LOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return DataLockWaits.DATA_LOCK_WAITS.BLOCKING_ENGINE_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return DataLockWaits.DATA_LOCK_WAITS.BLOCKING_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return DataLockWaits.DATA_LOCK_WAITS.BLOCKING_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return DataLockWaits.DATA_LOCK_WAITS.BLOCKING_OBJECT_INSTANCE_BEGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEngine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRequestingEngineLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getRequestingEngineTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getRequestingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getRequestingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getRequestingObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBlockingEngineLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getBlockingEngineTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getBlockingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getBlockingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getBlockingObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEngine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRequestingEngineLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getRequestingEngineTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getRequestingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getRequestingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getRequestingObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBlockingEngineLockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getBlockingEngineTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getBlockingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getBlockingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getBlockingObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value1(String value) {
        setEngine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value2(String value) {
        setRequestingEngineLockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value3(ULong value) {
        setRequestingEngineTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value4(ULong value) {
        setRequestingThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value5(ULong value) {
        setRequestingEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value6(ULong value) {
        setRequestingObjectInstanceBegin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value7(String value) {
        setBlockingEngineLockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value8(ULong value) {
        setBlockingEngineTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value9(ULong value) {
        setBlockingThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value10(ULong value) {
        setBlockingEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord value11(ULong value) {
        setBlockingObjectInstanceBegin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataLockWaitsRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, String value7, ULong value8, ULong value9, ULong value10, ULong value11) {
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
     * Create a detached DataLockWaitsRecord
     */
    public DataLockWaitsRecord() {
        super(DataLockWaits.DATA_LOCK_WAITS);
    }

    /**
     * Create a detached, initialised DataLockWaitsRecord
     */
    public DataLockWaitsRecord(String engine, String requestingEngineLockId, ULong requestingEngineTransactionId, ULong requestingThreadId, ULong requestingEventId, ULong requestingObjectInstanceBegin, String blockingEngineLockId, ULong blockingEngineTransactionId, ULong blockingThreadId, ULong blockingEventId, ULong blockingObjectInstanceBegin) {
        super(DataLockWaits.DATA_LOCK_WAITS);

        set(0, engine);
        set(1, requestingEngineLockId);
        set(2, requestingEngineTransactionId);
        set(3, requestingThreadId);
        set(4, requestingEventId);
        set(5, requestingObjectInstanceBegin);
        set(6, blockingEngineLockId);
        set(7, blockingEngineTransactionId);
        set(8, blockingThreadId);
        set(9, blockingEventId);
        set(10, blockingObjectInstanceBegin);
    }
}
