/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.tables.ReplicationAsynchronousConnectionFailoverManaged;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ReplicationAsynchronousConnectionFailoverManagedRecord extends TableRecordImpl<ReplicationAsynchronousConnectionFailoverManagedRecord> implements Record4<String, String, String, Object> {

    private static final long serialVersionUID = 26038685;

    /**
     * Setter for <code>performance_schema.replication_asynchronous_connection_failover_managed.CHANNEL_NAME</code>. The replication channel name that connects source and replica.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_asynchronous_connection_failover_managed.CHANNEL_NAME</code>. The replication channel name that connects source and replica.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_NAME</code>. The name of the source which needs to be managed.
     */
    public void setManagedName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_NAME</code>. The name of the source which needs to be managed.
     */
    public String getManagedName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_TYPE</code>. Determines the managed type.
     */
    public void setManagedType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_asynchronous_connection_failover_managed.MANAGED_TYPE</code>. Determines the managed type.
     */
    public String getManagedType() {
        return (String) get(2);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setConfiguration(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getConfiguration() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.MANAGED_TYPE;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED.CONFIGURATION;
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
    public String component2() {
        return getManagedName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getManagedType();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getConfiguration();
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
    public String value2() {
        return getManagedName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getManagedType();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getConfiguration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value2(String value) {
        setManagedName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value3(String value) {
        setManagedType(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord value4(Object value) {
        setConfiguration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationAsynchronousConnectionFailoverManagedRecord values(String value1, String value2, String value3, Object value4) {
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
     * Create a detached ReplicationAsynchronousConnectionFailoverManagedRecord
     */
    public ReplicationAsynchronousConnectionFailoverManagedRecord() {
        super(ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);
    }

    /**
     * Create a detached, initialised ReplicationAsynchronousConnectionFailoverManagedRecord
     */
    public ReplicationAsynchronousConnectionFailoverManagedRecord(String channelName, String managedName, String managedType, Object configuration) {
        super(ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED);

        set(0, channelName);
        set(1, managedName);
        set(2, managedType);
        set(3, configuration);
    }
}
