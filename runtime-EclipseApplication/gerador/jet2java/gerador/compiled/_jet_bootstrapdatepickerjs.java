package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_bootstrapdatepickerjs implements JET2Template {
    private final String templateFile;

    public _jet_bootstrapdatepickerjs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("/*!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Datepicker for Bootstrap v1.4.0 (https://github.com/eternicode/bootstrap-datepicker)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2012 Stefan Petre");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Improvements by Andrew Rowls");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under the Apache License v2.0 (http://www.apache.org/licenses/LICENSE-2.0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */(function($, undefined){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tfunction UTCDate(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn new Date(Date.UTC.apply(Date, arguments));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction UTCToday(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar today = new Date();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn UTCDate(today.getFullYear(), today.getMonth(), today.getDate());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction isUTCEquals(date1, date2) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate1.getUTCFullYear() === date2.getUTCFullYear() &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate1.getUTCMonth() === date2.getUTCMonth() &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate1.getUTCDate() === date2.getUTCDate()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction alias(method){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this[method].apply(this, arguments);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar DateArray = (function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar extras = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tget: function(i){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn this.slice(i)[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcontains: function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Array.indexOf is not cross-browser;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// $.inArray doesn't work with Dates");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar val = d && d.valueOf();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (var i=0, l=this.length; i < l; i++)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this[i].valueOf() === val)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn i;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tremove: function(i){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.splice(i,1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treplace: function(new_array){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!new_array)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!$.isArray(new_array))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tnew_array = [new_array];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.clear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.push.apply(this, new_array);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tclear: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.length = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcopy: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar a = new DateArray();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ta.replace(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar a = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ta.push.apply(a, arguments);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$.extend(a, extras);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t})();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\t// Picker object");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar Datepicker = function(element, options){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._process_options(options);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.dates = new DateArray();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.viewDate = this.o.defaultViewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.focusDate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.element = $(element);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.isInline = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.isInput = this.element.is('input');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.component = this.element.hasClass('date') ? this.element.find('.add-on, .input-group-addon, .btn') : false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.hasInput = this.component && this.element.find('input').length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (this.component && this.component.length === 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.component = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.picker = $(DPGlobal.template);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._buildEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis._attachEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (this.isInline){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.addClass('datepicker-inline').appendTo(this.element);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.addClass('datepicker-dropdown dropdown-menu');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (this.o.rtl){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.addClass('datepicker-rtl');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.viewMode = this.o.startView;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (this.o.calendarWeeks)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('tfoot .today, tfoot .clear')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.attr('colspan', function(i, val){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\treturn parseInt(val) + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis._allow_update = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.setStartDate(this._o.startDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.setEndDate(this._o.endDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.setDaysOfWeekDisabled(this.o.daysOfWeekDisabled);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.setDatesDisabled(this.o.datesDisabled);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.fillDow();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.fillMonths();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis._allow_update = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.showMode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tif (this.isInline){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tDatepicker.prototype = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tconstructor: Datepicker,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t_process_options: function(opts){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Store raw options for reference");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._o = $.extend({}, this._o, opts);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Processed options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar o = this.o = $.extend({}, this._o);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t// Check if \"de-DE\" style date is available, if not language should");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// fallback to 2 letter code eg \"de\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar lang = o.language;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!dates[lang]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tlang = lang.split('-')[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!dates[lang])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tlang = defaults.language;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.language = lang;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tswitch (o.startView){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 2:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 'decade':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.startView = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 1:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 'year':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.startView = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdefault:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.startView = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tswitch (o.minViewMode){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 1:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 'months':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.minViewMode = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 2:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 'years':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.minViewMode = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdefault:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.minViewMode = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\to.startView = Math.max(o.startView, o.minViewMode);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t// true, false, or Number > 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (o.multidate !== true){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.multidate = Number(o.multidate) || false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (o.multidate !== false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.multidate = Math.max(0, o.multidate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.multidateSeparator = String(o.multidateSeparator);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\to.weekStart %= 7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.weekEnd = ((o.weekStart + 6) % 7);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar format = DPGlobal.parseFormat(o.format);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (o.startDate !== -Infinity){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!!o.startDate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (o.startDate instanceof Date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.startDate = this._local_to_utc(this._zero_time(o.startDate));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.startDate = DPGlobal.parseDate(o.startDate, format, o.language);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.startDate = -Infinity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (o.endDate !== Infinity){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!!o.endDate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (o.endDate instanceof Date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.endDate = this._local_to_utc(this._zero_time(o.endDate));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.endDate = DPGlobal.parseDate(o.endDate, format, o.language);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\to.endDate = Infinity;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\to.daysOfWeekDisabled = o.daysOfWeekDisabled||[];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!$.isArray(o.daysOfWeekDisabled))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.daysOfWeekDisabled = o.daysOfWeekDisabled.split(/[,\\s]*/);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.daysOfWeekDisabled = $.map(o.daysOfWeekDisabled, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn parseInt(d, 10);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\to.datesDisabled = o.datesDisabled||[];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!$.isArray(o.datesDisabled)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar datesDisabled = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdatesDisabled.push(DPGlobal.parseDate(o.datesDisabled, format, o.language));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.datesDisabled = datesDisabled;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.datesDisabled = $.map(o.datesDisabled,function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn DPGlobal.parseDate(d, format, o.language);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar plc = String(o.orientation).toLowerCase().split(/\\s+/g),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t_plc = o.orientation.toLowerCase();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tplc = $.grep(plc, function(word){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn /^auto|left|right|top|bottom$/.test(word);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.orientation = {x: 'auto', y: 'auto'};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!_plc || _plc === 'auto')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t; // no action");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (plc.length === 1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tswitch (plc[0]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'top':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'bottom':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.orientation.y = plc[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'left':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'right':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\to.orientation.x = plc[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t_plc = $.grep(plc, function(word){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn /^left|right$/.test(word);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.orientation.x = _plc[0] || 'auto';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t_plc = $.grep(plc, function(word){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn /^top|bottom$/.test(word);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.orientation.y = _plc[0] || 'auto';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (o.defaultViewDate) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar year = o.defaultViewDate.year || new Date().getFullYear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar month = o.defaultViewDate.month || 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar day = o.defaultViewDate.day || 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.defaultViewDate = UTCDate(year, month, day);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\to.defaultViewDate = UTCToday();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\to.showOnFocus = o.showOnFocus !== undefined ? o.showOnFocus : true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_events: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_secondaryEvents: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_applyEvents: function(evs){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (var i=0, el, ch, ev; i < evs.length; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tel = evs[i][0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (evs[i].length === 2){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tch = undefined;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tev = evs[i][1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse if (evs[i].length === 3){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tch = evs[i][1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tev = evs[i][2];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tel.on(ev, ch);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_unapplyEvents: function(evs){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (var i=0, el, ev, ch; i < evs.length; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tel = evs[i][0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (evs[i].length === 2){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tch = undefined;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tev = evs[i][1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse if (evs[i].length === 3){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tch = evs[i][1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tev = evs[i][2];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tel.off(ev, ch);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_buildEvents: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var events = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                keyup: $.proxy(function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if ($.inArray(e.keyCode, [27, 37, 39, 38, 40, 32, 13, 9]) === -1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        this.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }, this),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                keydown: $.proxy(this.keydown, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (this.o.showOnFocus === true) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                events.focus = $.proxy(this.show, this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (this.isInput) { // single input");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this._events = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    [this.element, events]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            else if (this.component && this.hasInput) { // component: input + button");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this._events = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    // For components that are not readonly, allow keyboard nav");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    [this.element.find('input'), events],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    [this.component, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        click: $.proxy(this.show, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (this.element.is('div')){  // inline datepicker");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.isInline = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis._events = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t[this.element, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tclick: $.proxy(this.show, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._events.push(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Component: listen for blur on element descendants");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t[this.element, '*', {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tblur: $.proxy(function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._focused_from = e.target;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Input: listen for blur on element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t[this.element, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tblur: $.proxy(function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._focused_from = e.target;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis._secondaryEvents = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t[this.picker, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tclick: $.proxy(this.click, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t[$(window), {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tresize: $.proxy(this.place, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t[$(document), {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t'mousedown touchstart': $.proxy(function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t// Clicked outside the datepicker, hide it");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (!(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.element.is(e.target) ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.element.find(e.target).length ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.picker.is(e.target) ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.picker.find(e.target).length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_attachEvents: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._detachEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._applyEvents(this._events);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_detachEvents: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._unapplyEvents(this._events);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_attachSecondaryEvents: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._detachSecondaryEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._applyEvents(this._secondaryEvents);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_detachSecondaryEvents: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._unapplyEvents(this._secondaryEvents);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_trigger: function(event, altdate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar date = altdate || this.dates.get(-1),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tlocal_date = this._utc_to_local(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis.element.trigger({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttype: event,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate: local_date,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdates: $.map(this.dates, this._utc_to_local),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tformat: $.proxy(function(ix, format){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (arguments.length === 0){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tix = this.dates.length - 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tformat = this.o.format;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse if (typeof ix === 'string'){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tformat = ix;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tix = this.dates.length - 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tformat = format || this.o.format;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tvar date = this.dates.get(ix);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn DPGlobal.formatDate(date, format, this.o.language);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tshow: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.element.attr('readonly') && this.o.enableOnReadonly === false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.isInline)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.picker.appendTo(this.o.container);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.place();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._attachSecondaryEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._trigger('show');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif ((window.navigator.msMaxTouchPoints || 'ontouchstart' in document) && this.o.disableTouchKeyboard) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$(this.element).blur();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\thide: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.isInline)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.picker.is(':visible'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.focusDate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.hide().detach();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._detachSecondaryEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.viewMode = this.o.startView;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.showMode();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.o.forceParse &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.isInput && this.element.val() ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.hasInput && this.element.find('input').val()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._trigger('hide');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tremove: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._detachEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._detachSecondaryEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdelete this.element.data().datepicker;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.isInput){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdelete this.element.data().date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t_utc_to_local: function(utc){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn utc && new Date(utc.getTime() + (utc.getTimezoneOffset()*60000));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_local_to_utc: function(local){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn local && new Date(local.getTime() - (local.getTimezoneOffset()*60000));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_zero_time: function(local){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn local && new Date(local.getFullYear(), local.getMonth(), local.getDate());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t_zero_utc_time: function(utc){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn utc && new Date(Date.UTC(utc.getUTCFullYear(), utc.getUTCMonth(), utc.getUTCDate()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $.map(this.dates, this._utc_to_local);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetUTCDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $.map(this.dates, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn new Date(d);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetDate: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this._utc_to_local(this.getUTCDate());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetUTCDate: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar selected_date = this.dates.get(-1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (typeof selected_date !== 'undefined') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn new Date(selected_date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tclearDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.isInput) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement = this.element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else if (this.component) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement = this.element.find('input');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement.val('').change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.o.autoclose) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar args = $.isArray(arguments[0]) ? arguments[0] : arguments;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update.apply(this, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetUTCDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar args = $.isArray(arguments[0]) ? arguments[0] : arguments;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update.apply(this, $.map(args, this._utc_to_local));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetDate: alias('setDates'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetUTCDate: alias('setUTCDates'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetValue: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar formatted = this.getFormattedDate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.isInput){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (this.component){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.element.find('input').val(formatted).change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.element.val(formatted).change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetFormattedDate: function(format){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (format === undefined)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tformat = this.o.format;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar lang = this.o.language;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $.map(this.dates, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn DPGlobal.formatDate(d, format, lang);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}).join(this.o.multidateSeparator);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetStartDate: function(startDate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._process_options({startDate: startDate});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetEndDate: function(endDate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._process_options({endDate: endDate});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetDaysOfWeekDisabled: function(daysOfWeekDisabled){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._process_options({daysOfWeekDisabled: daysOfWeekDisabled});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetDatesDisabled: function(datesDisabled){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis._process_options({datesDisabled: datesDisabled});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.update();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tplace: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.isInline)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar calendarWidth = this.picker.outerWidth(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcalendarHeight = this.picker.outerHeight(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvisualPadding = 10,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twindowWidth = $(this.o.container).width(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twindowHeight = $(this.o.container).height(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tscrollTop = $(this.o.container).scrollTop(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tappendOffset = $(this.o.container).offset();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar parentsZindex = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.element.parents().each(function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar itemZIndex = $(this).css('z-index');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (itemZIndex !== 'auto' && itemZIndex !== 0) parentsZindex.push(parseInt(itemZIndex));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar zIndex = Math.max.apply(Math, parentsZindex) + 10;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar offset = this.component ? this.component.parent().offset() : this.element.offset();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar height = this.component ? this.component.outerHeight(true) : this.element.outerHeight(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar width = this.component ? this.component.outerWidth(true) : this.element.outerWidth(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar left = offset.left - appendOffset.left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttop = offset.top - appendOffset.top;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis.picker.removeClass(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t'datepicker-orient-top datepicker-orient-bottom '+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t'datepicker-orient-right datepicker-orient-left'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.o.orientation.x !== 'auto'){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.picker.addClass('datepicker-orient-' + this.o.orientation.x);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (this.o.orientation.x === 'right')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tleft -= calendarWidth - width;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// auto x orientation is best-placement: if it crosses a window");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// edge, fudge it sideways");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (offset.left < 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// component is outside the window on the left side. Move it into visible range");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.picker.addClass('datepicker-orient-left');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tleft -= offset.left - visualPadding;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t} else if (left + calendarWidth > windowWidth) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// the calendar passes the widow right edge. Align it to component right side");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.picker.addClass('datepicker-orient-right');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tleft = offset.left + width - calendarWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// Default to left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.picker.addClass('datepicker-orient-left');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t// auto y orientation is best-situation: top or bottom, no fudging,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// decision based on which shows more of the calendar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar yorient = this.o.orientation.y,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttop_overflow, bottom_overflow;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (yorient === 'auto'){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttop_overflow = -scrollTop + top - calendarHeight;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tbottom_overflow = scrollTop + windowHeight - (top + height + calendarHeight);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (Math.max(top_overflow, bottom_overflow) === bottom_overflow)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tyorient = 'top';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tyorient = 'bottom';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.addClass('datepicker-orient-' + yorient);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (yorient === 'top')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttop += height;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttop -= calendarHeight + parseInt(this.picker.css('padding-top'));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.o.rtl) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar right = windowWidth - (left + width);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.picker.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\ttop: top,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tright: right,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tzIndex: zIndex");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.picker.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\ttop: top,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tleft: left,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tzIndex: zIndex");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t_allow_update: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdate: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this._allow_update)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar oldDates = this.dates.copy(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdates = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfromArgs = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (arguments.length){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$.each(arguments, $.proxy(function(i, date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (date instanceof Date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tdate = this._local_to_utc(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdates.push(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfromArgs = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdates = this.isInput");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t? this.element.val()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t: this.element.data('date') || this.element.find('input').val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (dates && this.o.multidate)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdates = dates.split(this.o.multidateSeparator);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdates = [dates];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdelete this.element.data().date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tdates = $.map(dates, $.proxy(function(date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn DPGlobal.parseDate(date, this.o.format, this.o.language);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdates = $.grep(dates, $.proxy(function(date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn (");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdate < this.o.startDate ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdate > this.o.endDate ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t!date");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}, this), true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.dates.replace(dates);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.dates.length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.viewDate = new Date(this.dates.get(-1));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (this.viewDate < this.o.startDate)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.viewDate = new Date(this.o.startDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (this.viewDate > this.o.endDate)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.viewDate = new Date(this.o.endDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (fromArgs){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// setting date by clicking");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (dates.length){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// setting date by typing");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (String(oldDates) !== String(this.dates))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.dates.length && oldDates.length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis._trigger('clearDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfillDow: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar dowCnt = this.o.weekStart,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml = '<tr>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.o.calendarWeeks){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.picker.find('.datepicker-days thead tr:first-child .datepicker-switch')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t.attr('colspan', function(i, val){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn parseInt(val) + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar cell = '<th class=\"cw\">&#160;</th>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml += cell;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile (dowCnt < this.o.weekStart + 7){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml += '<th class=\"dow\">'+dates[this.o.language].daysMin[(dowCnt++)%7]+'</th>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\thtml += '</tr>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('.datepicker-days thead').append(html);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfillMonths: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar html = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ti = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile (i < 12){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml += '<span class=\"month\">'+dates[this.o.language].monthsShort[i++]+'</span>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('.datepicker-months td').html(html);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tsetRange: function(range){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!range || !range.length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdelete this.range;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.range = $.map(range, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn d.valueOf();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tgetClassNames: function(date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar cls = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyear = this.viewDate.getUTCFullYear(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonth = this.viewDate.getUTCMonth(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttoday = new Date();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (date.getUTCFullYear() < year || (date.getUTCFullYear() === year && date.getUTCMonth() < month)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('old');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (date.getUTCFullYear() > year || (date.getUTCFullYear() === year && date.getUTCMonth() > month)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('new');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.focusDate && date.valueOf() === this.focusDate.valueOf())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('focused');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Compare internal UTC date with local today, not UTC today");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.o.todayHighlight &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate.getUTCFullYear() === today.getFullYear() &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate.getUTCMonth() === today.getMonth() &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate.getUTCDate() === today.getDate()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('today');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.dates.contains(date) !== -1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('active');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (date.valueOf() < this.o.startDate || date.valueOf() > this.o.endDate ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$.inArray(date.getUTCDay(), this.o.daysOfWeekDisabled) !== -1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.o.datesDisabled.length > 0 &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$.grep(this.o.datesDisabled, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn isUTCEquals(date, d); }).length > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcls.push('disabled', 'disabled-date');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.range){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (date > this.range[0] && date < this.range[this.range.length-1]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcls.push('range');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif ($.inArray(date.valueOf(), this.range) !== -1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcls.push('selected');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn cls;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tfill: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar d = new Date(this.viewDate),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyear = d.getUTCFullYear(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonth = d.getUTCMonth(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tstartYear = this.o.startDate !== -Infinity ? this.o.startDate.getUTCFullYear() : -Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tstartMonth = this.o.startDate !== -Infinity ? this.o.startDate.getUTCMonth() : -Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tendYear = this.o.endDate !== Infinity ? this.o.endDate.getUTCFullYear() : Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tendMonth = this.o.endDate !== Infinity ? this.o.endDate.getUTCMonth() : Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttodaytxt = dates[this.o.language].today || dates['en'].today || '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcleartxt = dates[this.o.language].clear || dates['en'].clear || '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttooltip;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (isNaN(year) || isNaN(month))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('.datepicker-days thead .datepicker-switch')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.text(dates[this.o.language].months[month]+' '+year);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('tfoot .today')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.text(todaytxt)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.toggle(this.o.todayBtn !== false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('tfoot .clear')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.text(cleartxt)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.toggle(this.o.clearBtn !== false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.fillMonths();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar prevMonth = UTCDate(year, month-1, 28),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tday = DPGlobal.getDaysInMonth(prevMonth.getUTCFullYear(), prevMonth.getUTCMonth());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tprevMonth.setUTCDate(day);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tprevMonth.setUTCDate(day - (prevMonth.getUTCDay() - this.o.weekStart + 7)%7);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar nextMonth = new Date(prevMonth);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tnextMonth.setUTCDate(nextMonth.getUTCDate() + 42);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tnextMonth = nextMonth.valueOf();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar html = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar clsName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile (prevMonth.valueOf() < nextMonth){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (prevMonth.getUTCDay() === this.o.weekStart){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\thtml.push('<tr>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.calendarWeeks){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t// ISO 8601: First week contains first thursday.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t// ISO also states week starts on Monday, but we can be more abstract here.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tvar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t// Start of current week: based on weekstart/current date");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tws = new Date(+prevMonth + (this.o.weekStart - prevMonth.getUTCDay() - 7) % 7 * 864e5),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t// Thursday of this week");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tth = new Date(Number(ws) + (7 + 4 - ws.getUTCDay()) % 7 * 864e5),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t// First Thursday of year, year from thursday");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tyth = new Date(Number(yth = UTCDate(th.getUTCFullYear(), 0, 1)) + (7 + 4 - yth.getUTCDay())%7*864e5),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t// Calendar week: ms between thursdays, div ms per day, div 7 days");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcalWeek =  (th - yth) / 864e5 / 7 + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\thtml.push('<td class=\"cw\">'+ calWeek +'</td>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclsName = this.getClassNames(prevMonth);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclsName.push('day');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\tif (this.o.beforeShowDay !== $.noop){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tvar before = this.o.beforeShowDay(this._utc_to_local(prevMonth));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (before === undefined)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbefore = {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse if (typeof(before) === 'boolean')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbefore = {enabled: before};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse if (typeof(before) === 'string')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbefore = {classes: before};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (before.enabled === false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tclsName.push('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (before.classes)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tclsName = clsName.concat(before.classes.split(/\\s+/));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (before.tooltip)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\ttooltip = before.tooltip;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\tclsName = $.unique(clsName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml.push('<td class=\"'+clsName.join(' ')+'\"' + (tooltip ? ' title=\"'+tooltip+'\"' : '') + '>'+prevMonth.getUTCDate() + '</td>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttooltip = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (prevMonth.getUTCDay() === this.o.weekEnd){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\thtml.push('</tr>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tprevMonth.setUTCDate(prevMonth.getUTCDate()+1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker.find('.datepicker-days tbody').empty().append(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar months = this.picker.find('.datepicker-months')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.find('th:eq(1)')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t.text(year)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t.end()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t.find('span').removeClass('active');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t$.each(this.dates, function(i, d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (d.getUTCFullYear() === year)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tmonths.eq(d.getUTCMonth()).addClass('active');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (year < startYear || year > endYear){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonths.addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (year === startYear){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonths.slice(0, startMonth).addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (year === endYear){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonths.slice(endMonth+1).addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (this.o.beforeShowMonth !== $.noop){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$.each(months, function(i, month){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (!$(month).hasClass('disabled')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tvar moDate = new Date(year, i, 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tvar before = that.o.beforeShowMonth(moDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (before === false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t$(month).addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\thtml = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tyear = parseInt(year/10, 10) * 10;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar yearCont = this.picker.find('.datepicker-years')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t.find('th:eq(1)')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t.text(year + '-' + (year + 9))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t.end()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t.find('td');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tyear -= 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar years = $.map(this.dates, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn d.getUTCFullYear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclasses;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (var i = -1; i < 11; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclasses = ['year'];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (i === -1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tclasses.push('old');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse if (i === 10)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tclasses.push('new');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif ($.inArray(year, years) !== -1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tclasses.push('active');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (year < startYear || year > endYear)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tclasses.push('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\thtml += '<span class=\"' + classes.join(' ') + '\">' + year + '</span>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyear += 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tyearCont.html(html);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tupdateNavArrows: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this._allow_update)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar d = new Date(this.viewDate),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyear = d.getUTCFullYear(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonth = d.getUTCMonth();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tswitch (this.viewMode){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 0:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.startDate !== -Infinity && year <= this.o.startDate.getUTCFullYear() && month <= this.o.startDate.getUTCMonth()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.prev').css({visibility: 'hidden'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.prev').css({visibility: 'visible'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.endDate !== Infinity && year >= this.o.endDate.getUTCFullYear() && month >= this.o.endDate.getUTCMonth()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.next').css({visibility: 'hidden'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.next').css({visibility: 'visible'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 1:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 2:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.startDate !== -Infinity && year <= this.o.startDate.getUTCFullYear()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.prev').css({visibility: 'hidden'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.prev').css({visibility: 'visible'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.endDate !== Infinity && year >= this.o.endDate.getUTCFullYear()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.next').css({visibility: 'hidden'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.picker.find('.next').css({visibility: 'visible'});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tclick: function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar target = $(e.target).closest('span, td, th'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyear, month, day;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (target.length === 1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tswitch (target[0].nodeName.toLowerCase()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'th':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tswitch (target[0].className){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'datepicker-switch':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.showMode(1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'prev':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'next':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tvar dir = DPGlobal.modes[this.viewMode].navStep * (target[0].className === 'prev' ? -1 : 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tswitch (this.viewMode){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tcase 0:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tthis.viewDate = this.moveMonth(this.viewDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tthis._trigger('changeMonth', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tcase 1:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tcase 2:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tthis.viewDate = this.moveYear(this.viewDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tif (this.viewMode === 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\t\tthis._trigger('changeYear', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'today':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tvar date = new Date();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tdate = UTCDate(date.getFullYear(), date.getMonth(), date.getDate(), 0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.showMode(-2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tvar which = this.o.todayBtn === 'linked' ? null : 'view';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis._setDate(date, which);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'clear':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.clearDates();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'span':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (!target.hasClass('disabled')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.viewDate.setUTCDate(1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tif (target.hasClass('month')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tday = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tmonth = target.parent().find('span').index(target);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tyear = this.viewDate.getUTCFullYear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.viewDate.setUTCMonth(month);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis._trigger('changeMonth', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tif (this.o.minViewMode === 1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tthis._setDate(UTCDate(year, month, day));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tday = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tmonth = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tyear = parseInt(target.text(), 10)||0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis.viewDate.setUTCFullYear(year);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tthis._trigger('changeYear', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tif (this.o.minViewMode === 2){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tthis._setDate(UTCDate(year, month, day));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.showMode(-1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tcase 'td':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (target.hasClass('day') && !target.hasClass('disabled')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tday = parseInt(target.text(), 10)||1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tyear = this.viewDate.getUTCFullYear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tmonth = this.viewDate.getUTCMonth();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tif (target.hasClass('old')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tif (month === 0){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tmonth = 11;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tyear -= 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tmonth -= 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\telse if (target.hasClass('new')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tif (month === 11){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tmonth = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tyear += 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tmonth += 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis._setDate(UTCDate(year, month, day));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.picker.is(':visible') && this._focused_from){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t$(this._focused_from).focus();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdelete this._focused_from;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t_toggle_multidate: function(date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar ix = this.dates.contains(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.dates.clear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (ix !== -1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (this.o.multidate === true || this.o.multidate > 1 || this.o.toggleActive){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.dates.remove(ix);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t} else if (this.o.multidate === false) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.dates.clear();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.dates.push(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.dates.push(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (typeof this.o.multidate === 'number')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twhile (this.dates.length > this.o.multidate)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.dates.remove(0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t_setDate: function(date, which){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!which || which === 'date')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis._toggle_multidate(date && new Date(date));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!which || which  === 'view')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.viewDate = date && new Date(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!which || which  !== 'view') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.isInput){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement = this.element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (this.component){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement = this.element.find('input');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (element){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telement.change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.o.autoclose && (!which || which === 'date')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tmoveMonth: function(date, dir){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn undefined;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!dir)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar new_date = new Date(date.valueOf()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tday = new_date.getUTCDate(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmonth = new_date.getUTCMonth(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmag = Math.abs(dir),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_month, test;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdir = dir > 0 ? 1 : -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (mag === 1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttest = dir === -1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// If going back one month, make sure month is not current month");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// (eg, Mar 31 -> Feb 31 == Feb 28, not Mar 02)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t? function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn new_date.getUTCMonth() === month;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// If going forward one month, make sure month is as expected");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// (eg, Jan 31 -> Feb 31 == Feb 28, not Mar 02)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn new_date.getUTCMonth() !== new_month;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_month = month + dir;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_date.setUTCMonth(new_month);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Dec -> Jan (12) or Jan -> Dec (-1) -- limit expected date to 0-11");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (new_month < 0 || new_month > 11)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tnew_month = (new_month + 12) % 12;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// For magnitudes >1, move one month at a time...");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (var i=0; i < mag; i++)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// ...which might decrease the day (eg, Jan 31 to Feb 28, etc)...");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tnew_date = this.moveMonth(new_date, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// ...then reset the day, keeping it in the new month");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_month = new_date.getUTCMonth();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_date.setUTCDate(day);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ttest = function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn new_month !== new_date.getUTCMonth();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Common date-resetting loop -- if date is beyond end of month, make it");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// end of month");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twhile (test()){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_date.setUTCDate(--day);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_date.setUTCMonth(new_month);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn new_date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tmoveYear: function(date, dir){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this.moveMonth(date, dir*12);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tdateWithinRange: function(date){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn date >= this.o.startDate && date <= this.o.endDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tkeydown: function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!this.picker.is(':visible')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (e.keyCode === 27) // allow escape to hide and re-show picker");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar dateChanged = false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdir, newDate, newViewDate,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfocusDate = this.focusDate || this.viewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tswitch (e.keyCode){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 27: // escape");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.focusDate){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.focusDate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.viewDate = this.dates.get(-1) || this.viewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 37: // left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 39: // right");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (!this.o.keyboardNavigation)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdir = e.keyCode === 37 ? -1 : 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (e.ctrlKey){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = this.moveYear(this.dates.get(-1) || UTCToday(), dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = this.moveYear(focusDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._trigger('changeYear', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse if (e.shiftKey){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = this.moveMonth(this.dates.get(-1) || UTCToday(), dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = this.moveMonth(focusDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._trigger('changeMonth', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = new Date(this.dates.get(-1) || UTCToday());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate.setUTCDate(newDate.getUTCDate() + dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = new Date(focusDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate.setUTCDate(focusDate.getUTCDate() + dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.dateWithinRange(newViewDate)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.focusDate = this.viewDate = newViewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 38: // up");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 40: // down");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (!this.o.keyboardNavigation)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdir = e.keyCode === 38 ? -1 : 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (e.ctrlKey){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = this.moveYear(this.dates.get(-1) || UTCToday(), dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = this.moveYear(focusDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._trigger('changeYear', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse if (e.shiftKey){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = this.moveMonth(this.dates.get(-1) || UTCToday(), dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = this.moveMonth(focusDate, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._trigger('changeMonth', this.viewDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate = new Date(this.dates.get(-1) || UTCToday());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewDate.setUTCDate(newDate.getUTCDate() + dir * 7);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate = new Date(focusDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tnewViewDate.setUTCDate(focusDate.getUTCDate() + dir * 7);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.dateWithinRange(newViewDate)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.focusDate = this.viewDate = newViewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 32: // spacebar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// Spacebar is used in manually typing dates in some formats.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// As such, its behavior should not be hijacked.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 13: // enter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tfocusDate = this.focusDate || this.dates.get(-1) || this.viewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.o.keyboardNavigation) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tthis._toggle_multidate(focusDate);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tdateChanged = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.focusDate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.viewDate = this.dates.get(-1) || this.viewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.setValue();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (this.picker.is(':visible')){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (typeof e.stopPropagation === 'function') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\te.stopPropagation(); // All modern browsers, IE9+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\te.cancelBubble = true; // IE6,7,8 ignore \"stopPropagation\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (this.o.autoclose)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tcase 9: // tab");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.focusDate = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.viewDate = this.dates.get(-1) || this.viewDate;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.fill();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (dateChanged){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (this.dates.length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis._trigger('changeDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis._trigger('clearDate');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (this.isInput){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telement = this.element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse if (this.component){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telement = this.element.find('input');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (element){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\telement.change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tshowMode: function(dir){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (dir){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthis.viewMode = Math.max(this.o.minViewMode, Math.min(2, this.viewMode + dir));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.picker");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t.children('div')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t.filter('.datepicker-' + DPGlobal.modes[this.viewMode].clsName)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t.css('display', 'block');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateNavArrows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar DateRangePicker = function(element, options){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.element = $(element);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.inputs = $.map(options.inputs, function(i){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn i.jquery ? i[0] : i;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdelete options.inputs;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tdatepickerPlugin.call($(this.inputs), options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t.bind('changeDate', $.proxy(this.dateUpdated, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tthis.pickers = $.map(this.inputs, function(i){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn $(i).data('datepicker');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.updateDates();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDateRangePicker.prototype = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdateDates: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.dates = $.map(this.pickers, function(i){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn i.getUTCDate();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateRanges();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tupdateRanges: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar range = $.map(this.dates, function(d){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn d.valueOf();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$.each(this.pickers, function(i, p){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tp.setRange(range);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdateUpdated: function(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// `this.updating` is a workaround for preventing infinite recursion");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// between `changeDate` triggering and `setUTCDate` calling.  Until");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// there is a better mechanism.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (this.updating)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updating = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tvar dp = $(e.target).data('datepicker'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnew_date = dp.getUTCDate(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\ti = $.inArray(e.target, this.inputs),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tj = i - 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tk = i + 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tl = this.inputs.length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (i === -1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\t$.each(this.pickers, function(i, p){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (!p.getUTCDate())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tp.setUTCDate(new_date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tif (new_date < this.dates[j]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Date being moved earlier/left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twhile (j >= 0 && new_date < this.dates[j]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.pickers[j--].setUTCDate(new_date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse if (new_date > this.dates[k]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t// Date being moved later/right");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\twhile (k < l && new_date > this.dates[k]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tthis.pickers[k++].setUTCDate(new_date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthis.updateDates();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\t\tdelete this.updating;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tremove: function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t$.map(this.pickers, function(p){ p.remove(); });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdelete this.element.data().datepicker;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tfunction opts_from_el(el, prefix){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t// Derive options from element data-attrs");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar data = $(el).data(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tout = {}, inkey,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treplace = new RegExp('^' + prefix.toLowerCase() + '([A-Z])');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tprefix = new RegExp('^' + prefix.toLowerCase());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfunction re_lower(_,a){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn a.toLowerCase();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (var key in data)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (prefix.test(key)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tinkey = key.replace(replace, re_lower);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tout[inkey] = data[key];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tfunction opts_from_locale(lang){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t// Derive options from locale plugins");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar out = {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t// Check if \"de-DE\" style date is available, if not language should");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t// fallback to 2 letter code eg \"de\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (!dates[lang]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tlang = lang.split('-')[0];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!dates[lang])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar d = dates[lang];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$.each(locale_opts, function(i,k){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (k in d)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tout[k] = d[k];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn out;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar old = $.fn.datepicker;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tvar datepickerPlugin = function(option){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar args = Array.apply(null, arguments);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\targs.shift();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar internal_return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.each(function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar $this = $(this),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdata = $this.data('datepicker'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\toptions = typeof option === 'object' && option;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!data){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar elopts = opts_from_el(this, 'date'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// Preliminary otions");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\txopts = $.extend({}, defaults, elopts, options),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tlocopts = opts_from_locale(xopts.language),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t// Options priority: js args, data-attrs, locales, defaults");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\topts = $.extend({}, defaults, locopts, elopts, options);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif ($this.hasClass('input-daterange') || opts.inputs){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tvar ropts = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tinputs: opts.inputs || $this.find('input').toArray()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t$this.data('datepicker', (data = new DateRangePicker(this, $.extend(opts, ropts))));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t$this.data('datepicker', (data = new Datepicker(this, opts)));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (typeof option === 'string' && typeof data[option] === 'function'){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tinternal_return = data[option].apply(data, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (internal_return !== undefined)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (internal_return !== undefined)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn internal_return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\telse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$.fn.datepicker = datepickerPlugin;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar defaults = $.fn.datepicker.defaults = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tautoclose: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbeforeShowDay: $.noop,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbeforeShowMonth: $.noop,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcalendarWeeks: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tclearBtn: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoggleActive: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdaysOfWeekDisabled: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdatesDisabled: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tendDate: Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tforceParse: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformat: 'mm/dd/yyyy',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tkeyboardNavigation: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tlanguage: 'en',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tminViewMode: 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmultidate: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmultidateSeparator: ',',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\torientation: \"auto\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\trtl: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tstartDate: -Infinity,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tstartView: 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttodayBtn: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttodayHighlight: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tweekStart: 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdisableTouchKeyboard: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        enableOnReadonly: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcontainer: 'body'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tvar locale_opts = $.fn.datepicker.locale_opts = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t'format',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t'rtl',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t'weekStart'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$.fn.datepicker.Constructor = Datepicker;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tvar dates = $.fn.datepicker.dates = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ten: {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdays: [\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdaysShort: [\"Sun\", \"Mon\", \"Tue\", \"Wed\", \"Thu\", \"Fri\", \"Sat\", \"Sun\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdaysMin: [\"Su\", \"Mo\", \"Tu\", \"We\", \"Th\", \"Fr\", \"Sa\", \"Su\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tmonths: [\"January\", \"February\", \"March\", \"April\", \"May\", \"June\", \"July\", \"August\", \"September\", \"October\", \"November\", \"December\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tmonthsShort: [\"Jan\", \"Feb\", \"Mar\", \"Apr\", \"May\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\ttoday: \"Today\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tclear: \"Clear\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar DPGlobal = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmodes: [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclsName: 'days',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavFnc: 'Month',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavStep: 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclsName: 'months',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavFnc: 'FullYear',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavStep: 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclsName: 'years',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavFnc: 'FullYear',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tnavStep: 10");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tisLeapYear: function(year){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn (((year % 4 === 0) && (year % 100 !== 0)) || (year % 400 === 0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetDaysInMonth: function(year, month){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn [31, (DPGlobal.isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31][month];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvalidParts: /dd?|DD?|mm?|MM?|yy(?:yy)?/g,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tnonpunctuation: /[^ -\\/:-@\\[\\u3400-\\u9fff-`{-~\\t\\n\\r]+/g,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparseFormat: function(format){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// IE treats \\0 as a string end in inputs (truncating the value),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// so it's a bad format delimiter, anyway");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar separators = format.replace(this.validParts, '\\0').split('\\0'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tparts = format.match(this.validParts);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!separators || !separators.length || !parts || parts.length === 0){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tthrow new Error(\"Invalid date format.\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn {separators: separators, parts: parts};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tparseDate: function(date, format, language){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn undefined;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (date instanceof Date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (typeof format === 'string')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tformat = DPGlobal.parseFormat(format);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar part_re = /([\\-+]\\d+)([dmwy])/,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tparts = date.match(/([\\-+]\\d+)([dmwy])/g),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tpart, dir, i;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (/^[\\-+]\\d+[dmwy]([\\s,]+[\\-+]\\d+[dmwy])*$/.test(date)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate = new Date();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (i=0; i < parts.length; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tpart = part_re.exec(parts[i]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdir = parseInt(part[1]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tswitch (part[2]){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tcase 'd':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tdate.setUTCDate(date.getUTCDate() + dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tcase 'm':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tdate = Datepicker.prototype.moveMonth.call(Datepicker.prototype, date, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tcase 'w':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tdate.setUTCDate(date.getUTCDate() + dir * 7);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tcase 'y':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tdate = Datepicker.prototype.moveYear.call(Datepicker.prototype, date, dir);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn UTCDate(date.getUTCFullYear(), date.getUTCMonth(), date.getUTCDate(), 0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tparts = date && date.match(this.nonpunctuation) || [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate = new Date();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar parsed = {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsetters_order = ['yyyy', 'yy', 'M', 'MM', 'm', 'mm', 'd', 'dd'],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tsetters_map = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tyyyy: function(d,v){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn d.setUTCFullYear(v);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tyy: function(d,v){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn d.setUTCFullYear(2000+v);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tm: function(d,v){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (isNaN(d))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\treturn d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tv -= 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\twhile (v < 0) v += 12;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tv %= 12;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\td.setUTCMonth(v);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\twhile (d.getUTCMonth() !== v)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\td.setUTCDate(d.getUTCDate()-1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\td: function(d,v){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\treturn d.setUTCDate(v);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tval, filtered;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetters_map['M'] = setters_map['MM'] = setters_map['mm'] = setters_map['m'];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tsetters_map['dd'] = setters_map['d'];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate = UTCDate(date.getFullYear(), date.getMonth(), date.getDate(), 0, 0, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar fparts = format.parts.slice();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Remove noop parts");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (parts.length !== fparts.length){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfparts = $(fparts).filter(function(i,p){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\treturn $.inArray(p, setters_order) !== -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}).toArray();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// Process remainder");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfunction match_part(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar m = this.slice(0, parts[i].length),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tp = parts[i].slice(0, m.length);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn m.toLowerCase() === p.toLowerCase();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (parts.length === fparts.length){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar cnt;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (i=0, cnt = fparts.length; i < cnt; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tval = parseInt(parts[i], 10);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tpart = fparts[i];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (isNaN(val)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tswitch (part){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'MM':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tfiltered = $(dates[language].months).filter(match_part);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tval = $.inArray(filtered[0], dates[language].months) + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tcase 'M':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tfiltered = $(dates[language].monthsShort).filter(match_part);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tval = $.inArray(filtered[0], dates[language].monthsShort) + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tparsed[part] = val;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar _date, s;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor (i=0; i < setters_order.length; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\ts = setters_order[i];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (s in parsed && !isNaN(parsed[s])){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t_date = new Date(date);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tsetters_map[s](_date, parsed[s]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tif (!isNaN(_date))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\tdate = _date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn date;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tformatDate: function(date, format, language){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (!date)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (typeof format === 'string')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tformat = DPGlobal.parseFormat(format);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar val = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\td: date.getUTCDate(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tD: dates[language].daysShort[date.getUTCDay()],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tDD: dates[language].days[date.getUTCDay()],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tm: date.getUTCMonth() + 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tM: dates[language].monthsShort[date.getUTCMonth()],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tMM: dates[language].months[date.getUTCMonth()],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyy: date.getUTCFullYear().toString().substring(2),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tyyyy: date.getUTCFullYear()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tval.dd = (val.d < 10 ? '0' : '') + val.d;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tval.mm = (val.m < 10 ? '0' : '') + val.m;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdate = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar seps = $.extend([], format.separators);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (var i=0, cnt = format.parts.length; i <= cnt; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (seps.length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tdate.push(seps.shift());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tdate.push(val[format.parts[i]]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn date.join('');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\theadTemplate: '<thead>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<th class=\"prev\">&#171;</th>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<th colspan=\"5\" class=\"datepicker-switch\"></th>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<th class=\"next\">&#187;</th>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t'</thead>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tcontTemplate: '<tbody><tr><td colspan=\"7\"></td></tr></tbody>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfootTemplate: '<tfoot>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<th colspan=\"7\" class=\"today\"></th>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<th colspan=\"7\" class=\"clear\"></th>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</tr>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t'</tfoot>'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDPGlobal.template = '<div class=\"datepicker\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<div class=\"datepicker-days\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<table class=\" table-condensed\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.headTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\t'<tbody></tbody>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.footTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'</table>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</div>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<div class=\"datepicker-months\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<table class=\"table-condensed\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.headTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.contTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.footTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'</table>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</div>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'<div class=\"datepicker-years\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'<table class=\"table-condensed\">'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.headTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.contTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t\tDPGlobal.footTemplate+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\t'</table>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t'</div>'+");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t'</div>';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t$.fn.datepicker.DPGlobal = DPGlobal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("\t/* DATEPICKER NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t* =================== */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t$.fn.datepicker.noConflict = function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t$.fn.datepicker = old;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/* DATEPICKER VERSION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t * =================== */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$.fn.datepicker.version =  \"1.4.0\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t/* DATEPICKER DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t* ================== */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t$(document).on(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t'focus.datepicker.data-api click.datepicker.data-api',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t'[data-provide=\"datepicker\"]',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfunction(e){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar $this = $(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif ($this.data('datepicker'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\treturn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\te.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// component click requires us to explicitly show it");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdatepickerPlugin.call($this, 'show');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t$(function(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tdatepickerPlugin.call($('[data-provide=\"datepicker-inline\"]'));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(window.jQuery));");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
