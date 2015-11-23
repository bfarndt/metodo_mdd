package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_main(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_load_1_1 = new TagInfo("c:load", //$NON-NLS-1$
            1, 1,
            new String[] {
                "url", //$NON-NLS-1$
                "urlContext", //$NON-NLS-1$
                "loader", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "ProjetoTesteGerador/src/entradaGerador/My.webdomainfeatures", //$NON-NLS-1$
                "workspace", //$NON-NLS-1$
                "org.eclipse.jet.emf", //$NON-NLS-1$
                "featuresModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_load_2_1 = new TagInfo("c:load", //$NON-NLS-1$
            2, 1,
            new String[] {
                "url", //$NON-NLS-1$
                "urlContext", //$NON-NLS-1$
                "loader", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "ProjetoTesteGerador/src-gen/entradaGerador/paginaPessoalNavegacao.xmi", //$NON-NLS-1$
                "workspace", //$NON-NLS-1$
                "org.eclipse.jet.emf", //$NON-NLS-1$
                "navigationModel", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_1 = new TagInfo("c:include", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/common/common.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_1 = new TagInfo("c:include", //$NON-NLS-1$
            6, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/beans/generateBeans.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_1 = new TagInfo("c:include", //$NON-NLS-1$
            7, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/daos/generateDAOs.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_1 = new TagInfo("c:include", //$NON-NLS-1$
            8, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/actions/generateActions.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_1 = new TagInfo("c:include", //$NON-NLS-1$
            9, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/forms/generateForms.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_10_1 = new TagInfo("c:include", //$NON-NLS-1$
            10, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/persistence/resources/generateResources.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_1 = new TagInfo("c:include", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/userContent/generateUserContent.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_13_1 = new TagInfo("c:include", //$NON-NLS-1$
            13, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/navigation/generatePages.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
        out.setTag("load",0,147);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(147);
        RuntimeTagElement _jettag_c_load_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "load", "c:load", _td_c_load_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_load_1_1.setRuntimeParent(null);
        _jettag_c_load_1_1.setTagInfo(_td_c_load_1_1);
        _jettag_c_load_1_1.doStart(context, out);
        _jettag_c_load_1_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("load",148,307);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(159);
        RuntimeTagElement _jettag_c_load_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "load", "c:load", _td_c_load_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_load_2_1.setRuntimeParent(null);
        _jettag_c_load_2_1.setTagInfo(_td_c_load_2_1);
        _jettag_c_load_2_1.doStart(context, out);
        _jettag_c_load_2_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write(NL);         
        out.setTag("include",309,373);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(64);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_4_1.setRuntimeParent(null);
        _jettag_c_include_4_1.setTagInfo(_td_c_include_4_1);
        _jettag_c_include_4_1.doStart(context, out);
        _jettag_c_include_4_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write("   ");  //$NON-NLS-1$        
        out.write(NL);         
        out.setTag("include",378,448);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(70);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_6_1.setRuntimeParent(null);
        _jettag_c_include_6_1.setTagInfo(_td_c_include_6_1);
        _jettag_c_include_6_1.doStart(context, out);
        _jettag_c_include_6_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("include",449,517);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(68);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_7_1.setRuntimeParent(null);
        _jettag_c_include_7_1.setTagInfo(_td_c_include_7_1);
        _jettag_c_include_7_1.doStart(context, out);
        _jettag_c_include_7_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("include",518,592);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(74);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_8_1.setRuntimeParent(null);
        _jettag_c_include_8_1.setTagInfo(_td_c_include_8_1);
        _jettag_c_include_8_1.doStart(context, out);
        _jettag_c_include_8_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("include",593,663);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(70);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_9_1.setRuntimeParent(null);
        _jettag_c_include_9_1.setTagInfo(_td_c_include_9_1);
        _jettag_c_include_9_1.doStart(context, out);
        _jettag_c_include_9_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("include",664,742);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(78);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_10_1.setRuntimeParent(null);
        _jettag_c_include_10_1.setTagInfo(_td_c_include_10_1);
        _jettag_c_include_10_1.doStart(context, out);
        _jettag_c_include_10_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.setTag("include",743,813);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(70);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_11_1.setRuntimeParent(null);
        _jettag_c_include_11_1.setTagInfo(_td_c_include_11_1);
        _jettag_c_include_11_1.doStart(context, out);
        _jettag_c_include_11_1.doEnd();
        out.setTag(null,-1,-1);
        out.write(NL);         
        out.write(NL);         
        out.setTag("include",815,878);
// elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
out.jump(63);
        out.includeStart();
        RuntimeTagElement _jettag_c_include_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_13_1.setRuntimeParent(null);
        _jettag_c_include_13_1.setTagInfo(_td_c_include_13_1);
        _jettag_c_include_13_1.doStart(context, out);
        _jettag_c_include_13_1.doEnd();
        out.setTag(null,-1,-1);
        out.popTemplateFile();
    }
}
