/**
 * IMingDeAppInterfaceWsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kompakar.ehealth.server.webservice.integratedservices.wsservice;

import net.hp.healthcare.utils.Contains;

public class IMingDeAppInterfaceWsServiceLocator extends org.apache.axis.client.Service implements com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsService {

    public IMingDeAppInterfaceWsServiceLocator() {
    }


    public IMingDeAppInterfaceWsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IMingDeAppInterfaceWsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IMingDeAppInterfaceWsServiceHttpPort
    private java.lang.String IMingDeAppInterfaceWsServiceHttpPort_address = Contains.WEBSERVICE_ADDRESS + "/eHealth/services/IMingDeAppInterfaceWsService";

    public java.lang.String getIMingDeAppInterfaceWsServiceHttpPortAddress() {
        return IMingDeAppInterfaceWsServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IMingDeAppInterfaceWsServiceHttpPortWSDDServiceName = "IMingDeAppInterfaceWsServiceHttpPort";

    public java.lang.String getIMingDeAppInterfaceWsServiceHttpPortWSDDServiceName() {
        return IMingDeAppInterfaceWsServiceHttpPortWSDDServiceName;
    }

    public void setIMingDeAppInterfaceWsServiceHttpPortWSDDServiceName(java.lang.String name) {
        IMingDeAppInterfaceWsServiceHttpPortWSDDServiceName = name;
    }

    public com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType getIMingDeAppInterfaceWsServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IMingDeAppInterfaceWsServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIMingDeAppInterfaceWsServiceHttpPort(endpoint);
    }

    public com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType getIMingDeAppInterfaceWsServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServiceHttpBindingStub _stub = new com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getIMingDeAppInterfaceWsServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIMingDeAppInterfaceWsServiceHttpPortEndpointAddress(java.lang.String address) {
        IMingDeAppInterfaceWsServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServiceHttpBindingStub _stub = new com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServiceHttpBindingStub(new java.net.URL(IMingDeAppInterfaceWsServiceHttpPort_address), this);
                _stub.setPortName(getIMingDeAppInterfaceWsServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IMingDeAppInterfaceWsServiceHttpPort".equals(inputPortName)) {
            return getIMingDeAppInterfaceWsServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "IMingDeAppInterfaceWsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "IMingDeAppInterfaceWsServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IMingDeAppInterfaceWsServiceHttpPort".equals(portName)) {
            setIMingDeAppInterfaceWsServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
