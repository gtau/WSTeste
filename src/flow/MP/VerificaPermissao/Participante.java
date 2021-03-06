
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Participante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Participante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-participante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero-multiplus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credenciais" type="{http://ebo.multiplusfidelidade.com.br/v1}UsuarioList" minOccurs="0"/>
 *         &lt;element name="numero-tam-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cadastro-pf" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *         &lt;element name="cadastro-marketing" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisMarketing" minOccurs="0"/>
 *         &lt;element name="contatos" type="{http://ebo.multiplusfidelidade.com.br/v1}ContatoList" minOccurs="0"/>
 *         &lt;element name="contato-principal" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="situacao-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoParticipante" minOccurs="0"/>
 *         &lt;element name="saldo-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}SaldoParticipante" minOccurs="0"/>
 *         &lt;element name="campanhas-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}CampanhaParticipanteList" minOccurs="0"/>
 *         &lt;element name="cadastro-participante-parceiros" type="{http://ebo.multiplusfidelidade.com.br/v1}CadastroParticipanteParceiroList" minOccurs="0"/>
 *         &lt;element name="credencial-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="credencial-assinatura-eletronica" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="hobbies" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="documento-estrangeiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canal-indicacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador" type="{http://ebo.multiplusfidelidade.com.br/v1}Indicador" minOccurs="0"/>
 *         &lt;element name="programas-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}ProgramaFidelidadeParticipanteList" minOccurs="0"/>
 *         &lt;element name="segmentos" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="canal-atualizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="tier" type="{http://ebo.multiplusfidelidade.com.br/v1}Tier" minOccurs="0"/>
 *         &lt;element name="numero-multiplus-mascarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lista-configuracoes-optin" type="{http://ebo.multiplusfidelidade.com.br/v1}ConfiguracaoOptinList" minOccurs="0"/>
 *         &lt;element name="participante-responsavel" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="parceiro-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="aceites-regulamentos" type="{http://ebo.multiplusfidelidade.com.br/v1}AceiteRegulamentoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participante", propOrder = {
    "idParticipante",
    "numeroMultiplus",
    "credenciais",
    "numeroTamFidelidade",
    "cadastroPf",
    "cadastroMarketing",
    "contatos",
    "contatoPrincipal",
    "situacaoParticipante",
    "saldoParticipante",
    "campanhasParticipante",
    "cadastroParticipanteParceiros",
    "credencialResgate",
    "credencialAssinaturaEletronica",
    "hobbies",
    "documentoEstrangeiro",
    "dataUltimaAtualizacao",
    "dataCriacao",
    "canalIndicacao",
    "indicador",
    "programasFidelidade",
    "segmentos",
    "canalOrigem",
    "canalAtualizacao",
    "tier",
    "numeroMultiplusMascarado",
    "listaConfiguracoesOptin",
    "participanteResponsavel",
    "parceiroOrigem",
    "aceitesRegulamentos"
})
public class Participante {

    @XmlElement(name = "id-participante")
    protected String idParticipante;
    @XmlElement(name = "numero-multiplus")
    protected String numeroMultiplus;
    protected UsuarioList credenciais;
    @XmlElement(name = "numero-tam-fidelidade")
    protected String numeroTamFidelidade;
    @XmlElement(name = "cadastro-pf")
    protected DadosCadastraisPF cadastroPf;
    @XmlElement(name = "cadastro-marketing")
    protected DadosCadastraisMarketing cadastroMarketing;
    protected ContatoList contatos;
    @XmlElement(name = "contato-principal")
    protected Contato contatoPrincipal;
    @XmlElement(name = "situacao-participante")
    protected SituacaoParticipante situacaoParticipante;
    @XmlElement(name = "saldo-participante")
    protected SaldoParticipante saldoParticipante;
    @XmlElement(name = "campanhas-participante")
    protected CampanhaParticipanteList campanhasParticipante;
    @XmlElement(name = "cadastro-participante-parceiros")
    protected CadastroParticipanteParceiroList cadastroParticipanteParceiros;
    @XmlElement(name = "credencial-resgate")
    protected Usuario credencialResgate;
    @XmlElement(name = "credencial-assinatura-eletronica")
    protected Usuario credencialAssinaturaEletronica;
    protected TipoReferenciaList hobbies;
    @XmlElement(name = "documento-estrangeiro")
    protected String documentoEstrangeiro;
    @XmlElement(name = "data-ultima-atualizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaAtualizacao;
    @XmlElement(name = "data-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlElement(name = "canal-indicacao")
    protected TipoReferencia canalIndicacao;
    protected Indicador indicador;
    @XmlElement(name = "programas-fidelidade")
    protected ProgramaFidelidadeParticipanteList programasFidelidade;
    protected TipoReferenciaList segmentos;
    @XmlElement(name = "canal-origem")
    protected Canal canalOrigem;
    @XmlElement(name = "canal-atualizacao")
    protected Canal canalAtualizacao;
    protected Tier tier;
    @XmlElement(name = "numero-multiplus-mascarado")
    protected String numeroMultiplusMascarado;
    @XmlElement(name = "lista-configuracoes-optin")
    protected ConfiguracaoOptinList listaConfiguracoesOptin;
    @XmlElement(name = "participante-responsavel")
    protected Participante participanteResponsavel;
    @XmlElement(name = "parceiro-origem")
    protected Parceiro parceiroOrigem;
    @XmlElement(name = "aceites-regulamentos")
    protected AceiteRegulamentoList aceitesRegulamentos;

    /**
     * Gets the value of the idParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdParticipante() {
        return idParticipante;
    }

    /**
     * Sets the value of the idParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdParticipante(String value) {
        this.idParticipante = value;
    }

    /**
     * Gets the value of the numeroMultiplus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMultiplus() {
        return numeroMultiplus;
    }

    /**
     * Sets the value of the numeroMultiplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMultiplus(String value) {
        this.numeroMultiplus = value;
    }

    /**
     * Gets the value of the credenciais property.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioList }
     *     
     */
    public UsuarioList getCredenciais() {
        return credenciais;
    }

    /**
     * Sets the value of the credenciais property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioList }
     *     
     */
    public void setCredenciais(UsuarioList value) {
        this.credenciais = value;
    }

    /**
     * Gets the value of the numeroTamFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTamFidelidade() {
        return numeroTamFidelidade;
    }

    /**
     * Sets the value of the numeroTamFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTamFidelidade(String value) {
        this.numeroTamFidelidade = value;
    }

    /**
     * Gets the value of the cadastroPf property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getCadastroPf() {
        return cadastroPf;
    }

    /**
     * Sets the value of the cadastroPf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setCadastroPf(DadosCadastraisPF value) {
        this.cadastroPf = value;
    }

    /**
     * Gets the value of the cadastroMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisMarketing }
     *     
     */
    public DadosCadastraisMarketing getCadastroMarketing() {
        return cadastroMarketing;
    }

    /**
     * Sets the value of the cadastroMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisMarketing }
     *     
     */
    public void setCadastroMarketing(DadosCadastraisMarketing value) {
        this.cadastroMarketing = value;
    }

    /**
     * Gets the value of the contatos property.
     * 
     * @return
     *     possible object is
     *     {@link ContatoList }
     *     
     */
    public ContatoList getContatos() {
        return contatos;
    }

    /**
     * Sets the value of the contatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContatoList }
     *     
     */
    public void setContatos(ContatoList value) {
        this.contatos = value;
    }

    /**
     * Gets the value of the contatoPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoPrincipal() {
        return contatoPrincipal;
    }

    /**
     * Sets the value of the contatoPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoPrincipal(Contato value) {
        this.contatoPrincipal = value;
    }

    /**
     * Gets the value of the situacaoParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoParticipante }
     *     
     */
    public SituacaoParticipante getSituacaoParticipante() {
        return situacaoParticipante;
    }

    /**
     * Sets the value of the situacaoParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoParticipante }
     *     
     */
    public void setSituacaoParticipante(SituacaoParticipante value) {
        this.situacaoParticipante = value;
    }

    /**
     * Gets the value of the saldoParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link SaldoParticipante }
     *     
     */
    public SaldoParticipante getSaldoParticipante() {
        return saldoParticipante;
    }

    /**
     * Sets the value of the saldoParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaldoParticipante }
     *     
     */
    public void setSaldoParticipante(SaldoParticipante value) {
        this.saldoParticipante = value;
    }

    /**
     * Gets the value of the campanhasParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link CampanhaParticipanteList }
     *     
     */
    public CampanhaParticipanteList getCampanhasParticipante() {
        return campanhasParticipante;
    }

    /**
     * Sets the value of the campanhasParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampanhaParticipanteList }
     *     
     */
    public void setCampanhasParticipante(CampanhaParticipanteList value) {
        this.campanhasParticipante = value;
    }

    /**
     * Gets the value of the cadastroParticipanteParceiros property.
     * 
     * @return
     *     possible object is
     *     {@link CadastroParticipanteParceiroList }
     *     
     */
    public CadastroParticipanteParceiroList getCadastroParticipanteParceiros() {
        return cadastroParticipanteParceiros;
    }

    /**
     * Sets the value of the cadastroParticipanteParceiros property.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastroParticipanteParceiroList }
     *     
     */
    public void setCadastroParticipanteParceiros(CadastroParticipanteParceiroList value) {
        this.cadastroParticipanteParceiros = value;
    }

    /**
     * Gets the value of the credencialResgate property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getCredencialResgate() {
        return credencialResgate;
    }

    /**
     * Sets the value of the credencialResgate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setCredencialResgate(Usuario value) {
        this.credencialResgate = value;
    }

    /**
     * Gets the value of the credencialAssinaturaEletronica property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getCredencialAssinaturaEletronica() {
        return credencialAssinaturaEletronica;
    }

    /**
     * Sets the value of the credencialAssinaturaEletronica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setCredencialAssinaturaEletronica(Usuario value) {
        this.credencialAssinaturaEletronica = value;
    }

    /**
     * Gets the value of the hobbies property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getHobbies() {
        return hobbies;
    }

    /**
     * Sets the value of the hobbies property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setHobbies(TipoReferenciaList value) {
        this.hobbies = value;
    }

    /**
     * Gets the value of the documentoEstrangeiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoEstrangeiro() {
        return documentoEstrangeiro;
    }

    /**
     * Sets the value of the documentoEstrangeiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoEstrangeiro(String value) {
        this.documentoEstrangeiro = value;
    }

    /**
     * Gets the value of the dataUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaAtualizacao(XMLGregorianCalendar value) {
        this.dataUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the dataCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Sets the value of the dataCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Gets the value of the canalIndicacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCanalIndicacao() {
        return canalIndicacao;
    }

    /**
     * Sets the value of the canalIndicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCanalIndicacao(TipoReferencia value) {
        this.canalIndicacao = value;
    }

    /**
     * Gets the value of the indicador property.
     * 
     * @return
     *     possible object is
     *     {@link Indicador }
     *     
     */
    public Indicador getIndicador() {
        return indicador;
    }

    /**
     * Sets the value of the indicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indicador }
     *     
     */
    public void setIndicador(Indicador value) {
        this.indicador = value;
    }

    /**
     * Gets the value of the programasFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramaFidelidadeParticipanteList }
     *     
     */
    public ProgramaFidelidadeParticipanteList getProgramasFidelidade() {
        return programasFidelidade;
    }

    /**
     * Sets the value of the programasFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramaFidelidadeParticipanteList }
     *     
     */
    public void setProgramasFidelidade(ProgramaFidelidadeParticipanteList value) {
        this.programasFidelidade = value;
    }

    /**
     * Gets the value of the segmentos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getSegmentos() {
        return segmentos;
    }

    /**
     * Sets the value of the segmentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setSegmentos(TipoReferenciaList value) {
        this.segmentos = value;
    }

    /**
     * Gets the value of the canalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalOrigem() {
        return canalOrigem;
    }

    /**
     * Sets the value of the canalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalOrigem(Canal value) {
        this.canalOrigem = value;
    }

    /**
     * Gets the value of the canalAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalAtualizacao() {
        return canalAtualizacao;
    }

    /**
     * Sets the value of the canalAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalAtualizacao(Canal value) {
        this.canalAtualizacao = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link Tier }
     *     
     */
    public Tier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier }
     *     
     */
    public void setTier(Tier value) {
        this.tier = value;
    }

    /**
     * Gets the value of the numeroMultiplusMascarado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMultiplusMascarado() {
        return numeroMultiplusMascarado;
    }

    /**
     * Sets the value of the numeroMultiplusMascarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMultiplusMascarado(String value) {
        this.numeroMultiplusMascarado = value;
    }

    /**
     * Gets the value of the listaConfiguracoesOptin property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoOptinList }
     *     
     */
    public ConfiguracaoOptinList getListaConfiguracoesOptin() {
        return listaConfiguracoesOptin;
    }

    /**
     * Sets the value of the listaConfiguracoesOptin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoOptinList }
     *     
     */
    public void setListaConfiguracoesOptin(ConfiguracaoOptinList value) {
        this.listaConfiguracoesOptin = value;
    }

    /**
     * Gets the value of the participanteResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipanteResponsavel() {
        return participanteResponsavel;
    }

    /**
     * Sets the value of the participanteResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipanteResponsavel(Participante value) {
        this.participanteResponsavel = value;
    }

    /**
     * Gets the value of the parceiroOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiroOrigem() {
        return parceiroOrigem;
    }

    /**
     * Sets the value of the parceiroOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiroOrigem(Parceiro value) {
        this.parceiroOrigem = value;
    }

    /**
     * Gets the value of the aceitesRegulamentos property.
     * 
     * @return
     *     possible object is
     *     {@link AceiteRegulamentoList }
     *     
     */
    public AceiteRegulamentoList getAceitesRegulamentos() {
        return aceitesRegulamentos;
    }

    /**
     * Sets the value of the aceitesRegulamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AceiteRegulamentoList }
     *     
     */
    public void setAceitesRegulamentos(AceiteRegulamentoList value) {
        this.aceitesRegulamentos = value;
    }

}
