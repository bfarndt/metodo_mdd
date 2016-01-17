package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_validatorjs implements JET2Template {
    private final String templateFile;

    public _jet_validatorjs(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap (plugin): validator.js v0.9.0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * The MIT License (MIT)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright (c) 2015 Cina Saffary.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Made by @1000hz in the style of Bootstrap 3 era @fat");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Permission is hereby granted, free of charge, to any person obtaining a copy");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * of this software and associated documentation files (the \"Software\"), to deal");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * in the Software without restriction, including without limitation the rights");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * copies of the Software, and to permit persons to whom the Software is");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * furnished to do so, subject to the following conditions:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * The above copyright notice and this permission notice shall be included in");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * all copies or substantial portions of the Software.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * THE SOFTWARE.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ======================================================================== */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("+function ($) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  'use strict';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  // VALIDATOR CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Validator = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options  = options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    options.errors = $.extend({}, Validator.DEFAULTS.errors, options.errors)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    for (var custom in options.custom) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!options.errors[custom]) throw new Error('Missing default error message for custom validator: ' + custom)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.extend(Validator.VALIDATORS, options.custom)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.attr('novalidate', true) // disable automatic native validation");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.toggleSubmit()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.on('input.bs.validator change.bs.validator focusout.bs.validator', $.proxy(this.validateInput, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.on('submit.bs.validator', $.proxy(this.onSubmit, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.find('[data-match]').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this  = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var target = $this.data('match')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $(target).on('input.bs.validator', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $this.val() && $this.trigger('input.bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.INPUT_SELECTOR = ':input:not([type=\"submit\"], button):enabled:visible'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    delay: 500,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    html: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    disable: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    custom: {},");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    errors: {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      match: 'Does not match',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      minlength: 'Not long enough'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    feedback: {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      success: 'glyphicon-ok',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      error: 'glyphicon-remove'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.VALIDATORS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    'native': function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var el = $el[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return el.checkValidity ? el.checkValidity() : true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    'match': function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var target = $el.data('match')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return !$el.val() || $el.val() === $(target).val()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    },");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    'minlength': function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var minlength = $el.data('minlength')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return !$el.val() || $el.val().length >= minlength");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.validateInput = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $el        = $(e.target)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var prevErrors = $el.data('bs.validator.errors')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var errors");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($el.is('[type=\"radio\"]')) $el = this.$element.find('input[name=\"' + $el.attr('name') + '\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.trigger(e = $.Event('validate.bs.validator', {relatedTarget: $el[0]}))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var self = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.runValidators($el).done(function (errors) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $el.data('bs.validator.errors', errors)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      errors.length ? self.showErrors($el) : self.clearErrors($el)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!prevErrors || errors.toString() !== prevErrors.toString()) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        e = errors.length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          ? $.Event('invalid.bs.validator', {relatedTarget: $el[0], detail: errors})");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          : $.Event('valid.bs.validator', {relatedTarget: $el[0], detail: prevErrors})");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        self.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      self.toggleSubmit()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      self.$element.trigger($.Event('validated.bs.validator', {relatedTarget: $el[0]}))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.runValidators = function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var errors   = []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var deferred = $.Deferred()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var options  = this.options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $el.data('bs.validator.deferred') && $el.data('bs.validator.deferred').reject()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $el.data('bs.validator.deferred', deferred)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    function getErrorMessage(key) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return $el.data(key + '-error')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        || $el.data('error')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        || key == 'native' && $el[0].validationMessage");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        || options.errors[key]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.each(Validator.VALIDATORS, $.proxy(function (key, validator) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (($el.data(key) || key == 'native') && !validator.call(this, $el)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var error = getErrorMessage(key)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        !~errors.indexOf(error) && errors.push(error)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!errors.length && $el.val() && $el.data('remote')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.defer($el, function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var data = {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        data[$el.attr('name')] = $el.val()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $.get($el.data('remote'), data)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .fail(function (jqXHR, textStatus, error) { errors.push(getErrorMessage('remote') || error) })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .always(function () { deferred.resolve(errors)})");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else deferred.resolve(errors)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return deferred.promise()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.validate = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var delay = this.options.delay");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.options.delay = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.find(Validator.INPUT_SELECTOR).trigger('input.bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options.delay = delay");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.showErrors = function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var method = this.options.html ? 'html' : 'text'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.defer($el, function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $group = $el.closest('.form-group')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $block = $group.find('.help-block.with-errors')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $feedback = $group.find('.form-control-feedback')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var errors = $el.data('bs.validator.errors')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!errors.length) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      errors = $('<ul/>')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('list-unstyled')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .append($.map(errors, function (error) { return $('<li/>')[method](error) }))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $block.data('bs.validator.originalContent') === undefined && $block.data('bs.validator.originalContent', $block.html())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $block.empty().append(errors)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $group.addClass('has-error')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $feedback.length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && $feedback.removeClass(this.options.feedback.success)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && $feedback.addClass(this.options.feedback.error)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && $group.removeClass('has-success')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.clearErrors = function ($el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $group = $el.closest('.form-group')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $block = $group.find('.help-block.with-errors')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $feedback = $group.find('.form-control-feedback')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $block.html($block.data('bs.validator.originalContent'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $group.removeClass('has-error')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $feedback.length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && $feedback.removeClass(this.options.feedback.error)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && $feedback.addClass(this.options.feedback.success)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && $group.addClass('has-success')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.hasErrors = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    function fieldErrors() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return !!($(this).data('bs.validator.errors') || []).length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return !!this.$element.find(Validator.INPUT_SELECTOR).filter(fieldErrors).length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.isIncomplete = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    function fieldIncomplete() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return this.type === 'checkbox' ? !this.checked                                   :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("             this.type === 'radio'    ? !$('[name=\"' + this.name + '\"]:checked').length :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                                        $.trim(this.value) === ''");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return !!this.$element.find(Validator.INPUT_SELECTOR).filter('[required]').filter(fieldIncomplete).length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.onSubmit = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.validate()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.isIncomplete() || this.hasErrors()) e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.toggleSubmit = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if(!this.options.disable) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $btn = $('button[type=\"submit\"], input[type=\"submit\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .filter('[form=\"' + this.$element.attr('id') + '\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .add(this.$element.find('input[type=\"submit\"], button[type=\"submit\"]'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $btn.toggleClass('disabled', this.isIncomplete() || this.hasErrors())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.defer = function ($el, callback) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    callback = $.proxy(callback, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!this.options.delay) return callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    window.clearTimeout($el.data('bs.validator.timeout'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $el.data('bs.validator.timeout', window.setTimeout(callback, this.options.delay))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Validator.prototype.destroy = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeAttr('novalidate')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeData('bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .off('.bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.find(Validator.INPUT_SELECTOR)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .off('.bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeData(['bs.validator.errors', 'bs.validator.deferred'])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var timeout = $this.data('bs.validator.timeout')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        window.clearTimeout(timeout) && $this.removeData('bs.validator.timeout')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.find('.help-block.with-errors').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var originalContent = $this.data('bs.validator.originalContent')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeData('bs.validator.originalContent')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .html(originalContent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.find('input[type=\"submit\"], button[type=\"submit\"]').removeClass('disabled')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.find('.has-error').removeClass('has-error')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  // VALIDATOR PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = $.extend({}, Validator.DEFAULTS, $this.data(), typeof option == 'object' && option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.validator')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data && option == 'destroy') return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.validator', (data = new Validator(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.validator");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.validator             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.validator.Constructor = Validator");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // VALIDATOR NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.validator.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.validator = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // VALIDATOR DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(window).on('load', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $('form[data-toggle=\"validator\"]').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $form = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      Plugin.call($form, $form.data())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
