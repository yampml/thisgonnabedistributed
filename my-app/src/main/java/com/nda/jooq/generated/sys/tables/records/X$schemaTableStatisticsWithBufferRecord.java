/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.X$schemaTableStatisticsWithBuffer;

import java.math.BigInteger;

import javax.annotation.Generated;

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
public class X$schemaTableStatisticsWithBufferRecord extends TableRecordImpl<X$schemaTableStatisticsWithBufferRecord> {

    private static final long serialVersionUID = 179816833;

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
     */
    public void setRowsFetched(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
     */
    public ULong getRowsFetched() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
     */
    public void setFetchLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
     */
    public ULong getFetchLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
     */
    public void setRowsInserted(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
     */
    public ULong getRowsInserted() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
     */
    public void setInsertLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
     */
    public ULong getInsertLatency() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
     */
    public void setRowsUpdated(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
     */
    public ULong getRowsUpdated() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
     */
    public void setUpdateLatency(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
     */
    public ULong getUpdateLatency() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
     */
    public void setRowsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
     */
    public ULong getRowsDeleted() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
     */
    public void setDeleteLatency(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
     */
    public ULong getDeleteLatency() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
     */
    public void setIoReadRequests(BigInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
     */
    public BigInteger getIoReadRequests() {
        return (BigInteger) get(10);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
     */
    public void setIoRead(BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
     */
    public BigInteger getIoRead() {
        return (BigInteger) get(11);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
     */
    public void setIoReadLatency(BigInteger value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
     */
    public BigInteger getIoReadLatency() {
        return (BigInteger) get(12);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
     */
    public void setIoWriteRequests(BigInteger value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
     */
    public BigInteger getIoWriteRequests() {
        return (BigInteger) get(13);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
     */
    public void setIoWrite(BigInteger value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
     */
    public BigInteger getIoWrite() {
        return (BigInteger) get(14);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
     */
    public void setIoWriteLatency(BigInteger value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
     */
    public BigInteger getIoWriteLatency() {
        return (BigInteger) get(15);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
     */
    public void setIoMiscRequests(BigInteger value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
     */
    public BigInteger getIoMiscRequests() {
        return (BigInteger) get(16);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
     */
    public void setIoMiscLatency(BigInteger value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
     */
    public BigInteger getIoMiscLatency() {
        return (BigInteger) get(17);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
     */
    public void setInnodbBufferAllocated(BigInteger value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
     */
    public BigInteger getInnodbBufferAllocated() {
        return (BigInteger) get(18);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
     */
    public void setInnodbBufferData(BigInteger value) {
        set(19, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
     */
    public BigInteger getInnodbBufferData() {
        return (BigInteger) get(19);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
     */
    public void setInnodbBufferFree(BigInteger value) {
        set(20, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
     */
    public BigInteger getInnodbBufferFree() {
        return (BigInteger) get(20);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
     */
    public void setInnodbBufferPages(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
     */
    public Long getInnodbBufferPages() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
     */
    public void setInnodbBufferPagesHashed(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
     */
    public Long getInnodbBufferPagesHashed() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
     */
    public void setInnodbBufferPagesOld(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
     */
    public Long getInnodbBufferPagesOld() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
     */
    public void setInnodbBufferRowsCached(BigInteger value) {
        set(24, value);
    }

    /**
     * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
     */
    public BigInteger getInnodbBufferRowsCached() {
        return (BigInteger) get(24);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$schemaTableStatisticsWithBufferRecord
     */
    public X$schemaTableStatisticsWithBufferRecord() {
        super(X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
    }

    /**
     * Create a detached, initialised X$schemaTableStatisticsWithBufferRecord
     */
    public X$schemaTableStatisticsWithBufferRecord(String tableSchema, String tableName, ULong rowsFetched, ULong fetchLatency, ULong rowsInserted, ULong insertLatency, ULong rowsUpdated, ULong updateLatency, ULong rowsDeleted, ULong deleteLatency, BigInteger ioReadRequests, BigInteger ioRead, BigInteger ioReadLatency, BigInteger ioWriteRequests, BigInteger ioWrite, BigInteger ioWriteLatency, BigInteger ioMiscRequests, BigInteger ioMiscLatency, BigInteger innodbBufferAllocated, BigInteger innodbBufferData, BigInteger innodbBufferFree, Long innodbBufferPages, Long innodbBufferPagesHashed, Long innodbBufferPagesOld, BigInteger innodbBufferRowsCached) {
        super(X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);

        set(0, tableSchema);
        set(1, tableName);
        set(2, rowsFetched);
        set(3, fetchLatency);
        set(4, rowsInserted);
        set(5, insertLatency);
        set(6, rowsUpdated);
        set(7, updateLatency);
        set(8, rowsDeleted);
        set(9, deleteLatency);
        set(10, ioReadRequests);
        set(11, ioRead);
        set(12, ioReadLatency);
        set(13, ioWriteRequests);
        set(14, ioWrite);
        set(15, ioWriteLatency);
        set(16, ioMiscRequests);
        set(17, ioMiscLatency);
        set(18, innodbBufferAllocated);
        set(19, innodbBufferData);
        set(20, innodbBufferFree);
        set(21, innodbBufferPages);
        set(22, innodbBufferPagesHashed);
        set(23, innodbBufferPagesOld);
        set(24, innodbBufferRowsCached);
    }
}
