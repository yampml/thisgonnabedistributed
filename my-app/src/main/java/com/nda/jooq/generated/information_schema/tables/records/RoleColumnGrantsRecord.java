/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.information_schema.tables.records;


import com.nda.jooq.generated.information_schema.tables.RoleColumnGrants;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


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
public class RoleColumnGrantsRecord extends TableRecordImpl<RoleColumnGrantsRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1619696345;

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR_HOST</code>.
     */
    public void setGrantorHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR_HOST</code>.
     */
    public String getGrantorHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE_HOST</code>.
     */
    public void setGranteeHost(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE_HOST</code>.
     */
    public String getGranteeHost() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.ROLE_COLUMN_GRANTS.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.ROLE_COLUMN_GRANTS.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTOR_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.GRANTEE_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return RoleColumnGrants.ROLE_COLUMN_GRANTS.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrantorHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGranteeHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrantorHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGranteeHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value2(String value) {
        setGrantorHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value3(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value4(String value) {
        setGranteeHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value5(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value6(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value7(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value8(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value9(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord value10(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleColumnGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleColumnGrantsRecord
     */
    public RoleColumnGrantsRecord() {
        super(RoleColumnGrants.ROLE_COLUMN_GRANTS);
    }

    /**
     * Create a detached, initialised RoleColumnGrantsRecord
     */
    public RoleColumnGrantsRecord(String grantor, String grantorHost, String grantee, String granteeHost, String tableCatalog, String tableSchema, String tableName, String columnName, String privilegeType, String isGrantable) {
        super(RoleColumnGrants.ROLE_COLUMN_GRANTS);

        set(0, grantor);
        set(1, grantorHost);
        set(2, grantee);
        set(3, granteeHost);
        set(4, tableCatalog);
        set(5, tableSchema);
        set(6, tableName);
        set(7, columnName);
        set(8, privilegeType);
        set(9, isGrantable);
    }
}
