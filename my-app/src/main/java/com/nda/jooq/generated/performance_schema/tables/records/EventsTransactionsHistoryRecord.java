/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.EventsTransactionsHistoryAccessMode;
import com.nda.jooq.generated.performance_schema.enums.EventsTransactionsHistoryAutocommit;
import com.nda.jooq.generated.performance_schema.enums.EventsTransactionsHistoryNestingEventType;
import com.nda.jooq.generated.performance_schema.enums.EventsTransactionsHistoryState;
import com.nda.jooq.generated.performance_schema.tables.EventsTransactionsHistory;

import javax.annotation.Generated;

import org.jooq.Record2;
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
public class EventsTransactionsHistoryRecord extends UpdatableRecordImpl<EventsTransactionsHistoryRecord> {

    private static final long serialVersionUID = 1836417762;

    /**
     * Setter for <code>performance_schema.events_transactions_history.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.EVENT_ID</code>.
     */
    public void setEventId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.END_EVENT_ID</code>.
     */
    public void setEndEventId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.STATE</code>.
     */
    public void setState(EventsTransactionsHistoryState value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.STATE</code>.
     */
    public EventsTransactionsHistoryState getState() {
        return (EventsTransactionsHistoryState) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.TRX_ID</code>.
     */
    public void setTrxId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.TRX_ID</code>.
     */
    public ULong getTrxId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.GTID</code>.
     */
    public void setGtid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.GTID</code>.
     */
    public String getGtid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.XID_FORMAT_ID</code>.
     */
    public void setXidFormatId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.XID_FORMAT_ID</code>.
     */
    public Integer getXidFormatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.XID_GTRID</code>.
     */
    public void setXidGtrid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.XID_GTRID</code>.
     */
    public String getXidGtrid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.XID_BQUAL</code>.
     */
    public void setXidBqual(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.XID_BQUAL</code>.
     */
    public String getXidBqual() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.XA_STATE</code>.
     */
    public void setXaState(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.XA_STATE</code>.
     */
    public String getXaState() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.SOURCE</code>.
     */
    public void setSource(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.TIMER_START</code>.
     */
    public void setTimerStart(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.TIMER_END</code>.
     */
    public void setTimerEnd(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.TIMER_WAIT</code>.
     */
    public void setTimerWait(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.ACCESS_MODE</code>.
     */
    public void setAccessMode(EventsTransactionsHistoryAccessMode value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.ACCESS_MODE</code>.
     */
    public EventsTransactionsHistoryAccessMode getAccessMode() {
        return (EventsTransactionsHistoryAccessMode) get(15);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.ISOLATION_LEVEL</code>.
     */
    public void setIsolationLevel(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.ISOLATION_LEVEL</code>.
     */
    public String getIsolationLevel() {
        return (String) get(16);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.AUTOCOMMIT</code>.
     */
    public void setAutocommit(EventsTransactionsHistoryAutocommit value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.AUTOCOMMIT</code>.
     */
    public EventsTransactionsHistoryAutocommit getAutocommit() {
        return (EventsTransactionsHistoryAutocommit) get(17);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.NUMBER_OF_SAVEPOINTS</code>.
     */
    public void setNumberOfSavepoints(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.NUMBER_OF_SAVEPOINTS</code>.
     */
    public ULong getNumberOfSavepoints() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public void setNumberOfRollbackToSavepoint(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public ULong getNumberOfRollbackToSavepoint() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public void setNumberOfReleaseSavepoint(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public ULong getNumberOfReleaseSavepoint() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.NESTING_EVENT_ID</code>.
     */
    public void setNestingEventId(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_history.NESTING_EVENT_TYPE</code>.
     */
    public void setNestingEventType(EventsTransactionsHistoryNestingEventType value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_history.NESTING_EVENT_TYPE</code>.
     */
    public EventsTransactionsHistoryNestingEventType getNestingEventType() {
        return (EventsTransactionsHistoryNestingEventType) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<ULong, ULong> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsHistoryRecord
     */
    public EventsTransactionsHistoryRecord() {
        super(EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY);
    }

    /**
     * Create a detached, initialised EventsTransactionsHistoryRecord
     */
    public EventsTransactionsHistoryRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, EventsTransactionsHistoryState state, ULong trxId, String gtid, Integer xidFormatId, String xidGtrid, String xidBqual, String xaState, String source, ULong timerStart, ULong timerEnd, ULong timerWait, EventsTransactionsHistoryAccessMode accessMode, String isolationLevel, EventsTransactionsHistoryAutocommit autocommit, ULong numberOfSavepoints, ULong numberOfRollbackToSavepoint, ULong numberOfReleaseSavepoint, ULong objectInstanceBegin, ULong nestingEventId, EventsTransactionsHistoryNestingEventType nestingEventType) {
        super(EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY);

        set(0, threadId);
        set(1, eventId);
        set(2, endEventId);
        set(3, eventName);
        set(4, state);
        set(5, trxId);
        set(6, gtid);
        set(7, xidFormatId);
        set(8, xidGtrid);
        set(9, xidBqual);
        set(10, xaState);
        set(11, source);
        set(12, timerStart);
        set(13, timerEnd);
        set(14, timerWait);
        set(15, accessMode);
        set(16, isolationLevel);
        set(17, autocommit);
        set(18, numberOfSavepoints);
        set(19, numberOfRollbackToSavepoint);
        set(20, numberOfReleaseSavepoint);
        set(21, objectInstanceBegin);
        set(22, nestingEventId);
        set(23, nestingEventType);
    }
}
