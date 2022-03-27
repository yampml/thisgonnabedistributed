/*
 * This file is generated by jOOQ.
*/
package com.nda.jooq.generated.sys.routines;


import com.nda.jooq.generated.sys.Sys;

import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 * Description
 * -----------
 * 
 * Enable all background thread instrumentation within Performance Schema.
 * 
 * Parameters
 * -----------
 * 
 * None.
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_enable_background_threads();
 * +-------------------------------+
 * | summary                       |
 * +-------------------------------+
 * | Enabled 18 background threads |
 * +-------------------------------+
 * 1 row in set (0.00 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupEnableBackgroundThreads extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 322976041;

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableBackgroundThreads() {
        super("ps_setup_enable_background_threads", Sys.SYS);
    }
}