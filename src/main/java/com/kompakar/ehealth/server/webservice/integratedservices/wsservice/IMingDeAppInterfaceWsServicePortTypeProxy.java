package com.kompakar.ehealth.server.webservice.integratedservices.wsservice;

public class IMingDeAppInterfaceWsServicePortTypeProxy implements com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType {
  private String _endpoint = null;
  private com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType iMingDeAppInterfaceWsServicePortType = null;
  
  public IMingDeAppInterfaceWsServicePortTypeProxy() {
    _initIMingDeAppInterfaceWsServicePortTypeProxy();
  }
  
  public IMingDeAppInterfaceWsServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initIMingDeAppInterfaceWsServicePortTypeProxy();
  }
  
  private void _initIMingDeAppInterfaceWsServicePortTypeProxy() {
    try {
      iMingDeAppInterfaceWsServicePortType = (new com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServiceLocator()).getIMingDeAppInterfaceWsServiceHttpPort();
      if (iMingDeAppInterfaceWsServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iMingDeAppInterfaceWsServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iMingDeAppInterfaceWsServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iMingDeAppInterfaceWsServicePortType != null)
      ((javax.xml.rpc.Stub)iMingDeAppInterfaceWsServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType getIMingDeAppInterfaceWsServicePortType() {
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType;
  }
  
  public java.lang.String regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.regnAppointment(in0);
  }
  
  public java.lang.String cancel_regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.cancel_regnAppointment(in0);
  }
  
  public java.lang.String WS_HP_DEPARTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_DEPARTMENT(in0);
  }
  
  public java.lang.String WS_HP_PATIENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_PATIENT(in0);
  }
  
  public java.lang.String WS_HP_ORDER_ITEM(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_ORDER_ITEM(in0);
  }
  
  public java.lang.String WS_HP_LIS_RESULTBAC(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_LIS_RESULTBAC(in0);
  }
  
  public java.lang.String WS_HP_CODEMSTR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_CODEMSTR(in0);
  }
  
  public java.lang.String WS_HP_VISIT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_VISIT(in0);
  }
  
  public java.lang.String WS_HP_BILL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_BILL(in0);
  }
  
  public java.lang.String WS_HP_APPOINTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_APPOINTMENT(in0);
  }
  
  public java.lang.String WS_HP_DUTY(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_DUTY(in0);
  }
  
  public java.lang.String WS_HP_DOCTOR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_DOCTOR(in0);
  }
  
  public java.lang.String WS_HP_BILL_DETAIL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_BILL_DETAIL(in0);
  }
  
  public java.lang.String pay_op_nopay_bill(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.pay_op_nopay_bill(in0);
  }
  
  public java.lang.String WS_HP_LIS_RESULT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_LIS_RESULT(in0);
  }
  
  public java.lang.String WS_HP_ABROGATE(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException{
    if (iMingDeAppInterfaceWsServicePortType == null)
      _initIMingDeAppInterfaceWsServicePortTypeProxy();
    return iMingDeAppInterfaceWsServicePortType.WS_HP_ABROGATE(in0);
  }
  
  
}