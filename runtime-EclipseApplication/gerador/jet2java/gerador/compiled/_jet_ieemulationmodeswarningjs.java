package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_ieemulationmodeswarningjs implements JET2Template {
    private final String templateFile;

    public _jet_ieemulationmodeswarningjs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("// NOTICE!! DO NOT USE ANY OF THIS JAVASCRIPT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("// IT'S JUST JUNK FOR OUR DOCS!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("// ++++++++++++++++++++++++++++++++++++++++++");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("/*!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2014 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under the Creative Commons Attribution 3.0 Unported License. For");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * details, see http://creativecommons.org/licenses/by/3.0/.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("// Intended to prevent false-positive bug reports about Bootstrap not working properly in old versions of IE due to folks testing using IE's unreliable emulation modes.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  'use strict';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function emulatedIEMajorVersion() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var groups = /MSIE ([0-9.]+)/.exec(window.navigator.userAgent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (groups === null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var ieVersionNum = parseInt(groups[1], 10)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var ieMajorVersion = Math.floor(ieVersionNum)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return ieMajorVersion");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function actualNonEmulatedIEMajorVersion() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // Detects the actual version of IE in use, even if it's in an older-IE emulation mode.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // IE JavaScript conditional compilation docs: http://msdn.microsoft.com/en-us/library/ie/121hztk3(v=vs.94).aspx");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // @cc_on docs: http://msdn.microsoft.com/en-us/library/ie/8ka90k2e(v=vs.94).aspx");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var jscriptVersion = new Function('/*@cc_on return @_jscript_version; @*/')() // jshint ignore:line");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (jscriptVersion === undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return 11 // IE11+ not in emulation mode");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (jscriptVersion < 9) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return 8 // IE8 (or lower; haven't tested on IE<8)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return jscriptVersion // IE9 or IE10 in any mode, or IE11 in non-IE11 mode");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var ua = window.navigator.userAgent");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  if (ua.indexOf('Opera') > -1 || ua.indexOf('Presto') > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return // Opera, which might pretend to be IE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var emulated = emulatedIEMajorVersion()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  if (emulated === null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return // Not IE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var nonEmulated = actualNonEmulatedIEMajorVersion()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  if (emulated !== nonEmulated) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    window.alert('WARNING: You appear to be using IE' + nonEmulated + ' in IE' + emulated + ' emulation mode.\\nIE emulation modes can behave significantly differently from ACTUAL older versions of IE.\\nPLEASE DON\\'T FILE BOOTSTRAP BUGS based on testing in IE emulation modes!')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("})();");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
