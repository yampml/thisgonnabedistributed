/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.employees.tables.records;


import com.nda.jooq.generated.employees.enums.EmployeesGender;
import com.nda.jooq.generated.employees.tables.Employees;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class EmployeesRecord extends UpdatableRecordImpl<EmployeesRecord> implements Record6<Integer, Date, String, String, EmployeesGender, Date> {

    private static final long serialVersionUID = -633487107;

    /**
     * Setter for <code>employees.employees.emp_no</code>.
     */
    public void setEmpNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>employees.employees.emp_no</code>.
     */
    public Integer getEmpNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>employees.employees.birth_date</code>.
     */
    public void setBirthDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>employees.employees.birth_date</code>.
     */
    public Date getBirthDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>employees.employees.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>employees.employees.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>employees.employees.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>employees.employees.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>employees.employees.gender</code>.
     */
    public void setGender(EmployeesGender value) {
        set(4, value);
    }

    /**
     * Getter for <code>employees.employees.gender</code>.
     */
    public EmployeesGender getGender() {
        return (EmployeesGender) get(4);
    }

    /**
     * Setter for <code>employees.employees.hire_date</code>.
     */
    public void setHireDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>employees.employees.hire_date</code>.
     */
    public Date getHireDate() {
        return (Date) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Date, String, String, EmployeesGender, Date> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Date, String, String, EmployeesGender, Date> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Employees.EMPLOYEES_.EMP_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return Employees.EMPLOYEES_.BIRTH_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Employees.EMPLOYEES_.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Employees.EMPLOYEES_.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<EmployeesGender> field5() {
        return Employees.EMPLOYEES_.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return Employees.EMPLOYEES_.HIRE_DATE;
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
    public Date component2() {
        return getBirthDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesGender component5() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component6() {
        return getHireDate();
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
    public Date value2() {
        return getBirthDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesGender value5() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getHireDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value1(Integer value) {
        setEmpNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value2(Date value) {
        setBirthDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value5(EmployeesGender value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord value6(Date value) {
        setHireDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeesRecord values(Integer value1, Date value2, String value3, String value4, EmployeesGender value5, Date value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeesRecord
     */
    public EmployeesRecord() {
        super(Employees.EMPLOYEES_);
    }

    /**
     * Create a detached, initialised EmployeesRecord
     */
    public EmployeesRecord(Integer empNo, Date birthDate, String firstName, String lastName, EmployeesGender gender, Date hireDate) {
        super(Employees.EMPLOYEES_);

        set(0, empNo);
        set(1, birthDate);
        set(2, firstName);
        set(3, lastName);
        set(4, gender);
        set(5, hireDate);
    }
}
