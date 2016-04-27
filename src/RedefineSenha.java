import javax.xml.ws.BindingProvider;
import java.util.Properties;
import java.util.ArrayList;
import java.util.List;

import flow.MP.RedefineSenha.Canal;
import flow.MP.RedefineSenha.Email;
import flow.MP.RedefineSenha.ReciboEntregaList;
import flow.MP.RedefineSenha.TipoReferencia;
import flow.MP.RedefineSenha.PropriedadesExecucao;
import flow.MP.RedefineSenha.RedefinirSenhaUsuarioInput;
import flow.MP.RedefineSenha.RedefinirSenhaUsuarioOutput;
import flow.MP.RedefineSenha.RedefinirSenhaUsuariov1;
import flow.MP.RedefineSenha.RedefinirSenhaUsuariov1PortType;
import flow.MP.RedefineSenha.Usuario;

/*
 * @ToDO: revalidar webservice recibo de entrega pois esta havendo falha de autenticacao na interface 1
 */

import javax.xml.ws.handler.Handler;

public class RedefineSenha {
	static {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                return true;
            }
        });
    }
	public RedefineSenha(String trustStoreLocation, String trustStorePassword, String webserviceusername, String webservicepassword, Boolean debug) {
		
	}
	public void Testar(String[] args){
		
		/* Set trust store so we can connect to the https server
		Certificate for qab2b.multiplus.com.br was added to this keystore */
		System.setProperty("javax.net.ssl.trustStore", "c:\\tau.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "Avaya@100");
		/*
		 * Enable Debug so we can dump packets
		 */
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		//System.setProperty("javax.net.ssl.keyStore", "c:\\tau.jks");
		//System.setProperty("javax.net.ssl.keyStorePassword", "Avaya@100");
		
		/*
		 * Instantiate Webservice Variables
		 */
		RedefinirSenhaUsuarioInput redefinirsenhainput = new RedefinirSenhaUsuarioInput();
		RedefinirSenhaUsuarioOutput redefinitsenhaoutput = new RedefinirSenhaUsuarioOutput();
		Usuario usuario = new Usuario();
		ReciboEntregaList reciboentrega = new ReciboEntregaList();
		RedefinirSenhaUsuariov1 redefinirsenhaimpl = new RedefinirSenhaUsuariov1();
		RedefinirSenhaUsuariov1PortType redefinirsenhaport = redefinirsenhaimpl.getRedefinirSenhaUsuariov1();
		BindingProvider bindingprovider =  (BindingProvider)redefinirsenhaport;
		bindingprovider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://qab2b.pontosmultiplus.com.br:8443/API/RedefinirSenhaUsuarioAPISv1");
		@SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("OrbitallUser", "Mplus2@16"));
        bindingprovider.getBinding().setHandlerChain(handlerChain);

      System.out.println(System.getProperty("javax.net.ssl.trustStore"));
      
//    System.setProperty("javax.net.ssl.keyStorePassword", "changeit");      		
//		bp.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", getCustomSocketFactory()); 
				
//		Inicio.setProp();
      usuario.setIdUsuario("22323181840");
      TipoReferencia tiporeferenciausuario = new TipoReferencia();
      tiporeferenciausuario.setValorReferencia("PARTICIPANTE");
      usuario.setTipoUsuario(tiporeferenciausuario);
      TipoReferencia tiporeferenciacredencial = new TipoReferencia();
      tiporeferenciacredencial.setValorReferencia("SENHA_ACESSO");
      usuario.setTipoCredencial(tiporeferenciacredencial);
      
      Email email = new Email();
      email.setEnderecoEmail("gabrieltau@gabrieltau.com.br");
      usuario.setEmail(email);
      
      Canal canal = new Canal();
      TipoReferencia tiporeferenciacanal = new TipoReferencia();
      tiporeferenciacanal.setValorReferencia("URA");
      canal.setCanal(tiporeferenciacanal);
      
      TipoReferencia tiporeferenciasubcanal = new TipoReferencia();
      tiporeferenciasubcanal.setValorReferencia("ORBITALL");
      canal.setSubcanal(tiporeferenciasubcanal);

      redefinirsenhainput.setUsuario(usuario);
       

      PropriedadesExecucao prop = new PropriedadesExecucao();
      // We will be using interface 1 on this webservice call
      prop.setIdInterface(1);
		
      redefinirsenhainput.setPropriedadesExecucao(prop);

		try {
			redefinitsenhaoutput = redefinirsenhaport.redefinirSenhaUsuario(redefinirsenhainput);
			usuario = redefinitsenhaoutput.getUsuario();
			reciboentrega = redefinitsenhaoutput.getRecibosEntrega();
		
		}
		catch (flow.MP.RedefineSenha.RedefinirSenhaUsuarioFaultMsg e) {
			System.out.println("Erro na Executacao do WebService");
			System.out.println("Codigo: " + e.getFaultInfo().getCodigo());
			System.out.println("Mensagem: " + e.getFaultInfo().getMensagem());
			System.out.println("Instrucao: " + e.getFaultInfo().getInstrucao());
			System.out.println("Detalhe:" + e.getFaultInfo().getDetalhe());
		}
		catch (flow.MP.RedefineSenha.ErroTecnicoFaultMsg e) {
			System.out.println("Erro na Executacao do WebService");
			System.out.println("Codigo: " + e.getFaultInfo().getCodigo());
			System.out.println("Mensagem: " + e.getFaultInfo().getMensagem());
			System.out.println("Instrucao: " + e.getFaultInfo().getInstrucao());
			System.out.println("Detalhe:" + e.getFaultInfo().getDetalhe());
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		if(!reciboentrega.getReciboEntrega().isEmpty())
			System.out.println("Recibo Entrega: " + reciboentrega.getReciboEntrega().get(0).getIdReciboEntrega());
				
	}
	
	private static void setProp()
	{
	    String keyStoreFileName = "ssl/clientKeyStore.jks";
	    String keyStorePath = ClassLoader.getSystemResource(keyStoreFileName).getPath();
	    String keyStoreType = "JKS";
	    String keyStorePassword = "mypassword";

	    String trustStoreFileName = "ssl/clientTruststore.jks";
	    String trustStorePath = ClassLoader.getSystemResource(trustStoreFileName).getPath();
	    String trustStoreType = "JKS";
	    String trustStorePassword = "mypassword";

	    Properties systemProps = System.getProperties();
	    systemProps.put("javax.net.ssl.keyStore", keyStorePath);
	    System.out.println(keyStorePath);
	    systemProps.put("javax.net.ssl.keyStorePassword", trustStorePassword);
	    systemProps.put("javax.net.ssl.keyStoreType", keyStoreType);

	    systemProps.put("javax.net.ssl.trustStore", trustStorePath);
	    systemProps.put("javax.net.ssl.trustStoreType", trustStoreType);
	    systemProps.put("javax.net.ssl.trustStorePassword", keyStorePassword);
	    System.setProperties(systemProps);
	    return;
	}
}