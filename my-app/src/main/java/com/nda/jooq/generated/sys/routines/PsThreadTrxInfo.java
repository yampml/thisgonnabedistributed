/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.routines;


import com.nda.jooq.generated.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.types.ULong;


/**
 * 
 * Description
 * -----------
 * 
 * Returns a JSON object with info on the given threads current transaction, 
 * 
 * and the statements it has already executed, derived from the
 * performance_schema.events_transactions_current and
 * performance_schema.events_statements_history tables (so the consumers 
 * for these also have to be enabled within Performance Schema to get full
 * data in the object).
 * 
 * When the output exceeds the default truncation length (65535), a JSON error
 * object is returned, such as:
 * 
 * { "error": "Trx info truncated: Row 6 was cut by GROUP_CONCAT()" }
 * 
 * Similar error objects are returned for other warnings/and exceptions raised
 * when calling the function.
 * 
 * The max length of the output of this function can be controlled with the
 * ps_thread_trx_info.max_length variable set via sys_config, or the
 * @sys.ps_thread_trx_info.max_length user variable, as appropriate.
 * 
 * Parameters
 * -----------
 * 
 * in_thread_id (BIGINT UNSIGNED):
 *   The id of the thread to return the transaction info for.
 * 
 * Example
 * -----------
 * 
 * SELECT sys.ps_thread_trx_info(48)\G
 * *************************** 1. row ***************************
 * sys.ps_thread_trx_info(48): [
 *   {
 *     "time": "790.70 us",
 *     "state": "COMMITTED",
 *     "mode": "READ WRITE",
 *     "autocommitted": "NO",
 *     "gtid": "AUTOMATIC",
 *     "isolation": "REPEATABLE READ",
 *     "statements_executed": [
 *       {
 *         "sql_text": "INSERT INTO info VALUES (1, 'foo')",
 *         "time": "471.02 us",
 *         "schema": "trx",
 *         "rows_examined": 0,
 *         "rows_affected": 1,
 *         "rows_sent": 0,
 *         "tmp_tables": 0,
 *         "tmp_disk_tables": 0,
 *         "sort_rows": 0,
 *         "sort_merge_passes": 0
 *       },
 *       {
 *         "sql_text": "COMMIT",
 *         "time": "254.42 us",
 *         "schema": "trx",
 *         "rows_examined": 0,
 *         "rows_affected": 0,
 *         "rows_sent": 0,
 *         "tmp_tables": 0,
 *         "tmp_disk_tables": 0,
 *         "sort_rows": 0,
 *         "sort_merge_passes": 0
 *       }
 *     ]
 *   },
 *   {
 *     "time": "426.20 us",
 *     "state": "COMMITTED",
 *     "mode": "READ WRITE",
 *     "autocommitted": "NO",
 *     "gtid": "AUTOMATIC",
 *     "isolation": "REPEATABLE READ",
 *     "statements_executed": [
 *       {
 *         "sql_text": "INSERT INTO info VALUES (2, 'bar')",
 *         "time": "107.33 us",
 *         "schema": "trx",
 *         "rows_examined": 0,
 *         "rows_affected": 1,
 *         "rows_sent": 0,
 *         "tmp_tables": 0,
 *         "tmp_disk_tables": 0,
 *         "sort_rows": 0,
 *         "sort_merge_passes": 0
 *       },
 *       {
 *         "sql_text": "COMMIT",
 *         "time": "213.23 us",
 *         "schema": "trx",
 *         "rows_examined": 0,
 *         "rows_affected": 0,
 *         "rows_sent": 0,
 *         "tmp_tables": 0,
 *         "tmp_disk_tables": 0,
 *         "sort_rows": 0,
 *         "sort_merge_passes": 0
 *       }
 *     ]
 *   }
 * ]
 * 1 row in set (0.03 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsThreadTrxInfo extends AbstractRoutine<String> {

    private static final long serialVersionUID = -251696766;

    /**
     * The parameter <code>sys.ps_thread_trx_info.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.ps_thread_trx_info.in_thread_id</code>.
     */
    public static final Parameter<ULong> IN_THREAD_ID = createParameter("in_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, false, false);

    /**
     * Create a new routine call instance
     */
    public PsThreadTrxInfo() {
        super("ps_thread_trx_info", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_THREAD_ID);
    }

    /**
     * Set the <code>in_thread_id</code> parameter IN value to the routine
     */
    public void setInThreadId(ULong value) {
        setValue(IN_THREAD_ID, value);
    }

    /**
     * Set the <code>in_thread_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInThreadId(Field<ULong> field) {
        setField(IN_THREAD_ID, field);
    }
}
