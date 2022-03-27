/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.mysql;


import com.nda.jooq.generated.mysql.tables.ColumnsPriv;
import com.nda.jooq.generated.mysql.tables.Component;
import com.nda.jooq.generated.mysql.tables.Db;
import com.nda.jooq.generated.mysql.tables.DefaultRoles;
import com.nda.jooq.generated.mysql.tables.EngineCost;
import com.nda.jooq.generated.mysql.tables.Func;
import com.nda.jooq.generated.mysql.tables.GlobalGrants;
import com.nda.jooq.generated.mysql.tables.GtidExecuted;
import com.nda.jooq.generated.mysql.tables.HelpCategory;
import com.nda.jooq.generated.mysql.tables.HelpKeyword;
import com.nda.jooq.generated.mysql.tables.HelpRelation;
import com.nda.jooq.generated.mysql.tables.HelpTopic;
import com.nda.jooq.generated.mysql.tables.InnodbIndexStats;
import com.nda.jooq.generated.mysql.tables.InnodbTableStats;
import com.nda.jooq.generated.mysql.tables.PasswordHistory;
import com.nda.jooq.generated.mysql.tables.Plugin;
import com.nda.jooq.generated.mysql.tables.ProcsPriv;
import com.nda.jooq.generated.mysql.tables.ProxiesPriv;
import com.nda.jooq.generated.mysql.tables.ReplicationAsynchronousConnectionFailover;
import com.nda.jooq.generated.mysql.tables.ReplicationAsynchronousConnectionFailoverManaged;
import com.nda.jooq.generated.mysql.tables.ReplicationGroupConfigurationVersion;
import com.nda.jooq.generated.mysql.tables.ReplicationGroupMemberActions;
import com.nda.jooq.generated.mysql.tables.RoleEdges;
import com.nda.jooq.generated.mysql.tables.ServerCost;
import com.nda.jooq.generated.mysql.tables.Servers;
import com.nda.jooq.generated.mysql.tables.SlaveMasterInfo;
import com.nda.jooq.generated.mysql.tables.SlaveRelayLogInfo;
import com.nda.jooq.generated.mysql.tables.SlaveWorkerInfo;
import com.nda.jooq.generated.mysql.tables.TablesPriv;
import com.nda.jooq.generated.mysql.tables.TimeZone;
import com.nda.jooq.generated.mysql.tables.TimeZoneLeapSecond;
import com.nda.jooq.generated.mysql.tables.TimeZoneName;
import com.nda.jooq.generated.mysql.tables.TimeZoneTransition;
import com.nda.jooq.generated.mysql.tables.TimeZoneTransitionType;
import com.nda.jooq.generated.mysql.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>mysql</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index COLUMNS_PRIV_PRIMARY = Indexes0.COLUMNS_PRIV_PRIMARY;
    public static final Index COMPONENT_PRIMARY = Indexes0.COMPONENT_PRIMARY;
    public static final Index DB_PRIMARY = Indexes0.DB_PRIMARY;
    public static final Index DB_USER = Indexes0.DB_USER;
    public static final Index DEFAULT_ROLES_PRIMARY = Indexes0.DEFAULT_ROLES_PRIMARY;
    public static final Index ENGINE_COST_PRIMARY = Indexes0.ENGINE_COST_PRIMARY;
    public static final Index FUNC_PRIMARY = Indexes0.FUNC_PRIMARY;
    public static final Index GLOBAL_GRANTS_PRIMARY = Indexes0.GLOBAL_GRANTS_PRIMARY;
    public static final Index GTID_EXECUTED_PRIMARY = Indexes0.GTID_EXECUTED_PRIMARY;
    public static final Index HELP_CATEGORY_NAME = Indexes0.HELP_CATEGORY_NAME;
    public static final Index HELP_CATEGORY_PRIMARY = Indexes0.HELP_CATEGORY_PRIMARY;
    public static final Index HELP_KEYWORD_NAME = Indexes0.HELP_KEYWORD_NAME;
    public static final Index HELP_KEYWORD_PRIMARY = Indexes0.HELP_KEYWORD_PRIMARY;
    public static final Index HELP_RELATION_PRIMARY = Indexes0.HELP_RELATION_PRIMARY;
    public static final Index HELP_TOPIC_NAME = Indexes0.HELP_TOPIC_NAME;
    public static final Index HELP_TOPIC_PRIMARY = Indexes0.HELP_TOPIC_PRIMARY;
    public static final Index INNODB_INDEX_STATS_PRIMARY = Indexes0.INNODB_INDEX_STATS_PRIMARY;
    public static final Index INNODB_TABLE_STATS_PRIMARY = Indexes0.INNODB_TABLE_STATS_PRIMARY;
    public static final Index PASSWORD_HISTORY_PRIMARY = Indexes0.PASSWORD_HISTORY_PRIMARY;
    public static final Index PLUGIN_PRIMARY = Indexes0.PLUGIN_PRIMARY;
    public static final Index PROCS_PRIV_GRANTOR = Indexes0.PROCS_PRIV_GRANTOR;
    public static final Index PROCS_PRIV_PRIMARY = Indexes0.PROCS_PRIV_PRIMARY;
    public static final Index PROXIES_PRIV_GRANTOR = Indexes0.PROXIES_PRIV_GRANTOR;
    public static final Index PROXIES_PRIV_PRIMARY = Indexes0.PROXIES_PRIV_PRIMARY;
    public static final Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME = Indexes0.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME;
    public static final Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY = Indexes0.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY;
    public static final Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED_PRIMARY = Indexes0.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED_PRIMARY;
    public static final Index REPLICATION_GROUP_CONFIGURATION_VERSION_PRIMARY = Indexes0.REPLICATION_GROUP_CONFIGURATION_VERSION_PRIMARY;
    public static final Index REPLICATION_GROUP_MEMBER_ACTIONS_EVENT = Indexes0.REPLICATION_GROUP_MEMBER_ACTIONS_EVENT;
    public static final Index REPLICATION_GROUP_MEMBER_ACTIONS_PRIMARY = Indexes0.REPLICATION_GROUP_MEMBER_ACTIONS_PRIMARY;
    public static final Index ROLE_EDGES_PRIMARY = Indexes0.ROLE_EDGES_PRIMARY;
    public static final Index SERVER_COST_PRIMARY = Indexes0.SERVER_COST_PRIMARY;
    public static final Index SERVERS_PRIMARY = Indexes0.SERVERS_PRIMARY;
    public static final Index SLAVE_MASTER_INFO_PRIMARY = Indexes0.SLAVE_MASTER_INFO_PRIMARY;
    public static final Index SLAVE_RELAY_LOG_INFO_PRIMARY = Indexes0.SLAVE_RELAY_LOG_INFO_PRIMARY;
    public static final Index SLAVE_WORKER_INFO_PRIMARY = Indexes0.SLAVE_WORKER_INFO_PRIMARY;
    public static final Index TABLES_PRIV_GRANTOR = Indexes0.TABLES_PRIV_GRANTOR;
    public static final Index TABLES_PRIV_PRIMARY = Indexes0.TABLES_PRIV_PRIMARY;
    public static final Index TIME_ZONE_PRIMARY = Indexes0.TIME_ZONE_PRIMARY;
    public static final Index TIME_ZONE_LEAP_SECOND_PRIMARY = Indexes0.TIME_ZONE_LEAP_SECOND_PRIMARY;
    public static final Index TIME_ZONE_NAME_PRIMARY = Indexes0.TIME_ZONE_NAME_PRIMARY;
    public static final Index TIME_ZONE_TRANSITION_PRIMARY = Indexes0.TIME_ZONE_TRANSITION_PRIMARY;
    public static final Index TIME_ZONE_TRANSITION_TYPE_PRIMARY = Indexes0.TIME_ZONE_TRANSITION_TYPE_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COLUMNS_PRIV_PRIMARY = Internal.createIndex("PRIMARY", ColumnsPriv.COLUMNS_PRIV, new OrderField[] { ColumnsPriv.COLUMNS_PRIV.HOST, ColumnsPriv.COLUMNS_PRIV.DB, ColumnsPriv.COLUMNS_PRIV.USER, ColumnsPriv.COLUMNS_PRIV.TABLE_NAME, ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME }, true);
        public static Index COMPONENT_PRIMARY = Internal.createIndex("PRIMARY", Component.COMPONENT, new OrderField[] { Component.COMPONENT.COMPONENT_ID }, true);
        public static Index DB_PRIMARY = Internal.createIndex("PRIMARY", Db.DB, new OrderField[] { Db.DB.HOST, Db.DB.DB_, Db.DB.USER }, true);
        public static Index DB_USER = Internal.createIndex("User", Db.DB, new OrderField[] { Db.DB.USER }, false);
        public static Index DEFAULT_ROLES_PRIMARY = Internal.createIndex("PRIMARY", DefaultRoles.DEFAULT_ROLES, new OrderField[] { DefaultRoles.DEFAULT_ROLES.HOST, DefaultRoles.DEFAULT_ROLES.USER, DefaultRoles.DEFAULT_ROLES.DEFAULT_ROLE_HOST, DefaultRoles.DEFAULT_ROLES.DEFAULT_ROLE_USER }, true);
        public static Index ENGINE_COST_PRIMARY = Internal.createIndex("PRIMARY", EngineCost.ENGINE_COST, new OrderField[] { EngineCost.ENGINE_COST.COST_NAME, EngineCost.ENGINE_COST.ENGINE_NAME, EngineCost.ENGINE_COST.DEVICE_TYPE }, true);
        public static Index FUNC_PRIMARY = Internal.createIndex("PRIMARY", Func.FUNC, new OrderField[] { Func.FUNC.NAME }, true);
        public static Index GLOBAL_GRANTS_PRIMARY = Internal.createIndex("PRIMARY", GlobalGrants.GLOBAL_GRANTS, new OrderField[] { GlobalGrants.GLOBAL_GRANTS.USER, GlobalGrants.GLOBAL_GRANTS.HOST, GlobalGrants.GLOBAL_GRANTS.PRIV }, true);
        public static Index GTID_EXECUTED_PRIMARY = Internal.createIndex("PRIMARY", GtidExecuted.GTID_EXECUTED, new OrderField[] { GtidExecuted.GTID_EXECUTED.SOURCE_UUID, GtidExecuted.GTID_EXECUTED.INTERVAL_START }, true);
        public static Index HELP_CATEGORY_NAME = Internal.createIndex("name", HelpCategory.HELP_CATEGORY, new OrderField[] { HelpCategory.HELP_CATEGORY.NAME }, true);
        public static Index HELP_CATEGORY_PRIMARY = Internal.createIndex("PRIMARY", HelpCategory.HELP_CATEGORY, new OrderField[] { HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID }, true);
        public static Index HELP_KEYWORD_NAME = Internal.createIndex("name", HelpKeyword.HELP_KEYWORD, new OrderField[] { HelpKeyword.HELP_KEYWORD.NAME }, true);
        public static Index HELP_KEYWORD_PRIMARY = Internal.createIndex("PRIMARY", HelpKeyword.HELP_KEYWORD, new OrderField[] { HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID }, true);
        public static Index HELP_RELATION_PRIMARY = Internal.createIndex("PRIMARY", HelpRelation.HELP_RELATION, new OrderField[] { HelpRelation.HELP_RELATION.HELP_KEYWORD_ID, HelpRelation.HELP_RELATION.HELP_TOPIC_ID }, true);
        public static Index HELP_TOPIC_NAME = Internal.createIndex("name", HelpTopic.HELP_TOPIC, new OrderField[] { HelpTopic.HELP_TOPIC.NAME }, true);
        public static Index HELP_TOPIC_PRIMARY = Internal.createIndex("PRIMARY", HelpTopic.HELP_TOPIC, new OrderField[] { HelpTopic.HELP_TOPIC.HELP_TOPIC_ID }, true);
        public static Index INNODB_INDEX_STATS_PRIMARY = Internal.createIndex("PRIMARY", InnodbIndexStats.INNODB_INDEX_STATS, new OrderField[] { InnodbIndexStats.INNODB_INDEX_STATS.DATABASE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.TABLE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.INDEX_NAME, InnodbIndexStats.INNODB_INDEX_STATS.STAT_NAME }, true);
        public static Index INNODB_TABLE_STATS_PRIMARY = Internal.createIndex("PRIMARY", InnodbTableStats.INNODB_TABLE_STATS, new OrderField[] { InnodbTableStats.INNODB_TABLE_STATS.DATABASE_NAME, InnodbTableStats.INNODB_TABLE_STATS.TABLE_NAME }, true);
        public static Index PASSWORD_HISTORY_PRIMARY = Internal.createIndex("PRIMARY", PasswordHistory.PASSWORD_HISTORY, new OrderField[] { PasswordHistory.PASSWORD_HISTORY.HOST, PasswordHistory.PASSWORD_HISTORY.USER, PasswordHistory.PASSWORD_HISTORY.PASSWORD_TIMESTAMP }, true);
        public static Index PLUGIN_PRIMARY = Internal.createIndex("PRIMARY", Plugin.PLUGIN, new OrderField[] { Plugin.PLUGIN.NAME }, true);
        public static Index PROCS_PRIV_GRANTOR = Internal.createIndex("Grantor", ProcsPriv.PROCS_PRIV, new OrderField[] { ProcsPriv.PROCS_PRIV.GRANTOR }, false);
        public static Index PROCS_PRIV_PRIMARY = Internal.createIndex("PRIMARY", ProcsPriv.PROCS_PRIV, new OrderField[] { ProcsPriv.PROCS_PRIV.HOST, ProcsPriv.PROCS_PRIV.DB, ProcsPriv.PROCS_PRIV.USER, ProcsPriv.PROCS_PRIV.ROUTINE_NAME, ProcsPriv.PROCS_PRIV.ROUTINE_TYPE }, true);
        public static Index PROXIES_PRIV_GRANTOR = Internal.createIndex("Grantor", ProxiesPriv.PROXIES_PRIV, new OrderField[] { ProxiesPriv.PROXIES_PRIV.GRANTOR }, false);
        public static Index PROXIES_PRIV_PRIMARY = Internal.createIndex("PRIMARY", ProxiesPriv.PROXIES_PRIV, new OrderField[] { ProxiesPriv.PROXIES_PRIV.HOST, ProxiesPriv.PROXIES_PRIV.USER, ProxiesPriv.PROXIES_PRIV.PROXIED_HOST, ProxiesPriv.PROXIES_PRIV.PROXIED_USER }, true);
        public static Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME = Internal.createIndex("Channel_name", ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER, new OrderField[] { ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.CHANNEL_NAME, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.MANAGED_NAME }, false);
        public static Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY = Internal.createIndex("PRIMARY", ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER, new OrderField[] { ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.CHANNEL_NAME, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.HOST, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.PORT, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.NETWORK_NAMESPACE, ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER.MANAGED_NAME }, true);
        public static Index REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED_PRIMARY = Internal.createIndex("PRIMARY", ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED, new OrderField[] { ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CHANNEL_NAME, ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_NAME }, true);
        public static Index REPLICATION_GROUP_CONFIGURATION_VERSION_PRIMARY = Internal.createIndex("PRIMARY", ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION, new OrderField[] { ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION.NAME }, true);
        public static Index REPLICATION_GROUP_MEMBER_ACTIONS_EVENT = Internal.createIndex("event", ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS, new OrderField[] { ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.EVENT }, false);
        public static Index REPLICATION_GROUP_MEMBER_ACTIONS_PRIMARY = Internal.createIndex("PRIMARY", ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS, new OrderField[] { ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.NAME, ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS.EVENT }, true);
        public static Index ROLE_EDGES_PRIMARY = Internal.createIndex("PRIMARY", RoleEdges.ROLE_EDGES, new OrderField[] { RoleEdges.ROLE_EDGES.FROM_HOST, RoleEdges.ROLE_EDGES.FROM_USER, RoleEdges.ROLE_EDGES.TO_HOST, RoleEdges.ROLE_EDGES.TO_USER }, true);
        public static Index SERVER_COST_PRIMARY = Internal.createIndex("PRIMARY", ServerCost.SERVER_COST, new OrderField[] { ServerCost.SERVER_COST.COST_NAME }, true);
        public static Index SERVERS_PRIMARY = Internal.createIndex("PRIMARY", Servers.SERVERS, new OrderField[] { Servers.SERVERS.SERVER_NAME }, true);
        public static Index SLAVE_MASTER_INFO_PRIMARY = Internal.createIndex("PRIMARY", SlaveMasterInfo.SLAVE_MASTER_INFO, new OrderField[] { SlaveMasterInfo.SLAVE_MASTER_INFO.CHANNEL_NAME }, true);
        public static Index SLAVE_RELAY_LOG_INFO_PRIMARY = Internal.createIndex("PRIMARY", SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO, new OrderField[] { SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO.CHANNEL_NAME }, true);
        public static Index SLAVE_WORKER_INFO_PRIMARY = Internal.createIndex("PRIMARY", SlaveWorkerInfo.SLAVE_WORKER_INFO, new OrderField[] { SlaveWorkerInfo.SLAVE_WORKER_INFO.CHANNEL_NAME, SlaveWorkerInfo.SLAVE_WORKER_INFO.ID }, true);
        public static Index TABLES_PRIV_GRANTOR = Internal.createIndex("Grantor", TablesPriv.TABLES_PRIV, new OrderField[] { TablesPriv.TABLES_PRIV.GRANTOR }, false);
        public static Index TABLES_PRIV_PRIMARY = Internal.createIndex("PRIMARY", TablesPriv.TABLES_PRIV, new OrderField[] { TablesPriv.TABLES_PRIV.HOST, TablesPriv.TABLES_PRIV.DB, TablesPriv.TABLES_PRIV.USER, TablesPriv.TABLES_PRIV.TABLE_NAME }, true);
        public static Index TIME_ZONE_PRIMARY = Internal.createIndex("PRIMARY", TimeZone.TIME_ZONE, new OrderField[] { TimeZone.TIME_ZONE.TIME_ZONE_ID }, true);
        public static Index TIME_ZONE_LEAP_SECOND_PRIMARY = Internal.createIndex("PRIMARY", TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND, new OrderField[] { TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME }, true);
        public static Index TIME_ZONE_NAME_PRIMARY = Internal.createIndex("PRIMARY", TimeZoneName.TIME_ZONE_NAME, new OrderField[] { TimeZoneName.TIME_ZONE_NAME.NAME }, true);
        public static Index TIME_ZONE_TRANSITION_PRIMARY = Internal.createIndex("PRIMARY", TimeZoneTransition.TIME_ZONE_TRANSITION, new OrderField[] { TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID, TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME }, true);
        public static Index TIME_ZONE_TRANSITION_TYPE_PRIMARY = Internal.createIndex("PRIMARY", TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE, new OrderField[] { TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID, TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.HOST, User.USER.USER_ }, true);
    }
}