/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.SessionSslStatus;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
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
public class SessionSslStatusRecord extends TableRecordImpl<SessionSslStatusRecord> implements Record4<ULong, String, String, String> {

    private static final long serialVersionUID = -1192087588;

    /**
     * Setter for <code>sys.session_ssl_status.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.session_ssl_status.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>sys.session_ssl_status.ssl_version</code>.
     */
    public void setSslVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.session_ssl_status.ssl_version</code>.
     */
    public String getSslVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.session_ssl_status.ssl_cipher</code>.
     */
    public void setSslCipher(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.session_ssl_status.ssl_cipher</code>.
     */
    public String getSslCipher() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.session_ssl_status.ssl_sessions_reused</code>.
     */
    public void setSslSessionsReused(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.session_ssl_status.ssl_sessions_reused</code>.
     */
    public String getSslSessionsReused() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<ULong, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return SessionSslStatus.SESSION_SSL_STATUS.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SessionSslStatus.SESSION_SSL_STATUS.SSL_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SessionSslStatus.SESSION_SSL_STATUS.SSL_CIPHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SessionSslStatus.SESSION_SSL_STATUS.SSL_SESSIONS_REUSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSslVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSslCipher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSslSessionsReused();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSslVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSslCipher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSslSessionsReused();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionSslStatusRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionSslStatusRecord value2(String value) {
        setSslVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionSslStatusRecord value3(String value) {
        setSslCipher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionSslStatusRecord value4(String value) {
        setSslSessionsReused(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SessionSslStatusRecord values(ULong value1, String value2, String value3, String value4) {
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
     * Create a detached SessionSslStatusRecord
     */
    public SessionSslStatusRecord() {
        super(SessionSslStatus.SESSION_SSL_STATUS);
    }

    /**
     * Create a detached, initialised SessionSslStatusRecord
     */
    public SessionSslStatusRecord(ULong threadId, String sslVersion, String sslCipher, String sslSessionsReused) {
        super(SessionSslStatus.SESSION_SSL_STATUS);

        set(0, threadId);
        set(1, sslVersion);
        set(2, sslCipher);
        set(3, sslSessionsReused);
    }
}
