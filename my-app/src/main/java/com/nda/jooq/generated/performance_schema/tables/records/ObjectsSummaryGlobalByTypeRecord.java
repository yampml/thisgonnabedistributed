/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.ObjectsSummaryGlobalByType;

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
public class ObjectsSummaryGlobalByTypeRecord extends TableRecordImpl<ObjectsSummaryGlobalByTypeRecord> implements Record8<String, String, String, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -1150943105;

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.objects_summary_global_by_type.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.objects_summary_global_by_type.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.OBJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.COUNT_STAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.SUM_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.MIN_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.AVG_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE.MAX_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value1(String value) {
        setObjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value2(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value4(ULong value) {
        setCountStar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value5(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value6(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value7(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord value8(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ObjectsSummaryGlobalByTypeRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8) {
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
     * Create a detached ObjectsSummaryGlobalByTypeRecord
     */
    public ObjectsSummaryGlobalByTypeRecord() {
        super(ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE);
    }

    /**
     * Create a detached, initialised ObjectsSummaryGlobalByTypeRecord
     */
    public ObjectsSummaryGlobalByTypeRecord(String objectType, String objectSchema, String objectName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait) {
        super(ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE);

        set(0, objectType);
        set(1, objectSchema);
        set(2, objectName);
        set(3, countStar);
        set(4, sumTimerWait);
        set(5, minTimerWait);
        set(6, avgTimerWait);
        set(7, maxTimerWait);
    }
}
