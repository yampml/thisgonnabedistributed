/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.tables.records;


import com.nda.jooq.generated.mysql.enums.GlobalGrantsWithGrantOption;
import com.nda.jooq.generated.mysql.tables.GlobalGrants;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Extended global grants
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GlobalGrantsRecord extends UpdatableRecordImpl<GlobalGrantsRecord> implements Record4<String, String, String, GlobalGrantsWithGrantOption> {

    private static final long serialVersionUID = 1799222835;

    /**
     * Setter for <code>mysql.global_grants.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.global_grants.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.global_grants.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.global_grants.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.global_grants.PRIV</code>.
     */
    public void setPriv(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.global_grants.PRIV</code>.
     */
    public String getPriv() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.global_grants.WITH_GRANT_OPTION</code>.
     */
    public void setWithGrantOption(GlobalGrantsWithGrantOption value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.global_grants.WITH_GRANT_OPTION</code>.
     */
    public GlobalGrantsWithGrantOption getWithGrantOption() {
        return (GlobalGrantsWithGrantOption) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, GlobalGrantsWithGrantOption> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, GlobalGrantsWithGrantOption> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GlobalGrants.GLOBAL_GRANTS.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GlobalGrants.GLOBAL_GRANTS.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GlobalGrants.GLOBAL_GRANTS.PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<GlobalGrantsWithGrantOption> field4() {
        return GlobalGrants.GLOBAL_GRANTS.WITH_GRANT_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsWithGrantOption component4() {
        return getWithGrantOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsWithGrantOption value4() {
        return getWithGrantOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsRecord value2(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsRecord value3(String value) {
        setPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsRecord value4(GlobalGrantsWithGrantOption value) {
        setWithGrantOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalGrantsRecord values(String value1, String value2, String value3, GlobalGrantsWithGrantOption value4) {
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
     * Create a detached GlobalGrantsRecord
     */
    public GlobalGrantsRecord() {
        super(GlobalGrants.GLOBAL_GRANTS);
    }

    /**
     * Create a detached, initialised GlobalGrantsRecord
     */
    public GlobalGrantsRecord(String user, String host, String priv, GlobalGrantsWithGrantOption withGrantOption) {
        super(GlobalGrants.GLOBAL_GRANTS);

        set(0, user);
        set(1, host);
        set(2, priv);
        set(3, withGrantOption);
    }
}
