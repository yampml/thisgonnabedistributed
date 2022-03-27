/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables.records;


import com.nda.jooq.generated.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType;
import com.nda.jooq.generated.performance_schema.tables.BinaryLogTransactionCompressionStats;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;
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
public class BinaryLogTransactionCompressionStatsRecord extends TableRecordImpl<BinaryLogTransactionCompressionStatsRecord> implements Record14<BinaryLogTransactionCompressionStatsLogType, String, ULong, ULong, ULong, Short, String, ULong, ULong, Timestamp, String, ULong, ULong, Timestamp> {

    private static final long serialVersionUID = 1846320514;

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.LOG_TYPE</code>. The log type to which the transactions were written.
     */
    public void setLogType(BinaryLogTransactionCompressionStatsLogType value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.LOG_TYPE</code>. The log type to which the transactions were written.
     */
    public BinaryLogTransactionCompressionStatsLogType getLogType() {
        return (BinaryLogTransactionCompressionStatsLogType) get(0);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_TYPE</code>. The transaction compression algorithm used.
     */
    public void setCompressionType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_TYPE</code>. The transaction compression algorithm used.
     */
    public String getCompressionType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.TRANSACTION_COUNTER</code>. Number of transactions written to the log
     */
    public void setTransactionCounter(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.TRANSACTION_COUNTER</code>. Number of transactions written to the log
     */
    public ULong getTransactionCounter() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER</code>. The total number of bytes compressed.
     */
    public void setCompressedBytesCounter(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER</code>. The total number of bytes compressed.
     */
    public ULong getCompressedBytesCounter() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER</code>. The total number of bytes uncompressed.
     */
    public void setUncompressedBytesCounter(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER</code>. The total number of bytes uncompressed.
     */
    public ULong getUncompressedBytesCounter() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE</code>. The compression ratio as a percentage.
     */
    public void setCompressionPercentage(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE</code>. The compression ratio as a percentage.
     */
    public Short getCompressionPercentage() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID</code>. The first transaction written.
     */
    public void setFirstTransactionId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID</code>. The first transaction written.
     */
    public String getFirstTransactionId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES</code>. First transaction written compressed bytes.
     */
    public void setFirstTransactionCompressedBytes(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES</code>. First transaction written compressed bytes.
     */
    public ULong getFirstTransactionCompressedBytes() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES</code>. First transaction written uncompressed bytes.
     */
    public void setFirstTransactionUncompressedBytes(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES</code>. First transaction written uncompressed bytes.
     */
    public ULong getFirstTransactionUncompressedBytes() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP</code>. When the first transaction was written.
     */
    public void setFirstTransactionTimestamp(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP</code>. When the first transaction was written.
     */
    public Timestamp getFirstTransactionTimestamp() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_ID</code>. The last transaction written.
     */
    public void setLastTransactionId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_ID</code>. The last transaction written.
     */
    public String getLastTransactionId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES</code>. Last transaction written compressed bytes.
     */
    public void setLastTransactionCompressedBytes(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES</code>. Last transaction written compressed bytes.
     */
    public ULong getLastTransactionCompressedBytes() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES</code>. Last transaction written uncompressed bytes.
     */
    public void setLastTransactionUncompressedBytes(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES</code>. Last transaction written uncompressed bytes.
     */
    public ULong getLastTransactionUncompressedBytes() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP</code>. When the last transaction was written.
     */
    public void setLastTransactionTimestamp(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP</code>. When the last transaction was written.
     */
    public Timestamp getLastTransactionTimestamp() {
        return (Timestamp) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BinaryLogTransactionCompressionStatsLogType, String, ULong, ULong, ULong, Short, String, ULong, ULong, Timestamp, String, ULong, ULong, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BinaryLogTransactionCompressionStatsLogType, String, ULong, ULong, ULong, Short, String, ULong, ULong, Timestamp, String, ULong, ULong, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BinaryLogTransactionCompressionStatsLogType> field1() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.LOG_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.COMPRESSION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.TRANSACTION_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.COMPRESSED_BYTES_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.UNCOMPRESSED_BYTES_COUNTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.COMPRESSION_PERCENTAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.FIRST_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.FIRST_TRANSACTION_COMPRESSED_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.FIRST_TRANSACTION_UNCOMPRESSED_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.FIRST_TRANSACTION_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.LAST_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.LAST_TRANSACTION_COMPRESSED_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.LAST_TRANSACTION_UNCOMPRESSED_BYTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS.LAST_TRANSACTION_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsLogType component1() {
        return getLogType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCompressionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getTransactionCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getCompressedBytesCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getUncompressedBytesCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getCompressionPercentage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFirstTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getFirstTransactionCompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getFirstTransactionUncompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getFirstTransactionTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getLastTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getLastTransactionCompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getLastTransactionUncompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getLastTransactionTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsLogType value1() {
        return getLogType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCompressionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTransactionCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getCompressedBytesCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getUncompressedBytesCounter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getCompressionPercentage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFirstTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getFirstTransactionCompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getFirstTransactionUncompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getFirstTransactionTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLastTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getLastTransactionCompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getLastTransactionUncompressedBytes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getLastTransactionTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value1(BinaryLogTransactionCompressionStatsLogType value) {
        setLogType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value2(String value) {
        setCompressionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value3(ULong value) {
        setTransactionCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value4(ULong value) {
        setCompressedBytesCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value5(ULong value) {
        setUncompressedBytesCounter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value6(Short value) {
        setCompressionPercentage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value7(String value) {
        setFirstTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value8(ULong value) {
        setFirstTransactionCompressedBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value9(ULong value) {
        setFirstTransactionUncompressedBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value10(Timestamp value) {
        setFirstTransactionTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value11(String value) {
        setLastTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value12(ULong value) {
        setLastTransactionCompressedBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value13(ULong value) {
        setLastTransactionUncompressedBytes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord value14(Timestamp value) {
        setLastTransactionTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStatsRecord values(BinaryLogTransactionCompressionStatsLogType value1, String value2, ULong value3, ULong value4, ULong value5, Short value6, String value7, ULong value8, ULong value9, Timestamp value10, String value11, ULong value12, ULong value13, Timestamp value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BinaryLogTransactionCompressionStatsRecord
     */
    public BinaryLogTransactionCompressionStatsRecord() {
        super(BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    /**
     * Create a detached, initialised BinaryLogTransactionCompressionStatsRecord
     */
    public BinaryLogTransactionCompressionStatsRecord(BinaryLogTransactionCompressionStatsLogType logType, String compressionType, ULong transactionCounter, ULong compressedBytesCounter, ULong uncompressedBytesCounter, Short compressionPercentage, String firstTransactionId, ULong firstTransactionCompressedBytes, ULong firstTransactionUncompressedBytes, Timestamp firstTransactionTimestamp, String lastTransactionId, ULong lastTransactionCompressedBytes, ULong lastTransactionUncompressedBytes, Timestamp lastTransactionTimestamp) {
        super(BinaryLogTransactionCompressionStats.BINARY_LOG_TRANSACTION_COMPRESSION_STATS);

        set(0, logType);
        set(1, compressionType);
        set(2, transactionCounter);
        set(3, compressedBytesCounter);
        set(4, uncompressedBytesCounter);
        set(5, compressionPercentage);
        set(6, firstTransactionId);
        set(7, firstTransactionCompressedBytes);
        set(8, firstTransactionUncompressedBytes);
        set(9, firstTransactionTimestamp);
        set(10, lastTransactionId);
        set(11, lastTransactionCompressedBytes);
        set(12, lastTransactionUncompressedBytes);
        set(13, lastTransactionTimestamp);
    }
}