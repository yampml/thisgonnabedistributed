/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.EventsStagesCurrentNestingEventType;
import com.nda.jooq.generated.performance_schema.tables.EventsStagesCurrent;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record2;
import org.jooq.Row12;
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
public class EventsStagesCurrentRecord extends UpdatableRecordImpl<EventsStagesCurrentRecord> implements Record12<ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, EventsStagesCurrentNestingEventType> {

    private static final long serialVersionUID = 1682089981;

    /**
     * Setter for <code>performance_schema.events_stages_current.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.EVENT_ID</code>.
     */
    public void setEventId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.END_EVENT_ID</code>.
     */
    public void setEndEventId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.SOURCE</code>.
     */
    public void setSource(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.TIMER_START</code>.
     */
    public void setTimerStart(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.TIMER_END</code>.
     */
    public void setTimerEnd(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.TIMER_WAIT</code>.
     */
    public void setTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.WORK_COMPLETED</code>.
     */
    public void setWorkCompleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.WORK_COMPLETED</code>.
     */
    public ULong getWorkCompleted() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.WORK_ESTIMATED</code>.
     */
    public void setWorkEstimated(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.WORK_ESTIMATED</code>.
     */
    public ULong getWorkEstimated() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.NESTING_EVENT_ID</code>.
     */
    public void setNestingEventId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_stages_current.NESTING_EVENT_TYPE</code>.
     */
    public void setNestingEventType(EventsStagesCurrentNestingEventType value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_stages_current.NESTING_EVENT_TYPE</code>.
     */
    public EventsStagesCurrentNestingEventType getNestingEventType() {
        return (EventsStagesCurrentNestingEventType) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, EventsStagesCurrentNestingEventType> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, EventsStagesCurrentNestingEventType> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.END_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.TIMER_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.TIMER_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.WORK_COMPLETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.WORK_ESTIMATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.NESTING_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EventsStagesCurrentNestingEventType> field12() {
        return EventsStagesCurrent.EVENTS_STAGES_CURRENT.NESTING_EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getEndEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getTimerStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getTimerEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getWorkCompleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getWorkEstimated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getNestingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentNestingEventType component12() {
        return getNestingEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getEndEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getTimerStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getTimerEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getWorkCompleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getWorkEstimated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getNestingEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentNestingEventType value12() {
        return getNestingEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value2(ULong value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value3(ULong value) {
        setEndEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value4(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value5(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value6(ULong value) {
        setTimerStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value7(ULong value) {
        setTimerEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value8(ULong value) {
        setTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value9(ULong value) {
        setWorkCompleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value10(ULong value) {
        setWorkEstimated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value11(ULong value) {
        setNestingEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord value12(EventsStagesCurrentNestingEventType value) {
        setNestingEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStagesCurrentRecord values(ULong value1, ULong value2, ULong value3, String value4, String value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, EventsStagesCurrentNestingEventType value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsStagesCurrentRecord
     */
    public EventsStagesCurrentRecord() {
        super(EventsStagesCurrent.EVENTS_STAGES_CURRENT);
    }

    /**
     * Create a detached, initialised EventsStagesCurrentRecord
     */
    public EventsStagesCurrentRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, String source, ULong timerStart, ULong timerEnd, ULong timerWait, ULong workCompleted, ULong workEstimated, ULong nestingEventId, EventsStagesCurrentNestingEventType nestingEventType) {
        super(EventsStagesCurrent.EVENTS_STAGES_CURRENT);

        set(0, threadId);
        set(1, eventId);
        set(2, endEventId);
        set(3, eventName);
        set(4, source);
        set(5, timerStart);
        set(6, timerEnd);
        set(7, timerWait);
        set(8, workCompleted);
        set(9, workEstimated);
        set(10, nestingEventId);
        set(11, nestingEventType);
    }
}
