import javax.xml.ws.BindingProvider;
import java.util.Properties;
import java.util.ArrayList;
import java.util.List;

import flow.MP.ConsultaSaldo.PropriedadesExecucao;
import flow.MP.ConsultaSaldo.ConsultarSaldoParticipanteOutput;
import flow.MP.ConsultaSaldo.ConsultarSaldoParticipanteInput;
import flow.MP.ConsultaSaldo.ConsultarSaldoParticipantev1;
import flow.MP.ConsultaSaldo.ConsultarSaldoParticipantev1PortType;
import flow.MP.ConsultaSaldo.Participante;


import javax.xml.ws.handler.Handler;

public class ConsultaSaldo {
	static {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                return true;
            }
        });
    }
	public void testar(String[] args){
		
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
		ConsultarSaldoParticipanteInput consultasaldoinput = new ConsultarSaldoParticipanteInput();
		ConsultarSaldoParticipanteOutput consultasaldooutput = new ConsultarSaldoParticipanteOutput();
		Participante participante = new Participante();
		ConsultarSaldoParticipantev1 consultasaldoimpl = new ConsultarSaldoParticipantev1();
		ConsultarSaldoParticipantev1PortType consultasaldoport = consultasaldoimpl.getConsultarSaldoParticipantev1();
		BindingProvider bindingprovider =  (BindingProvider)consultasaldoport;
		bindingprovider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://qab2b.pontosmultiplus.com.br:8443/API/ConsultarSaldoParticipanteAPISv1");
		@SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("OrbitallUser", "Mplus2@16"));
        bindingprovider.getBinding().setHandlerChain(handlerChain);

      System.out.println(System.getProperty("javax.net.ssl.trustStore"));
      
//    System.setProperty("javax.net.ssl.keyStorePassword", "changeit");      		
//		bp.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", getCustomSocketFactory()); 
				
//		Inicio.setProp();
      participante.setNumeroMultiplus("81233107577");
      consultasaldoinput.setParticipante(participante);
      

		PropriedadesExecucao prop = new PropriedadesExecucao();
		// We will be using interface 1 on this webservice call
		prop.setIdInterface(1);
		
		consultasaldoinput.setPropriedadesExecucao(prop);

		try {
			consultasaldooutput = consultasaldoport.consultarSaldoParticipante(consultasaldoinput);
			participante = consultasaldooutput.getParticipante();
		
		}
		catch (flow.MP.ConsultaSaldo.ConsultarSaldoParticipanteFaultMsg e) {
			System.out.println("Erro na Executacao do WebService");
			System.out.println("Codigo: " + e.getFaultInfo().getCodigo());
			System.out.println("Mensagem: " + e.getFaultInfo().getMensagem());
			System.out.println("Instrucao: " + e.getFaultInfo().getInstrucao());
			System.out.println("Detalhe:" + e.getFaultInfo().getDetalhe());
		}
		catch (flow.MP.ConsultaSaldo.ErroTecnicoFaultMsg e) {
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
		System.out.println("id-participante: " + participante.getSaldoParticipante().getSaldoPontos());
				
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