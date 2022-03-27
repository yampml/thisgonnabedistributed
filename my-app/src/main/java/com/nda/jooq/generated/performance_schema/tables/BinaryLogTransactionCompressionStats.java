/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.performance_schema.tables;


import com.nda.jooq.generated.performance_schema.PerformanceSchema;
import com.nda.jooq.generated.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType;
import com.nda.jooq.generated.performance_schema.tables.records.BinaryLogTransactionCompressionStatsRecord;

import java.sql.Timestamp;

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
public class BinaryLogTransactionCompressionStats extends TableImpl<BinaryLogTransactionCompressionStatsRecord> {

    private static final long serialVersionUID = -36201522;

    /**
     * The reference instance of <code>performance_schema.binary_log_transaction_compression_stats</code>
     */
    public static final BinaryLogTransactionCompressionStats BINARY_LOG_TRANSACTION_COMPRESSION_STATS = new BinaryLogTransactionCompressionStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BinaryLogTransactionCompressionStatsRecord> getRecordType() {
        return BinaryLogTransactionCompressionStatsRecord.class;
    }

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.LOG_TYPE</code>. The log type to which the transactions were written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, BinaryLogTransactionCompressionStatsLogType> LOG_TYPE = createField("LOG_TYPE", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(com.nda.jooq.generated.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType.class), this, "The log type to which the transactions were written.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_TYPE</code>. The transaction compression algorithm used.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> COMPRESSION_TYPE = createField("COMPRESSION_TYPE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "The transaction compression algorithm used.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.TRANSACTION_COUNTER</code>. Number of transactions written to the log
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> TRANSACTION_COUNTER = createField("TRANSACTION_COUNTER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Number of transactions written to the log");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER</code>. The total number of bytes compressed.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> COMPRESSED_BYTES_COUNTER = createField("COMPRESSED_BYTES_COUNTER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes compressed.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER</code>. The total number of bytes uncompressed.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> UNCOMPRESSED_BYTES_COUNTER = createField("UNCOMPRESSED_BYTES_COUNTER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes uncompressed.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE</code>. The compression ratio as a percentage.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, Short> COMPRESSION_PERCENTAGE = createField("COMPRESSION_PERCENTAGE", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "The compression ratio as a percentage.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID</code>. The first transaction written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> FIRST_TRANSACTION_ID = createField("FIRST_TRANSACTION_ID", org.jooq.impl.SQLDataType.CLOB, this, "The first transaction written.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES</code>. First transaction written compressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> FIRST_TRANSACTION_COMPRESSED_BYTES = createField("FIRST_TRANSACTION_COMPRESSED_BYTES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written compressed bytes.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES</code>. First transaction written uncompressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> FIRST_TRANSACTION_UNCOMPRESSED_BYTES = createField("FIRST_TRANSACTION_UNCOMPRESSED_BYTES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written uncompressed bytes.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP</code>. When the first transaction was written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, Timestamp> FIRST_TRANSACTION_TIMESTAMP = createField("FIRST_TRANSACTION_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "When the first transaction was written.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_ID</code>. The last transaction written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> LAST_TRANSACTION_ID = createField("LAST_TRANSACTION_ID", org.jooq.impl.SQLDataType.CLOB, this, "The last transaction written.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES</code>. Last transaction written compressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> LAST_TRANSACTION_COMPRESSED_BYTES = createField("LAST_TRANSACTION_COMPRESSED_BYTES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written compressed bytes.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES</code>. Last transaction written uncompressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> LAST_TRANSACTION_UNCOMPRESSED_BYTES = createField("LAST_TRANSACTION_UNCOMPRESSED_BYTES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written uncompressed bytes.");

    /**
     * The column <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP</code>. When the last transaction was written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, Timestamp> LAST_TRANSACTION_TIMESTAMP = createField("LAST_TRANSACTION_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "When the last transaction was written.");

    /**
     * Create a <code>performance_schema.binary_log_transaction_compression_stats</code> table reference
     */
    public BinaryLogTransactionCompressionStats() {
        this(DSL.name("binary_log_transaction_compression_stats"), null);
    }

    /**
     * Create an aliased <code>performance_schema.binary_log_transaction_compression_stats</code> table reference
     */
    public BinaryLogTransactionCompressionStats(String alias) {
        this(DSL.name(alias), BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    /**
     * Create an aliased <code>performance_schema.binary_log_transaction_compression_stats</code> table reference
     */
    public BinaryLogTransactionCompressionStats(Name alias) {
        this(alias, BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    private BinaryLogTransactionCompressionStats(Name alias, Table<BinaryLogTransactionCompressionStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BinaryLogTransactionCompressionStats(Name alias, Table<BinaryLogTransactionCompressionStatsRecord> aliased, Field<?>[] parameters) {
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
    public BinaryLogTransactionCompressionStats as(String alias) {
        return new BinaryLogTransactionCompressionStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinaryLogTransactionCompressionStats as(Name alias) {
        return new BinaryLogTransactionCompressionStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BinaryLogTransactionCompressionStats rename(String name) {
        return new BinaryLogTransactionCompressionStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BinaryLogTransactionCompressionStats rename(Name name) {
        return new BinaryLogTransactionCompressionStats(name, null);
    }
}