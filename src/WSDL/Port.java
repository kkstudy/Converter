package WSDL;

/**
 * Created by zGuindouOS on 02/05/2017.
 */
public class Port {

    private String binding;
    private String name;
    private SoapAddress soapAddress;

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoapAddress(SoapAddress soapAddress) {
        this.soapAddress = soapAddress;
    }

    public String getBinding() {
        return binding;
    }

    public String getName() {
        return name;
    }

    public SoapAddress getSoapAddress() {
        return soapAddress;
    }

    public Port() {
        soapAddress = new SoapAddress();
    }

    public Port(String binding, String name) {
        this.binding = binding;
        this.name = name;
    }

    public Port(String binding, String name, SoapAddress soapAddress) {
        this.binding = binding;
        this.name = name;
        this.soapAddress = soapAddress;
    }
}