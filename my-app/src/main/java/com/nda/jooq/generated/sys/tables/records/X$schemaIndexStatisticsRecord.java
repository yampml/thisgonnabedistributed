/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables.records;


import com.nda.jooq.generated.sys.tables.X$schemaIndexStatistics;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class X$schemaIndexStatisticsRecord extends TableRecordImpl<X$schemaIndexStatisticsRecord> implements Record11<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 590452458;

    /**
     * Setter for <code>sys.x$schema_index_statistics.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.index_name</code>.
     */
    public void setIndexName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.index_name</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.rows_selected</code>.
     */
    public void setRowsSelected(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.rows_selected</code>.
     */
    public ULong getRowsSelected() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.select_latency</code>.
     */
    public void setSelectLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.select_latency</code>.
     */
    public ULong getSelectLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.rows_inserted</code>.
     */
    public void setRowsInserted(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.rows_inserted</code>.
     */
    public ULong getRowsInserted() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.insert_latency</code>.
     */
    public void setInsertLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.insert_latency</code>.
     */
    public ULong getInsertLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.rows_updated</code>.
     */
    public void setRowsUpdated(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.rows_updated</code>.
     */
    public ULong getRowsUpdated() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.update_latency</code>.
     */
    public void setUpdateLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.update_latency</code>.
     */
    public ULong getUpdateLatency() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.rows_deleted</code>.
     */
    public void setRowsDeleted(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.rows_deleted</code>.
     */
    public ULong getRowsDeleted() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$schema_index_statistics.delete_latency</code>.
     */
    public void setDeleteLatency(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$schema_index_statistics.delete_latency</code>.
     */
    public ULong getDeleteLatency() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.ROWS_SELECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.SELECT_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.ROWS_INSERTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.INSERT_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.ROWS_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.UPDATE_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.ROWS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS.DELETE_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getRowsSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getSelectLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getRowsInserted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getInsertLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getRowsUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getUpdateLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getRowsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getDeleteLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getRowsSelected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getSelectLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getRowsInserted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getInsertLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getRowsUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getUpdateLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getRowsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getDeleteLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value1(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value2(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value3(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value4(ULong value) {
        setRowsSelected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value5(ULong value) {
        setSelectLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value6(ULong value) {
        setRowsInserted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value7(ULong value) {
        setInsertLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value8(ULong value) {
        setRowsUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value9(ULong value) {
        setUpdateLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value10(ULong value) {
        setRowsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord value11(ULong value) {
        setDeleteLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaIndexStatisticsRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$schemaIndexStatisticsRecord
     */
    public X$schemaIndexStatisticsRecord() {
        super(X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS);
    }

    /**
     * Create a detached, initialised X$schemaIndexStatisticsRecord
     */
    public X$schemaIndexStatisticsRecord(String tableSchema, String tableName, String indexName, ULong rowsSelected, ULong selectLatency, ULong rowsInserted, ULong insertLatency, ULong rowsUpdated, ULong updateLatency, ULong rowsDeleted, ULong deleteLatency) {
        super(X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS);

        set(0, tableSchema);
        set(1, tableName);
        set(2, indexName);
        set(3, rowsSelected);
        set(4, selectLatency);
        set(5, rowsInserted);
        set(6, insertLatency);
        set(7, rowsUpdated);
        set(8, updateLatency);
        set(9, rowsDeleted);
        set(10, deleteLatency);
    }
}
