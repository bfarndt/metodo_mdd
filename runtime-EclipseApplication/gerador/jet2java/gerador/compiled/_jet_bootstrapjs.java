package gerador.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_bootstrapjs implements JET2Template {
    private final String templateFile;

    public _jet_bootstrapjs(String templateFile) {
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
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("if (typeof jQuery === 'undefined') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  throw new Error('Bootstrap\\'s JavaScript requires jQuery')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("+function ($) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  'use strict';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var version = $.fn.jquery.split(' ')[0].split('.')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  if ((version[0] < 2 && version[1] < 9) || (version[0] == 1 && version[1] == 9 && version[2] < 1)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    throw new Error('Bootstrap\\'s JavaScript requires jQuery version 1.9.1 or higher')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: transition.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#transitions");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // CSS TRANSITION SUPPORT (Shoutout: http://www.modernizr.com/)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ============================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function transitionEnd() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var el = document.createElement('bootstrap')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var transEndEventNames = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      WebkitTransition : 'webkitTransitionEnd',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      MozTransition    : 'transitionend',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      OTransition      : 'oTransitionEnd otransitionend',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      transition       : 'transitionend'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    for (var name in transEndEventNames) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (el.style[name] !== undefined) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        return { end: transEndEventNames[name] }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return false // explicit for ie8 (  ._.)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  // http://blog.alexmaccaw.com/css-transitions");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.emulateTransitionEnd = function (duration) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var called = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $el = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(this).one('bsTransitionEnd', function () { called = true })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var callback = function () { if (!called) $($el).trigger($.support.transition.end) }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    setTimeout(callback, duration)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.support.transition = transitionEnd()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$.support.transition) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.event.special.bsTransitionEnd = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      bindType: $.support.transition.end,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      delegateType: $.support.transition.end,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      handle: function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if ($(e.target).is(this)) return e.handleObj.handler.apply(this, arguments)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: alert.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#alerts");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // ALERT CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var dismiss = '[data-dismiss=\"alert\"]'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var Alert   = function (el) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(el).on('click', dismiss, this.close)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Alert.VERSION = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Alert.TRANSITION_DURATION = 150");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Alert.prototype.close = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this    = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var selector = $this.attr('data-target')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!selector) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = $this.attr('href')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = selector && selector.replace(/.*(?=#[^\\s]*$)/, '') // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $parent = $(selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (e) e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$parent.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $parent = $this.closest('.alert')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $parent.trigger(e = $.Event('close.bs.alert'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $parent.removeClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    function removeElement() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      // detach from parent, fire event then clean up data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $parent.detach().trigger('closed.bs.alert').remove()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.support.transition && $parent.hasClass('fade') ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $parent");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .one('bsTransitionEnd', removeElement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .emulateTransitionEnd(Alert.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      removeElement()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // ALERT PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data  = $this.data('bs.alert')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.alert', (data = new Alert(this)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option].call($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.alert");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.alert             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.alert.Constructor = Alert");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // ALERT NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.alert.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.alert = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // ALERT DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document).on('click.bs.alert.data-api', dismiss, Alert.prototype.close)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: button.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#buttons");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // BUTTON PUBLIC CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==============================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Button = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element  = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options   = $.extend({}, Button.DEFAULTS, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.isLoading = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Button.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Button.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    loadingText: 'loading...'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Button.prototype.setState = function (state) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var d    = 'disabled'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $el  = this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var val  = $el.is('input') ? 'val' : 'html'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var data = $el.data()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    state = state + 'Text'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (data.resetText == null) $el.data('resetText', $el[val]())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // push to event loop to allow forms to submit");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    setTimeout($.proxy(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $el[val](data[state] == null ? this.options[state] : data[state])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (state == 'loadingText') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.isLoading = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $el.addClass(d).attr(d, d)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      } else if (this.isLoading) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.isLoading = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $el.removeClass(d).removeAttr(d)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }, this), 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Button.prototype.toggle = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var changed = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $parent = this.$element.closest('[data-toggle=\"buttons\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($parent.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $input = this.$element.find('input')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if ($input.prop('type') == 'radio') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if ($input.prop('checked') && this.$element.hasClass('active')) changed = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        else $parent.find('.active').removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (changed) $input.prop('checked', !this.$element.hasClass('active')).trigger('change')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.attr('aria-pressed', !this.$element.hasClass('active'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (changed) this.$element.toggleClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // BUTTON PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.button')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = typeof option == 'object' && option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.button', (data = new Button(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (option == 'toggle') data.toggle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      else if (option) data.setState(option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.button");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.button             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.button.Constructor = Button");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // BUTTON NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.button.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.button = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // BUTTON DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.button.data-api', '[data-toggle^=\"button\"]', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $btn = $(e.target)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!$btn.hasClass('btn')) $btn = $btn.closest('.btn')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      Plugin.call($btn, 'toggle')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('focus.bs.button.data-api blur.bs.button.data-api', '[data-toggle^=\"button\"]', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $(e.target).closest('.btn').toggleClass('focus', /^focus(in)?$/.test(e.type))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: carousel.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#carousel");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // CAROUSEL CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Carousel = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element    = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$indicators = this.$element.find('.carousel-indicators')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options     = options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.paused      = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.sliding     = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.interval    = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$active     = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$items      = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.options.keyboard && this.$element.on('keydown.bs.carousel', $.proxy(this.keydown, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.options.pause == 'hover' && !('ontouchstart' in document.documentElement) && this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .on('mouseenter.bs.carousel', $.proxy(this.pause, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .on('mouseleave.bs.carousel', $.proxy(this.cycle, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.TRANSITION_DURATION = 600");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    interval: 5000,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    pause: 'hover',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    wrap: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    keyboard: true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.keydown = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (/input|textarea/i.test(e.target.tagName)) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    switch (e.which) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      case 37: this.prev(); break");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      case 39: this.next(); break");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      default: return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.cycle = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    e || (this.paused = false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.interval && clearInterval(this.interval)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.options.interval");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && !this.paused");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && (this.interval = setInterval($.proxy(this.next, this), this.options.interval))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.getItemIndex = function (item) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$items = item.parent().children('.item')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.$items.index(item || this.$active)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.getItemForDirection = function (direction, active) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var activeIndex = this.getItemIndex(active)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var willWrap = (direction == 'prev' && activeIndex === 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                || (direction == 'next' && activeIndex == (this.$items.length - 1))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (willWrap && !this.options.wrap) return active");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var delta = direction == 'prev' ? -1 : 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var itemIndex = (activeIndex + delta) % this.$items.length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.$items.eq(itemIndex)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.to = function (pos) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that        = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var activeIndex = this.getItemIndex(this.$active = this.$element.find('.item.active'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (pos > (this.$items.length - 1) || pos < 0) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.sliding)       return this.$element.one('slid.bs.carousel', function () { that.to(pos) }) // yes, \"slid\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (activeIndex == pos) return this.pause().cycle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this.slide(pos > activeIndex ? 'next' : 'prev', this.$items.eq(pos))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.pause = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    e || (this.paused = true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.$element.find('.next, .prev').length && $.support.transition) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.trigger($.support.transition.end)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.cycle(true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.interval = clearInterval(this.interval)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.next = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.sliding) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.slide('next')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.prev = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.sliding) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.slide('prev')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Carousel.prototype.slide = function (type, next) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $active   = this.$element.find('.item.active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $next     = next || this.getItemForDirection(type, $active)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var isCycling = this.interval");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var direction = type == 'next' ? 'left' : 'right'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that      = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($next.hasClass('active')) return (this.sliding = false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var relatedTarget = $next[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var slideEvent = $.Event('slide.bs.carousel', {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      relatedTarget: relatedTarget,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      direction: direction");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.trigger(slideEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (slideEvent.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.sliding = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    isCycling && this.pause()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.$indicators.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$indicators.find('.active').removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $nextIndicator = $(this.$indicators.children()[this.getItemIndex($next)])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $nextIndicator && $nextIndicator.addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var slidEvent = $.Event('slid.bs.carousel', { relatedTarget: relatedTarget, direction: direction }) // yes, \"slid\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if ($.support.transition && this.$element.hasClass('slide')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $next.addClass(type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $next[0].offsetWidth // force reflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $active.addClass(direction)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $next.addClass(direction)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $active");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .one('bsTransitionEnd', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          $next.removeClass([type, direction].join(' ')).addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          $active.removeClass(['active', direction].join(' '))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          that.sliding = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$element.trigger(slidEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          }, 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .emulateTransitionEnd(Carousel.TRANSITION_DURATION)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $active.removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $next.addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.sliding = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.trigger(slidEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    isCycling && this.cycle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // CAROUSEL PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.carousel')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = $.extend({}, Carousel.DEFAULTS, $this.data(), typeof option == 'object' && option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var action  = typeof option == 'string' ? option : options.slide");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.carousel', (data = new Carousel(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'number') data.to(option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      else if (action) data[action]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      else if (options.interval) data.pause().cycle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.carousel");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.carousel             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.carousel.Constructor = Carousel");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // CAROUSEL NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.carousel.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.carousel = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // CAROUSEL DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var clickHandler = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var href");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $target = $($this.attr('data-target') || (href = $this.attr('href')) && href.replace(/.*(?=#[^\\s]+$)/, '')) // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!$target.hasClass('carousel')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var options = $.extend({}, $target.data(), $this.data())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var slideIndex = $this.attr('data-slide-to')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (slideIndex) options.interval = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    Plugin.call($target, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (slideIndex) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $target.data('bs.carousel').to(slideIndex)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.carousel.data-api', '[data-slide]', clickHandler)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.carousel.data-api', '[data-slide-to]', clickHandler)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(window).on('load', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $('[data-ride=\"carousel\"]').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $carousel = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      Plugin.call($carousel, $carousel.data())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: collapse.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#collapse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // COLLAPSE PUBLIC CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Collapse = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element      = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options       = $.extend({}, Collapse.DEFAULTS, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$trigger      = $('[data-toggle=\"collapse\"][href=\"#' + element.id + '\"],' +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                           '[data-toggle=\"collapse\"][data-target=\"#' + element.id + '\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.transitioning = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.options.parent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$parent = this.getParent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.addAriaAndCollapsedClass(this.$element, this.$trigger)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.options.toggle) this.toggle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.TRANSITION_DURATION = 350");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    toggle: true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.dimension = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var hasWidth = this.$element.hasClass('width')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return hasWidth ? 'width' : 'height'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.show = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.transitioning || this.$element.hasClass('in')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var activesData");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var actives = this.$parent && this.$parent.children('.panel').children('.in, .collapsing')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (actives && actives.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      activesData = actives.data('bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (activesData && activesData.transitioning) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var startEvent = $.Event('show.bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.trigger(startEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (startEvent.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (actives && actives.length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      Plugin.call(actives, 'hide')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      activesData || actives.data('bs.collapse', null)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var dimension = this.dimension()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeClass('collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .addClass('collapsing')[dimension](0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-expanded', true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$trigger");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeClass('collapsed')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-expanded', true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.transitioning = 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var complete = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeClass('collapsing')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('collapse in')[dimension]('')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.transitioning = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger('shown.bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$.support.transition) return complete.call(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var scrollSize = $.camelCase(['scroll', dimension].join('-'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .one('bsTransitionEnd', $.proxy(complete, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .emulateTransitionEnd(Collapse.TRANSITION_DURATION)[dimension](this.$element[0][scrollSize])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.hide = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.transitioning || !this.$element.hasClass('in')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var startEvent = $.Event('hide.bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.trigger(startEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (startEvent.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var dimension = this.dimension()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element[dimension](this.$element[dimension]())[0].offsetHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .addClass('collapsing')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeClass('collapse in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-expanded', false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$trigger");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .addClass('collapsed')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-expanded', false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.transitioning = 1");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var complete = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.transitioning = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeClass('collapsing')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger('hidden.bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$.support.transition) return complete.call(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      [dimension](0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .one('bsTransitionEnd', $.proxy(complete, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .emulateTransitionEnd(Collapse.TRANSITION_DURATION)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.toggle = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this[this.$element.hasClass('in') ? 'hide' : 'show']()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.getParent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return $(this.options.parent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .find('[data-toggle=\"collapse\"][data-parent=\"' + this.options.parent + '\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .each($.proxy(function (i, element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $element = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.addAriaAndCollapsedClass(getTargetFromTrigger($element), $element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .end()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Collapse.prototype.addAriaAndCollapsedClass = function ($element, $trigger) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var isOpen = $element.hasClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $element.attr('aria-expanded', isOpen)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $trigger");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .toggleClass('collapsed', !isOpen)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-expanded', isOpen)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function getTargetFromTrigger($trigger) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var href");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var target = $trigger.attr('data-target')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      || (href = $trigger.attr('href')) && href.replace(/.*(?=#[^\\s]+$)/, '') // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return $(target)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // COLLAPSE PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = $.extend({}, Collapse.DEFAULTS, $this.data(), typeof option == 'object' && option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data && options.toggle && /show|hide/.test(option)) options.toggle = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.collapse', (data = new Collapse(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.collapse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.collapse             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.collapse.Constructor = Collapse");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // COLLAPSE NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.collapse.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.collapse = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // COLLAPSE DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document).on('click.bs.collapse.data-api', '[data-toggle=\"collapse\"]', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$this.attr('data-target')) e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $target = getTargetFromTrigger($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var data    = $target.data('bs.collapse')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var option  = data ? 'toggle' : $this.data()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    Plugin.call($target, option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: dropdown.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#dropdowns");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // DROPDOWN CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var backdrop = '.dropdown-backdrop'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var toggle   = '[data-toggle=\"dropdown\"]'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  var Dropdown = function (element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(element).on('click.bs.dropdown', this.toggle)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Dropdown.VERSION = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Dropdown.prototype.toggle = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($this.is('.disabled, :disabled')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $parent  = getParent($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var isActive = $parent.hasClass('open')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    clearMenus()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!isActive) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if ('ontouchstart' in document.documentElement && !$parent.closest('.navbar-nav').length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        // if mobile we use a backdrop because click events don't delegate");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $('<div class=\"dropdown-backdrop\"/>').insertAfter($(this)).on('click', clearMenus)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var relatedTarget = { relatedTarget: this }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $parent.trigger(e = $.Event('show.bs.dropdown', relatedTarget))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger('focus')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .attr('aria-expanded', 'true')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $parent");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .toggleClass('open')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger('shown.bs.dropdown', relatedTarget)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Dropdown.prototype.keydown = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!/(38|40|27|32)/.test(e.which) || /input|textarea/i.test(e.target.tagName)) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    e.stopPropagation()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($this.is('.disabled, :disabled')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $parent  = getParent($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var isActive = $parent.hasClass('open')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ((!isActive && e.which != 27) || (isActive && e.which == 27)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (e.which == 27) $parent.find(toggle).trigger('focus')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return $this.trigger('click')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var desc = ' li:not(.disabled):visible a'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $items = $parent.find('[role=\"menu\"]' + desc + ', [role=\"listbox\"]' + desc)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$items.length) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var index = $items.index(e.target)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (e.which == 38 && index > 0)                 index--                        // up");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (e.which == 40 && index < $items.length - 1) index++                        // down");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!~index)                                      index = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $items.eq(index).trigger('focus')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function clearMenus(e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (e && e.which === 3) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(backdrop).remove()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(toggle).each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this         = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $parent       = getParent($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var relatedTarget = { relatedTarget: this }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!$parent.hasClass('open')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $parent.trigger(e = $.Event('hide.bs.dropdown', relatedTarget))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $this.attr('aria-expanded', 'false')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $parent.removeClass('open').trigger('hidden.bs.dropdown', relatedTarget)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function getParent($this) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var selector = $this.attr('data-target')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!selector) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = $this.attr('href')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = selector && /#[A-Za-z]/.test(selector) && selector.replace(/.*(?=#[^\\s]*$)/, '') // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $parent = selector && $(selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return $parent && $parent.length ? $parent : $this.parent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // DROPDOWN PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data  = $this.data('bs.dropdown')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.dropdown', (data = new Dropdown(this)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option].call($this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.dropdown");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.dropdown             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.dropdown.Constructor = Dropdown");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // DROPDOWN NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.dropdown.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.dropdown = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // APPLY TO STANDARD DROPDOWN ELEMENTS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.dropdown.data-api', clearMenus)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.dropdown.data-api', '.dropdown form', function (e) { e.stopPropagation() })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.dropdown.data-api', toggle, Dropdown.prototype.toggle)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('keydown.bs.dropdown.data-api', toggle, Dropdown.prototype.keydown)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('keydown.bs.dropdown.data-api', '[role=\"menu\"]', Dropdown.prototype.keydown)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('keydown.bs.dropdown.data-api', '[role=\"listbox\"]', Dropdown.prototype.keydown)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: modal.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#modals");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // MODAL CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Modal = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options             = options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body               = $(document.body)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element            = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$dialog             = this.$element.find('.modal-dialog')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$backdrop           = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.isShown             = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.originalBodyPad     = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.scrollbarWidth      = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.ignoreBackdropClick = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.options.remote) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .find('.modal-content')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .load(this.options.remote, $.proxy(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          this.$element.trigger('loaded.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.TRANSITION_DURATION = 300");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  Modal.BACKDROP_TRANSITION_DURATION = 150");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    backdrop: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    keyboard: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    show: true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.toggle = function (_relatedTarget) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.isShown ? this.hide() : this.show(_relatedTarget)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.show = function (_relatedTarget) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var e    = $.Event('show.bs.modal', { relatedTarget: _relatedTarget })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.isShown || e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.isShown = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.checkScrollbar()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.setScrollbar()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body.addClass('modal-open')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.escape()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.resize()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.on('click.dismiss.bs.modal', '[data-dismiss=\"modal\"]', $.proxy(this.hide, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$dialog.on('mousedown.dismiss.bs.modal', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.$element.one('mouseup.dismiss.bs.modal', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if ($(e.target).is(that.$element)) that.ignoreBackdropClick = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.backdrop(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var transition = $.support.transition && that.$element.hasClass('fade')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!that.$element.parent().length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$element.appendTo(that.$body) // don't move modals dom position");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      that.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .show()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .scrollTop(0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      that.adjustDialog()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (transition) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$element[0].offsetWidth // force reflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      that.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .attr('aria-hidden', false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      that.enforceFocus()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var e = $.Event('shown.bs.modal', { relatedTarget: _relatedTarget })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      transition ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$dialog // wait for modal to slide in");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .one('bsTransitionEnd', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            that.$element.trigger('focus').trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .emulateTransitionEnd(Modal.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$element.trigger('focus').trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.hide = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (e) e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    e = $.Event('hide.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!this.isShown || e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.isShown = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.escape()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.resize()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $(document).off('focusin.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .attr('aria-hidden', true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .off('click.dismiss.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .off('mouseup.dismiss.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$dialog.off('mousedown.dismiss.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.support.transition && this.$element.hasClass('fade') ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .one('bsTransitionEnd', $.proxy(this.hideModal, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .emulateTransitionEnd(Modal.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.hideModal()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.enforceFocus = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(document)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .off('focusin.bs.modal') // guard against infinite focus loop");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .on('focusin.bs.modal', $.proxy(function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.$element[0] !== e.target && !this.$element.has(e.target).length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          this.$element.trigger('focus')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.escape = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.isShown && this.options.keyboard) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.on('keydown.dismiss.bs.modal', $.proxy(function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        e.which == 27 && this.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else if (!this.isShown) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.off('keydown.dismiss.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.resize = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.isShown) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $(window).on('resize.bs.modal', $.proxy(this.handleUpdate, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $(window).off('resize.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.hideModal = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.backdrop(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.$body.removeClass('modal-open')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.resetAdjustments()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.resetScrollbar()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.$element.trigger('hidden.bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.removeBackdrop = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$backdrop && this.$backdrop.remove()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$backdrop = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.backdrop = function (callback) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var animate = this.$element.hasClass('fade') ? 'fade' : ''");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.isShown && this.options.backdrop) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var doAnimate = $.support.transition && animate");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.$backdrop = $('<div class=\"modal-backdrop ' + animate + '\" />')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .appendTo(this.$body)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.$element.on('click.dismiss.bs.modal', $.proxy(function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (this.ignoreBackdropClick) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          this.ignoreBackdropClick = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if (e.target !== e.currentTarget) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.backdrop == 'static'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          ? this.$element[0].focus()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          : this.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (doAnimate) this.$backdrop[0].offsetWidth // force reflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.$backdrop.addClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!callback) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      doAnimate ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$backdrop");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .one('bsTransitionEnd', callback)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .emulateTransitionEnd(Modal.BACKDROP_TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    } else if (!this.isShown && this.$backdrop) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$backdrop.removeClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var callbackRemove = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.removeBackdrop()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        callback && callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $.support.transition && this.$element.hasClass('fade') ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$backdrop");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .one('bsTransitionEnd', callbackRemove)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .emulateTransitionEnd(Modal.BACKDROP_TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        callbackRemove()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    } else if (callback) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  // these following methods are used to handle overflowing modals");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.handleUpdate = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.adjustDialog()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.adjustDialog = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var modalIsOverflowing = this.$element[0].scrollHeight > document.documentElement.clientHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      paddingLeft:  !this.bodyIsOverflowing && modalIsOverflowing ? this.scrollbarWidth : '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      paddingRight: this.bodyIsOverflowing && !modalIsOverflowing ? this.scrollbarWidth : ''");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.resetAdjustments = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      paddingLeft: '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      paddingRight: ''");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.checkScrollbar = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var fullWindowWidth = window.innerWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!fullWindowWidth) { // workaround for missing window.innerWidth in IE8");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var documentElementRect = document.documentElement.getBoundingClientRect()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      fullWindowWidth = documentElementRect.right - Math.abs(documentElementRect.left)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.bodyIsOverflowing = document.body.clientWidth < fullWindowWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.scrollbarWidth = this.measureScrollbar()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.setScrollbar = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var bodyPad = parseInt((this.$body.css('padding-right') || 0), 10)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.originalBodyPad = document.body.style.paddingRight || ''");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.bodyIsOverflowing) this.$body.css('padding-right', bodyPad + this.scrollbarWidth)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.resetScrollbar = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body.css('padding-right', this.originalBodyPad)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Modal.prototype.measureScrollbar = function () { // thx walsh");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollDiv = document.createElement('div')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    scrollDiv.className = 'modal-scrollbar-measure'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body.append(scrollDiv)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollbarWidth = scrollDiv.offsetWidth - scrollDiv.clientWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body[0].removeChild(scrollDiv)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return scrollbarWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // MODAL PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option, _relatedTarget) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.modal')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = $.extend({}, Modal.DEFAULTS, $this.data(), typeof option == 'object' && option)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.modal', (data = new Modal(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option](_relatedTarget)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      else if (options.show) data.show(_relatedTarget)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.modal");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.modal             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.modal.Constructor = Modal");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // MODAL NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.modal.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.modal = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // MODAL DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document).on('click.bs.modal.data-api', '[data-toggle=\"modal\"]', function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var href    = $this.attr('href')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $target = $($this.attr('data-target') || (href && href.replace(/.*(?=#[^\\s]+$)/, ''))) // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var option  = $target.data('bs.modal') ? 'toggle' : $.extend({ remote: !/#/.test(href) && href }, $target.data(), $this.data())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($this.is('a')) e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $target.one('show.bs.modal', function (showEvent) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (showEvent.isDefaultPrevented()) return // only register focus restorer if modal will actually get shown");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $target.one('hidden.bs.modal', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $this.is(':visible') && $this.trigger('focus')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    Plugin.call($target, option, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: tooltip.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#tooltip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Inspired by the original jQuery.tipsy by Jason Frame");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // TOOLTIP PUBLIC CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===============================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Tooltip = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.type       = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options    = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.enabled    = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.timeout    = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.hoverState = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element   = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.init('tooltip', element, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.TRANSITION_DURATION = 150");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    animation: true,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    placement: 'top',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    selector: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    template: '<div class=\"tooltip\" role=\"tooltip\"><div class=\"tooltip-arrow\"></div><div class=\"tooltip-inner\"></div></div>',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    trigger: 'hover focus',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    title: '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    delay: 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    html: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    container: false,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    viewport: {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector: 'body',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      padding: 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.init = function (type, element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.enabled   = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.type      = type");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element  = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options   = this.getOptions(options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$viewport = this.options.viewport && $(this.options.viewport.selector || this.options.viewport)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.$element[0] instanceof document.constructor && !this.options.selector) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      throw new Error('`selector` option must be specified when initializing ' + this.type + ' on the window.document object!')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var triggers = this.options.trigger.split(' ')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    for (var i = triggers.length; i--;) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var trigger = triggers[i]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (trigger == 'click') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$element.on('click.' + this.type, this.options.selector, $.proxy(this.toggle, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      } else if (trigger != 'manual') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var eventIn  = trigger == 'hover' ? 'mouseenter' : 'focusin'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var eventOut = trigger == 'hover' ? 'mouseleave' : 'focusout'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        this.$element.on(eventIn  + '.' + this.type, this.options.selector, $.proxy(this.enter, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.$element.on(eventOut + '.' + this.type, this.options.selector, $.proxy(this.leave, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.options.selector ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      (this._options = $.extend({}, this.options, { trigger: 'manual', selector: '' })) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.fixTitle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getDefaults = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return Tooltip.DEFAULTS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getOptions = function (options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    options = $.extend({}, this.getDefaults(), this.$element.data(), options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (options.delay && typeof options.delay == 'number') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      options.delay = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        show: options.delay,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        hide: options.delay");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getDelegateOptions = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var options  = {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var defaults = this.getDefaults()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this._options && $.each(this._options, function (key, value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (defaults[key] != value) options[key] = value");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.enter = function (obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var self = obj instanceof this.constructor ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      obj : $(obj.currentTarget).data('bs.' + this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (self && self.$tip && self.$tip.is(':visible')) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      self.hoverState = 'in'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!self) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      self = new this.constructor(obj.currentTarget, this.getDelegateOptions())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $(obj.currentTarget).data('bs.' + this.type, self)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    clearTimeout(self.timeout)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    self.hoverState = 'in'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!self.options.delay || !self.options.delay.show) return self.show()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    self.timeout = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (self.hoverState == 'in') self.show()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }, self.options.delay.show)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.leave = function (obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var self = obj instanceof this.constructor ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      obj : $(obj.currentTarget).data('bs.' + this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!self) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      self = new this.constructor(obj.currentTarget, this.getDelegateOptions())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $(obj.currentTarget).data('bs.' + this.type, self)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    clearTimeout(self.timeout)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    self.hoverState = 'out'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!self.options.delay || !self.options.delay.hide) return self.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    self.timeout = setTimeout(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (self.hoverState == 'out') self.hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }, self.options.delay.hide)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.show = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var e = $.Event('show.bs.' + this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.hasContent() && this.enabled) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var inDom = $.contains(this.$element[0].ownerDocument.documentElement, this.$element[0])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (e.isDefaultPrevented() || !inDom) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var $tip = this.tip()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var tipId = this.getUID(this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.setContent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $tip.attr('id', tipId)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.attr('aria-describedby', tipId)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (this.options.animation) $tip.addClass('fade')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var placement = typeof this.options.placement == 'function' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.placement.call(this, $tip[0], this.$element[0]) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        this.options.placement");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var autoToken = /\\s?auto?\\s?/i");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var autoPlace = autoToken.test(placement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (autoPlace) placement = placement.replace(autoToken, '') || 'top'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $tip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .detach()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .css({ top: 0, left: 0, display: 'block' })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass(placement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .data('bs.' + this.type, this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.options.container ? $tip.appendTo(this.options.container) : $tip.insertAfter(this.$element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var pos          = this.getPosition()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var actualWidth  = $tip[0].offsetWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var actualHeight = $tip[0].offsetHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (autoPlace) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var orgPlacement = placement");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $container   = this.options.container ? $(this.options.container) : this.$element.parent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var containerDim = this.getPosition($container)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        placement = placement == 'bottom' && pos.bottom + actualHeight > containerDim.bottom ? 'top'    :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    placement == 'top'    && pos.top    - actualHeight < containerDim.top    ? 'bottom' :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    placement == 'right'  && pos.right  + actualWidth  > containerDim.width  ? 'left'   :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    placement == 'left'   && pos.left   - actualWidth  < containerDim.left   ? 'right'  :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    placement");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        $tip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .removeClass(orgPlacement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .addClass(placement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var calculatedOffset = this.getCalculatedOffset(placement, pos, actualWidth, actualHeight)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.applyPlacement(calculatedOffset, placement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var complete = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var prevHoverState = that.hoverState");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.$element.trigger('shown.bs.' + that.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.hoverState = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        if (prevHoverState == 'out') that.leave(that)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      $.support.transition && this.$tip.hasClass('fade') ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $tip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .one('bsTransitionEnd', complete)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .emulateTransitionEnd(Tooltip.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        complete()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.applyPlacement = function (offset, placement) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $tip   = this.tip()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var width  = $tip[0].offsetWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var height = $tip[0].offsetHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // manually read margins because getBoundingClientRect includes difference");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var marginTop = parseInt($tip.css('margin-top'), 10)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var marginLeft = parseInt($tip.css('margin-left'), 10)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // we must check for NaN for ie 8/9");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (isNaN(marginTop))  marginTop  = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (isNaN(marginLeft)) marginLeft = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    offset.top  = offset.top  + marginTop");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    offset.left = offset.left + marginLeft");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // $.fn.offset doesn't round pixel values");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // so we use setOffset directly with our own function B-0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.offset.setOffset($tip[0], $.extend({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      using: function (props) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $tip.css({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          top: Math.round(props.top),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          left: Math.round(props.left)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }, offset), 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.addClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // check to see if placing tip in new offset caused the tip to resize itself");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var actualWidth  = $tip[0].offsetWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var actualHeight = $tip[0].offsetHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (placement == 'top' && actualHeight != height) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      offset.top = offset.top + height - actualHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var delta = this.getViewportAdjustedDelta(placement, offset, actualWidth, actualHeight)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (delta.left) offset.left += delta.left");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    else offset.top += delta.top");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var isVertical          = /top|bottom/.test(placement)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var arrowDelta          = isVertical ? delta.left * 2 - width + actualWidth : delta.top * 2 - height + actualHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var arrowOffsetPosition = isVertical ? 'offsetWidth' : 'offsetHeight'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.offset(offset)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.replaceArrow(arrowDelta, $tip[0][arrowOffsetPosition], isVertical)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.replaceArrow = function (delta, dimension, isVertical) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.arrow()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .css(isVertical ? 'left' : 'top', 50 * (1 - delta / dimension) + '%')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .css(isVertical ? 'top' : 'left', '')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.setContent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $tip  = this.tip()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var title = this.getTitle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.find('.tooltip-inner')[this.options.html ? 'html' : 'text'](title)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $tip.removeClass('fade in top bottom left right')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.hide = function (callback) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $tip = $(this.$tip)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var e    = $.Event('hide.bs.' + this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    function complete() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (that.hoverState != 'in') $tip.detach()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeAttr('aria-describedby')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger('hidden.bs.' + that.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      callback && callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.removeClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $.support.transition && $tip.hasClass('fade') ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $tip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .one('bsTransitionEnd', complete)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .emulateTransitionEnd(Tooltip.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      complete()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.hoverState = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.fixTitle = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $e = this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if ($e.attr('title') || typeof ($e.attr('data-original-title')) != 'string') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $e.attr('data-original-title', $e.attr('title') || '').attr('title', '')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.hasContent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.getTitle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getPosition = function ($element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $element   = $element || this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var el     = $element[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var isBody = el.tagName == 'BODY'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var elRect    = el.getBoundingClientRect()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (elRect.width == null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      // width and height are missing in IE8, so compute them manually; see https://github.com/twbs/bootstrap/issues/14093");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      elRect = $.extend({}, elRect, { width: elRect.right - elRect.left, height: elRect.bottom - elRect.top })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var elOffset  = isBody ? { top: 0, left: 0 } : $element.offset()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scroll    = { scroll: isBody ? document.documentElement.scrollTop || document.body.scrollTop : $element.scrollTop() }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var outerDims = isBody ? { width: $(window).width(), height: $(window).height() } : null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return $.extend({}, elRect, scroll, outerDims, elOffset)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getCalculatedOffset = function (placement, pos, actualWidth, actualHeight) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return placement == 'bottom' ? { top: pos.top + pos.height,   left: pos.left + pos.width / 2 - actualWidth / 2 } :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           placement == 'top'    ? { top: pos.top - actualHeight, left: pos.left + pos.width / 2 - actualWidth / 2 } :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("           placement == 'left'   ? { top: pos.top + pos.height / 2 - actualHeight / 2, left: pos.left - actualWidth } :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        /* placement == 'right' */ { top: pos.top + pos.height / 2 - actualHeight / 2, left: pos.left + pos.width }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getViewportAdjustedDelta = function (placement, pos, actualWidth, actualHeight) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var delta = { top: 0, left: 0 }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!this.$viewport) return delta");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var viewportPadding = this.options.viewport && this.options.viewport.padding || 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var viewportDimensions = this.getPosition(this.$viewport)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (/right|left/.test(placement)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var topEdgeOffset    = pos.top - viewportPadding - viewportDimensions.scroll");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var bottomEdgeOffset = pos.top + viewportPadding - viewportDimensions.scroll + actualHeight");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (topEdgeOffset < viewportDimensions.top) { // top overflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        delta.top = viewportDimensions.top - topEdgeOffset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      } else if (bottomEdgeOffset > viewportDimensions.top + viewportDimensions.height) { // bottom overflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        delta.top = viewportDimensions.top + viewportDimensions.height - bottomEdgeOffset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var leftEdgeOffset  = pos.left - viewportPadding");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var rightEdgeOffset = pos.left + viewportPadding + actualWidth");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (leftEdgeOffset < viewportDimensions.left) { // left overflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        delta.left = viewportDimensions.left - leftEdgeOffset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      } else if (rightEdgeOffset > viewportDimensions.width) { // right overflow");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        delta.left = viewportDimensions.left + viewportDimensions.width - rightEdgeOffset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return delta");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getTitle = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var title");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $e = this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var o  = this.options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    title = $e.attr('data-original-title')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      || (typeof o.title == 'function' ? o.title.call($e[0]) :  o.title)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return title");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.getUID = function (prefix) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    do prefix += ~~(Math.random() * 1000000)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    while (document.getElementById(prefix))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return prefix");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.tip = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return (this.$tip = this.$tip || $(this.options.template))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.arrow = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return (this.$arrow = this.$arrow || this.tip().find('.tooltip-arrow'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.enable = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.enabled = true");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.disable = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.enabled = false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.toggleEnabled = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.enabled = !this.enabled");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.toggle = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var self = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      self = $(e.currentTarget).data('bs.' + this.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!self) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        self = new this.constructor(e.currentTarget, this.getDelegateOptions())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        $(e.currentTarget).data('bs.' + this.type, self)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    self.tip().hasClass('in') ? self.leave(self) : self.enter(self)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tooltip.prototype.destroy = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    clearTimeout(this.timeout)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.hide(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      that.$element.off('.' + that.type).removeData('bs.' + that.type)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // TOOLTIP PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.tooltip')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = typeof option == 'object' && option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data && /destroy|hide/.test(option)) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.tooltip', (data = new Tooltip(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.tooltip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.tooltip             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.tooltip.Constructor = Tooltip");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // TOOLTIP NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.tooltip.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.tooltip = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: popover.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#popovers");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // POPOVER PUBLIC CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===============================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Popover = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.init('popover', element, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  if (!$.fn.tooltip) throw new Error('Popover requires tooltip.js')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.DEFAULTS = $.extend({}, $.fn.tooltip.Constructor.DEFAULTS, {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    placement: 'right',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    trigger: 'click',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    content: '',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    template: '<div class=\"popover\" role=\"tooltip\"><div class=\"arrow\"></div><h3 class=\"popover-title\"></h3><div class=\"popover-content\"></div></div>'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // NOTE: POPOVER EXTENDS tooltip.js");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype = $.extend({}, $.fn.tooltip.Constructor.prototype)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.constructor = Popover");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.getDefaults = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return Popover.DEFAULTS");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.setContent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $tip    = this.tip()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var title   = this.getTitle()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var content = this.getContent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.find('.popover-title')[this.options.html ? 'html' : 'text'](title)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $tip.find('.popover-content').children().detach().end()[ // we use append for html objects to maintain js events");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.options.html ? (typeof content == 'string' ? 'html' : 'append') : 'text'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    ](content)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $tip.removeClass('fade top bottom left right in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    // IE8 doesn't accept hiding via the `:empty` pseudo selector, we have to do");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    // this manually by checking the contents.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!$tip.find('.popover-title').html()) $tip.find('.popover-title').hide()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.hasContent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.getTitle() || this.getContent()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.getContent = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $e = this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var o  = this.options");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return $e.attr('data-content')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      || (typeof o.content == 'function' ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            o.content.call($e[0]) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            o.content)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Popover.prototype.arrow = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return (this.$arrow = this.$arrow || this.tip().find('.arrow'))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // POPOVER PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.popover')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = typeof option == 'object' && option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data && /destroy|hide/.test(option)) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.popover', (data = new Popover(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.popover");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.popover             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.popover.Constructor = Popover");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // POPOVER NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.popover.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.popover = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: scrollspy.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#scrollspy");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // SCROLLSPY CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function ScrollSpy(element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$body          = $(document.body)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$scrollElement = $(element).is(document.body) ? $(window) : $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options        = $.extend({}, ScrollSpy.DEFAULTS, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.selector       = (this.options.target || '') + ' .nav li > a'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.offsets        = []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.targets        = []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.activeTarget   = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.scrollHeight   = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$scrollElement.on('scroll.bs.scrollspy', $.proxy(this.process, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.refresh()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.process()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    offset: 10");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.prototype.getScrollHeight = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.$scrollElement[0].scrollHeight || Math.max(this.$body[0].scrollHeight, document.documentElement.scrollHeight)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.prototype.refresh = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var that          = this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offsetMethod  = 'offset'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offsetBase    = 0");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.offsets      = []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.targets      = []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.scrollHeight = this.getScrollHeight()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!$.isWindow(this.$scrollElement[0])) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      offsetMethod = 'position'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      offsetBase   = this.$scrollElement.scrollTop()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$body");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .find(this.selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .map(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $el   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var href  = $el.data('target') || $el.attr('href')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        var $href = /^#./.test(href) && $(href)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("        return ($href");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          && $href.length");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          && $href.is(':visible')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          && [[$href[offsetMethod]().top + offsetBase, href]]) || null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .sort(function (a, b) { return a[0] - b[0] })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.offsets.push(this[0])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        that.targets.push(this[1])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.prototype.process = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollTop    = this.$scrollElement.scrollTop() + this.options.offset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollHeight = this.getScrollHeight()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var maxScroll    = this.options.offset + scrollHeight - this.$scrollElement.height()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offsets      = this.offsets");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var targets      = this.targets");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var activeTarget = this.activeTarget");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var i");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.scrollHeight != scrollHeight) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.refresh()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (scrollTop >= maxScroll) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return activeTarget != (i = targets[targets.length - 1]) && this.activate(i)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (activeTarget && scrollTop < offsets[0]) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.activeTarget = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return this.clear()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    for (i = offsets.length; i--;) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      activeTarget != targets[i]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && scrollTop >= offsets[i]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && (offsets[i + 1] === undefined || scrollTop < offsets[i + 1])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        && this.activate(targets[i])");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.prototype.activate = function (target) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.activeTarget = target");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.clear()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var selector = this.selector +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      '[data-target=\"' + target + '\"],' +");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.selector + '[href=\"' + target + '\"]'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var active = $(selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .parents('li')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (active.parent('.dropdown-menu').length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      active = active");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .closest('li.dropdown')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    active.trigger('activate.bs.scrollspy')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  ScrollSpy.prototype.clear = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $(this.selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .parentsUntil(this.options.target, '.active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // SCROLLSPY PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===========================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.scrollspy')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = typeof option == 'object' && option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.scrollspy', (data = new ScrollSpy(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.scrollspy");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.scrollspy             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.scrollspy.Constructor = ScrollSpy");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // SCROLLSPY NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.scrollspy.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.scrollspy = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // SCROLLSPY DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(window).on('load.bs.scrollspy.data-api', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $('[data-spy=\"scroll\"]').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $spy = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      Plugin.call($spy, $spy.data())");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: tab.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#tabs");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // TAB CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Tab = function (element) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.element = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tab.VERSION = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tab.TRANSITION_DURATION = 150");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tab.prototype.show = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $this    = this.element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $ul      = $this.closest('ul:not(.dropdown-menu)')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var selector = $this.data('target')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (!selector) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = $this.attr('href')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      selector = selector && selector.replace(/.*(?=#[^\\s]*$)/, '') // strip for ie7");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if ($this.parent('li').hasClass('active')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $previous = $ul.find('.active:last a')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var hideEvent = $.Event('hide.bs.tab', {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      relatedTarget: $this[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var showEvent = $.Event('show.bs.tab', {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      relatedTarget: $previous[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $previous.trigger(hideEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $this.trigger(showEvent)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (showEvent.isDefaultPrevented() || hideEvent.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var $target = $(selector)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.activate($this.closest('li'), $ul)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.activate($target, $target.parent(), function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $previous.trigger({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        type: 'hidden.bs.tab',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        relatedTarget: $this[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $this.trigger({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        type: 'shown.bs.tab',");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        relatedTarget: $previous[0]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Tab.prototype.activate = function (element, container, callback) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var $active    = container.find('> .active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var transition = callback");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && $.support.transition");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      && (($active.length && $active.hasClass('fade')) || !!container.find('> .fade').length)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    function next() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $active");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .find('> .dropdown-menu > .active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .removeClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .end()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .find('[data-toggle=\"tab\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .attr('aria-expanded', false)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .find('[data-toggle=\"tab\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .attr('aria-expanded', true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (transition) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        element[0].offsetWidth // reflow for transition");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        element.addClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      } else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        element.removeClass('fade')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (element.parent('.dropdown-menu').length) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .closest('li.dropdown')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .addClass('active')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .end()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("          .find('[data-toggle=\"tab\"]')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            .attr('aria-expanded', true)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      callback && callback()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $active.length && transition ?");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      $active");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .one('bsTransitionEnd', next)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .emulateTransitionEnd(Tab.TRANSITION_DURATION) :");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      next()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    $active.removeClass('in')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // TAB PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =====================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data  = $this.data('bs.tab')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.tab', (data = new Tab(this)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.tab");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.tab             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.tab.Constructor = Tab");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // TAB NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ===============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.tab.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.tab = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // TAB DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var clickHandler = function (e) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    e.preventDefault()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    Plugin.call($(this), 'show')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(document)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.tab.data-api', '[data-toggle=\"tab\"]', clickHandler)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    .on('click.bs.tab.data-api', '[data-toggle=\"pill\"]', clickHandler)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("}(jQuery);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/* ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Bootstrap: affix.js v3.3.4");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * http://getbootstrap.com/javascript/#affix");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * ========================================================================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Copyright 2011-2015 Twitter, Inc.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)");  //$NON-NLS-1$        
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
        out.write("  // AFFIX CLASS DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var Affix = function (element, options) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.options = $.extend({}, Affix.DEFAULTS, options)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$target = $(this.options.target)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .on('scroll.bs.affix.data-api', $.proxy(this.checkPosition, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      .on('click.bs.affix.data-api',  $.proxy(this.checkPositionWithEventLoop, this))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.$element     = $(element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.affixed      = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.unpin        = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.pinnedOffset = null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    this.checkPosition()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.VERSION  = '3.3.4'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.RESET    = 'affix affix-top affix-bottom'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.DEFAULTS = {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    offset: 0,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    target: window");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.prototype.getState = function (scrollHeight, height, offsetTop, offsetBottom) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollTop    = this.$target.scrollTop()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var position     = this.$element.offset()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var targetHeight = this.$target.height()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (offsetTop != null && this.affixed == 'top') return scrollTop < offsetTop ? 'top' : false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.affixed == 'bottom') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (offsetTop != null) return (scrollTop + this.unpin <= position.top) ? false : 'bottom'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      return (scrollTop + targetHeight <= scrollHeight - offsetBottom) ? false : 'bottom'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var initializing   = this.affixed == null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var colliderTop    = initializing ? scrollTop : position.top");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var colliderHeight = initializing ? targetHeight : height");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (offsetTop != null && scrollTop <= offsetTop) return 'top'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (offsetBottom != null && (colliderTop + colliderHeight >= scrollHeight - offsetBottom)) return 'bottom'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    return false");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.prototype.getPinnedOffset = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (this.pinnedOffset) return this.pinnedOffset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    this.$element.removeClass(Affix.RESET).addClass('affix')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollTop = this.$target.scrollTop()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var position  = this.$element.offset()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return (this.pinnedOffset = position.top - scrollTop)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.prototype.checkPositionWithEventLoop = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    setTimeout($.proxy(this.checkPosition, this), 1)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  Affix.prototype.checkPosition = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (!this.$element.is(':visible')) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var height       = this.$element.height()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offset       = this.options.offset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offsetTop    = offset.top");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var offsetBottom = offset.bottom");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    var scrollHeight = $(document.body).height()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (typeof offset != 'object')         offsetBottom = offsetTop = offset");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (typeof offsetTop == 'function')    offsetTop    = offset.top(this.$element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    if (typeof offsetBottom == 'function') offsetBottom = offset.bottom(this.$element)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    var affix = this.getState(scrollHeight, height, offsetTop, offsetBottom)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (this.affixed != affix) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (this.unpin != null) this.$element.css('top', '')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      var affixType = 'affix' + (affix ? '-' + affix : '')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var e         = $.Event(affixType + '.bs.affix')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.$element.trigger(e)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (e.isDefaultPrevented()) return");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.affixed = affix");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.unpin = affix == 'bottom' ? this.getPinnedOffset() : null");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      this.$element");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .removeClass(Affix.RESET)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .addClass(affixType)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        .trigger(affixType.replace('affix', 'affixed') + '.bs.affix')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    if (affix == 'bottom') {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      this.$element.offset({");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        top: scrollHeight - height - offsetBottom");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // AFFIX PLUGIN DEFINITION");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =======================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  function Plugin(option) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this.each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $this   = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data    = $this.data('bs.affix')");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var options = typeof option == 'object' && option");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (!data) $this.data('bs.affix', (data = new Affix(this, options)))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (typeof option == 'string') data[option]()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    })");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  var old = $.fn.affix");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.affix             = Plugin");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  $.fn.affix.Constructor = Affix");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // AFFIX NO CONFLICT");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // =================");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $.fn.affix.noConflict = function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $.fn.affix = old");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    return this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("  // AFFIX DATA-API");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  // ==============");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("  $(window).on('load', function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    $('[data-spy=\"affix\"]').each(function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var $spy = $(this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      var data = $spy.data()");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      data.offset = data.offset || {}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      if (data.offsetBottom != null) data.offset.bottom = data.offsetBottom");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("      if (data.offsetTop    != null) data.offset.top    = data.offsetTop");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("      Plugin.call($spy, data)");  //$NON-NLS-1$        
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
