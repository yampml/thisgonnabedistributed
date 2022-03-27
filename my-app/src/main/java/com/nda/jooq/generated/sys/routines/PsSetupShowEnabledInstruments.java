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
 * Shows all currently enabled instruments.
 * 
 * Parameters
 * -----------
 * 
 * None
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_show_enabled_instruments();
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowEnabledInstruments extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 270521707;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowEnabledInstruments() {
        super("ps_setup_show_enabled_instruments", Sys.SYS);
    }
}
