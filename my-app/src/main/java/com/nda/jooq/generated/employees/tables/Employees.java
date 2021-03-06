/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.employees.tables;


import com.nda.jooq.generated.employees.Indexes;
import com.nda.jooq.generated.employees.Keys;
import com.nda.jooq.generated.employees.enums.EmployeesGender;
import com.nda.jooq.generated.employees.tables.records.EmployeesRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Employees extends TableImpl<EmployeesRecord> {

    private static final long serialVersionUID = -858986686;

    /**
     * The reference instance of <code>employees.employees</code>
     */
    public static final Employees EMPLOYEES_ = new Employees();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeesRecord> getRecordType() {
        return EmployeesRecord.class;
    }

    /**
     * The column <code>employees.employees.emp_no</code>.
     */
    public final TableField<EmployeesRecord, Integer> EMP_NO = createField("emp_no", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>employees.employees.birth_date</code>.
     */
    public final TableField<EmployeesRecord, Date> BIRTH_DATE = createField("birth_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>employees.employees.first_name</code>.
     */
    public final TableField<EmployeesRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(14).nullable(false), this, "");

    /**
     * The column <code>employees.employees.last_name</code>.
     */
    public final TableField<EmployeesRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>employees.employees.gender</code>.
     */
    public final TableField<EmployeesRecord, EmployeesGender> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).asEnumDataType(com.nda.jooq.generated.employees.enums.EmployeesGender.class), this, "");

    /**
     * The column <code>employees.employees.hire_date</code>.
     */
    public final TableField<EmployeesRecord, Date> HIRE_DATE = createField("hire_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>employees.employees</code> table reference
     */
    public Employees() {
        this(DSL.name("employees"), null);
    }

    /**
     * Create an aliased <code>employees.employees</code> table reference
     */
    public Employees(String alias) {
        this(DSL.name(alias), EMPLOYEES_);
    }

    /**
     * Create an aliased <code>employees.employees</code> table reference
     */
    public Employees(Name alias) {
        this(alias, EMPLOYEES_);
    }

    private Employees(Name alias, Table<EmployeesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employees(Name alias, Table<EmployeesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return com.nda.jooq.generated.employees.Employees.EMPLOYEES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EMPLOYEES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployeesRecord> getPrimaryKey() {
        return Keys.KEY_EMPLOYEES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployeesRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeesRecord>>asList(Keys.KEY_EMPLOYEES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employees as(String alias) {
        return new Employees(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employees as(Name alias) {
        return new Employees(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employees rename(String name) {
        return new Employees(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employees rename(Name name) {
        return new Employees(name, null);
    }
}
