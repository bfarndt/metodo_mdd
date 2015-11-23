package generatorForWebDomain.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_messagesproperties implements JET2Template {
    private final String templateFile;
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_messagesproperties(String templateFile) {
        super();
        this.templateFile = templateFile;
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_1_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/WebDomainAdministrationModel/userTypes", //$NON-NLS-1$
                "userType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/attributes", //$NON-NLS-1$
                "anAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_1 = new TagInfo("c:get", //$NON-NLS-1$
            6, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_44 = new TagInfo("c:get", //$NON-NLS-1$
            6, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_88 = new TagInfo("c:get", //$NON-NLS-1$
            6, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$anAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$userType/referenceList", //$NON-NLS-1$
                "aReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_1 = new TagInfo("c:get", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_44 = new TagInfo("c:get", //$NON-NLS-1$
            11, 44,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_87 = new TagInfo("c:get", //$NON-NLS-1$
            11, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$aReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_1 = new TagInfo("c:get", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_68 = new TagInfo("c:get", //$NON-NLS-1$
            15, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_1 = new TagInfo("c:get", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_70 = new TagInfo("c:get", //$NON-NLS-1$
            16, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_1 = new TagInfo("c:get", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_52 = new TagInfo("c:get", //$NON-NLS-1$
            19, 52,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_1 = new TagInfo("c:get", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_86 = new TagInfo("c:get", //$NON-NLS-1$
            20, 86,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_1 = new TagInfo("c:get", //$NON-NLS-1$
            21, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_54 = new TagInfo("c:get", //$NON-NLS-1$
            21, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_1 = new TagInfo("c:get", //$NON-NLS-1$
            22, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_89 = new TagInfo("c:get", //$NON-NLS-1$
            22, 89,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_1 = new TagInfo("c:get", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_64 = new TagInfo("c:get", //$NON-NLS-1$
            23, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_1 = new TagInfo("c:get", //$NON-NLS-1$
            24, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_63 = new TagInfo("c:get", //$NON-NLS-1$
            24, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_1 = new TagInfo("c:get", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@fullBeanName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_57 = new TagInfo("c:get", //$NON-NLS-1$
            25, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$userType/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.pushTemplateFile(templateFile);
// elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
out.jump(75);
        out.setTag("iterate",0,75);
        RuntimeTagElement _jettag_c_iterate_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_1.setRuntimeParent(null);
        _jettag_c_iterate_1_1.setTagInfo(_td_c_iterate_1_1);
        _jettag_c_iterate_1_1.doStart(context, out);
        out.loopStart();
        out.setTag(null,-1,-1);
        while (_jettag_c_iterate_1_1.okToProcessBody()) {
out.bodyContentEnd();
out.handleDelimiter(_jettag_c_iterate_1_1.getTagInfo().getAttribute("delimiter"),0,75);
            out.loopIterate();
            out.write(NL);         
            out.write("########################## {$userType/@name} #######################");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("# fields");  //$NON-NLS-1$        
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(59);
            out.setTag("iterate",155,214);
            RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_5_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
            _jettag_c_iterate_5_1.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_5_1.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_5_1.getTagInfo().getAttribute("delimiter"),155,214);
                out.loopIterate();
                out.write(NL);         
                out.setTag("get",215,257);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_1.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_1.setTagInfo(_td_c_get_6_1);
                _jettag_c_get_6_1.doStart(context, out);
                _jettag_c_get_6_1.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",258,295);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_6_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_44); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_44.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_44.setTagInfo(_td_c_get_6_44);
                _jettag_c_get_6_44.doStart(context, out);
                _jettag_c_get_6_44.doEnd();
                out.setTag(null,-1,-1);
                out.write(".label=");  //$NON-NLS-1$        
                out.setTag("get",302,339);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(37);
                RuntimeTagElement _jettag_c_get_6_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_88); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_88.setRuntimeParent(_jettag_c_iterate_5_1);
                _jettag_c_get_6_88.setTagInfo(_td_c_get_6_88);
                _jettag_c_get_6_88.doStart(context, out);
                _jettag_c_get_6_88.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
    out.bodyContentStart();
                _jettag_c_iterate_5_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_5_1.doEnd();
            out.loopEnd();
            out.endTag("iterate",126);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("# references");  //$NON-NLS-1$        
            out.write(NL);         
    // elemento tipo XMLBodyElement3(org.eclipse.jet.core.parser.ast.XMLBodyElement)
    out.jump(61);
            out.setTag("iterate",367,428);
            RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_10_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
            _jettag_c_iterate_10_1.doStart(context, out);
            out.loopStart();
            out.setTag(null,-1,-1);
            while (_jettag_c_iterate_10_1.okToProcessBody()) {
    out.bodyContentEnd();
    out.handleDelimiter(_jettag_c_iterate_10_1.getTagInfo().getAttribute("delimiter"),367,428);
                out.loopIterate();
                out.write(NL);         
                out.setTag("get",429,471);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(42);
                RuntimeTagElement _jettag_c_get_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_1.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_get_11_1.setTagInfo(_td_c_get_11_1);
                _jettag_c_get_11_1.doStart(context, out);
                _jettag_c_get_11_1.doEnd();
                out.setTag(null,-1,-1);
                out.write(".");  //$NON-NLS-1$        
                out.setTag("get",472,508);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(36);
                RuntimeTagElement _jettag_c_get_11_44 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_44); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_44.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_get_11_44.setTagInfo(_td_c_get_11_44);
                _jettag_c_get_11_44.doStart(context, out);
                _jettag_c_get_11_44.doEnd();
                out.setTag(null,-1,-1);
                out.write(".label=");  //$NON-NLS-1$        
                out.setTag("get",515,551);
        // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
        out.jump(36);
                RuntimeTagElement _jettag_c_get_11_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_11_87.setRuntimeParent(_jettag_c_iterate_10_1);
                _jettag_c_get_11_87.setTagInfo(_td_c_get_11_87);
                _jettag_c_get_11_87.doStart(context, out);
                _jettag_c_get_11_87.doEnd();
                out.setTag(null,-1,-1);
                out.write(NL);         
    out.bodyContentStart();
                _jettag_c_iterate_10_1.handleBodyContent(out);
            }
    out.bodyContentEnd();
            _jettag_c_iterate_10_1.doEnd();
            out.loopEnd();
            out.endTag("iterate",124);
    // elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
    out.jump(12);
            out.write(NL);         
            out.write(NL);         
            out.write("# selection dialog messages");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",594,636);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_15_1.setTagInfo(_td_c_get_15_1);
            _jettag_c_get_15_1.doStart(context, out);
            _jettag_c_get_15_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".currentlySelected.label=");  //$NON-NLS-1$        
            out.setTag("get",661,695);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_15_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_68); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_68.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_15_68.setTagInfo(_td_c_get_15_68);
            _jettag_c_get_15_68.doStart(context, out);
            _jettag_c_get_15_68.doEnd();
            out.setTag(null,-1,-1);
            out.write(" selecionado");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",708,750);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_16_1.setTagInfo(_td_c_get_16_1);
            _jettag_c_get_16_1.doStart(context, out);
            _jettag_c_get_16_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".select.label=Selecione um ");  //$NON-NLS-1$        
            out.setTag("get",777,811);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_16_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_70.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_16_70.setTagInfo(_td_c_get_16_70);
            _jettag_c_get_16_70.doStart(context, out);
            _jettag_c_get_16_70.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.write(NL);         
            out.write("# Action messages");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",831,873);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_19_1.setTagInfo(_td_c_get_19_1);
            _jettag_c_get_19_1.doStart(context, out);
            _jettag_c_get_19_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".save.ok=");  //$NON-NLS-1$        
            out.setTag("get",882,916);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_19_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_52); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_19_52.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_19_52.setTagInfo(_td_c_get_19_52);
            _jettag_c_get_19_52.doStart(context, out);
            _jettag_c_get_19_52.doEnd();
            out.setTag(null,-1,-1);
            out.write(" salvo com sucesso");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",935,977);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_20_1.setTagInfo(_td_c_get_20_1);
            _jettag_c_get_20_1.doStart(context, out);
            _jettag_c_get_20_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".save.failed=Ocorreu um problema ao salvar ");  //$NON-NLS-1$        
            out.setTag("get",1020,1054);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_20_86 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_86); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_86.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_20_86.setTagInfo(_td_c_get_20_86);
            _jettag_c_get_20_86.doStart(context, out);
            _jettag_c_get_20_86.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.setTag("get",1055,1097);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_21_1.setTagInfo(_td_c_get_21_1);
            _jettag_c_get_21_1.doStart(context, out);
            _jettag_c_get_21_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".delete.ok=");  //$NON-NLS-1$        
            out.setTag("get",1108,1142);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_21_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_54.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_21_54.setTagInfo(_td_c_get_21_54);
            _jettag_c_get_21_54.doStart(context, out);
            _jettag_c_get_21_54.doEnd();
            out.setTag(null,-1,-1);
            out.write(" removido com sucesso");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",1164,1206);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_22_1.setTagInfo(_td_c_get_22_1);
            _jettag_c_get_22_1.doStart(context, out);
            _jettag_c_get_22_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".delete.failed=Ocorreu um problema ao remover ");  //$NON-NLS-1$        
            out.setTag("get",1252,1286);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_22_89 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_89); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_89.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_22_89.setTagInfo(_td_c_get_22_89);
            _jettag_c_get_22_89.doStart(context, out);
            _jettag_c_get_22_89.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.setTag("get",1287,1329);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_23_1.setTagInfo(_td_c_get_23_1);
            _jettag_c_get_23_1.doStart(context, out);
            _jettag_c_get_23_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".list.title=Lista de ");  //$NON-NLS-1$        
            out.setTag("get",1350,1384);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_23_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_64); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_23_64.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_23_64.setTagInfo(_td_c_get_23_64);
            _jettag_c_get_23_64.doStart(context, out);
            _jettag_c_get_23_64.doEnd();
            out.setTag(null,-1,-1);
            out.write("s");  //$NON-NLS-1$        
            out.write(NL);         
            out.setTag("get",1386,1428);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_24_1.setTagInfo(_td_c_get_24_1);
            _jettag_c_get_24_1.doStart(context, out);
            _jettag_c_get_24_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".new=Cadastrar novo ");  //$NON-NLS-1$        
            out.setTag("get",1448,1482);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_24_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_63); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_63.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_24_63.setTagInfo(_td_c_get_24_63);
            _jettag_c_get_24_63.doStart(context, out);
            _jettag_c_get_24_63.doEnd();
            out.setTag(null,-1,-1);
            out.write(NL);         
            out.setTag("get",1483,1525);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(42);
            RuntimeTagElement _jettag_c_get_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_1.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_25_1.setTagInfo(_td_c_get_25_1);
            _jettag_c_get_25_1.doStart(context, out);
            _jettag_c_get_25_1.doEnd();
            out.setTag(null,-1,-1);
            out.write(".empty=Nao ha ");  //$NON-NLS-1$        
            out.setTag("get",1539,1573);
    // elemento tipo XMLEmptyElement3(org.eclipse.jet.core.parser.ast.XMLEmptyElement)
    out.jump(34);
            RuntimeTagElement _jettag_c_get_25_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_25_57.setRuntimeParent(_jettag_c_iterate_1_1);
            _jettag_c_get_25_57.setTagInfo(_td_c_get_25_57);
            _jettag_c_get_25_57.doStart(context, out);
            _jettag_c_get_25_57.doEnd();
            out.setTag(null,-1,-1);
            out.write("s cadastrados");  //$NON-NLS-1$        
            out.write(NL);         
out.bodyContentStart();
            _jettag_c_iterate_1_1.handleBodyContent(out);
        }
out.bodyContentEnd();
        _jettag_c_iterate_1_1.doEnd();
        out.loopEnd();
        out.endTag("iterate",1512);
// elemento tipo XMLBodyElement4(org.eclipse.jet.core.parser.ast.XMLBodyElementEnd)
out.jump(12);
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("# General messages");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("saveButton=Salvar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("selectButton=Selecionar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("uploadButton=Enviar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("closeButton=Fechar");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("image.upload.ok=Imagem enviada com sucesso!");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("image.upload.failed=Erro ao enviar imagem!");  //$NON-NLS-1$        
        out.write(NL);         
        out.popTemplateFile();
    }
}
