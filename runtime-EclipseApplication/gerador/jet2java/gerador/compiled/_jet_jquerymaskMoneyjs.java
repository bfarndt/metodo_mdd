package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_jquerymaskMoneyjs implements JET2Template {
    private final String templateFile;

    public _jet_jquerymaskMoneyjs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("(function ($) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    \"use strict\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!$.browser) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.browser = {};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.browser.mozilla = /mozilla/.test(navigator.userAgent.toLowerCase()) && !/webkit/.test(navigator.userAgent.toLowerCase());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.browser.webkit = /webkit/.test(navigator.userAgent.toLowerCase());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.browser.opera = /opera/.test(navigator.userAgent.toLowerCase());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.browser.msie = /msie/.test(navigator.userAgent.toLowerCase());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var methods = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        destroy : function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $(this).unbind(\".maskMoney\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            if ($.browser.msie) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                this.onpaste = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return this;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        mask : function (value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var $this = $(this);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (typeof value === \"number\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $this.val(value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return $this.trigger(\"mask\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        unmasked : function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return this.map(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var value = ($(this).val() || \"0\"),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    isNegative = value.indexOf(\"-\") !== -1,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    decimalPart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                // get the last position of the array that is a number(coercion makes \"\" to be evaluated as false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $(value.split(/\\D/).reverse()).each(function (index, element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if(element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        decimalPart = element;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                   }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                value = value.replace(/\\D/g, \"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                value = value.replace(new RegExp(decimalPart + \"$\"), \".\" + decimalPart);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if (isNegative) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    value = \"-\" + value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                return parseFloat(value);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        init : function (parameters) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            parameters = $.extend({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                prefix: \"\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                suffix: \"\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                affixesStay: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                thousands: \",\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                decimal: \".\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                precision: 2,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                allowZero: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                allowNegative: false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            }, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("            return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                var $input = $(this), settings,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    onFocusValue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                // data-* api");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                settings = $.extend({}, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                settings = $.extend(settings, $input.data());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function getInputSelection() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var el = $input.get(0),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        start = 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        end = 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        normalizedValue,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        range,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        textInputRange,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        len,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        endRange;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if (typeof el.selectionStart === \"number\" && typeof el.selectionEnd === \"number\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        start = el.selectionStart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        end = el.selectionEnd;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        range = document.selection.createRange();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        if (range && range.parentElement() === el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            len = el.value.length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            normalizedValue = el.value.replace(/\\r\\n/g, \"\\n\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                            // Create a working TextRange that lives only in the input");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            textInputRange = el.createTextRange();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            textInputRange.moveToBookmark(range.getBookmark());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                            // Check if the start and end of the selection are at the very end");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            // of the input, since moveStart/moveEnd doesn't return what we want");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            // in those cases");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            endRange = el.createTextRange();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            endRange.collapse(false);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                            if (textInputRange.compareEndPoints(\"StartToEnd\", endRange) > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                start = end = len;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                start = -textInputRange.moveStart(\"character\", -len);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                start += normalizedValue.slice(0, start).split(\"\\n\").length - 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                                if (textInputRange.compareEndPoints(\"EndToEnd\", endRange) > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    end = len;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    end = -textInputRange.moveEnd(\"character\", -len);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    end += normalizedValue.slice(0, end).split(\"\\n\").length - 1;");  //$NON-NLS-1$        
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
        out.write("                    return {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        start: start,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        end: end");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                } // getInputSelection");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function canInputMoreNumbers() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var haventReachedMaxLength = !($input.val().length >= $input.attr(\"maxlength\") && $input.attr(\"maxlength\") >= 0),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        selection = getInputSelection(),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        start = selection.start,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        end = selection.end,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        haveNumberSelected = (selection.start !== selection.end && $input.val().substring(start, end).match(/\\d/)) ? true : false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        startWithZero = ($input.val().substring(0, 1) === \"0\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return haventReachedMaxLength || haveNumberSelected || startWithZero;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function setCursorPosition(pos) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $input.each(function (index, elem) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (elem.setSelectionRange) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            elem.focus();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            elem.setSelectionRange(pos, pos);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else if (elem.createTextRange) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            var range = elem.createTextRange();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            range.collapse(true);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            range.moveEnd(\"character\", pos);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            range.moveStart(\"character\", pos);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            range.select();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function setSymbol(value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var operator = \"\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (value.indexOf(\"-\") > -1) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        value = value.replace(\"-\", \"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        operator = \"-\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return operator + settings.prefix + value + settings.suffix;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function maskValue(value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var negative = (value.indexOf(\"-\") > -1 && settings.allowNegative) ? \"-\" : \"\",");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        onlyNumbers = value.replace(/[^0-9]/g, \"\"),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        integerPart = onlyNumbers.slice(0, onlyNumbers.length - settings.precision),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        newValue,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        decimalPart,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        leadingZeros;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    // remove initial zeros");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    integerPart = integerPart.replace(/^0*/g, \"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    // put settings.thousands every 3 chars");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    integerPart = integerPart.replace(/\\B(?=(\\d{3})+(?!\\d))/g, settings.thousands);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (integerPart === \"\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        integerPart = \"0\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    newValue = negative + integerPart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if (settings.precision > 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        decimalPart = onlyNumbers.slice(onlyNumbers.length - settings.precision);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        leadingZeros = new Array((settings.precision + 1) - decimalPart.length).join(0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        newValue += settings.decimal + leadingZeros + decimalPart;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return setSymbol(newValue);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("                function maskAndPosition(startPos) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var originalLen = $input.val().length,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        newLen;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $input.val(maskValue($input.val()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    newLen = $input.val().length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    startPos = startPos - (originalLen - newLen);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    setCursorPosition(startPos);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function mask() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var value = $input.val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (settings.precision > 0 && value.indexOf(settings.decimal) < 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        value += settings.decimal + new Array(settings.precision+1).join(0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    $input.val(maskValue(value));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function changeSign() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var inputValue = $input.val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (settings.allowNegative) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (inputValue !== \"\" && inputValue.charAt(0) === \"-\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return inputValue.replace(\"-\", \"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return \"-\" + inputValue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return inputValue;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function preventDefault(e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (e.preventDefault) { //standard browsers");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        e.preventDefault();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else { // old internet explorer");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        e.returnValue = false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function keypressEvent(e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    e = e || window.event;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var key = e.which || e.charCode || e.keyCode,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        keyPressedChar,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        selection,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        startPos,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        endPos,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    //added to handle an IE \"special\" event");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (key === undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    // any key except the numbers 0-9");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (key < 48 || key > 57) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        // -(minus) key");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (key === 45) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val(changeSign());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        // +(plus) key");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else if (key === 43) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val($input.val().replace(\"-\", \"\"));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        // enter key or tab key");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else if (key === 13 || key === 9) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else if ($.browser.mozilla && (key === 37 || key === 39) && e.charCode === 0) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            // needed for left arrow key or right arrow key with firefox");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            // the charCode part is to avoid allowing \"%\"(e.charCode 0, e.keyCode 37)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else { // any other key with keycode less than 48 and greater than 57");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            preventDefault(e);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else if (!canInputMoreNumbers()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        preventDefault(e);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        keyPressedChar = String.fromCharCode(key);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        selection = getInputSelection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        startPos = selection.start;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        endPos = selection.end;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        value = $input.val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        $input.val(value.substring(0, startPos) + keyPressedChar + value.substring(endPos, value.length));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        maskAndPosition(startPos + 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function keydownEvent(e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    e = e || window.event;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var key = e.which || e.charCode || e.keyCode,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        selection,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        startPos,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        endPos,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        value,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        lastNumber;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    //needed to handle an IE \"special\" event");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (key === undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    selection = getInputSelection();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    startPos = selection.start;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    endPos = selection.end;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if (key === 8 || key === 46 || key === 63272) { // backspace or delete key (with special case for safari)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        preventDefault(e);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        value = $input.val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        // not a selection");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (startPos === endPos) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            // backspace");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            if (key === 8) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                if (settings.suffix === \"\") {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    startPos -= 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    // needed to find the position of the last number to be erased");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    lastNumber = value.split(\"\").reverse().join(\"\").search(/\\d/);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    startPos = value.length - lastNumber - 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                    endPos = startPos + 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            //delete");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                endPos += 1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        $input.val(value.substring(0, startPos) + value.substring(endPos, value.length));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                        maskAndPosition(startPos);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else if (key === 9) { // tab key");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else { // any other key");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        return true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function focusEvent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    onFocusValue = $input.val();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    mask();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var input = $input.get(0),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        textRange;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (input.createTextRange) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        textRange = input.createTextRange();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        textRange.collapse(false); // set the cursor at the end of the input");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        textRange.select();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function cutPasteEvent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    setTimeout(function() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        mask();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }, 0);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function getDefaultMask() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var n = parseFloat(\"0\") / Math.pow(10, settings.precision);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    return (n.toFixed(settings.precision)).replace(new RegExp(\"\\\\.\", \"g\"), settings.decimal);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function blurEvent(e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if ($.browser.msie) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        keypressEvent(e);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                    if ($input.val() === \"\" || $input.val() === setSymbol(getDefaultMask())) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (!settings.allowZero) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val(\"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else if (!settings.affixesStay) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val(getDefaultMask());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val(setSymbol(getDefaultMask()));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        if (!settings.affixesStay) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            var newValue = $input.val().replace(settings.prefix, \"\").replace(settings.suffix, \"\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                            $input.val(newValue);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if ($input.val() !== onFocusValue) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        $input.change();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                function clickEvent() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    var input = $input.get(0),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    if (input.setSelectionRange) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        length = $input.val().length;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        input.setSelectionRange(length, length);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                        $input.val($input.val());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("                $input.unbind(\".maskMoney\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"keypress.maskMoney\", keypressEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"keydown.maskMoney\", keydownEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"blur.maskMoney\", blurEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"focus.maskMoney\", focusEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"click.maskMoney\", clickEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"cut.maskMoney\", cutPasteEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"paste.maskMoney\", cutPasteEvent);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                $input.bind(\"mask.maskMoney\", mask);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            });");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.fn.maskMoney = function (method) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (methods[method]) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else if (typeof method === \"object\" || ! method) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return methods.init.apply(this, arguments);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            $.error(\"Method \" +  method + \" does not exist on jQuery.maskMoney\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    };");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("})(window.jQuery || window.Zepto);");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
