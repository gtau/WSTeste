import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import flow.MP.ConsultaParticipante.Cache;
import flow.MP.ConsultaParticipante.ConsultarParticipanteInput;
import flow.MP.ConsultaParticipante.ConsultarParticipanteOutput;
import flow.MP.ConsultaParticipante.ConsultarParticipantev1;
import flow.MP.ConsultaParticipante.ConsultarParticipantev1PortType;
import flow.MP.ConsultaParticipante.Participante;
import flow.MP.ConsultaParticipante.PropriedadesExecucao;


public class ConsultaParticipante {
	static {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier() {
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                return true;
            }
        });
    }
	public void testar(){
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
		ConsultarParticipanteInput participanteinput = new ConsultarParticipanteInput();
		ConsultarParticipanteOutput participanteoutput = new ConsultarParticipanteOutput();
		Participante participante = new Participante();
		ConsultarParticipantev1 consultarparticipanteimpl = new ConsultarParticipantev1();
		ConsultarParticipantev1PortType consultarparticipanteport = consultarparticipanteimpl.getConsultarParticipantev1();
		BindingProvider bindingprovider =  (BindingProvider)consultarparticipanteport;
		bindingprovider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://qab2b.pontosmultiplus.com.br:8443/API/ConsultarParticipanteAPISv1");
		@SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("OrbitallUser", "Mplus2@16"));
        bindingprovider.getBinding().setHandlerChain(handlerChain);

      System.out.println(System.getProperty("javax.net.ssl.trustStore"));
      
//    System.setProperty("javax.net.ssl.keyStorePassword", "changeit");      		
//		bp.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", getCustomSocketFactory()); 
				
//		Inicio.setProp();

      	participante.setNumeroMultiplus("22323181840");
		participanteinput.setParticipante(participante);
		participanteinput.setIdiomaDadosRetorno("PTB");
		PropriedadesExecucao prop = new PropriedadesExecucao();
		// We will be using interface 1 on this webservice call
		prop.setIdInterface(1);
		// Define cache properties to be used
		Cache cache = new Cache();
		cache.setIndicadorSuporteCache(true);
		cache.setTempoMaximoSegundos((long)600);
		prop.setCache(cache);
		// Enable Test Mode
	//	prop.setIndicadorModoTeste(true);
		participanteinput.setPropriedadesExecucao(prop);

		try {
			participanteoutput = consultarparticipanteport.consultarParticipante(participanteinput);
			participante = participanteoutput.getParticipante();
		
		}
		catch (flow.MP.ConsultaParticipante.ConsultarParticipanteFaultMsg e) {
			System.out.println("Erro na Executacao do WebService");
			System.out.println("Codigo: " + e.getFaultInfo().getCodigo());
			System.out.println("Mensagem: " + e.getFaultInfo().getMensagem());
			System.out.println("Instrucao: " + e.getFaultInfo().getInstrucao());
			System.out.println("Detalhe:" + e.getFaultInfo().getDetalhe());
		}
		catch (flow.MP.ConsultaParticipante.ErroTecnicoFaultMsg e) {
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
		System.out.println("id-participante: " + participante.getIdParticipante());
		System.out.println(participante.getNumeroTamFidelidade().toString());
		System.out.println(participante.getCadastroPf().getPrimeiroNome());
		System.out.println(participante.getContatos().getContato().get(0).getTelefones().getTelefone().get(0).getNumeroInternacional());
		System.out.println(participante.getSaldoParticipante().getSaldoPontos().toString());
		
	}
}


