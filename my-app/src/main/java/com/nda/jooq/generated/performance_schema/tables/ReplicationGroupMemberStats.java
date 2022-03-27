/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.tables.records.ReplicationGroupMemberStatsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class ReplicationGroupMemberStats extends TableImpl<ReplicationGroupMemberStatsRecord> {

    private static final long serialVersionUID = -1138041990;

    /**
     * The reference instance of <code>performance_schema.replication_group_member_stats</code>
     */
    public static final ReplicationGroupMemberStats REPLICATION_GROUP_MEMBER_STATS = new ReplicationGroupMemberStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationGroupMemberStatsRecord> getRecordType() {
        return ReplicationGroupMemberStatsRecord.class;
    }

    /**
     * The column <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> CHANNEL_NAME = createField("CHANNEL_NAME", org.jooq.impl.SQLDataType.CHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> VIEW_ID = createField("VIEW_ID", org.jooq.impl.SQLDataType.CHAR(60).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> MEMBER_ID = createField("MEMBER_ID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_IN_QUEUE = createField("COUNT_TRANSACTIONS_IN_QUEUE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_CHECKED = createField("COUNT_TRANSACTIONS_CHECKED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_CONFLICTS_DETECTED = createField("COUNT_CONFLICTS_DETECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_ROWS_VALIDATING = createField("COUNT_TRANSACTIONS_ROWS_VALIDATING", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> TRANSACTIONS_COMMITTED_ALL_MEMBERS = createField("TRANSACTIONS_COMMITTED_ALL_MEMBERS", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, String> LAST_CONFLICT_FREE_TRANSACTION = createField("LAST_CONFLICT_FREE_TRANSACTION", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE = createField("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_REMOTE_APPLIED = createField("COUNT_TRANSACTIONS_REMOTE_APPLIED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_LOCAL_PROPOSED = createField("COUNT_TRANSACTIONS_LOCAL_PROPOSED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK</code>.
     */
    public final TableField<ReplicationGroupMemberStatsRecord, ULong> COUNT_TRANSACTIONS_LOCAL_ROLLBACK = createField("COUNT_TRANSACTIONS_LOCAL_ROLLBACK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public ReplicationGroupMemberStats() {
        this(DSL.name("replication_group_member_stats"), null);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public ReplicationGroupMemberStats(String alias) {
        this(DSL.name(alias), REPLICATION_GROUP_MEMBER_STATS);
    }

    /**
     * Create an aliased <code>performance_schema.replication_group_member_stats</code> table reference
     */
    public ReplicationGroupMemberStats(Name alias) {
        this(alias, REPLICATION_GROUP_MEMBER_STATS);
    }

    private ReplicationGroupMemberStats(Name alias, Table<ReplicationGroupMemberStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationGroupMemberStats(Name alias, Table<ReplicationGroupMemberStatsRecord> aliased, Field<?>[] parameters) {
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
    public ReplicationGroupMemberStats as(String alias) {
        return new ReplicationGroupMemberStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStats as(Name alias) {
        return new ReplicationGroupMemberStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMemberStats rename(String name) {
        return new ReplicationGroupMemberStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationGroupMemberStats rename(Name name) {
        return new ReplicationGroupMemberStats(name, null);
    }
}
