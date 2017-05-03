package WSDL;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by zGuindouOS on 02/05/2017.
 */


public class Definition {

    private String name;
    private String targetNameSpace;
    private ArrayList<Message> messages;
    private ArrayList<Service> services;
    private PortType portType;
    private Binding binding;
    private Import importDefinition;
    private Types types;

    public void setName(String name) {
        this.name = name;
    }

    public void setTargetNameSpace(String targetNameSpace) {
        this.targetNameSpace = targetNameSpace;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public void setPortType(PortType portType) {
        this.portType = portType;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public void setImportDefinition(Import importDefinition) {
        this.importDefinition = importDefinition;
    }

    public void setTypes(Types types) { this.types = types;}

    public String getName() {
        return name;
    }

    public String getTargetNameSpace() {
        return targetNameSpace;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public PortType getPortType() {
        return portType;
    }

    public Binding getBinding() {
        return binding;
    }

    public Import getImportDefinition() {
        return importDefinition;
    }

    public Types getTypes() { return types; }


    public Definition() {
        messages        = new ArrayList<Message>();
        services        = new ArrayList<Service>();
        portType        = new PortType();
        binding         = new Binding();
        importDefinition= new Import();
    }

    public Definition(String name, String targetNameSpace) {
        this.name = name;
        this.targetNameSpace = targetNameSpace;
        messages        = new ArrayList<Message>();
        services        = new ArrayList<Service>();
        portType       = new PortType();
        binding         = new Binding();
        importDefinition= new Import();
    }

    public Definition(String name, String targetNameSpace, ArrayList<Message> messages, ArrayList<Service> services, PortType portType, Binding binding, Import importDefinition) {
        this.name = name;
        this.targetNameSpace = targetNameSpace;
        this.messages = messages;
        this.services = services;
        this.portType = portType;
        this.binding  = binding;
        this.importDefinition = importDefinition;
    }

    public Definition(String name, String targetNameSpace, ArrayList<Message> messages, ArrayList<Service> services, PortType portType, Binding binding, Import importDefinition, Types types) {
        this.name = name;
        this.targetNameSpace = targetNameSpace;
        this.messages = messages;
        this.services = services;
        this.portType = portType;
        this.binding  = binding;
        this.importDefinition = importDefinition;
        this.types = types;
    }
}
