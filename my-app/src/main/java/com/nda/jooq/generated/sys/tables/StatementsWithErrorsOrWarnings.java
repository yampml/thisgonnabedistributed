/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.tables;


import com.nda.jooq.generated.sys.Sys;
import com.nda.jooq.generated.sys.tables.records.StatementsWithErrorsOrWarningsRecord;

import java.math.BigDecimal;
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
public class StatementsWithErrorsOrWarnings extends TableImpl<StatementsWithErrorsOrWarningsRecord> {

    private static final long serialVersionUID = -2128184049;

    /**
     * The reference instance of <code>sys.statements_with_errors_or_warnings</code>
     */
    public static final StatementsWithErrorsOrWarnings STATEMENTS_WITH_ERRORS_OR_WARNINGS = new StatementsWithErrorsOrWarnings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatementsWithErrorsOrWarningsRecord> getRecordType() {
        return StatementsWithErrorsOrWarningsRecord.class;
    }

    /**
     * The column <code>sys.statements_with_errors_or_warnings.query</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.db</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.exec_count</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.errors</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> ERRORS = createField("errors", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.error_pct</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, BigDecimal> ERROR_PCT = createField("error_pct", org.jooq.impl.SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.warnings</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, ULong> WARNINGS = createField("warnings", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.warning_pct</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, BigDecimal> WARNING_PCT = createField("warning_pct", org.jooq.impl.SQLDataType.DECIMAL(27, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.first_seen</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.last_seen</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>sys.statements_with_errors_or_warnings.digest</code>.
     */
    public final TableField<StatementsWithErrorsOrWarningsRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings() {
        this(DSL.name("statements_with_errors_or_warnings"), null);
    }

    /**
     * Create an aliased <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings(String alias) {
        this(DSL.name(alias), STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    /**
     * Create an aliased <code>sys.statements_with_errors_or_warnings</code> table reference
     */
    public StatementsWithErrorsOrWarnings(Name alias) {
        this(alias, STATEMENTS_WITH_ERRORS_OR_WARNINGS);
    }

    private StatementsWithErrorsOrWarnings(Name alias, Table<StatementsWithErrorsOrWarningsRecord> aliased) {
        this(alias, aliased, null);
    }

    private StatementsWithErrorsOrWarnings(Name alias, Table<StatementsWithErrorsOrWarningsRecord> aliased, Field<?>[] parameters) {
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
    public StatementsWithErrorsOrWarnings as(String alias) {
        return new StatementsWithErrorsOrWarnings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StatementsWithErrorsOrWarnings as(Name alias) {
        return new StatementsWithErrorsOrWarnings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithErrorsOrWarnings rename(String name) {
        return new StatementsWithErrorsOrWarnings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatementsWithErrorsOrWarnings rename(Name name) {
        return new StatementsWithErrorsOrWarnings(name, null);
    }
}
