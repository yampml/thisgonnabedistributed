/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.tables;


import com.nda.jooq.generated.mysql.Indexes;
import com.nda.jooq.generated.mysql.Keys;
import com.nda.jooq.generated.mysql.Mysql;
import com.nda.jooq.generated.mysql.enums.DbAlterPriv;
import com.nda.jooq.generated.mysql.enums.DbAlterRoutinePriv;
import com.nda.jooq.generated.mysql.enums.DbCreatePriv;
import com.nda.jooq.generated.mysql.enums.DbCreateRoutinePriv;
import com.nda.jooq.generated.mysql.enums.DbCreateTmpTablePriv;
import com.nda.jooq.generated.mysql.enums.DbCreateViewPriv;
import com.nda.jooq.generated.mysql.enums.DbDeletePriv;
import com.nda.jooq.generated.mysql.enums.DbDropPriv;
import com.nda.jooq.generated.mysql.enums.DbEventPriv;
import com.nda.jooq.generated.mysql.enums.DbExecutePriv;
import com.nda.jooq.generated.mysql.enums.DbGrantPriv;
import com.nda.jooq.generated.mysql.enums.DbIndexPriv;
import com.nda.jooq.generated.mysql.enums.DbInsertPriv;
import com.nda.jooq.generated.mysql.enums.DbLockTablesPriv;
import com.nda.jooq.generated.mysql.enums.DbReferencesPriv;
import com.nda.jooq.generated.mysql.enums.DbSelectPriv;
import com.nda.jooq.generated.mysql.enums.DbShowViewPriv;
import com.nda.jooq.generated.mysql.enums.DbTriggerPriv;
import com.nda.jooq.generated.mysql.enums.DbUpdatePriv;
import com.nda.jooq.generated.mysql.tables.records.DbRecord;

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
 * Database privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db extends TableImpl<DbRecord> {

    private static final long serialVersionUID = -1807818001;

    /**
     * The reference instance of <code>mysql.db</code>
     */
    public static final Db DB = new Db();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbRecord> getRecordType() {
        return DbRecord.class;
    }

    /**
     * The column <code>mysql.db.Host</code>.
     */
    public final TableField<DbRecord, String> HOST = createField("Host", org.jooq.impl.SQLDataType.CHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Db</code>.
     */
    public final TableField<DbRecord, String> DB_ = createField("Db", org.jooq.impl.SQLDataType.CHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.User</code>.
     */
    public final TableField<DbRecord, String> USER = createField("User", org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Select_priv</code>.
     */
    public final TableField<DbRecord, DbSelectPriv> SELECT_PRIV = createField("Select_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbSelectPriv.class), this, "");

    /**
     * The column <code>mysql.db.Insert_priv</code>.
     */
    public final TableField<DbRecord, DbInsertPriv> INSERT_PRIV = createField("Insert_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbInsertPriv.class), this, "");

    /**
     * The column <code>mysql.db.Update_priv</code>.
     */
    public final TableField<DbRecord, DbUpdatePriv> UPDATE_PRIV = createField("Update_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbUpdatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Delete_priv</code>.
     */
    public final TableField<DbRecord, DbDeletePriv> DELETE_PRIV = createField("Delete_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbDeletePriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_priv</code>.
     */
    public final TableField<DbRecord, DbCreatePriv> CREATE_PRIV = createField("Create_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbCreatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Drop_priv</code>.
     */
    public final TableField<DbRecord, DbDropPriv> DROP_PRIV = createField("Drop_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbDropPriv.class), this, "");

    /**
     * The column <code>mysql.db.Grant_priv</code>.
     */
    public final TableField<DbRecord, DbGrantPriv> GRANT_PRIV = createField("Grant_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbGrantPriv.class), this, "");

    /**
     * The column <code>mysql.db.References_priv</code>.
     */
    public final TableField<DbRecord, DbReferencesPriv> REFERENCES_PRIV = createField("References_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbReferencesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Index_priv</code>.
     */
    public final TableField<DbRecord, DbIndexPriv> INDEX_PRIV = createField("Index_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbIndexPriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_priv</code>.
     */
    public final TableField<DbRecord, DbAlterPriv> ALTER_PRIV = createField("Alter_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbAlterPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public final TableField<DbRecord, DbCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField("Create_tmp_table_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbCreateTmpTablePriv.class), this, "");

    /**
     * The column <code>mysql.db.Lock_tables_priv</code>.
     */
    public final TableField<DbRecord, DbLockTablesPriv> LOCK_TABLES_PRIV = createField("Lock_tables_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbLockTablesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_view_priv</code>.
     */
    public final TableField<DbRecord, DbCreateViewPriv> CREATE_VIEW_PRIV = createField("Create_view_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbCreateViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Show_view_priv</code>.
     */
    public final TableField<DbRecord, DbShowViewPriv> SHOW_VIEW_PRIV = createField("Show_view_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbShowViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_routine_priv</code>.
     */
    public final TableField<DbRecord, DbCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField("Create_routine_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbCreateRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_routine_priv</code>.
     */
    public final TableField<DbRecord, DbAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField("Alter_routine_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbAlterRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Execute_priv</code>.
     */
    public final TableField<DbRecord, DbExecutePriv> EXECUTE_PRIV = createField("Execute_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbExecutePriv.class), this, "");

    /**
     * The column <code>mysql.db.Event_priv</code>.
     */
    public final TableField<DbRecord, DbEventPriv> EVENT_PRIV = createField("Event_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbEventPriv.class), this, "");

    /**
     * The column <code>mysql.db.Trigger_priv</code>.
     */
    public final TableField<DbRecord, DbTriggerPriv> TRIGGER_PRIV = createField("Trigger_priv", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.DbTriggerPriv.class), this, "");

    /**
     * Create a <code>mysql.db</code> table reference
     */
    public Db() {
        this(DSL.name("db"), null);
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(String alias) {
        this(DSL.name(alias), DB);
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(Name alias) {
        this(alias, DB);
    }

    private Db(Name alias, Table<DbRecord> aliased) {
        this(alias, aliased, null);
    }

    private Db(Name alias, Table<DbRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Database privileges");
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
        return Arrays.<Index>asList(Indexes.DB_PRIMARY, Indexes.DB_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DbRecord> getPrimaryKey() {
        return Keys.KEY_DB_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DbRecord>> getKeys() {
        return Arrays.<UniqueKey<DbRecord>>asList(Keys.KEY_DB_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Db as(String alias) {
        return new Db(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Db as(Name alias) {
        return new Db(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(String name) {
        return new Db(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(Name name) {
        return new Db(name, null);
    }
}