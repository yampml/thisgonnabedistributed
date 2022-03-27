/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.tables.records;


import com.nda.jooq.generated.mysql.tables.TimeZoneTransition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Time zone transitions
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionRecord extends UpdatableRecordImpl<TimeZoneTransitionRecord> implements Record3<UInteger, Long, UInteger> {

    private static final long serialVersionUID = 139977650;

    /**
     * Setter for <code>mysql.time_zone_transition.Time_zone_id</code>.
     */
    public void setTimeZoneId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition.Time_zone_id</code>.
     */
    public UInteger getTimeZoneId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.time_zone_transition.Transition_time</code>.
     */
    public void setTransitionTime(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition.Transition_time</code>.
     */
    public Long getTransitionTime() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>mysql.time_zone_transition.Transition_type_id</code>.
     */
    public void setTransitionTypeId(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.time_zone_transition.Transition_type_id</code>.
     */
    public UInteger getTransitionTypeId() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UInteger, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, Long, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<UInteger, Long, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getTimeZoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTransitionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getTransitionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getTimeZoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTransitionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getTransitionTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneTransitionRecord value1(UInteger value) {
        setTimeZoneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneTransitionRecord value2(Long value) {
        setTransitionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneTransitionRecord value3(UInteger value) {
        setTransitionTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneTransitionRecord values(UInteger value1, Long value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TimeZoneTransitionRecord
     */
    public TimeZoneTransitionRecord() {
        super(TimeZoneTransition.TIME_ZONE_TRANSITION);
    }

    /**
     * Create a detached, initialised TimeZoneTransitionRecord
     */
    public TimeZoneTransitionRecord(UInteger timeZoneId, Long transitionTime, UInteger transitionTypeId) {
        super(TimeZoneTransition.TIME_ZONE_TRANSITION);

        set(0, timeZoneId);
        set(1, transitionTime);
        set(2, transitionTypeId);
    }
}
