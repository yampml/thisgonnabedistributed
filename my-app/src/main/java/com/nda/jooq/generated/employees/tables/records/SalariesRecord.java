/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.employees.tables.records;


import com.nda.jooq.generated.employees.tables.Salaries;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SalariesRecord extends UpdatableRecordImpl<SalariesRecord> implements Record4<Integer, Integer, Date, Date> {

    private static final long serialVersionUID = -1093334635;

    /**
     * Setter for <code>employees.salaries.emp_no</code>.
     */
    public void setEmpNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>employees.salaries.emp_no</code>.
     */
    public Integer getEmpNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>employees.salaries.salary</code>.
     */
    public void setSalary(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>employees.salaries.salary</code>.
     */
    public Integer getSalary() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>employees.salaries.from_date</code>.
     */
    public void setFromDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>employees.salaries.from_date</code>.
     */
    public Date getFromDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>employees.salaries.to_date</code>.
     */
    public void setToDate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>employees.salaries.to_date</code>.
     */
    public Date getToDate() {
        return (Date) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Date> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Date, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Date, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Salaries.SALARIES.EMP_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Salaries.SALARIES.SALARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Salaries.SALARIES.FROM_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Salaries.SALARIES.TO_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getEmpNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSalary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getFromDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getToDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEmpNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSalary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getFromDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getToDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalariesRecord value1(Integer value) {
        setEmpNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalariesRecord value2(Integer value) {
        setSalary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalariesRecord value3(Date value) {
        setFromDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalariesRecord value4(Date value) {
        setToDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalariesRecord values(Integer value1, Integer value2, Date value3, Date value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalariesRecord
     */
    public SalariesRecord() {
        super(Salaries.SALARIES);
    }

    /**
     * Create a detached, initialised SalariesRecord
     */
    public SalariesRecord(Integer empNo, Integer salary, Date fromDate, Date toDate) {
        super(Salaries.SALARIES);

        set(0, empNo);
        set(1, salary);
        set(2, fromDate);
        set(3, toDate);
    }
}
