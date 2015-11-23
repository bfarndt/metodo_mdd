package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_templateBootstraptable implements JET2Template {
    private final String templateFile;

    public _jet_templateBootstraptable(String templateFile) {
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
        out.write(".bootstrap-table .table {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0 !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-collapse: collapse !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 1px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".bootstrap-table");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table>tbody>tr>th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table>tfoot>tr>th,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table>thead>tr>td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table>tbody>tr>td,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".table>tfoot>tr>td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 8px !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    clear: both;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -moz-border-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-footer,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 37px; /*cellHeight*/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -moz-border-radius: 4px 4px 0 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-header {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-footer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-body {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow-x: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow-y: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container table {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container thead th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-left: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container thead th:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-left: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -webkit-border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -moz-border-radius-topleft: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container thead th .th-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 8px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 24px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: top;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-overflow: ellipsis;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    white-space: nowrap;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container thead th .sortable {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    cursor: pointer;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container tbody td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-left: 1px solid #dddddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container tbody tr:first-child td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container tbody td:first-child {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-left: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* the same color with .active */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-container tbody .selected td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #f5f5f5;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container .bs-checkbox {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container .bs-checkbox .th-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 8px 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container input[type=\"radio\"],");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-container input[type=\"checkbox\"] {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin: 0 auto !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-container .no-records-found {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .pagination,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-pagination .pagination-detail {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-top: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .pagination a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 6px 12px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 1.428571429;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .pagination-info {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 34px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .dropup .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination .page-list {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .columns-left {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-right: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .columns-right {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: 5px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .columns label {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 3px 20px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    clear: both;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 1.428571429;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .bars,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-toolbar .search,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-toolbar .columns {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: relative;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-top: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-bottom: 10px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    line-height: 34px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-pagination li.disabled a {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pointer-events: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    cursor: default;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-loading {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    position: absolute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    top: 42px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    bottom: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    z-index: 99;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    background-color: #fff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-align: center;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-body .card-view .title {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    font-weight: bold;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    min-width: 30%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-align: left !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* support bootstrap 2 */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".fixed-table-body thead th .th-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-sizing: border-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".table th, .table td {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: middle;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    box-sizing: border-box;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    text-align: left;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    max-height: 300px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .btn-group > .btn-group {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    display: inline-block;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin-left: -1px !important;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .btn-group > .btn-group > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-radius: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .btn-group > .btn-group:first-child > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom-left-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".fixed-table-toolbar .btn-group > .btn-group:last-child > .btn {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-top-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom-right-radius: 4px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".bootstrap-table .table > thead > tr > th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    vertical-align: bottom;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    border-bottom: 2px solid #ddd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* support bootstrap 3 */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(".bootstrap-table .table thead > tr > th {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    padding: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    margin: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(".pull-right .dropdown-menu {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    right: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: auto;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* calculate scrollbar width */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("p.fixed-table-scroll-inner {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 100%;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 200px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("div.fixed-table-scroll-outer {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    top: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    left: 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    visibility: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    width: 200px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    height: 150px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    overflow: hidden;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.popTemplateFile();
    }
}
