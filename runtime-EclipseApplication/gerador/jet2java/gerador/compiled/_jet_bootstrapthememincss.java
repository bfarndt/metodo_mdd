package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_bootstrapthememincss implements JET2Template {
    private final String templateFile;

    public _jet_bootstrapthememincss(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("/*!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap v3.3.4 (http://getbootstrap.com)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter,  Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */.btn-danger, .btn-default, .btn-info, .btn-primary, .btn-success, .btn-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 -1px 0 rgba(0, 0, 0, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, .15), 0 1px 1px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 1px 0 rgba(255, 255, 255, .15), 0 1px 1px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger.active, .btn-danger:active, .btn-default.active, .btn-default:active, .btn-info.active, .btn-info:active, .btn-primary.active, .btn-primary:active, .btn-success.active, .btn-success:active, .btn-warning.active, .btn-warning:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 3px 5px rgba(0, 0, 0, .125);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger .badge, .btn-default .badge, .btn-info .badge, .btn-primary .badge, .btn-success .badge, .btn-warning .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn.active, .btn:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-default {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 1px 0 #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #fff 0, #e0e0e0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #fff 0, #e0e0e0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#e0e0e0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #fff 0, #e0e0e0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffffff',  endColorstr='#ffe0e0e0',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #dbdbdb;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #ccc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-default:focus, .btn-default:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #e0e0e0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-default.active, .btn-default:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #e0e0e0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #dbdbdb;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-default.disabled, .btn-default:disabled, .btn-default[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #e0e0e0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-primary {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #265a88 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #265a88 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#265a88));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #265a88 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff265a88',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #245580;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-primary:focus, .btn-primary:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #265a88;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-primary.active, .btn-primary:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #265a88;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #245580;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-primary.disabled, .btn-primary:disabled, .btn-primary[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #265a88;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #5cb85c 0, #419641 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #5cb85c 0, #419641 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#5cb85c), to(#419641));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #5cb85c 0, #419641 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5cb85c',  endColorstr='#ff419641',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #3e8f3e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-success:focus, .btn-success:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #419641;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-success.active, .btn-success:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #419641;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #3e8f3e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-success.disabled, .btn-success:disabled, .btn-success[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #419641;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #5bc0de 0, #2aabd2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #5bc0de 0, #2aabd2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#5bc0de), to(#2aabd2));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #5bc0de 0, #2aabd2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bc0de',  endColorstr='#ff2aabd2',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #28a4c9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-info:focus, .btn-info:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #2aabd2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-info.active, .btn-info:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #2aabd2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #28a4c9;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-info.disabled, .btn-info:disabled, .btn-info[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #2aabd2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f0ad4e 0, #eb9316 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f0ad4e 0, #eb9316 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f0ad4e), to(#eb9316));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f0ad4e 0, #eb9316 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff0ad4e',  endColorstr='#ffeb9316',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #e38d13;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-warning:focus, .btn-warning:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #eb9316;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-warning.active, .btn-warning:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #eb9316;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #e38d13;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-warning.disabled, .btn-warning:disabled, .btn-warning[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #eb9316;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #d9534f 0, #c12e2a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #d9534f 0, #c12e2a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#d9534f), to(#c12e2a));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #d9534f 0, #c12e2a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffd9534f',  endColorstr='#ffc12e2a',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #b92c28;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger:focus, .btn-danger:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #c12e2a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-position: 0 -15px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger.active, .btn-danger:active {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #c12e2a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #b92c28;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".btn-danger.disabled, .btn-danger:disabled, .btn-danger[disabled] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #c12e2a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".img-thumbnail, .thumbnail {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: 0 1px 2px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu>li>a:focus, .dropdown-menu>li>a:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #e8e8e8;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f5f5f5), to(#e8e8e8));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff5f5f5',  endColorstr='#ffe8e8e8',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".dropdown-menu>.active>a, .dropdown-menu>.active>a:focus, .dropdown-menu>.active>a:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #2e6da4;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#2e6da4));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff2e6da4',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #fff 0, #f8f8f8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #fff 0, #f8f8f8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#f8f8f8));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #fff 0, #f8f8f8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffffffff',  endColorstr='#fff8f8f8',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, .15), 0 1px 5px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 1px 0 rgba(255, 255, 255, .15), 0 1px 5px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-default .navbar-nav>.active>a, .navbar-default .navbar-nav>.open>a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #dbdbdb 0, #e2e2e2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #dbdbdb 0, #e2e2e2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#dbdbdb), to(#e2e2e2));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #dbdbdb 0, #e2e2e2 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffdbdbdb',  endColorstr='#ffe2e2e2',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 3px 9px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 3px 9px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-brand, .navbar-nav>li>a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 1px 0 rgba(255, 255, 255, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #3c3c3c 0, #222 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #3c3c3c 0, #222 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#3c3c3c), to(#222));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #3c3c3c 0, #222 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff3c3c3c',  endColorstr='#ff222222',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(enabled=false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-nav>.active>a, .navbar-inverse .navbar-nav>.open>a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #080808 0, #0f0f0f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #080808 0, #0f0f0f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#080808), to(#0f0f0f));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #080808 0, #0f0f0f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff080808',  endColorstr='#ff0f0f0f',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 3px 9px rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 3px 9px rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-inverse .navbar-brand, .navbar-inverse .navbar-nav>li>a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 -1px 0 rgba(0, 0, 0, .25);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".navbar-fixed-bottom, .navbar-fixed-top, .navbar-static-top {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("@media (max-width:767px) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .navbar .navbar-nav .open .dropdown-menu>.active>a, .navbar .navbar-nav .open .dropdown-menu>.active>a: focus, .navbar .navbar-nav .open .dropdown-menu>.active>a:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#2e6da4));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff2e6da4',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}.alert {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 1px 0 rgba(255, 255, 255, .2);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, .25), 0 1px 2px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 1px 0 rgba(255, 255, 255, .25), 0 1px 2px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #dff0d8 0, #c8e5bc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #dff0d8 0, #c8e5bc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#dff0d8), to(#c8e5bc));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #dff0d8 0, #c8e5bc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffdff0d8',  endColorstr='#ffc8e5bc',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #b2dba1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #d9edf7 0, #b9def0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #d9edf7 0, #b9def0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#d9edf7), to(#b9def0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #d9edf7 0, #b9def0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffd9edf7',  endColorstr='#ffb9def0',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #9acfea;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #fcf8e3 0, #f8efc0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #fcf8e3 0, #f8efc0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fcf8e3), to(#f8efc0));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #fcf8e3 0, #f8efc0 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fffcf8e3',  endColorstr='#fff8efc0',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #f5e79e;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".alert-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f2dede 0, #e7c3c3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f2dede 0, #e7c3c3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f2dede), to(#e7c3c3));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f2dede 0, #e7c3c3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff2dede',  endColorstr='#ffe7c3c3',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #dca7a7;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #ebebeb 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #ebebeb 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#ebebeb), to(#f5f5f5));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #ebebeb 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffebebeb',  endColorstr='#fff5f5f5',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #286090 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #286090 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#286090));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #286090 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff286090',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-success {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #5cb85c 0, #449d44 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #5cb85c 0, #449d44 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#5cb85c), to(#449d44));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #5cb85c 0, #449d44 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5cb85c',  endColorstr='#ff449d44',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #5bc0de 0, #31b0d5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #5bc0de 0, #31b0d5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#5bc0de), to(#31b0d5));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #5bc0de 0, #31b0d5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff5bc0de',  endColorstr='#ff31b0d5',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-warning {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f0ad4e 0, #ec971f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f0ad4e 0, #ec971f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f0ad4e), to(#ec971f));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f0ad4e 0, #ec971f 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff0ad4e',  endColorstr='#ffec971f',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-danger {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #d9534f 0, #c9302c 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #d9534f 0, #c9302c 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#d9534f), to(#c9302c));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #d9534f 0, #c9302c 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffd9534f',  endColorstr='#ffc9302c',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".progress-bar-striped {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(45deg, rgba(255, 255, 255, .15) 25%, transparent 25%, transparent 50%, rgba(255, 255, 255, .15) 50%, rgba(255, 255, 255, .15) 75%, transparent 75%, transparent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: 0 1px 2px rgba(0, 0, 0, .075);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active, .list-group-item.active:focus, .list-group-item.active:hover {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: 0 -1px 0 #286090;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #2b669a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #2b669a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#2b669a));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #2b669a 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff2b669a',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #2b669a;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".list-group-item.active .badge, .list-group-item.active:focus .badge, .list-group-item.active:hover .badge {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-shadow: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: 0 1px 2px rgba(0, 0, 0, .05);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-default>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f5f5f5), to(#e8e8e8));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f5f5f5 0, #e8e8e8 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff5f5f5',  endColorstr='#ffe8e8e8',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-primary>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#337ab7), to(#2e6da4));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #337ab7 0, #2e6da4 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ff337ab7',  endColorstr='#ff2e6da4',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-success>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #dff0d8 0, #d0e9c6 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #dff0d8 0, #d0e9c6 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#dff0d8), to(#d0e9c6));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #dff0d8 0, #d0e9c6 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffdff0d8',  endColorstr='#ffd0e9c6',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-info>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #d9edf7 0, #c4e3f3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #d9edf7 0, #c4e3f3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#d9edf7), to(#c4e3f3));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #d9edf7 0, #c4e3f3 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffd9edf7',  endColorstr='#ffc4e3f3',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-warning>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #fcf8e3 0, #faf2cc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #fcf8e3 0, #faf2cc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fcf8e3), to(#faf2cc));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #fcf8e3 0, #faf2cc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fffcf8e3',  endColorstr='#fffaf2cc',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".panel-danger>.panel-heading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #f2dede 0, #ebcccc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #f2dede 0, #ebcccc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#f2dede), to(#ebcccc));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #f2dede 0, #ebcccc 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#fff2dede',  endColorstr='#ffebcccc',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".well {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-linear-gradient(top, #e8e8e8 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -o-linear-gradient(top, #e8e8e8 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#e8e8e8), to(#f5f5f5));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-image: linear-gradient(to bottom, #e8e8e8 0, #f5f5f5 100%);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffe8e8e8',  endColorstr='#fff5f5f5',  GradientType=0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-repeat: repeat-x;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-color: #dcdcdc;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, .05), 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-shadow: inset 0 1px 3px rgba(0, 0, 0, .05), 0 1px 0 rgba(255, 255, 255, .1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
