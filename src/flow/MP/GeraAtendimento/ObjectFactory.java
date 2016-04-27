
package flow.MP.GeraAtendimento;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the flow.MP.GeraAtendimento package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GerarAtendimentoFault_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "GerarAtendimentoFault");
    private final static QName _ErroTecnicoFault_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "ErroTecnicoFault");
    private final static QName _MetaInformacao_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "MetaInformacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: flow.MP.GeraAtendimento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarAtendimentoOutput }
     * 
     */
    public GerarAtendimentoOutput createGerarAtendimentoOutput() {
        return new GerarAtendimentoOutput();
    }

    /**
     * Create an instance of {@link Atendimento }
     * 
     */
    public Atendimento createAtendimento() {
        return new Atendimento();
    }

    /**
     * Create an instance of {@link MetaInformacao }
     * 
     */
    public MetaInformacao createMetaInformacao() {
        return new MetaInformacao();
    }

    /**
     * Create an instance of {@link GerarAtendimentoFault }
     * 
     */
    public GerarAtendimentoFault createGerarAtendimentoFault() {
        return new GerarAtendimentoFault();
    }

    /**
     * Create an instance of {@link ErroTecnicoFault }
     * 
     */
    public ErroTecnicoFault createErroTecnicoFault() {
        return new ErroTecnicoFault();
    }

    /**
     * Create an instance of {@link GerarAtendimentoInput }
     * 
     */
    public GerarAtendimentoInput createGerarAtendimentoInput() {
        return new GerarAtendimentoInput();
    }

    /**
     * Create an instance of {@link PropriedadesExecucao }
     * 
     */
    public PropriedadesExecucao createPropriedadesExecucao() {
        return new PropriedadesExecucao();
    }

    /**
     * Create an instance of {@link DadosCadastraisPFList }
     * 
     */
    public DadosCadastraisPFList createDadosCadastraisPFList() {
        return new DadosCadastraisPFList();
    }

    /**
     * Create an instance of {@link Parceiro }
     * 
     */
    public Parceiro createParceiro() {
        return new Parceiro();
    }

    /**
     * Create an instance of {@link Rne }
     * 
     */
    public Rne createRne() {
        return new Rne();
    }

    /**
     * Create an instance of {@link AceiteRegulamento }
     * 
     */
    public AceiteRegulamento createAceiteRegulamento() {
        return new AceiteRegulamento();
    }

    /**
     * Create an instance of {@link ConfiguracaoOptin }
     * 
     */
    public ConfiguracaoOptin createConfiguracaoOptin() {
        return new ConfiguracaoOptin();
    }

    /**
     * Create an instance of {@link ProgramaFidelidade }
     * 
     */
    public ProgramaFidelidade createProgramaFidelidade() {
        return new ProgramaFidelidade();
    }

    /**
     * Create an instance of {@link Endereco }
     * 
     */
    public Endereco createEndereco() {
        return new Endereco();
    }

    /**
     * Create an instance of {@link AtendimentoList }
     * 
     */
    public AtendimentoList createAtendimentoList() {
        return new AtendimentoList();
    }

    /**
     * Create an instance of {@link UsuarioList }
     * 
     */
    public UsuarioList createUsuarioList() {
        return new UsuarioList();
    }

    /**
     * Create an instance of {@link RegraTier }
     * 
     */
    public RegraTier createRegraTier() {
        return new RegraTier();
    }

    /**
     * Create an instance of {@link TipoReferenciaList }
     * 
     */
    public TipoReferenciaList createTipoReferenciaList() {
        return new TipoReferenciaList();
    }

    /**
     * Create an instance of {@link EmailList }
     * 
     */
    public EmailList createEmailList() {
        return new EmailList();
    }

    /**
     * Create an instance of {@link PermissaoList }
     * 
     */
    public PermissaoList createPermissaoList() {
        return new PermissaoList();
    }

    /**
     * Create an instance of {@link MoedaList }
     * 
     */
    public MoedaList createMoedaList() {
        return new MoedaList();
    }

    /**
     * Create an instance of {@link Participante }
     * 
     */
    public Participante createParticipante() {
        return new Participante();
    }

    /**
     * Create an instance of {@link Canal }
     * 
     */
    public Canal createCanal() {
        return new Canal();
    }

    /**
     * Create an instance of {@link SituacaoParticipanteList }
     * 
     */
    public SituacaoParticipanteList createSituacaoParticipanteList() {
        return new SituacaoParticipanteList();
    }

    /**
     * Create an instance of {@link CampanhaInformativaList }
     * 
     */
    public CampanhaInformativaList createCampanhaInformativaList() {
        return new CampanhaInformativaList();
    }

    /**
     * Create an instance of {@link Atributo }
     * 
     */
    public Atributo createAtributo() {
        return new Atributo();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Bonificacao }
     * 
     */
    public Bonificacao createBonificacao() {
        return new Bonificacao();
    }

    /**
     * Create an instance of {@link Promocao }
     * 
     */
    public Promocao createPromocao() {
        return new Promocao();
    }

    /**
     * Create an instance of {@link MaquinaList }
     * 
     */
    public MaquinaList createMaquinaList() {
        return new MaquinaList();
    }

    /**
     * Create an instance of {@link CanalList }
     * 
     */
    public CanalList createCanalList() {
        return new CanalList();
    }

    /**
     * Create an instance of {@link RegulamentoList }
     * 
     */
    public RegulamentoList createRegulamentoList() {
        return new RegulamentoList();
    }

    /**
     * Create an instance of {@link Permissao }
     * 
     */
    public Permissao createPermissao() {
        return new Permissao();
    }

    /**
     * Create an instance of {@link Identificador }
     * 
     */
    public Identificador createIdentificador() {
        return new Identificador();
    }

    /**
     * Create an instance of {@link Geolocalizacao }
     * 
     */
    public Geolocalizacao createGeolocalizacao() {
        return new Geolocalizacao();
    }

    /**
     * Create an instance of {@link InterfaceRedeMovel }
     * 
     */
    public InterfaceRedeMovel createInterfaceRedeMovel() {
        return new InterfaceRedeMovel();
    }

    /**
     * Create an instance of {@link SegmentoIBGE }
     * 
     */
    public SegmentoIBGE createSegmentoIBGE() {
        return new SegmentoIBGE();
    }

    /**
     * Create an instance of {@link AtividadeList }
     * 
     */
    public AtividadeList createAtividadeList() {
        return new AtividadeList();
    }

    /**
     * Create an instance of {@link ProgramaFidelidadeParticipante }
     * 
     */
    public ProgramaFidelidadeParticipante createProgramaFidelidadeParticipante() {
        return new ProgramaFidelidadeParticipante();
    }

    /**
     * Create an instance of {@link ProgramaFidelidadeList }
     * 
     */
    public ProgramaFidelidadeList createProgramaFidelidadeList() {
        return new ProgramaFidelidadeList();
    }

    /**
     * Create an instance of {@link CampanhaParticipante }
     * 
     */
    public CampanhaParticipante createCampanhaParticipante() {
        return new CampanhaParticipante();
    }

    /**
     * Create an instance of {@link Telefone }
     * 
     */
    public Telefone createTelefone() {
        return new Telefone();
    }

    /**
     * Create an instance of {@link PromocaoList }
     * 
     */
    public PromocaoList createPromocaoList() {
        return new PromocaoList();
    }

    /**
     * Create an instance of {@link Atividade }
     * 
     */
    public Atividade createAtividade() {
        return new Atividade();
    }

    /**
     * Create an instance of {@link RegraTierList }
     * 
     */
    public RegraTierList createRegraTierList() {
        return new RegraTierList();
    }

    /**
     * Create an instance of {@link CampanhaParticipanteList }
     * 
     */
    public CampanhaParticipanteList createCampanhaParticipanteList() {
        return new CampanhaParticipanteList();
    }

    /**
     * Create an instance of {@link GrupoList }
     * 
     */
    public GrupoList createGrupoList() {
        return new GrupoList();
    }

    /**
     * Create an instance of {@link DadosCadastraisMarketingList }
     * 
     */
    public DadosCadastraisMarketingList createDadosCadastraisMarketingList() {
        return new DadosCadastraisMarketingList();
    }

    /**
     * Create an instance of {@link ValorMonetario }
     * 
     */
    public ValorMonetario createValorMonetario() {
        return new ValorMonetario();
    }

    /**
     * Create an instance of {@link ConfiguracaoOptinList }
     * 
     */
    public ConfiguracaoOptinList createConfiguracaoOptinList() {
        return new ConfiguracaoOptinList();
    }

    /**
     * Create an instance of {@link CampanhaInformativa }
     * 
     */
    public CampanhaInformativa createCampanhaInformativa() {
        return new CampanhaInformativa();
    }

    /**
     * Create an instance of {@link SituacaoAtendimento }
     * 
     */
    public SituacaoAtendimento createSituacaoAtendimento() {
        return new SituacaoAtendimento();
    }

    /**
     * Create an instance of {@link MetaInformacaoList }
     * 
     */
    public MetaInformacaoList createMetaInformacaoList() {
        return new MetaInformacaoList();
    }

    /**
     * Create an instance of {@link Idioma }
     * 
     */
    public Idioma createIdioma() {
        return new Idioma();
    }

    /**
     * Create an instance of {@link AtributoList }
     * 
     */
    public AtributoList createAtributoList() {
        return new AtributoList();
    }

    /**
     * Create an instance of {@link PaginacaoList }
     * 
     */
    public PaginacaoList createPaginacaoList() {
        return new PaginacaoList();
    }

    /**
     * Create an instance of {@link Periodo }
     * 
     */
    public Periodo createPeriodo() {
        return new Periodo();
    }

    /**
     * Create an instance of {@link Sistema }
     * 
     */
    public Sistema createSistema() {
        return new Sistema();
    }

    /**
     * Create an instance of {@link DadosCadastraisPJList }
     * 
     */
    public DadosCadastraisPJList createDadosCadastraisPJList() {
        return new DadosCadastraisPJList();
    }

    /**
     * Create an instance of {@link MensagemList }
     * 
     */
    public MensagemList createMensagemList() {
        return new MensagemList();
    }

    /**
     * Create an instance of {@link SituacaoParceiro }
     * 
     */
    public SituacaoParceiro createSituacaoParceiro() {
        return new SituacaoParceiro();
    }

    /**
     * Create an instance of {@link SituacaoAtendimentoList }
     * 
     */
    public SituacaoAtendimentoList createSituacaoAtendimentoList() {
        return new SituacaoAtendimentoList();
    }

    /**
     * Create an instance of {@link TierList }
     * 
     */
    public TierList createTierList() {
        return new TierList();
    }

    /**
     * Create an instance of {@link Grupo }
     * 
     */
    public Grupo createGrupo() {
        return new Grupo();
    }

    /**
     * Create an instance of {@link IdentificadorList }
     * 
     */
    public IdentificadorList createIdentificadorList() {
        return new IdentificadorList();
    }

    /**
     * Create an instance of {@link DadosCadastraisPJ }
     * 
     */
    public DadosCadastraisPJ createDadosCadastraisPJ() {
        return new DadosCadastraisPJ();
    }

    /**
     * Create an instance of {@link CalendarioList }
     * 
     */
    public CalendarioList createCalendarioList() {
        return new CalendarioList();
    }

    /**
     * Create an instance of {@link EnderecoList }
     * 
     */
    public EnderecoList createEnderecoList() {
        return new EnderecoList();
    }

    /**
     * Create an instance of {@link DadosCadastraisPF }
     * 
     */
    public DadosCadastraisPF createDadosCadastraisPF() {
        return new DadosCadastraisPF();
    }

    /**
     * Create an instance of {@link OfertaList }
     * 
     */
    public OfertaList createOfertaList() {
        return new OfertaList();
    }

    /**
     * Create an instance of {@link BaseFaultList }
     * 
     */
    public BaseFaultList createBaseFaultList() {
        return new BaseFaultList();
    }

    /**
     * Create an instance of {@link Oferta }
     * 
     */
    public Oferta createOferta() {
        return new Oferta();
    }

    /**
     * Create an instance of {@link IndicadorList }
     * 
     */
    public IndicadorList createIndicadorList() {
        return new IndicadorList();
    }

    /**
     * Create an instance of {@link Cota }
     * 
     */
    public Cota createCota() {
        return new Cota();
    }

    /**
     * Create an instance of {@link ParceiroList }
     * 
     */
    public ParceiroList createParceiroList() {
        return new ParceiroList();
    }

    /**
     * Create an instance of {@link Cache }
     * 
     */
    public Cache createCache() {
        return new Cache();
    }

    /**
     * Create an instance of {@link Indicador }
     * 
     */
    public Indicador createIndicador() {
        return new Indicador();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Regulamento }
     * 
     */
    public Regulamento createRegulamento() {
        return new Regulamento();
    }

    /**
     * Create an instance of {@link DadosCadastraisMarketing }
     * 
     */
    public DadosCadastraisMarketing createDadosCadastraisMarketing() {
        return new DadosCadastraisMarketing();
    }

    /**
     * Create an instance of {@link Tier }
     * 
     */
    public Tier createTier() {
        return new Tier();
    }

    /**
     * Create an instance of {@link CadastroParticipanteParceiro }
     * 
     */
    public CadastroParticipanteParceiro createCadastroParticipanteParceiro() {
        return new CadastroParticipanteParceiro();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link CacheList }
     * 
     */
    public CacheList createCacheList() {
        return new CacheList();
    }

    /**
     * Create an instance of {@link ParticipanteList }
     * 
     */
    public ParticipanteList createParticipanteList() {
        return new ParticipanteList();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link TelefoneList }
     * 
     */
    public TelefoneList createTelefoneList() {
        return new TelefoneList();
    }

    /**
     * Create an instance of {@link InstrucaoList }
     * 
     */
    public InstrucaoList createInstrucaoList() {
        return new InstrucaoList();
    }

    /**
     * Create an instance of {@link SaldoParticipante }
     * 
     */
    public SaldoParticipante createSaldoParticipante() {
        return new SaldoParticipante();
    }

    /**
     * Create an instance of {@link CadastroParticipanteParceiroList }
     * 
     */
    public CadastroParticipanteParceiroList createCadastroParticipanteParceiroList() {
        return new CadastroParticipanteParceiroList();
    }

    /**
     * Create an instance of {@link Paginacao }
     * 
     */
    public Paginacao createPaginacao() {
        return new Paginacao();
    }

    /**
     * Create an instance of {@link Instrucao }
     * 
     */
    public Instrucao createInstrucao() {
        return new Instrucao();
    }

    /**
     * Create an instance of {@link Mensagem }
     * 
     */
    public Mensagem createMensagem() {
        return new Mensagem();
    }

    /**
     * Create an instance of {@link CampanhaList }
     * 
     */
    public CampanhaList createCampanhaList() {
        return new CampanhaList();
    }

    /**
     * Create an instance of {@link GeolocalizacaoList }
     * 
     */
    public GeolocalizacaoList createGeolocalizacaoList() {
        return new GeolocalizacaoList();
    }

    /**
     * Create an instance of {@link SituacaoParticipante }
     * 
     */
    public SituacaoParticipante createSituacaoParticipante() {
        return new SituacaoParticipante();
    }

    /**
     * Create an instance of {@link SituacaoParceiroList }
     * 
     */
    public SituacaoParceiroList createSituacaoParceiroList() {
        return new SituacaoParceiroList();
    }

    /**
     * Create an instance of {@link PeriodoList }
     * 
     */
    public PeriodoList createPeriodoList() {
        return new PeriodoList();
    }

    /**
     * Create an instance of {@link ProgramaFidelidadeParticipanteList }
     * 
     */
    public ProgramaFidelidadeParticipanteList createProgramaFidelidadeParticipanteList() {
        return new ProgramaFidelidadeParticipanteList();
    }

    /**
     * Create an instance of {@link PrecoList }
     * 
     */
    public PrecoList createPrecoList() {
        return new PrecoList();
    }

    /**
     * Create an instance of {@link AssuntoComunicacaoList }
     * 
     */
    public AssuntoComunicacaoList createAssuntoComunicacaoList() {
        return new AssuntoComunicacaoList();
    }

    /**
     * Create an instance of {@link TipoReferencia }
     * 
     */
    public TipoReferencia createTipoReferencia() {
        return new TipoReferencia();
    }

    /**
     * Create an instance of {@link BonificacaoList }
     * 
     */
    public BonificacaoList createBonificacaoList() {
        return new BonificacaoList();
    }

    /**
     * Create an instance of {@link Preco }
     * 
     */
    public Preco createPreco() {
        return new Preco();
    }

    /**
     * Create an instance of {@link AceiteRegulamentoList }
     * 
     */
    public AceiteRegulamentoList createAceiteRegulamentoList() {
        return new AceiteRegulamentoList();
    }

    /**
     * Create an instance of {@link Rg }
     * 
     */
    public Rg createRg() {
        return new Rg();
    }

    /**
     * Create an instance of {@link ContatoList }
     * 
     */
    public ContatoList createContatoList() {
        return new ContatoList();
    }

    /**
     * Create an instance of {@link Calendario }
     * 
     */
    public Calendario createCalendario() {
        return new Calendario();
    }

    /**
     * Create an instance of {@link SistemaList }
     * 
     */
    public SistemaList createSistemaList() {
        return new SistemaList();
    }

    /**
     * Create an instance of {@link Campanha }
     * 
     */
    public Campanha createCampanha() {
        return new Campanha();
    }

    /**
     * Create an instance of {@link Maquina }
     * 
     */
    public Maquina createMaquina() {
        return new Maquina();
    }

    /**
     * Create an instance of {@link Moeda }
     * 
     */
    public Moeda createMoeda() {
        return new Moeda();
    }

    /**
     * Create an instance of {@link AssuntoComunicacao }
     * 
     */
    public AssuntoComunicacao createAssuntoComunicacao() {
        return new AssuntoComunicacao();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarAtendimentoFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebs.multiplusfidelidade.com.br/v1", name = "GerarAtendimentoFault")
    public JAXBElement<GerarAtendimentoFault> createGerarAtendimentoFault(GerarAtendimentoFault value) {
        return new JAXBElement<GerarAtendimentoFault>(_GerarAtendimentoFault_QNAME, GerarAtendimentoFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErroTecnicoFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebs.multiplusfidelidade.com.br/v1", name = "ErroTecnicoFault")
    public JAXBElement<ErroTecnicoFault> createErroTecnicoFault(ErroTecnicoFault value) {
        return new JAXBElement<ErroTecnicoFault>(_ErroTecnicoFault_QNAME, ErroTecnicoFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaInformacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ebs.multiplusfidelidade.com.br/v1", name = "MetaInformacao")
    public JAXBElement<MetaInformacao> createMetaInformacao(MetaInformacao value) {
        return new JAXBElement<MetaInformacao>(_MetaInformacao_QNAME, MetaInformacao.class, null, value);
    }

}
