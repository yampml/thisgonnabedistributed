/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType;
import com.nda.jooq.generated.performance_schema.enums.ReplicationApplierConfigurationRequireRowFormat;
import com.nda.jooq.generated.performance_schema.enums.ReplicationApplierConfigurationRequireTablePrimaryKeyCheck;
import com.nda.jooq.generated.performance_schema.tables.ReplicationApplierConfiguration;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ReplicationApplierConfigurationRecord extends UpdatableRecordImpl<ReplicationApplierConfigurationRecord> implements Record7<String, Integer, String, ReplicationApplierConfigurationRequireRowFormat, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType, String> {

    private static final long serialVersionUID = -1632044898;

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
     */
    public void setDesiredDelay(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.DESIRED_DELAY</code>.
     */
    public Integer getDesiredDelay() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.PRIVILEGE_CHECKS_USER</code>. User name for the security context of the applier.
     */
    public void setPrivilegeChecksUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.PRIVILEGE_CHECKS_USER</code>. User name for the security context of the applier.
     */
    public String getPrivilegeChecksUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.REQUIRE_ROW_FORMAT</code>. Indicates whether the channel shall only accept row based events.
     */
    public void setRequireRowFormat(ReplicationApplierConfigurationRequireRowFormat value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.REQUIRE_ROW_FORMAT</code>. Indicates whether the channel shall only accept row based events.
     */
    public ReplicationApplierConfigurationRequireRowFormat getRequireRowFormat() {
        return (ReplicationApplierConfigurationRequireRowFormat) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK</code>. Indicates what is the channel policy regarding tables having primary keys on create and alter table queries
     */
    public void setRequireTablePrimaryKeyCheck(ReplicationApplierConfigurationRequireTablePrimaryKeyCheck value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.REQUIRE_TABLE_PRIMARY_KEY_CHECK</code>. Indicates what is the channel policy regarding tables having primary keys on create and alter table queries
     */
    public ReplicationApplierConfigurationRequireTablePrimaryKeyCheck getRequireTablePrimaryKeyCheck() {
        return (ReplicationApplierConfigurationRequireTablePrimaryKeyCheck) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE</code>. Indicates whether the channel will generate a new GTID for anonymous transactions. OFF means that anonymous transactions will remain anonymous. LOCAL means that anonymous transactions will be assigned a newly generated GTID based on server_uuid. UUID indicates that anonymous transactions will be assigned a newly generated GTID based on Assign_gtids_to_anonymous_transactions_value
     */
    public void setAssignGtidsToAnonymousTransactionsType(ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE</code>. Indicates whether the channel will generate a new GTID for anonymous transactions. OFF means that anonymous transactions will remain anonymous. LOCAL means that anonymous transactions will be assigned a newly generated GTID based on server_uuid. UUID indicates that anonymous transactions will be assigned a newly generated GTID based on Assign_gtids_to_anonymous_transactions_value
     */
    public ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType getAssignGtidsToAnonymousTransactionsType() {
        return (ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE</code>. Indicates the UUID used while generating GTIDs for anonymous transactions
     */
    public void setAssignGtidsToAnonymousTransactionsValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_configuration.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE</code>. Indicates the UUID used while generating GTIDs for anonymous transactions
     */
    public String getAssignGtidsToAnonymousTransactionsValue() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Integer, String, ReplicationApplierConfigurationRequireRowFormat, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Integer, String, ReplicationApplierConfigurationRequireRowFormat, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.DESIRED_DELAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.PRIVILEGE_CHECKS_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierConfigurationRequireRowFormat> field4() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.REQUIRE_ROW_FORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierConfigurationRequireTablePrimaryKeyCheck> field5() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.REQUIRE_TABLE_PRIMARY_KEY_CHECK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType> field6() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION.ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDesiredDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPrivilegeChecksUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRequireRowFormat component4() {
        return getRequireRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRequireTablePrimaryKeyCheck component5() {
        return getRequireTablePrimaryKeyCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType component6() {
        return getAssignGtidsToAnonymousTransactionsType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAssignGtidsToAnonymousTransactionsValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDesiredDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPrivilegeChecksUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRequireRowFormat value4() {
        return getRequireRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRequireTablePrimaryKeyCheck value5() {
        return getRequireTablePrimaryKeyCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType value6() {
        return getAssignGtidsToAnonymousTransactionsType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAssignGtidsToAnonymousTransactionsValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value2(Integer value) {
        setDesiredDelay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value3(String value) {
        setPrivilegeChecksUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value4(ReplicationApplierConfigurationRequireRowFormat value) {
        setRequireRowFormat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value5(ReplicationApplierConfigurationRequireTablePrimaryKeyCheck value) {
        setRequireTablePrimaryKeyCheck(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value6(ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType value) {
        setAssignGtidsToAnonymousTransactionsType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord value7(String value) {
        setAssignGtidsToAnonymousTransactionsValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierConfigurationRecord values(String value1, Integer value2, String value3, ReplicationApplierConfigurationRequireRowFormat value4, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck value5, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationApplierConfigurationRecord
     */
    public ReplicationApplierConfigurationRecord() {
        super(ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION);
    }

    /**
     * Create a detached, initialised ReplicationApplierConfigurationRecord
     */
    public ReplicationApplierConfigurationRecord(String channelName, Integer desiredDelay, String privilegeChecksUser, ReplicationApplierConfigurationRequireRowFormat requireRowFormat, ReplicationApplierConfigurationRequireTablePrimaryKeyCheck requireTablePrimaryKeyCheck, ReplicationApplierConfigurationAssignGtidsToAnonymousTransactionsType assignGtidsToAnonymousTransactionsType, String assignGtidsToAnonymousTransactionsValue) {
        super(ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION);

        set(0, channelName);
        set(1, desiredDelay);
        set(2, privilegeChecksUser);
        set(3, requireRowFormat);
        set(4, requireTablePrimaryKeyCheck);
        set(5, assignGtidsToAnonymousTransactionsType);
        set(6, assignGtidsToAnonymousTransactionsValue);
    }
}