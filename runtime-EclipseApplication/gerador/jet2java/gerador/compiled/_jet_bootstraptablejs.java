package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_bootstraptablejs implements JET2Template {
    private final String templateFile;

    public _jet_bootstraptablejs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @author zhixin wen <wenzhixin2010@gmail.com>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * version: 1.7.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * https://github.com/wenzhixin/bootstrap-table/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("!function ($) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    'use strict';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // TOOLS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // ======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var cellHeight = 37; // update css if changed");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var cachedWidth = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // it only does '%s', and return '' when arguments are undefined");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var sprintf = function (str) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var args = arguments,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            flag = true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            i = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        str = str.replace(/%s/g, function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var arg = args[i++];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (typeof arg === 'undefined') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                flag = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return arg;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return flag ? str : '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var getPropertyFromOther = function (list, from, to, value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var result = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.each(list, function (i, item) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (item[from] === value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                result = item[to];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return result;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var getFieldIndex = function (columns, field) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var index = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(columns, function (i, column) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (column.field === field) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                index = i;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return index;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var getScrollBarWidth = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (cachedWidth === null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var inner = $('<p/>').addClass('fixed-table-scroll-inner'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                outer = $('<div/>').addClass('fixed-table-scroll-outer'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                w1, w2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            outer.append(inner);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $('body').append(outer);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            w1 = inner[0].offsetWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            outer.css('overflow', 'scroll');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            w2 = inner[0].offsetWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (w1 === w2) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                w2 = outer[0].clientWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            outer.remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            cachedWidth = w1 - w2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return cachedWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var calculateObjectValue = function (self, name, args, defaultValue) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof name === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            // support obj.func1.func2");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var names = name.split('.');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (names.length > 1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                name = window;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $.each(names, function (i, f) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    name = name[f];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                name = window[name];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof name === 'object') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return name;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof name === 'function') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return name.apply(self, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return defaultValue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var escapeHTML = function (text) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof text === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return text");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .replace(/&/g, \"&amp;\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .replace(/</g, \"&lt;\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .replace(/>/g, \"&gt;\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .replace(/\"/g, \"&quot;\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .replace(/'/g, \"&#039;\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // BOOTSTRAP TABLE CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // ======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var BootstrapTable = function (el, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options = options;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el = $(el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el_ = this.$el.clone();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.timeoutId_ = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.timeoutFooter_ = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.init();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        classes: 'table table-hover',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        height: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        undefinedText: '-',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sortName: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sortOrder: 'asc',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        striped: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        columns: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        data: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        method: 'get',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        url: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        cache: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        contentType: 'application/json',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        dataType: 'json',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        ajaxOptions: {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        queryParams: function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return params;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        queryParamsType: 'limit', // undefined");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        responseHandler: function (res) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return res;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pagination: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sidePagination: 'client', // client or server");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        totalRows: 0, // server side need to set");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pageNumber: 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pageSize: 10,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pageList: [10, 25, 50, 100],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        paginationHAlign: 'right', //right, left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        paginationVAlign: 'bottom', //bottom, top, both");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        paginationDetailHAlign: 'left', //right, left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        search: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        searchAlign: 'right',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        selectItemName: 'btSelectItem',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showHeader: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showFooter: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showColumns: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showPaginationSwitch: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showRefresh: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        showToggle: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        buttonsAlign: 'right',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        smartDisplay: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        minimumCountColumns: 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        idField: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        uniqueId: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        cardView: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        trimOnSearch: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        clickToSelect: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        singleSelect: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        toolbar: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        toolbarAlign: 'left',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        checkboxHeader: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sortable: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        maintainSelected: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        searchTimeOut: 500,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        keyEvents: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        searchText: '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        iconSize: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        iconsPrefix: 'glyphicon', // glyphicon of fa (font awesome)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        icons: {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            paginationSwitchDown: 'glyphicon-collapse-down icon-chevron-down',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            paginationSwitchUp: 'glyphicon-collapse-up icon-chevron-up',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            refresh: 'glyphicon-refresh icon-refresh',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            toggle: 'glyphicon-list-alt icon-list-alt',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            columns: 'glyphicon-th icon-th'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        rowStyle: function (row, index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        rowAttributes: function (row, index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        onAll: function (name, args) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onClickRow: function (item, $element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onDblClickRow: function (item, $element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onSort: function (name, order) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onCheck: function (row) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onUncheck: function (row) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onCheckAll: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onUncheckAll: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onLoadSuccess: function (data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onLoadError: function (status) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onColumnSwitch: function (field, checked) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onColumnSearch: function (field, text) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onPageChange: function (number, size) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onSearch: function (text) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onPreBody: function (data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onPostBody: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        onPostHeader: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.LOCALES = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.LOCALES['en-US'] = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatLoadingMessage: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Loading, please wait...';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatRecordsPerPage: function (pageNumber) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return sprintf('%s records per page', pageNumber);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatShowingRows: function (pageFrom, pageTo, totalRows) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return sprintf('Showing %s to %s of %s rows', pageFrom, pageTo, totalRows);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatSearch: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Search';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatNoMatches: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'No matching records found';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatPaginationSwitch: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Hide/Show pagination';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatRefresh: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Refresh';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatToggle: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Toggle';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatColumns: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'Columns';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatAllRows: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return 'All';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.extend(BootstrapTable.DEFAULTS, BootstrapTable.LOCALES['en-US']);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.COLUMN_DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        radio: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        checkbox: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        checkboxEnabled: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        field: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        title: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'class': undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        align: undefined, // left, right, center");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        halign: undefined, // left, right, center");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        falign: undefined, // left, right, center");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        valign: undefined, // top, middle, bottom");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        width: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sortable: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        order: 'asc', // asc, desc");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        visible: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        switchable: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        clickToSelect: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        formatter: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        footerFormatter: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        events: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        sorter: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        cellStyle: undefined,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        searchable: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        cardVisible: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        filterControl: undefined // edit, todo: select, todo: date");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.EVENTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'all.bs.table': 'onAll',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'click-row.bs.table': 'onClickRow',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'dbl-click-row.bs.table': 'onDblClickRow',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'sort.bs.table': 'onSort',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'check.bs.table': 'onCheck',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'uncheck.bs.table': 'onUncheck',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'check-all.bs.table': 'onCheckAll',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'uncheck-all.bs.table': 'onUncheckAll',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'load-success.bs.table': 'onLoadSuccess',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'load-error.bs.table': 'onLoadError',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'column-switch.bs.table': 'onColumnSwitch',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'column-search.bs.table': 'onColumnSearch',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'page-change.bs.table': 'onPageChange',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'search.bs.table': 'onSearch',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'pre-body.bs.table': 'onPreBody',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'post-body.bs.table': 'onPostBody',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'post-header.bs.table': 'onPostHeader'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.init = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initContainer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initTable();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initHeader();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initData();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initFooter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initToolbar();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initServer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initKeyEvents();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initContainer = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container = $([");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"bootstrap-table\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-toolbar\"></div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.paginationVAlign === 'top' || this.options.paginationVAlign === 'both' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<div class=\"fixed-table-pagination\" style=\"clear: both;\"></div>' :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-container\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-header\"><table></table></div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-body\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-loading\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.formatLoadingMessage(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"fixed-table-footer\"><table><tr></tr></table></div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.paginationVAlign === 'bottom' || this.options.paginationVAlign === 'both' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<div class=\"fixed-table-pagination\"></div>' :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</div>'].join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$container.insertAfter(this.$el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.find('.fixed-table-body').append(this.$el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.after('<div class=\"clearfix\"></div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$loading = this.$container.find('.fixed-table-loading');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$el.addClass(this.options.classes);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.striped) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$el.addClass('table-striped');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initTable = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            columns = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$header = this.$el.find('thead');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!this.$header.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header = $('<thead></thead>').appendTo(this.$el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!this.$header.find('tr').length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header.append('<tr></tr>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$header.find('th').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var column = $.extend({}, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                title: $(this).html(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                'class': $(this).attr('class')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }, $(this).data());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            columns.push(column);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.columns = $.extend(true, [], columns, this.options.columns);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.each(this.options.columns, function (i, column) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.options.columns[i] = $.extend({}, BootstrapTable.COLUMN_DEFAULTS,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                {field: i}, column); // when field is undefined, use index instead");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // if options.data is setting, do not process tbody data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.data.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$el.find('tbody tr').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var row = {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            // save tr's id and class");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            row._id = $(this).attr('id');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            row._class = $(this).attr('class');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            $(this).find('td').each(function (i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var field = that.options.columns[i].field;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                row[field] = $(this).html();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                // save td's id and class");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                row['_' + field + '_id'] = $(this).attr('id');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                row['_' + field + '_class'] = $(this).attr('class');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                row['_' + field + '_data'] = $(this).data();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data.push(row);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.data = data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initHeader = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            visibleColumns = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            addedFilterControl = false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            timeoutId = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.header = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            fields: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            styles: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            classes: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            formatters: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            events: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            sorters: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            cellStyles: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            clickToSelects: [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            searchables: []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(this.options.columns, function (i, column) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var text = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                halign = '', // header align style");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                align = '', // body align style");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                style = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                class_ = sprintf(' class=\"%s\"', column['class']),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                order = that.options.sortOrder || column.order,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                searchable = true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                unitWidth = 'px',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                isVisible = 'hidden';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (!column.visible) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (that.options.cardView && (!column.cardVisible)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (column.width !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (typeof column.width === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (column.width.indexOf('%') > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        unitWidth = '%'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    column.width = column.width.replace('%', '').replace('px', '');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            halign = sprintf('text-align: %s; ', column.halign ? column.halign : column.align);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            align = sprintf('text-align: %s; ', column.align);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            style = sprintf('vertical-align: %s; ', column.valign);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            style += sprintf('width: %s'+ unitWidth +'; ', column.checkbox || column.radio ? 36 : column.width);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            visibleColumns.push(column);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.fields.push(column.field);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.styles.push(align + style);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.classes.push(class_);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.formatters.push(column.formatter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.events.push(column.events);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.sorters.push(column.sorter);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.cellStyles.push(column.cellStyle);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.clickToSelects.push(column.clickToSelect);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.header.searchables.push(column.searchable);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('<th',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                column.checkbox || column.radio ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    sprintf(' class=\"bs-checkbox %s\"', column['class'] || '') :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    class_,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' style=\"%s\"', halign + style),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push(sprintf('<div class=\"th-inner %s\">', that.options.sortable && column.sortable ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                'sortable' : ''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            text = column.title;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (that.options.sortName === column.field && that.options.sortable && column.sortable) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                text += that.getCaretHtml();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (column.checkbox) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (!that.options.singleSelect && that.options.checkboxHeader) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    text = '<input name=\"btSelectAll\" type=\"checkbox\" />';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.header.stateField = column.field;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (column.radio) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                text = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.header.stateField = column.field;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.options.singleSelect = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push(text);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('<div class=\"fht-cell\"></div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('<div style=\"margin: 0px 2px 2px 2px;\" class=\"filterControl\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (column.filterControl && column.searchable) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                addedFilterControl = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                isVisible = 'visible'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (column.filterControl !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                switch (column.filterControl.toLowerCase()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    case 'input' :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        html.push(sprintf('<input type=\"text\" class=\"form-control\" style=\"width: 100%; visibility: %s\">', isVisible));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    case 'select':");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        html.push(sprintf('<select class=\"%s form-control\" style=\"width: 100%; visibility: %s\"></select>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            column.field, isVisible))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                html.push('<div style=\"height: 34px;\"></div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('</th>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$header.find('tr').html(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$header.find('th').each(function (i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $(this).data(visibleColumns[i]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.off('click', '.th-inner').on('click', '.th-inner', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (that.options.sortable && $(this).parent().data().sortable) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.onSort(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.showHeader || this.options.cardView) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$container.find('.fixed-table-header').hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$loading.css('top', 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$container.find('.fixed-table-header').show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$loading.css('top', cellHeight + 'px');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectAll = this.$header.find('[name=\"btSelectAll\"]');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.off('click', '[name=\"btSelectAll\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .on('click', '[name=\"btSelectAll\"]', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var checked = $(this).prop('checked');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that[checked ? 'checkAll' : 'uncheckAll']();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (addedFilterControl) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header.off('keyup', 'input').on('keyup' , 'input', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                clearTimeout(timeoutId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                timeoutId = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.onColumnSearch(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }, that.options.searchTimeOut);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            this.$header.off('change', 'select').on('change' , 'select', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                clearTimeout(timeoutId);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                timeoutId = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.onColumnSearch(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }, that.options.searchTimeOut);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$header.find('.filterControl').hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initFooter = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$footer =  this.$container.find('.fixed-table-footer');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!this.options.showFooter || this.options.cardView) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$footer.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$footer.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    /**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * @param data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     * @param type: append / prepend");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initData = function (data, type) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (type === 'append') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data = this.data.concat(data);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else if (type === 'prepend') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data = [].concat(data).concat(this.data);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data = data || this.options.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.data = this.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.sidePagination === 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSort();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initSort = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            name = this.options.sortName,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            order = this.options.sortOrder === 'desc' ? -1 : 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            index = $.inArray(this.options.sortName, this.header.fields);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (index !== -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data.sort(function (a, b) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var aa = a[name],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    bb = b[name],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = calculateObjectValue(that.header, that.header.sorters[index], [aa, bb]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (value !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return order * value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (value !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return order * value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                // Fix #161: undefined or null string sort bug.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (aa === undefined || aa === null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    aa = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (bb === undefined || bb === null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    bb = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                // IF both values are numeric, do a numeric comparison");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if ($.isNumeric(aa) && $.isNumeric(bb)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    // Convert numerical values form string to float.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    aa = parseFloat(aa);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    bb = parseFloat(bb);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (aa < bb) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return order * -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return order;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (aa === bb) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                // If value is not a string, convert to string");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (typeof aa !== 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    aa = aa.toString();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (aa.localeCompare(bb) === -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return order * -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                return order;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onSort = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $this = $(event.currentTarget).parent(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $this_ = this.$header.find('th').eq($this.index());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$header.add(this.$header_).find('span.order').remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.sortName === $this.data('field')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.sortOrder = this.options.sortOrder === 'asc' ? 'desc' : 'asc';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.sortName = $this.data('field');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.sortOrder = $this.data('order') === 'asc' ? 'desc' : 'asc';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.trigger('sort', this.options.sortName, this.options.sortOrder);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $this.add($this_).data('order', this.options.sortOrder)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .find('.th-inner').append(this.getCaretHtml());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.sidePagination === 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.initServer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.initSort();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initToolbar = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            timeoutId = 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $keepOpen,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $search,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            switchableCount = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$toolbar = this.$container.find('.fixed-table-toolbar').html('');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (typeof this.options.toolbar === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $(sprintf('<div class=\"bars pull-%s\"></div>', this.options.toolbarAlign))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .appendTo(this.$toolbar)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .append($(this.options.toolbar));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // showColumns, showToggle, showRefresh");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        html = [sprintf('<div class=\"columns columns-%s btn-group pull-%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.buttonsAlign, this.options.buttonsAlign)];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (typeof this.options.icons === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.icons = calculateObjectValue(null, this.options.icons);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showPaginationSwitch) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push(sprintf('<button class=\"btn btn-default\" type=\"button\" name=\"paginationSwitch\" title=\"%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.formatPaginationSwitch()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<i class=\"%s %s\"></i>', this.options.iconsPrefix, this.options.icons.paginationSwitchDown),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</button>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showRefresh) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push(sprintf('<button class=\"btn btn-default' + (this.options.iconSize === undefined ? '' : ' btn-' + this.options.iconSize) + '\" type=\"button\" name=\"refresh\" title=\"%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.formatRefresh()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<i class=\"%s %s\"></i>', this.options.iconsPrefix, this.options.icons.refresh),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</button>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showToggle) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push(sprintf('<button class=\"btn btn-default' + (this.options.iconSize === undefined ? '' : ' btn-' + this.options.iconSize) + '\" type=\"button\" name=\"toggle\" title=\"%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.formatToggle()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<i class=\"%s %s\"></i>', this.options.iconsPrefix, this.options.icons.toggle),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</button>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showColumns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push(sprintf('<div class=\"keep-open btn-group\" title=\"%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.formatColumns()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<button type=\"button\" class=\"btn btn-default' + (this.options.iconSize == undefined ? '' : ' btn-' + this.options.iconSize) + ' dropdown-toggle\" data-toggle=\"dropdown\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<i class=\"%s %s\"></i>', this.options.iconsPrefix, this.options.icons.columns),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ' <span class=\"caret\"></span>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</button>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<ul class=\"dropdown-menu\" role=\"menu\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            $.each(this.options.columns, function (i, column) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (column.radio || column.checkbox) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (that.options.cardView && (!column.cardVisible)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                var checked = column.visible ? ' checked=\"checked\"' : '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (column.switchable) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    html.push(sprintf('<li>' +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        '<label><input type=\"checkbox\" data-field=\"%s\" value=\"%s\"%s> %s</label>' +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        '</li>', column.field, i, checked, column.title));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    switchableCount++;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('</ul>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        html.push('</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // Fix #188: this.showToolbar is for extentions");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.showToolbar || html.length > 2) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$toolbar.append(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showPaginationSwitch) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$toolbar.find('button[name=\"paginationSwitch\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .off('click').on('click', $.proxy(this.togglePagination, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showRefresh) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$toolbar.find('button[name=\"refresh\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .off('click').on('click', $.proxy(this.refresh, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showToggle) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$toolbar.find('button[name=\"toggle\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                .off('click').on('click', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.toggleView();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showColumns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $keepOpen = this.$toolbar.find('.keep-open');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (switchableCount <= this.options.minimumCountColumns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $keepOpen.find('input').prop('disabled', true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            $keepOpen.find('li').off('click').on('click', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                event.stopImmediatePropagation();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $keepOpen.find('input').off('click').on('click', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var $this = $(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                that.toggleColumn($this.val(), $this.prop('checked'), false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.trigger('column-switch', $(this).data('field'), $this.prop('checked'));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.search) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<div class=\"pull-' + this.options.searchAlign + ' search\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<input class=\"form-control' + (this.options.iconSize === undefined ? '' : ' input-' + this.options.iconSize) + '\" type=\"text\" placeholder=\"%s\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    this.options.formatSearch()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            this.$toolbar.append(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $search = this.$toolbar.find('.search input');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $search.off('keyup').on('keyup', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                clearTimeout(timeoutId); // doesn't matter if it's 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                timeoutId = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.onSearch(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }, that.options.searchTimeOut);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (this.options.searchText !== '') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $search.val(this.options.searchText);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                clearTimeout(timeoutId); // doesn't matter if it's 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                timeoutId = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $search.trigger('keyup');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }, that.options.searchTimeOut);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onSearch = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var text = $.trim($(event.currentTarget).val());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // trim search input");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.trimOnSearch && $(event.currentTarget).val() !== text) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $(event.currentTarget).val(text);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (text === this.searchText) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.searchText = text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.options.pageNumber = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.trigger('search', text);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onColumnSearch = function (event, isSelectControl) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var text = $.trim($(event.currentTarget).val());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $field = $(event.currentTarget).parent().parent().data('field')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // trim search input");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        //$(event.currentTarget).val(text);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if ($.isEmptyObject(this.filterColumnsPartial)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.filterColumnsPartial = {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (text) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.filterColumnsPartial[$field] = text;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            delete this.filterColumnsPartial[$field];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.options.pageNumber = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        /* this.trigger('column-search', $field, text); */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initSearch = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.sidePagination !== 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var s = this.searchText && this.searchText.toLowerCase();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var f = $.isEmptyObject(this.filterColumns) ? null : this.filterColumns;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var fp = $.isEmptyObject(this.filterColumnsPartial) ? null: this.filterColumnsPartial;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            // Check filter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data = f ? $.grep(this.options.data, function (item, i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                for (var key in f) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (item[key] !== f[key]) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }) : this.options.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            //Check partial colum filter");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.data = fp ? $.grep(this.data, function (item, i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                for (var key in fp) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var fval = fp[key].toLowerCase();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var value = item[key];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = calculateObjectValue(that.header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        that.header.formatters[$.inArray(key, that.header.fields)],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        [value, item, i], value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if (! ($.inArray(key, that.header.fields) !== -1 &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        (typeof value === 'string' || typeof value === 'number') &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        (value + '').toLowerCase().indexOf(fval) !== -1)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }) : this.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            this.data = s ? $.grep(this.data, function (item, i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                for (var key in item) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    key = $.isNumeric(key) ? parseInt(key, 10) : key;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var value = item[key];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    // Fix #142: search use formated data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = calculateObjectValue(that.header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        that.header.formatters[$.inArray(key, that.header.fields)],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        [value, item, i], value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    var index = $.inArray(key, that.header.fields);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (index !== -1 && that.header.searchables[index] &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        (typeof value === 'string' ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            typeof value === 'number') &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        (value + '').toLowerCase().indexOf(s) !== -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }) : this.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initPagination = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$pagination = this.$container.find('.fixed-table-pagination');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.pagination) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$pagination.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$pagination.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $allSelected = false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            i, from, to,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $pageList,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $first, $pre,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $next, $last,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $number,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = this.getData();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.sidePagination !== 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.totalRows = data.length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.totalPages = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.totalRows) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (this.options.pageSize === this.options.formatAllRows()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.pageSize = this.options.totalRows;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $allSelected = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            } else if (this.options.pageSize === this.options.totalRows) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                // Fix #667 Table with pagination, multiple pages and a search that matches to one page throws exception");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var pageLst = typeof this.options.pageList === 'string' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    this.options.pageList.replace('[', '').replace(']', '').replace(/ /g, '').toLowerCase().split(',') :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    this.options.pageList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (pageLst.indexOf(this.options.formatAllRows().toLowerCase()) > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $allSelected = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            this.totalPages = ~~((this.options.totalRows - 1) / this.options.pageSize) + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            this.options.totalPages = this.totalPages;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.totalPages > 0 && this.options.pageNumber > this.totalPages) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageNumber = this.totalPages;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.pageFrom = (this.options.pageNumber - 1) * this.options.pageSize + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.pageTo = this.options.pageNumber * this.options.pageSize;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.pageTo > this.options.totalRows) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.pageTo = this.options.totalRows;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        html.push(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"pull-' + this.options.paginationDetailHAlign + ' pagination-detail\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<span class=\"pagination-info\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.formatShowingRows(this.pageFrom, this.pageTo, this.options.totalRows),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</span>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        html.push('<span class=\"page-list\">');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        var pageNumber = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<span class=\"btn-group %s\">', this.options.paginationVAlign === 'top' || this.options.paginationVAlign === 'both' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    'dropdown' : 'dropup'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<button type=\"button\" class=\"btn btn-default ' + (this.options.iconSize === undefined ? '' : ' btn-' + this.options.iconSize) + ' dropdown-toggle\" data-toggle=\"dropdown\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<span class=\"page-size\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $allSelected ? this.options.formatAllRows() : this.options.pageSize,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</span>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                ' <span class=\"caret\"></span>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</button>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<ul class=\"dropdown-menu\" role=\"menu\">'],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            pageList = this.options.pageList;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (typeof this.options.pageList === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var list = this.options.pageList.replace('[', '').replace(']', '').replace(/ /g, '').split(',');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            pageList = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $.each(list, function (i, value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                pageList.push(value.toUpperCase() === that.options.formatAllRows().toUpperCase() ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                that.options.formatAllRows() : +value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(pageList, function (i, page) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (!that.options.smartDisplay || i === 0 || pageList[i - 1] <= that.options.totalRows) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var active;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if ($allSelected) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    active = page === that.options.formatAllRows() ? ' class=\"active\"' : '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                } else{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    active = page === that.options.pageSize ? ' class=\"active\"' : '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                pageNumber.push(sprintf('<li%s><a href=\"javascript:void(0)\">%s</a></li>', active, page));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        pageNumber.push('</ul></span>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        html.push(this.options.formatRecordsPerPage(pageNumber.join('')));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        html.push('</span>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // Fixed #611 vertical-align between pagination block and pagination-detail block. Remove class pagination.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        html.push('</div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<div class=\"pull-' + this.options.paginationHAlign + '\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<ul class=\"pagination' + (this.options.iconSize === undefined ? '' : ' pagination-' + this.options.iconSize) + '\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<li class=\"page-first\"><a href=\"javascript:void(0)\">&lt;&lt;</a></li>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<li class=\"page-pre\"><a href=\"javascript:void(0)\">&lt;</a></li>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.totalPages < 5) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            from = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            to = this.totalPages;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            from = this.options.pageNumber - 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            to = from + 4;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (from < 1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                from = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                to = 5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (to > this.totalPages) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                to = this.totalPages;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                from = to - 4;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        for (i = from; i <= to; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('<li class=\"page-number' + (i === this.options.pageNumber ? ' active' : '') + '\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '<a href=\"javascript:void(0)\">', i, '</a>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</li>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        html.push(");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<li class=\"page-next\"><a href=\"javascript:void(0)\">&gt;</a></li>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<li class=\"page-last\"><a href=\"javascript:void(0)\">&gt;&gt;</a></li>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</ul>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</div>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$pagination.html(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $pageList = this.$pagination.find('.page-list a');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $first = this.$pagination.find('.page-first');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $pre = this.$pagination.find('.page-pre');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $next = this.$pagination.find('.page-next');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $last = this.$pagination.find('.page-last');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $number = this.$pagination.find('.page-number');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.pageNumber <= 1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $first.addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $pre.addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.pageNumber >= this.totalPages) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $next.addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $last.addClass('disabled');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.smartDisplay) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (this.totalPages <= 1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.$pagination.find('div.pagination').hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (pageList.length < 2 || this.options.totalRows <= pageList[0]) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.$pagination.find('span.page-list').hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            // when data is empty, hide the pagination");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$pagination[this.getData().length ? 'show' : 'hide']();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if ($allSelected) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageSize = this.options.formatAllRows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $pageList.off('click').on('click', $.proxy(this.onPageListChange, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $first.off('click').on('click', $.proxy(this.onPageFirst, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $pre.off('click').on('click', $.proxy(this.onPagePre, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $next.off('click').on('click', $.proxy(this.onPageNext, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $last.off('click').on('click', $.proxy(this.onPageLast, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $number.off('click').on('click', $.proxy(this.onPageNumber, this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.updatePagination = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // Fix #171: IE disabled button can be clicked bug.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (event && $(event.currentTarget).hasClass('disabled')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.maintainSelected) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.resetRows();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.sidePagination === 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.initServer();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.initBody();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.trigger('page-change', this.options.pageNumber, this.options.pageSize);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPageListChange = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $this = $(event.currentTarget);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $this.parent().addClass('active').siblings().removeClass('active');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageSize = $this.text().toUpperCase() === this.options.formatAllRows().toUpperCase() ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    this.options.formatAllRows() : +$this.text();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$toolbar.find('.page-size').text(this.options.pageSize);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPageFirst = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPagePre = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber--;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPageNext = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber++;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPageLast = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber = this.totalPages;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.onPageNumber = function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.pageNumber === +$(event.currentTarget).text()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber = +$(event.currentTarget).text();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination(event);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initBody = function (fixedScroll) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = this.getData();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.trigger('pre-body', data);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$body = this.$el.find('tbody');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!this.$body.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$body = $('<tbody></tbody>').appendTo(this.$el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        //Fix #389 Bootstrap-table-flatJSON is not working");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.pagination || this.options.sidePagination === 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.pageFrom = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.pageTo = data.length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        for (var i = this.pageFrom - 1; i < this.pageTo; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var key,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                item = data[i],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                style = {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                csses = [],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                attributes = {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                htmlAttributes = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            style = calculateObjectValue(this.options, this.options.rowStyle, [item, i], style);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (style && style.css) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                for (key in style.css) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    csses.push(key + ': ' + style.css[key]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            attributes = calculateObjectValue(this.options,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.rowAttributes, [item, i], attributes);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (attributes) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                for (key in attributes) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    htmlAttributes.push(sprintf('%s=\"%s\"', key, escapeHTML(attributes[key])));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('<tr',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' %s', htmlAttributes.join(' ')),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' id=\"%s\"', $.isArray(item) ? undefined : item._id),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' class=\"%s\"', style.classes || ($.isArray(item) ? undefined : item._class)),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' data-index=\"%s\"', i),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf(' data-unique-id=\"%s\"', item[this.options.uniqueId]),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '>'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            );");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (this.options.cardView) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                html.push(sprintf('<td colspan=\"%s\">', this.header.fields.length));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            $.each(this.header.fields, function (j, field) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var text = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = item[field],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    type = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    cellStyle = {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    id_ = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    class_ = that.header.classes[j],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    data_ = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    column = that.options.columns[getFieldIndex(that.options.columns, field)];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                style = sprintf('style=\"%s\"', csses.concat(that.header.styles[j]).join('; '));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                value = calculateObjectValue(that.header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.header.formatters[j], [value, item, i], value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                // handle td's id and class");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (item['_' + field + '_id']) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    id_ = sprintf(' id=\"%s\"', item['_' + field + '_id']);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (item['_' + field + '_class']) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    class_ = sprintf(' class=\"%s\"', item['_' + field + '_class']);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                cellStyle = calculateObjectValue(that.header,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.header.cellStyles[j], [value, item, i], cellStyle);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (cellStyle.classes) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    class_ = sprintf(' class=\"%s\"', cellStyle.classes);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (cellStyle.css) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var csses_ = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    for (var key in cellStyle.css) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        csses_.push(key + ': ' + cellStyle.css[key]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    style = sprintf('style=\"%s\"', csses_.concat(that.header.styles[j]).join('; '));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (item['_' + field + '_data'] && !$.isEmptyObject(item['_' + field + '_data'])) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $.each(item['_' + field + '_data'], function (k, v) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        // ignore data-index");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (k === 'index') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        data_ += sprintf(' data-%s=\"%s\"', k, v);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (column.checkbox || column.radio) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    type = column.checkbox ? 'checkbox' : type;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    type = column.radio ? 'radio' : type;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    text = [that.options.cardView ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        '<div class=\"card-view\">' : '<td class=\"bs-checkbox\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        '<input' +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' data-index=\"%s\"', i) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' name=\"%s\"', that.options.selectItemName) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' type=\"%s\"', type) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' value=\"%s\"', item[that.options.idField]) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' checked=\"%s\"', value === true ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                (value && value.checked) ? 'checked' : undefined) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf(' disabled=\"%s\"', !column.checkboxEnabled ||");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                (value && value.disabled) ? 'disabled' : undefined) +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            ' />',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        that.options.cardView ? '</div>' : '</td>'].join('');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = typeof value === 'undefined' || value === null ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        that.options.undefinedText : value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    text = that.options.cardView ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        ['<div class=\"card-view\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            that.options.showHeader ? sprintf('<span class=\"title\" %s>%s</span>', style,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                getPropertyFromOther(that.options.columns, 'field', 'title', field)) : '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            sprintf('<span class=\"value\">%s</span>', value),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            '</div>'].join('') :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        [sprintf('<td%s %s %s %s>', id_, class_, style, data_),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            value,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            '</td>'].join('');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if (column.filterControl !== undefined && column.filterControl.toLowerCase() === 'select'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        && column.searchable) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        var selectControl = $('.' + column.field),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            iOpt = 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            exitsOpt = false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            options;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (selectControl !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            options = selectControl.get(0).options;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                            if (options.length === 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                                //Added the default option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                selectControl.append($(\"<option></option>\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    .attr(\"value\", '')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    .text(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                                selectControl.append($(\"<option></option>\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    .attr(\"value\",value)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    .text(value));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                for (; iOpt < options.length; iOpt++ ) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    if (options[iOpt].value === value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                        exitsOpt = true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                        break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                                if (!exitsOpt) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    selectControl.append($(\"<option></option>\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                        .attr(\"value\",value)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                        .text(value));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    // Hide empty data on Card view when smartDisplay is set to true.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (that.options.cardView && that.options.smartDisplay && value === '') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        text = '';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                html.push(text);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (this.options.cardView) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                html.push('</td>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('</tr>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // show no records");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!html.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('<tr class=\"no-records-found\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sprintf('<td colspan=\"%s\">%s</td>', this.header.fields.length, this.options.formatNoMatches()),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                '</tr>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$body.html(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!fixedScroll) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.scrollTo(0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // click to select by column");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$body.find('> tr > td').off('click').on('click', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var $tr = $(this).parent();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.trigger('click-row', that.data[$tr.data('index')], $tr);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            // if click to select - then trigger the checkbox/radio click");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (that.options.clickToSelect) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (that.header.clickToSelects[$tr.children().index($(this))]) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $tr.find(sprintf('[name=\"%s\"]',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        that.options.selectItemName))[0].click(); // #144: .trigger('click') bug");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$body.find('tr').off('dblclick').on('dblclick', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.trigger('dbl-click-row', that.data[$(this).data('index')], $(this));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectItem = this.$body.find(sprintf('[name=\"%s\"]', this.options.selectItemName));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$selectItem.off('click').on('click', function (event) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            event.stopImmediatePropagation();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            var checked = $(this).prop('checked'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                row = that.data[$(this).data('index')];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            row[that.header.stateField] = checked;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.trigger(checked ? 'check' : 'uncheck', row);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (that.options.singleSelect) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.$selectItem.not(this).each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.data[$(this).data('index')][that.header.stateField] = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.$selectItem.filter(':checked').not(this).prop('checked', false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            that.updateSelected();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(this.header.events, function (i, events) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (!events) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            // fix bug, if events is defined with namespace");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (typeof events === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                events = calculateObjectValue(null, events);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            for (var key in events) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.$body.find('tr').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var $tr = $(this),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        $td = $tr.find(that.options.cardView ? '.card-view' : 'td').eq(i),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        index = key.indexOf(' '),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        name = key.substring(0, index),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        el = key.substring(index + 1),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        func = events[key];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    $td.find(el).off(name).on(name, function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        var index = $tr.data('index'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            row = that.data[index],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            value = row[that.header.fields[i]];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        func.apply(this, [e, value, row, index]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.updateSelected();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.resetView();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.trigger('post-body');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initServer = function (silent, query) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            params = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                pageSize: this.options.pageSize === this.options.formatAllRows() ? this.options.totalRows : this.options.pageSize,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                pageNumber: this.options.pageNumber,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                searchText: this.searchText,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sortName: this.options.sortName,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sortOrder: this.options.sortOrder");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.url) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.queryParamsType === 'limit') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            params = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                search: params.searchText,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                sort: params.sortName,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                order: params.sortOrder");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (this.options.pagination) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                params.limit = this.options.pageSize === this.options.formatAllRows() ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    this.options.totalRows : this.options.pageSize;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                params.offset = this.options.pageSize === this.options.formatAllRows() ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    0 : this.options.pageSize * (this.options.pageNumber - 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!($.isEmptyObject(this.filterColumnsPartial))) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            params['filter'] = JSON.stringify(this.filterColumnsPartial, null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        data = calculateObjectValue(this.options, this.options.queryParams, [params], data);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.extend(data, query || {});");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // false to stop request");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (data === false) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!silent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$loading.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.ajax($.extend({}, calculateObjectValue(null, this.options.ajaxOptions), {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            type: this.options.method,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            url: this.options.url,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data: this.options.contentType === 'application/json' && this.options.method === 'post' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                JSON.stringify(data) : data,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            cache: this.options.cache,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            contentType: this.options.contentType,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            dataType: this.options.dataType,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            success: function (res) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                res = calculateObjectValue(that.options, that.options.responseHandler, [res], res);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                that.load(res);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.trigger('load-success', res);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            error: function (res) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.trigger('load-error', res.status);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            complete: function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (!silent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    that.$loading.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.initKeyEvents = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (this.options.keyEvents) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          $(document).off('keypress').on('keypress', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("              var $search = that.$toolbar.find('.search input'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  $refresh = that.$toolbar.find('button[name=\"refresh\"]'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  $toggle= that.$toolbar.find('button[name=\"toggle\"]'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  $paginationSwitch = that.$toolbar.find('button[name=\"paginationSwitch\"]');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("              switch (e.keyCode) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 115://s");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 83://S");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      if (!that.options.search) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      if(document.activeElement === $search.get(0)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      $search.focus();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 114: //r");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 82: //R");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      if (!that.options.showRefresh) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      if(document.activeElement === $search.get(0)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      $refresh.click();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 116: //t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 84: //T");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      if (!that.options.showToggle) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      if(document.activeElement === $search.get(0)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      $toggle.click();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 112: //p");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                  case 80: //p");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      if (!that.options.showPaginationSwitch) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      if(document.activeElement === $search.get(0)){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                          return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                      $paginationSwitch.click();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                      return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("              }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.getCaretHtml = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return ['<span class=\"order' + (this.options.sortOrder === 'desc' ? '' : ' dropup') + '\">',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '<span class=\"caret\" style=\"margin: 10px 5px;\"></span>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            '</span>'].join('');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.updateSelected = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var checkAll = this.$selectItem.filter(':enabled').length ===");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$selectItem.filter(':enabled').filter(':checked').length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectAll.add(this.$selectAll_).prop('checked', checkAll);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectItem.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $(this).parents('tr')[$(this).prop('checked') ? 'addClass' : 'removeClass']('selected');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.updateRows = function (checked) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectItem.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.data[$(this).data('index')][that.header.stateField] = checked;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.resetRows = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(this.data, function (i, row) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$selectAll.prop('checked', false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$selectItem.prop('checked', false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            row[that.header.stateField] = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.trigger = function (name) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var args = Array.prototype.slice.call(arguments, 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        name += '.bs.table';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options[BootstrapTable.EVENTS[name]].apply(this.options, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el.trigger($.Event(name), args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.options.onAll(name, args);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el.trigger($.Event('all.bs.table'), [name, args]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.resetHeader = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el.css('margin-top', -this.$header.height());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // fix #61: the hidden table reset header bug.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // fix bug: get $el.css('width') error sometime (height = 500)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        clearTimeout(this.timeoutId_);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.timeoutId_ = setTimeout($.proxy(this.fitHeader, this), this.$el.is(':hidden') ? 100 : 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.fitHeader = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $fixedHeader,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $fixedBody,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            scrollWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (that.$el.is(':hidden')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.timeoutFooter_ = setTimeout($.proxy(that.fitHeader, that), 100);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $fixedHeader = that.$container.find('.fixed-table-header'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $fixedBody = that.$container.find('.fixed-table-body'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        scrollWidth = that.$el.width() > $fixedBody.width() ? getScrollBarWidth() : 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        that.$header_ = that.$header.clone(true, true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$selectAll_ = that.$header_.find('[name=\"btSelectAll\"]');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $fixedHeader.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            'margin-right': scrollWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }).find('table').css('width', that.$el.css('width'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .html('').attr('class', that.$el.attr('class'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .append(that.$header_);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // fix bug: $.data() is not working as expected after $.append()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$header.find('th').each(function (i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$header_.find('th').eq(i).data($(this).data());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        that.$body.find('tr:first-child:not(.no-records-found) > *').each(function (i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$header_.find('div.fht-cell').eq(i).width($(this).innerWidth());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // horizontal scroll event");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // TODO: it's probably better improving the layout than binding to scroll event");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $fixedBody.off('scroll').on('scroll', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $fixedHeader.scrollLeft($(this).scrollLeft());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.trigger('post-header');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.resetFooter = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = that.getData(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!this.options.showFooter || this.options.cardView) { //do nothing");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $.each(this.options.columns, function (i, column) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var falign = '', // footer align style");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                style  = '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                class_ = sprintf(' class=\"%s\"', column['class']);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (!column.visible) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (that.options.cardView && (!column.cardVisible)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            falign = sprintf('text-align: %s; ', column.falign ? column.falign : column.align);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            style = sprintf('vertical-align: %s; ', column.valign);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push('<td', class_, sprintf(' style=\"%s\"', falign + style), '>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("            html.push(calculateObjectValue(column, column.footerFormatter, [data], '&nbsp;') || '&nbsp;');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            html.push('</td>');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$footer.find('tr').html(html.join(''));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        clearTimeout(this.timeoutFooter_);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.timeoutFooter_ = setTimeout($.proxy(this.fitFooter, this),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$el.is(':hidden') ? 100: 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.fitFooter = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $fixedBody,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $footerTd,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            elWidth,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            scrollWidth;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        clearTimeout(this.timeoutFooter_);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.$el.is(':hidden')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.timeoutFooter_ = setTimeout($.proxy(this.fitFooter, this), 100);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $fixedBody  = this.$container.find('.fixed-table-body');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        elWidth     = this.$el.css('width');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        scrollWidth = elWidth > $fixedBody.width() ? getScrollBarWidth() : 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$footer.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            'margin-right': scrollWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }).find('table').css('width', elWidth)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .attr('class', this.$el.attr('class'));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $footerTd = this.$footer.find('td');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $fixedBody.find('tbody tr:first-child:not(.no-records-found) > td').each(function(i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $footerTd.eq(i).outerWidth($(this).outerWidth());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.toggleColumn = function (index, checked, needUpdate) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (index === -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.columns[index].visible = checked;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initHeader();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showColumns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var $items = this.$toolbar.find('.keep-open input').prop('disabled', false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (needUpdate) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $items.filter(sprintf('[value=\"%s\"]', index)).prop('checked', checked);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if ($items.filter(':checked').length <= this.options.minimumCountColumns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $items.filter(':checked').prop('disabled', true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.toggleRow = function (index, isIdField, visible) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (index === -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $(this.$body[0]).children().filter(sprintf( isIdField ? '[value=\"%s\"]' : '[data-index=\"%s\"]', index))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            [visible ? 'show' : 'hide']();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("     };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // PUBLIC FUNCTION DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.resetView = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            padding = 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $tableContainer = that.$container.find('.fixed-table-container');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (params && params.height) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.height = params.height;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$selectAll.prop('checked', this.$selectItem.length > 0 &&");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$selectItem.length === this.$selectItem.filter(':checked').length);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.height) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var toolbarHeight = +this.$toolbar.children().outerHeight(true),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                paginationHeight = +this.$pagination.children().outerHeight(true),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                height = this.options.height - toolbarHeight - paginationHeight;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            $tableContainer.css('height', height + 'px');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.cardView) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            // remove the element css");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$el.css('margin-top', '0');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $tableContainer.css('padding-bottom', '0');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showHeader && this.options.height) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$container.find('.fixed-table-header').show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.resetHeader();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            padding += cellHeight;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.$container.find('.fixed-table-header').hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.trigger('post-header');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (this.options.showFooter) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.resetFooter();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (this.options.height) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                padding += cellHeight;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $tableContainer.css('padding-bottom', padding + 'px');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.getData = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return (this.searchText");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            || !$.isEmptyObject(this.filterColumns)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            || !$.isEmptyObject(this.filterColumnsPartial)) ? this.data : this.options.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.load = function (data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var fixedScroll = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        // #431: support pagination");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.sidePagination === 'server') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.totalRows = data.total;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            fixedScroll = data.fixedScroll;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = data.rows;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else if (!$.isArray(data)) { // support fixedScroll");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            fixedScroll = data.fixedScroll;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            data = data.data;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.initData(data);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(fixedScroll);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.append = function (data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initData(data, 'append');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.prepend = function (data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initData(data, 'prepend');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.remove = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var len = this.options.data.length,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            i, row;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (!params.hasOwnProperty('field') || !params.hasOwnProperty('values')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        for (i = len - 1; i >= 0; i--) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            row = this.options.data[i];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (!row.hasOwnProperty(params.field)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                continue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if ($.inArray(row[params.field], params.values) !== -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.options.data.splice(i, 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (len === this.options.data.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.insertRow = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!params.hasOwnProperty('index') || !params.hasOwnProperty('row')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.data.splice(params.index, 0, params.row);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initPagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.updateRow = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!params.hasOwnProperty('index') || !params.hasOwnProperty('row')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.extend(this.data[params.index], params.row);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.showRow = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!params.hasOwnProperty('index')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.toggleRow(params.index, params.isIdField === undefined ? false : true, true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.hideRow = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!params.hasOwnProperty('index')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.toggleRow(params.index, params.isIdField === undefined ? false : true, false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.getRowsHidden = function (show) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var rows = $(this.$body[0]).children().filter(':hidden'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            i = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (show) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            for (; i < rows.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $(rows[i]).show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return rows;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.mergeCells = function (options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var row = options.index,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            col = $.inArray(options.field, this.header.fields),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            rowspan = options.rowspan || 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            colspan = options.colspan || 1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            i, j,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $tr = this.$body.find('tr'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $td = $tr.eq(row).find('td').eq(col);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (row < 0 || col < 0 || row >= this.data.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        for (i = row; i < row + rowspan; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            for (j = col; j < col + colspan; j++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $tr.eq(i).find('td').eq(j).hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $td.attr('rowspan', rowspan).attr('colspan', colspan).show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.getOptions = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return this.options;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.getSelections = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        return $.grep(this.data, function (row) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return row[that.header.stateField];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.checkAll = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.checkAll_(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.uncheckAll = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.checkAll_(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.checkAll_ = function (checked) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var rows;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!checked) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            rows = this.getSelections();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$selectItem.filter(':enabled').prop('checked', checked);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updateRows(checked);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updateSelected();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (checked) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            rows = this.getSelections();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.trigger(checked ? 'check-all' : 'uncheck-all', rows);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.check = function (index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.check_(true, index);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.uncheck = function (index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.check_(false, index);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.check_ = function (checked, index) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$selectItem.filter(sprintf('[data-index=\"%s\"]', index)).prop('checked', checked);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.data[index][this.header.stateField] = checked;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updateSelected();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.trigger(checked ? 'check' : 'uncheck', this.data[index]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.checkBy = function (obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.checkBy_(true, obj);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.uncheckBy = function (obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.checkBy_(false, obj);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.checkBy_ = function (checked, obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (!obj.hasOwnProperty('field') || !obj.hasOwnProperty('values')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        var that = this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.each(this.options.data, function (index, row) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if (!row.hasOwnProperty(obj.field)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            if ($.inArray(row[obj.field], obj.values) !== -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.$selectItem.filter(sprintf('[data-index=\"%s\"]', index)).prop('checked', checked);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                row[that.header.stateField] = checked;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                that.trigger(checked ? 'check' : 'uncheck', row);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updateSelected();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.destroy = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el.insertBefore(this.$container);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $(this.options.toolbar).insertBefore(this.$el);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.next().remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$container.remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$el.html(this.$el_.html())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .css('margin-top', '0')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .attr('class', this.$el_.attr('class') || ''); // reset the class");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.showLoading = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$loading.show();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.hideLoading = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$loading.hide();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.togglePagination = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pagination = !this.options.pagination;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var button = this.$toolbar.find('button[name=\"paginationSwitch\"] i');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.pagination) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            button.attr(\"class\", this.options.iconsPrefix + \" \" + this.options.icons.paginationSwitchDown);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            button.attr(\"class\", this.options.iconsPrefix + \" \" + this.options.icons.paginationSwitchUp);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.refresh = function (params) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (params && params.url) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.url = params.url;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageNumber = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initServer(params && params.silent, params && params.query);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.showColumn = function (field) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.toggleColumn(getFieldIndex(this.options.columns, field), true, true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.hideColumn = function (field) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.toggleColumn(getFieldIndex(this.options.columns, field), false, true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.filterBy = function (columns) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.filterColumns = $.isEmptyObject(columns) ? {} : columns;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.pageNumber = 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initSearch();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.scrollTo = function (value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $tbody = this.$container.find('.fixed-table-body');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof value === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            value = value === 'bottom' ? $tbody[0].scrollHeight : 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (typeof value === 'number') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $tbody.scrollTop(value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.selectPage = function (page) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (page > 0 && page <= this.options.totalPages) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageNumber = page;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.prevPage = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.pageNumber > 1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageNumber--;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.nextPage = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.options.pageNumber < this.options.totalPages) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.options.pageNumber++;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            this.updatePagination();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    BootstrapTable.prototype.toggleView = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.cardView = !this.options.cardView;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initHeader();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // Fixed remove toolbar when click cardView button.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        //that.initToolbar();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.initBody();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // BOOTSTRAP TABLE PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var allowedMethods = [");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'getOptions',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'getSelections', 'getData',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'load', 'append', 'prepend', 'remove',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'insertRow', 'updateRow',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'showRow', 'hideRow', 'getRowsHidden',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'mergeCells',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'checkAll', 'uncheckAll',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'check', 'uncheck',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'checkBy', 'uncheckBy',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'refresh',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'resetView',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'destroy',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'showLoading', 'hideLoading',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'showColumn', 'hideColumn',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'filterBy',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'scrollTo',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'selectPage', 'prevPage', 'nextPage',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'togglePagination',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        'toggleView'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.fn.bootstrapTable = function (option, _relatedTarget) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            var $this = $(this),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                data = $this.data('bootstrap.table'),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                options = $.extend({}, BootstrapTable.DEFAULTS, $this.data(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    typeof option === 'object' && option);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (typeof option === 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if ($.inArray(option, allowedMethods) < 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    throw \"Unknown method: \" + option;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (!data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                value = data[option](_relatedTarget);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                if (option === 'destroy') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $this.removeData('bootstrap.table');");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if (!data) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $this.data('bootstrap.table', (data = new BootstrapTable(this, options)));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        return typeof value === 'undefined' ? this : value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.fn.bootstrapTable.Constructor = BootstrapTable;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.bootstrapTable.defaults = BootstrapTable.DEFAULTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.bootstrapTable.columnDefaults = BootstrapTable.COLUMN_DEFAULTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.bootstrapTable.locales = BootstrapTable.LOCALES;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.bootstrapTable.methods = allowedMethods;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // BOOTSTRAP TABLE INIT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $('[data-toggle=\"table\"]').bootstrapTable();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
