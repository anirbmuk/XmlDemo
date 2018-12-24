package blog.anirbanm.xml.view.bean;

import blog.anirbanm.xml.view.ADFUtils;

import javax.faces.event.ActionEvent;

import oracle.binding.OperationBinding;

public class XmlManager {
    
    public XmlManager() {
    }

    public void printXml(final ActionEvent actionEvent) {
        final String xmltype = (String) actionEvent.getComponent().getAttributes().get("xmltype");
        final OperationBinding printXml = ADFUtils.findOperation("printXml");
        printXml.getParamsMap().put("type", xmltype);
        printXml.execute();
    }
}
