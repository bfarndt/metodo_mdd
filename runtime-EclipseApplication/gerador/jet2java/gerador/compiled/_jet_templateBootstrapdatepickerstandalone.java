package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_templateBootstrapdatepickerstandalone implements JET2Template {
    private final String templateFile;

    public _jet_templateBootstrapdatepickerstandalone(String templateFile) {
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
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  direction: ltr;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-inline {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 220px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.datepicker-rtl {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  direction: rtl;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.datepicker-rtl table tr td span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: right;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left: 7px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right: 7px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 7px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom-color: rgba(0, 0, 0, 0.2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  content: '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-left: 6px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-right: 6px solid transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 6px solid #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-left:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-left:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 7px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-right:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-right:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  right: 7px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-top:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -7px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-top:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: -6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-bottom:before {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: -7px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 7px solid #999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker-dropdown.datepicker-orient-bottom:after {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  bottom: -6px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-top: 6px solid #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker > div {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.days .datepicker-days,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.months .datepicker-months,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.years .datepicker-years {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-touch-callout: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-user-select: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -khtml-user-select: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-user-select: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -ms-user-select: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  user-select: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table-striped .datepicker table tr td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table-striped .datepicker table tr th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.day:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.day.focused {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: #eeeeee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.old,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.new {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #999999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #999999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fde19a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -moz-linear-gradient(top, #fdd49a, #fdf59a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -ms-linear-gradient(top, #fdd49a, #fdf59a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#fdd49a), to(#fdf59a));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(top, #fdd49a, #fdf59a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -o-linear-gradient(top, #fdd49a, #fdf59a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: linear-gradient(top, #fdd49a, #fdf59a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fdd49a', endColorstr='#fdf59a', GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #fdf59a #fdf59a #fbed50;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fdf59a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.disabled:hover.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #fbf069 \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today:hover:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.today.active:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: #eeeeee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f3d17a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -moz-linear-gradient(top, #f3c17a, #f3e97a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -ms-linear-gradient(top, #f3c17a, #f3e97a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#f3c17a), to(#f3e97a));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(top, #f3c17a, #f3e97a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -o-linear-gradient(top, #f3c17a, #f3e97a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: linear-gradient(top, #f3c17a, #f3e97a);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f3c17a', endColorstr='#f3e97a', GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #f3e97a #f3e97a #edde34;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #f3e97a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.range.today.disabled:hover.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #efe24b \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #9e9e9e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -moz-linear-gradient(top, #b3b3b3, #808080);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -ms-linear-gradient(top, #b3b3b3, #808080);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#b3b3b3), to(#808080));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(top, #b3b3b3, #808080);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -o-linear-gradient(top, #b3b3b3, #808080);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: linear-gradient(top, #b3b3b3, #808080);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#b3b3b3', endColorstr='#808080', GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #808080 #808080 #595959;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #808080;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.selected.disabled:hover.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #666666 \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #006dcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -moz-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -ms-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#0088cc), to(#0044cc));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -o-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0088cc', endColorstr='#0044cc', GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #0044cc #0044cc #002a80;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #0044cc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td.active.disabled:hover.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #003399 \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 23%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 54px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 54px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin: 1%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: #eeeeee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #999999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #006dcc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -moz-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -ms-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#0088cc), to(#0044cc));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -webkit-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: -o-linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-image: linear-gradient(top, #0088cc, #0044cc);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#0088cc', endColorstr='#0044cc', GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: #0044cc #0044cc #002a80;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover.disabled,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled[disabled],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #0044cc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover:active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active:hover.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled.active,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.active.disabled:hover.active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #003399 \\9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.old,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker table tr td span.new {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #999999;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker .datepicker-switch {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 145px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker thead tr:first-child th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker tfoot tr th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker thead tr:first-child th:hover,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker tfoot tr th:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background: #eeeeee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker .cw {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 0 2px 0 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker thead tr:first-child .cw {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: transparent;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-append.date .add-on,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-prepend.date .add-on {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-append.date .add-on i,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-prepend.date .add-on i {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-top: 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-daterange input {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-daterange input:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 3px 0 0 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 3px 0 0 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 3px 0 0 3px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-daterange input:last-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 0 3px 3px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 0 3px 3px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 0 3px 3px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".input-daterange .add-on {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  width: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-width: 16px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 4px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  text-shadow: 0 1px 0 #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #eeeeee;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-left: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  margin-right: -5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  top: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  z-index: 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  float: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  min-width: 160px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  list-style: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-color: #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border: 1px solid rgba(0, 0, 0, 0.2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-border-radius: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-border-radius: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  border-radius: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -webkit-background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  -moz-background-clip: padding;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  background-clip: padding-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  *border-right-width: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  *border-bottom-width: 2px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  color: #333333;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  font-size: 13px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  line-height: 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.dropdown-menu th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.datepicker-inline th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.dropdown-menu td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".datepicker.datepicker-inline td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  padding: 4px 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
