/**
 * IMingDeAppInterfaceWsServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kompakar.ehealth.server.webservice.integratedservices.wsservice;

public interface IMingDeAppInterfaceWsServicePortType extends java.rmi.Remote {
    public java.lang.String regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String cancel_regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_DEPARTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_PATIENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_ORDER_ITEM(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_LIS_RESULTBAC(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_CODEMSTR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_VISIT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_BILL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_APPOINTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_DUTY(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_DOCTOR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_BILL_DETAIL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String pay_op_nopay_bill(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_LIS_RESULT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
    public java.lang.String WS_HP_ABROGATE(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException;
}
