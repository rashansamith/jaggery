package org.wso2.jaggery.integration.tests.wsmock;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService
public interface AddService {
    @WebMethod
    int addInt(int i, int j);
}
