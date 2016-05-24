/**
 * BusinessException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kompakar.ehealth.base.exception;

public class BusinessException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String detailMessage;

    private java.lang.Object extraObj;

    private java.lang.String focusWidgetName;

    private java.lang.String widgetCode;

    public BusinessException() {
    }

    public BusinessException(
           java.lang.String detailMessage,
           java.lang.Object extraObj,
           java.lang.String focusWidgetName,
           java.lang.String widgetCode) {
        this.detailMessage = detailMessage;
        this.extraObj = extraObj;
        this.focusWidgetName = focusWidgetName;
        this.widgetCode = widgetCode;
    }


    /**
     * Gets the detailMessage value for this BusinessException.
     * 
     * @return detailMessage
     */
    public java.lang.String getDetailMessage() {
        return detailMessage;
    }


    /**
     * Sets the detailMessage value for this BusinessException.
     * 
     * @param detailMessage
     */
    public void setDetailMessage(java.lang.String detailMessage) {
        this.detailMessage = detailMessage;
    }


    /**
     * Gets the extraObj value for this BusinessException.
     * 
     * @return extraObj
     */
    public java.lang.Object getExtraObj() {
        return extraObj;
    }


    /**
     * Sets the extraObj value for this BusinessException.
     * 
     * @param extraObj
     */
    public void setExtraObj(java.lang.Object extraObj) {
        this.extraObj = extraObj;
    }


    /**
     * Gets the focusWidgetName value for this BusinessException.
     * 
     * @return focusWidgetName
     */
    public java.lang.String getFocusWidgetName() {
        return focusWidgetName;
    }


    /**
     * Sets the focusWidgetName value for this BusinessException.
     * 
     * @param focusWidgetName
     */
    public void setFocusWidgetName(java.lang.String focusWidgetName) {
        this.focusWidgetName = focusWidgetName;
    }


    /**
     * Gets the widgetCode value for this BusinessException.
     * 
     * @return widgetCode
     */
    public java.lang.String getWidgetCode() {
        return widgetCode;
    }


    /**
     * Sets the widgetCode value for this BusinessException.
     * 
     * @param widgetCode
     */
    public void setWidgetCode(java.lang.String widgetCode) {
        this.widgetCode = widgetCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessException)) return false;
        BusinessException other = (BusinessException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailMessage==null && other.getDetailMessage()==null) || 
             (this.detailMessage!=null &&
              this.detailMessage.equals(other.getDetailMessage()))) &&
            ((this.extraObj==null && other.getExtraObj()==null) || 
             (this.extraObj!=null &&
              this.extraObj.equals(other.getExtraObj()))) &&
            ((this.focusWidgetName==null && other.getFocusWidgetName()==null) || 
             (this.focusWidgetName!=null &&
              this.focusWidgetName.equals(other.getFocusWidgetName()))) &&
            ((this.widgetCode==null && other.getWidgetCode()==null) || 
             (this.widgetCode!=null &&
              this.widgetCode.equals(other.getWidgetCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDetailMessage() != null) {
            _hashCode += getDetailMessage().hashCode();
        }
        if (getExtraObj() != null) {
            _hashCode += getExtraObj().hashCode();
        }
        if (getFocusWidgetName() != null) {
            _hashCode += getFocusWidgetName().hashCode();
        }
        if (getWidgetCode() != null) {
            _hashCode += getWidgetCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "BusinessException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "detailMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "extraObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("focusWidgetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "focusWidgetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://exception.base.ehealth.kompakar.com", "widgetCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
