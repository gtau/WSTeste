import java.util.Set;
 
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
 
public class WSSecurityHeaderSOAPHandler implements SOAPHandler<SOAPMessageContext> {
 
 private static final String SOAP_ELEMENT_PASSWORD = "Password";
 private static final String SOAP_ELEMENT_USERNAME = "Username";
 private static final String SOAP_ELEMENT_USERNAME_TOKEN = "UsernameToken";
 private static final String SOAP_ELEMENT_SECURITY = "Security";
 private static final String NAMESPACE_SECURITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
 private static final String PREFIX_SECURITY = "wsse";
 
 private String usernameText;
 private String passwordText;
 
 public WSSecurityHeaderSOAPHandler(String usernameText, String passwordText) {
 this.usernameText = usernameText;
 this.passwordText = passwordText;
 }
 
 public boolean handleMessage(SOAPMessageContext soapMessageContext) {
 
 Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
 if (outboundProperty.booleanValue()) {
 
 try {
 SOAPEnvelope soapEnvelope = soapMessageContext.getMessage().getSOAPPart().getEnvelope();
 // WebService requires we use soapenv as the header for soap;
 soapEnvelope.setPrefix("soapenv");
 soapEnvelope.addNamespaceDeclaration("ebo", "http://ebo.multiplusfidelidade.com.br/v1");

 
 SOAPHeader header = soapEnvelope.getHeader();
 if (header == null) {
 header = soapEnvelope.addHeader();
 }
 

 SOAPElement soapElementSecurityHeader = header.addChildElement(SOAP_ELEMENT_SECURITY, PREFIX_SECURITY,
 NAMESPACE_SECURITY);

 SOAPElement soapElementUsernameToken = soapElementSecurityHeader.addChildElement(SOAP_ELEMENT_USERNAME_TOKEN, PREFIX_SECURITY);
 SOAPElement soapElementUsername = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_USERNAME, PREFIX_SECURITY);
 soapElementUsername.addTextNode(this.usernameText);
 
 SOAPElement soapElementPassword = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_PASSWORD, PREFIX_SECURITY);
 soapElementPassword.addTextNode(this.passwordText);
 
 
 //Create header MetaInformacao

 SOAPElement soapElementMetaInformacaoHeader = header.addChildElement("MetaInformacao", "ebo");
 SOAPElement soapElementIdRequesicaoHeader = soapElementMetaInformacaoHeader.addChildElement("id-requisicao","ebo");
 soapElementIdRequesicaoHeader.addTextNode("123456");
 SOAPElement soapElementDataHoraHeader = soapElementMetaInformacaoHeader.addChildElement("data-hora-requisicao","ebo");
 soapElementDataHoraHeader.addTextNode("2013-04-04T18:00:00");
 SOAPElement soapElementSistemaOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("sistema-origem","ebo");
 soapElementSistemaOrigemHeader.addTextNode("XYZ-App-v2.75");
 SOAPElement soapElementOperacaoOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("operacao-origem","ebo");
 soapElementOperacaoOrigemHeader.addTextNode("CasoUso123");
 SOAPElement soapElementEnderecoOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("endereco-origem","ebo");
 soapElementEnderecoOrigemHeader.addTextNode("servidor1:porta1@cluster1.dominio1");
 SOAPElement soapElementUsuarioOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("usuario-origem","ebo");
 soapElementUsuarioOrigemHeader.addTextNode("systemUserXyz");
 SOAPElement soapElementCanalOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("canal-origem","ebo");
 soapElementCanalOrigemHeader.addTextNode("SYS");
 SOAPElement soapElementVersaoOrigemHeader = soapElementMetaInformacaoHeader.addChildElement("versao-consumidor","ebo");
 soapElementVersaoOrigemHeader.addTextNode("1.0");
 SOAPElement soapElementVersaoServicoHeader = soapElementMetaInformacaoHeader.addChildElement("versao-servico-consumido","ebo");
 soapElementVersaoServicoHeader.addTextNode("1.1");
 SOAPElement soapElementTipoConsumidorHeader = soapElementMetaInformacaoHeader.addChildElement("tipo-consumidor","ebo");
 soapElementTipoConsumidorHeader.addTextNode("JAX-WS 2.1");
 SOAPElement soapElementEnderecoServicoHeader = soapElementMetaInformacaoHeader.addChildElement("endereco-servico-consumido","ebo");
 soapElementEnderecoServicoHeader.addTextNode("https://esb.multiplusfidelidade.com.br/EBS/ConsultarParticipantev1");
 
		 
 } catch (Exception e) {
 throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
 }
 
 }
 
 return true;
 }
 
 @Override
 public void close(MessageContext context) {
 // TODO Auto-generated method stub
 }
 
 @Override
 public boolean handleFault(SOAPMessageContext context) {
 // TODO Auto-generated method stub
 return true;
 }
 
 @Override
 public Set<QName> getHeaders() {
 // TODO Auto-generated method stub
 return null;
 }
}