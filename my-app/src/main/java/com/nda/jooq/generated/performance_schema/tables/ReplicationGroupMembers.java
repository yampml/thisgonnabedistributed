/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.ReplicationGroupMembersRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class ReplicationGroupMembers extends TableImpl<ReplicationGroupMembersRecord> {

    private static final long serialVersionUID = 1938849434;

    /**
     * The reference instance of <code>performance_schema.replication_group_members</code>
     */
    public static final ReplicationGroupMembers REPLICATION_GROUP_MEMBERS = new ReplicationGroupMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationGroupMembersRecord> getRecordType() {
        return ReplicationGroupMembersRecord.class;
    }

    /**
     * The column <code>performance_schema.replication_group_members.CHANNEL_NAME</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> CHANNEL_NAME = createField("CHANNEL_NAME", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_ID</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_ID = createField("MEMBER_ID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_HOST</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_HOST = createField("MEMBER_HOST", org.jooq.impl.SQLDataType.CHAR(255).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_PORT</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, Integer> MEMBER_PORT = createField("MEMBER_PORT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_STATE</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_STATE = createField("MEMBER_STATE", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_ROLE</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_ROLE = createField("MEMBER_ROLE", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_VERSION</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_VERSION = createField("MEMBER_VERSION", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_members.MEMBER_COMMUNICATION_STACK</code>.
     */
    public final TableField<ReplicationGroupMembersRecord, String> MEMBER_COMMUNICATION_STACK = createField("MEMBER_COMMUNICATION_STACK", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * Create a <code>performance_schema.replication_group_members</code> table reference
     */
    public ReplicationGroupMembers() {
        this(DSL.name("replication_group_members"), null);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_members</code> table reference
     */
    public ReplicationGroupMembers(String alias) {
        this(DSL.name(alias), REPLICATION_GROUP_MEMBERS);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_members</code> table reference
     */
    public ReplicationGroupMembers(Name alias) {
        this(alias, REPLICATION_GROUP_MEMBERS);
    }

    private ReplicationGroupMembers(Name alias, Table<ReplicationGroupMembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationGroupMembers(Name alias, Table<ReplicationGroupMembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMembers as(String alias) {
        return new ReplicationGroupMembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMembers as(Name alias) {
        return new ReplicationGroupMembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMembers rename(String name) {
        return new ReplicationGroupMembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMembers rename(Name name) {
        return new ReplicationGroupMembers(name, null);
    }
}
