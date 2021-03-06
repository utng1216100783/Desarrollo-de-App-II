
package utng.dsoria.services.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MedallistasWS", targetNamespace = "http://webservices.services.dsoria.utng/", wsdlLocation = "http://localhost:8082/MedallistasWSHibernateII/MedallistasWS?wsdl")
public class MedallistasWS_Service
    extends Service
{

    private final static URL MEDALLISTASWS_WSDL_LOCATION;
    private final static WebServiceException MEDALLISTASWS_EXCEPTION;
    private final static QName MEDALLISTASWS_QNAME = new QName("http://webservices.services.dsoria.utng/", "MedallistasWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/MedallistasWSHibernateII/MedallistasWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDALLISTASWS_WSDL_LOCATION = url;
        MEDALLISTASWS_EXCEPTION = e;
    }

    public MedallistasWS_Service() {
        super(__getWsdlLocation(), MEDALLISTASWS_QNAME);
    }

    public MedallistasWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDALLISTASWS_QNAME, features);
    }

    public MedallistasWS_Service(URL wsdlLocation) {
        super(wsdlLocation, MEDALLISTASWS_QNAME);
    }

    public MedallistasWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDALLISTASWS_QNAME, features);
    }

    public MedallistasWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MedallistasWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MedallistasWS
     */
    @WebEndpoint(name = "MedallistasWSPort")
    public MedallistasWS getMedallistasWSPort() {
        return super.getPort(new QName("http://webservices.services.dsoria.utng/", "MedallistasWSPort"), MedallistasWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MedallistasWS
     */
    @WebEndpoint(name = "MedallistasWSPort")
    public MedallistasWS getMedallistasWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.services.dsoria.utng/", "MedallistasWSPort"), MedallistasWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDALLISTASWS_EXCEPTION!= null) {
            throw MEDALLISTASWS_EXCEPTION;
        }
        return MEDALLISTASWS_WSDL_LOCATION;
    }

}
