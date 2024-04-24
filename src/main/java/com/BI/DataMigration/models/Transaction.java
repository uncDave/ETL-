package com.BI.DataMigration.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transactions")
@ToString
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long merchantId;
    private String description;
    private Long amount;
    private Long fee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getFeeInclusive() {
        return feeInclusive;
    }

    public void setFeeInclusive(Long feeInclusive) {
        this.feeInclusive = feeInclusive;
    }

    public Long getCurrency() {
        return currency;
    }

    public void setCurrency(Long currency) {
        this.currency = currency;
    }

    public Date getInitiated() {
        return initiated;
    }

    public void setInitiated(Date initiated) {
        this.initiated = initiated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProcessorRef() {
        return processorRef;
    }

    public void setProcessorRef(String processorRef) {
        this.processorRef = processorRef;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getTripleDesIV() {
        return tripleDesIV;
    }

    public void setTripleDesIV(String tripleDesIV) {
        this.tripleDesIV = tripleDesIV;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(String retailerId) {
        this.retailerId = retailerId;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getSwitchId() {
        return switchId;
    }

    public void setSwitchId(String switchId) {
        this.switchId = switchId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(String referenceID) {
        this.referenceID = referenceID;
    }

    public String getMpiStatus() {
        return mpiStatus;
    }

    public void setMpiStatus(String mpiStatus) {
        this.mpiStatus = mpiStatus;
    }

    public String getOrderExpirationPeriod() {
        return orderExpirationPeriod;
    }

    public void setOrderExpirationPeriod(String orderExpirationPeriod) {
        this.orderExpirationPeriod = orderExpirationPeriod;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getEndRecur() {
        return endRecur;
    }

    public void setEndRecur(String endRecur) {
        this.endRecur = endRecur;
    }

    public String getIsRecurr() {
        return isRecurr;
    }

    public void setIsRecurr(String isRecurr) {
        this.isRecurr = isRecurr;
    }

    public String getAdditionalFee() {
        return additionalFee;
    }

    public void setAdditionalFee(String additionalFee) {
        this.additionalFee = additionalFee;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSubMerchantId() {
        return subMerchantId;
    }

    public void setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
    }

    public String getSubMerchantName() {
        return subMerchantName;
    }

    public void setSubMerchantName(String subMerchantName) {
        this.subMerchantName = subMerchantName;
    }

    public String getSubMerchantCity() {
        return subMerchantCity;
    }

    public void setSubMerchantCity(String subMerchantCity) {
        this.subMerchantCity = subMerchantCity;
    }

    public String getSubMerchantCountryCode() {
        return subMerchantCountryCode;
    }

    public void setSubMerchantCountryCode(String subMerchantCountryCode) {
        this.subMerchantCountryCode = subMerchantCountryCode;
    }

    public String getSubMerchantPostalCode() {
        return subMerchantPostalCode;
    }

    public void setSubMerchantPostalCode(String subMerchantPostalCode) {
        this.subMerchantPostalCode = subMerchantPostalCode;
    }

    public String getSubMerchantStreetAddress() {
        return subMerchantStreetAddress;
    }

    public void setSubMerchantStreetAddress(String subMerchantStreetAddress) {
        this.subMerchantStreetAddress = subMerchantStreetAddress;
    }

    public String getRefundRef() {
        return refundRef;
    }

    public void setRefundRef(String refundRef) {
        this.refundRef = refundRef;
    }

    public String getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(String amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public String getPayattitudeOnFileRef() {
        return payattitudeOnFileRef;
    }

    public void setPayattitudeOnFileRef(String payattitudeOnFileRef) {
        this.payattitudeOnFileRef = payattitudeOnFileRef;
    }

    public String getCardOnFileRef() {
        return cardOnFileRef;
    }

    public void setCardOnFileRef(String cardOnFileRef) {
        this.cardOnFileRef = cardOnFileRef;
    }

    public String getCardOnFileId() {
        return cardOnFileId;
    }

    public void setCardOnFileId(String cardOnFileId) {
        this.cardOnFileId = cardOnFileId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getMerchantRefData() {
        return merchantRefData;
    }

    public void setMerchantRefData(String merchantRefData) {
        this.merchantRefData = merchantRefData;
    }

    private Long feeInclusive;
    private Long currency;
    private Date initiated;
    private String status;
    private String processorRef;
    private String completed;
    private String returnUrl;
    private String pan;
    private String cardHolder;
    private String routeId;
    private String approvalCode;
    private String tripleDesIV;
    private String parameter;
    private String orderType;
    private String terminalId;
    private String retailerId;
    private String scheme;
    private String respCode;
    private String switchId;
    private String vendorId;
    private String customerEmail;
    private String customerName;
    private String clientIP;
    private String referenceID;
    private String mpiStatus;
    private String orderExpirationPeriod;
    private String frequency;
    private String endRecur;
    private String isRecurr;
    private String additionalFee;
    private String sessionId;
    private String subMerchantId;
    private String subMerchantName;
    private String subMerchantCity;
    private String subMerchantCountryCode;
    private String subMerchantPostalCode;
    private String subMerchantStreetAddress;
    private String refundRef;
    private String amountRefunded;
    private Date refundDate;
    private String payattitudeOnFileRef;
    private String cardOnFileRef;
    private String cardOnFileId;
    private String cardId;
    private String statusDescription;
    private String merchantRefData;
}
