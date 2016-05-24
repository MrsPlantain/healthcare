/**
 * IMingDeAppInterfaceWsServiceHttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kompakar.ehealth.server.webservice.integratedservices.wsservice;

public class IMingDeAppInterfaceWsServiceHttpBindingStub extends org.apache.axis.client.Stub implements com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("regnAppointment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancel_regnAppointment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_DEPARTMENT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_PATIENT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_ORDER_ITEM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_LIS_RESULTBAC");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_CODEMSTR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_VISIT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_BILL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_APPOINTMENT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_DUTY");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_DOCTOR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_BILL_DETAIL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pay_op_nopay_bill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_LIS_RESULT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WS_HP_ABROGATE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "out"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "BusinessException"),
                      "com.kompakar.ehealth.base.exception.BusinessException",
                      new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"), 
                      true
                     ));
        _operations[15] = oper;

    }

    public IMingDeAppInterfaceWsServiceHttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IMingDeAppInterfaceWsServiceHttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IMingDeAppInterfaceWsServiceHttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.base.exception.BusinessException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">cancel_regnAppointment");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.Cancel_regnAppointment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">cancel_regnAppointmentResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.Cancel_regnAppointmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">pay_op_nopay_bill");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.Pay_op_nopay_bill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">pay_op_nopay_billResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.Pay_op_nopay_billResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">regnAppointment");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.RegnAppointment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">regnAppointmentResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.RegnAppointmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_ABROGATE");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_ABROGATE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_ABROGATEResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_ABROGATEResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_APPOINTMENT");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_APPOINTMENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_APPOINTMENTResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_APPOINTMENTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_BILL");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_BILL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_BILL_DETAIL");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_BILL_DETAIL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_BILL_DETAILResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_BILL_DETAILResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_BILLResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_BILLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_CODEMSTR");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_CODEMSTR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_CODEMSTRResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_CODEMSTRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DEPARTMENT");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DEPARTMENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DEPARTMENTResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DEPARTMENTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DOCTOR");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DOCTOR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DOCTORResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DOCTORResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DUTY");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DUTY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_DUTYResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_DUTYResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_LIS_RESULT");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_LIS_RESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_LIS_RESULTBAC");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_LIS_RESULTBAC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_LIS_RESULTBACResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_LIS_RESULTBACResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_LIS_RESULTResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_LIS_RESULTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_ORDER_ITEM");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_ORDER_ITEM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_ORDER_ITEMResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_ORDER_ITEMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_PATIENT");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_PATIENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_PATIENTResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_PATIENTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_VISIT");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_VISIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", ">WS_HP_VISITResponse");
            cachedSerQNames.add(qName);
            cls = com.kompakar.ehealth.server.webservice.integratedservices.wsservice.WS_HP_VISITResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "regnAppointment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String cancel_regnAppointment(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "cancel_regnAppointment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_DEPARTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_DEPARTMENT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_PATIENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_PATIENT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_ORDER_ITEM(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_ORDER_ITEM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_LIS_RESULTBAC(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_LIS_RESULTBAC"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_CODEMSTR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_CODEMSTR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_VISIT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_VISIT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_BILL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_BILL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_APPOINTMENT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_APPOINTMENT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_DUTY(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_DUTY"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_DOCTOR(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_DOCTOR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_BILL_DETAIL(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_BILL_DETAIL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String pay_op_nopay_bill(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "pay_op_nopay_bill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_LIS_RESULT(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_LIS_RESULT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String WS_HP_ABROGATE(java.lang.String in0) throws java.rmi.RemoteException, com.kompakar.ehealth.base.exception.BusinessException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsservice.integratedservices.webservice.server.ehealth.kompakar.com", "WS_HP_ABROGATE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.kompakar.ehealth.base.exception.BusinessException) {
              throw (com.kompakar.ehealth.base.exception.BusinessException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
