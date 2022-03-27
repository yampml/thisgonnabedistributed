/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.UserSummaryByStagesRecord;

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
public class UserSummaryByStages extends TableImpl<UserSummaryByStagesRecord> {

    private static final long serialVersionUID = 1576893674;

    /**
     * The reference instance of <code>sys.user_summary_by_stages</code>
     */
    public static final UserSummaryByStages USER_SUMMARY_BY_STAGES = new UserSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSummaryByStagesRecord> getRecordType() {
        return UserSummaryByStagesRecord.class;
    }

    /**
     * The column <code>sys.user_summary_by_stages.user</code>.
     */
    public final TableField<UserSummaryByStagesRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.event_name</code>.
     */
    public final TableField<UserSummaryByStagesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.total</code>.
     */
    public final TableField<UserSummaryByStagesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.total_latency</code>.
     */
    public final TableField<UserSummaryByStagesRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * The column <code>sys.user_summary_by_stages.avg_latency</code>.
     */
    public final TableField<UserSummaryByStagesRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.VARCHAR(11), this, "");

    /**
     * Create a <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages() {
        this(DSL.name("user_summary_by_stages"), null);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages(String alias) {
        this(DSL.name(alias), USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create an aliased <code>sys.user_summary_by_stages</code> table reference
     */
    public UserSummaryByStages(Name alias) {
        this(alias, USER_SUMMARY_BY_STAGES);
    }

    private UserSummaryByStages(Name alias, Table<UserSummaryByStagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSummaryByStages(Name alias, Table<UserSummaryByStagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStages as(String alias) {
        return new UserSummaryByStages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummaryByStages as(Name alias) {
        return new UserSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStages rename(String name) {
        return new UserSummaryByStages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummaryByStages rename(Name name) {
        return new UserSummaryByStages(name, null);
    }
}
