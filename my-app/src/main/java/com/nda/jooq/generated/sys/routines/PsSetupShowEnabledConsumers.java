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
 * Shows all currently enabled consumers.
 * 
 * Parameters
 * -----------
 * 
 * None
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_show_enabled_consumers();
 * 
 * +---------------------------+
 * | enabled_consumers         |
 * +---------------------------+
 * | events_statements_current |
 * | global_instrumentation    |
 * | thread_instrumentation    |
 * | statements_digest         |
 * +---------------------------+
 * 4 rows in set (0.05 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowEnabledConsumers extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1695480713;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowEnabledConsumers() {
        super("ps_setup_show_enabled_consumers", Sys.SYS);
    }
}
