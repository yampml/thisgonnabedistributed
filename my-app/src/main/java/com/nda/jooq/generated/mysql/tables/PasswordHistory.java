/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.tables;


import com.nda.jooq.generated.mysql.Indexes;
import com.nda.jooq.generated.mysql.Keys;
import com.nda.jooq.generated.mysql.Mysql;
import com.nda.jooq.generated.mysql.tables.records.PasswordHistoryRecord;

import java.sql.Timestamp;
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
 * Password history for user accounts
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PasswordHistory extends TableImpl<PasswordHistoryRecord> {

    private static final long serialVersionUID = 1373137966;

    /**
     * The reference instance of <code>mysql.password_history</code>
     */
    public static final PasswordHistory PASSWORD_HISTORY = new PasswordHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PasswordHistoryRecord> getRecordType() {
        return PasswordHistoryRecord.class;
    }

    /**
     * The column <code>mysql.password_history.Host</code>.
     */
    public final TableField<PasswordHistoryRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.password_history.User</code>.
     */
    public final TableField<PasswordHistoryRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.password_history.Password_timestamp</code>.
     */
    public final TableField<PasswordHistoryRecord, Timestamp> PASSWORD_TIMESTAMP = createField("Password_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP(6)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.password_history.Password</code>.
     */
    public final TableField<PasswordHistoryRecord, String> PASSWORD = createField("Password", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>mysql.password_history</code> table reference
     */
    public PasswordHistory() {
        this(DSL.name("password_history"), null);
    }

    /**
     * Create an aliased <code>mysql.password_history</code> table reference
     */
    public PasswordHistory(String alias) {
        this(DSL.name(alias), PASSWORD_HISTORY);
    }

    /**
     * Create an aliased <code>mysql.password_history</code> table reference
     */
    public PasswordHistory(Name alias) {
        this(alias, PASSWORD_HISTORY);
    }

    private PasswordHistory(Name alias, Table<PasswordHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private PasswordHistory(Name alias, Table<PasswordHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Password history for user accounts");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PASSWORD_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PasswordHistoryRecord> getPrimaryKey() {
        return Keys.KEY_PASSWORD_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PasswordHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<PasswordHistoryRecord>>asList(Keys.KEY_PASSWORD_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordHistory as(String alias) {
        return new PasswordHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PasswordHistory as(Name alias) {
        return new PasswordHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordHistory rename(String name) {
        return new PasswordHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PasswordHistory rename(Name name) {
        return new PasswordHistory(name, null);
    }
}
