/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql.tables;


import com.nda.jooq.generated.mysql.Indexes;
import com.nda.jooq.generated.mysql.Keys;
import com.nda.jooq.generated.mysql.Mysql;
import com.nda.jooq.generated.mysql.enums.RoleEdgesWithAdminOption;
import com.nda.jooq.generated.mysql.tables.records.RoleEdgesRecord;

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
 * Role hierarchy and role grants
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleEdges extends TableImpl<RoleEdgesRecord> {

    private static final long serialVersionUID = 489188673;

    /**
     * The reference instance of <code>mysql.role_edges</code>
     */
    public static final RoleEdges ROLE_EDGES = new RoleEdges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleEdgesRecord> getRecordType() {
        return RoleEdgesRecord.class;
    }

    /**
     * The column <code>mysql.role_edges.FROM_HOST</code>.
     */
    public final TableField<RoleEdgesRecord, String> FROM_HOST = createField("FROM_HOST", org.jooq.impl.SQLDataType.CHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.FROM_USER</code>.
     */
    public final TableField<RoleEdgesRecord, String> FROM_USER = createField("FROM_USER", org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.TO_HOST</code>.
     */
    public final TableField<RoleEdgesRecord, String> TO_HOST = createField("TO_HOST", org.jooq.impl.SQLDataType.CHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.TO_USER</code>.
     */
    public final TableField<RoleEdgesRecord, String> TO_USER = createField("TO_USER", org.jooq.impl.SQLDataType.CHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    public final TableField<RoleEdgesRecord, RoleEdgesWithAdminOption> WITH_ADMIN_OPTION = createField("WITH_ADMIN_OPTION", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false).defaultValue(org.jooq.impl.DSL.inline("N", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.nda.jooq.generated.mysql.enums.RoleEdgesWithAdminOption.class), this, "");

    /**
     * Create a <code>mysql.role_edges</code> table reference
     */
    public RoleEdges() {
        this(DSL.name("role_edges"), null);
    }

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    public RoleEdges(String alias) {
        this(DSL.name(alias), ROLE_EDGES);
    }

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    public RoleEdges(Name alias) {
        this(alias, ROLE_EDGES);
    }

    private RoleEdges(Name alias, Table<RoleEdgesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleEdges(Name alias, Table<RoleEdgesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Role hierarchy and role grants");
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
        return Arrays.<Index>asList(Indexes.ROLE_EDGES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RoleEdgesRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_EDGES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoleEdgesRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleEdgesRecord>>asList(Keys.KEY_ROLE_EDGES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleEdges as(String alias) {
        return new RoleEdges(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleEdges as(Name alias) {
        return new RoleEdges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleEdges rename(String name) {
        return new RoleEdges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleEdges rename(Name name) {
        return new RoleEdges(name, null);
    }
}
