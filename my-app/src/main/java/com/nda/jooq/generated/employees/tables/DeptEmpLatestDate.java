/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.employees.tables;


import com.nda.jooq.generated.employees.Employees;
import com.nda.jooq.generated.employees.tables.records.DeptEmpLatestDateRecord;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class DeptEmpLatestDate extends TableImpl<DeptEmpLatestDateRecord> {

    private static final long serialVersionUID = 1240955889;

    /**
     * The reference instance of <code>employees.dept_emp_latest_date</code>
     */
    public static final DeptEmpLatestDate DEPT_EMP_LATEST_DATE = new DeptEmpLatestDate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeptEmpLatestDateRecord> getRecordType() {
        return DeptEmpLatestDateRecord.class;
    }

    /**
     * The column <code>employees.dept_emp_latest_date.emp_no</code>.
     */
    public final TableField<DeptEmpLatestDateRecord, Integer> EMP_NO = createField("emp_no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>employees.dept_emp_latest_date.from_date</code>.
     */
    public final TableField<DeptEmpLatestDateRecord, Date> FROM_DATE = createField("from_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>employees.dept_emp_latest_date.to_date</code>.
     */
    public final TableField<DeptEmpLatestDateRecord, Date> TO_DATE = createField("to_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>employees.dept_emp_latest_date</code> table reference
     */
    public DeptEmpLatestDate() {
        this(DSL.name("dept_emp_latest_date"), null);
    }

    /**
     * Create an aliased <code>employees.dept_emp_latest_date</code> table reference
     */
    public DeptEmpLatestDate(String alias) {
        this(DSL.name(alias), DEPT_EMP_LATEST_DATE);
    }

    /**
     * Create an aliased <code>employees.dept_emp_latest_date</code> table reference
     */
    public DeptEmpLatestDate(Name alias) {
        this(alias, DEPT_EMP_LATEST_DATE);
    }

    private DeptEmpLatestDate(Name alias, Table<DeptEmpLatestDateRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeptEmpLatestDate(Name alias, Table<DeptEmpLatestDateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Employees.EMPLOYEES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptEmpLatestDate as(String alias) {
        return new DeptEmpLatestDate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptEmpLatestDate as(Name alias) {
        return new DeptEmpLatestDate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeptEmpLatestDate rename(String name) {
        return new DeptEmpLatestDate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeptEmpLatestDate rename(Name name) {
        return new DeptEmpLatestDate(name, null);
    }
}
