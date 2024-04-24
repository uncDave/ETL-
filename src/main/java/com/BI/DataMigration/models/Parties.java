package com.BI.DataMigration.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Long isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Long getIsMerchant() {
        return isMerchant;
    }

    public void setIsMerchant(Long isMerchant) {
        this.isMerchant = isMerchant;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Long getFeeIncluded() {
        return feeIncluded;
    }

    public void setFeeIncluded(Long feeIncluded) {
        this.feeIncluded = feeIncluded;
    }

    public String getSecretKey() {
        return SecretKey;
    }

    public void setSecretKey(String secretKey) {
        SecretKey = secretKey;
    }

    public String getIPAddresses() {
        return IPAddresses;
    }

    public void setIPAddresses(String IPAddresses) {
        this.IPAddresses = IPAddresses;
    }

    public String getMerchantId() {
        return MerchantId;
    }

    public void setMerchantId(String merchantId) {
        MerchantId = merchantId;
    }

    public String getMerId() {
        return MerId;
    }

    public void setMerId(String merId) {
        MerId = merId;
    }

    public String getProfileName() {
        return ProfileName;
    }

    public void setProfileName(String profileName) {
        ProfileName = profileName;
    }

    public String getTerminalId() {
        return TerminalId;
    }

    public void setTerminalId(String terminalId) {
        TerminalId = terminalId;
    }

    public Long getDiscriminator() {
        return Discriminator;
    }

    public void setDiscriminator(Long discriminator) {
        Discriminator = discriminator;
    }

    public Long getMigrated() {
        return Migrated;
    }

    public void setMigrated(Long migrated) {
        Migrated = migrated;
    }

    public Long getRetailerId() {
        return RetailerId;
    }

    public void setRetailerId(Long retailerId) {
        RetailerId = retailerId;
    }

    public Long getAmexId() {
        return AmexId;
    }

    public void setAmexId(Long amexId) {
        AmexId = amexId;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getSupportEmail() {
        return SupportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        SupportEmail = supportEmail;
    }

    public String getChargebackEmail() {
        return ChargebackEmail;
    }

    public void setChargebackEmail(String chargebackEmail) {
        ChargebackEmail = chargebackEmail;
    }

    public String getPartyMode() {
        return PartyMode;
    }

    public void setPartyMode(String partyMode) {
        PartyMode = partyMode;
    }

    public String getStaffStrength() {
        return StaffStrength;
    }

    public void setStaffStrength(String staffStrength) {
        StaffStrength = staffStrength;
    }

    public String getBVN() {
        return BVN;
    }

    public void setBVN(String BVN) {
        this.BVN = BVN;
    }

    public String getDOBonBVN() {
        return DOBonBVN;
    }

    public void setDOBonBVN(String DOBonBVN) {
        this.DOBonBVN = DOBonBVN;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String twitter) {
        Twitter = twitter;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        LinkedIn = linkedIn;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getPartyCategoryID() {
        return PartyCategoryID;
    }

    public void setPartyCategoryID(String partyCategoryID) {
        PartyCategoryID = partyCategoryID;
    }

    public String getPartyTypeID() {
        return PartyTypeID;
    }

    public void setPartyTypeID(String partyTypeID) {
        PartyTypeID = partyTypeID;
    }

    public String getRegistrationTypeID() {
        return RegistrationTypeID;
    }

    public void setRegistrationTypeID(String registrationTypeID) {
        RegistrationTypeID = registrationTypeID;
    }

    public String getRegistrationTypeNumber() {
        return RegistrationTypeNumber;
    }

    public void setRegistrationTypeNumber(String registrationTypeNumber) {
        RegistrationTypeNumber = registrationTypeNumber;
    }

    public Long getCurrencyID() {
        return CurrencyID;
    }

    public void setCurrencyID(Long currencyID) {
        CurrencyID = currencyID;
    }

    public String getWorkflowActivationID() {
        return WorkflowActivationID;
    }

    public void setWorkflowActivationID(String workflowActivationID) {
        WorkflowActivationID = workflowActivationID;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getIsApproved() {
        return IsApproved;
    }

    public void setIsApproved(String isApproved) {
        IsApproved = isApproved;
    }

    public String getYoutube() {
        return Youtube;
    }

    public void setYoutube(String youtube) {
        Youtube = youtube;
    }

    public String getSecuredSecretKey() {
        return SecuredSecretKey;
    }

    public void setSecuredSecretKey(String securedSecretKey) {
        SecuredSecretKey = securedSecretKey;
    }

    public String getEncryptionIV() {
        return EncryptionIV;
    }

    public void setEncryptionIV(String encryptionIV) {
        EncryptionIV = encryptionIV;
    }

    public Long getEncryptionKey() {
        return EncryptionKey;
    }

    public void setEncryptionKey(Long encryptionKey) {
        EncryptionKey = encryptionKey;
    }

    public Long getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(Long IPAddress) {
        this.IPAddress = IPAddress;
    }

    public Long getIsCardEnabled() {
        return IsCardEnabled;
    }

    public void setIsCardEnabled(Long isCardEnabled) {
        IsCardEnabled = isCardEnabled;
    }

    public Long getIsRecurring() {
        return isRecurring;
    }

    public void setIsRecurring(Long isRecurring) {
        this.isRecurring = isRecurring;
    }

    public Long getPayattitudeFee() {
        return PayattitudeFee;
    }

    public void setPayattitudeFee(Long payattitudeFee) {
        PayattitudeFee = payattitudeFee;
    }

    public Long getCardFee() {
        return CardFee;
    }

    public void setCardFee(Long cardFee) {
        CardFee = cardFee;
    }

    public Long getMaxFee() {
        return MaxFee;
    }

    public void setMaxFee(Long maxFee) {
        MaxFee = maxFee;
    }

    public Long getVAT() {
        return VAT;
    }

    public void setVAT(Long VAT) {
        this.VAT = VAT;
    }

    public Long getAddVAT() {
        return AddVAT;
    }

    public void setAddVAT(Long addVAT) {
        AddVAT = addVAT;
    }

    public boolean isReversalEnabled() {
        return ReversalEnabled;
    }

    public void setReversalEnabled(boolean reversalEnabled) {
        ReversalEnabled = reversalEnabled;
    }

    public String getEnableCardOnFile() {
        return EnableCardOnFile;
    }

    public void setEnableCardOnFile(String enableCardOnFile) {
        EnableCardOnFile = enableCardOnFile;
    }

    public String getOrderTimeOut() {
        return OrderTimeOut;
    }

    public void setOrderTimeOut(String orderTimeOut) {
        OrderTimeOut = orderTimeOut;
    }

    public String getDisablePayattitude() {
        return DisablePayattitude;
    }

    public void setDisablePayattitude(String disablePayattitude) {
        DisablePayattitude = disablePayattitude;
    }

    private String code;
    private String name;
    private String bank;
    private Long account;
    private String email;
    private Long isEnabled;
    private Long isMerchant;
    private String url;
    private String profileId;
    private Long feeIncluded;
    private String SecretKey;
    private String IPAddresses;
    private String MerchantId;
    private String MerId;
    private String ProfileName;
    private String TerminalId;
    private Long Discriminator;
    private Long Migrated;
    private Long RetailerId;
    private Long AmexId;
    private String Logo;
    private String Description;
    private String PhoneNo;
    private String Address;
    private String Website;
    private String SupportEmail;
    private String ChargebackEmail;
    private String PartyMode;
    private String StaffStrength;
    private String BVN;
    private String DOBonBVN;
    private String Facebook;
    private String Twitter;
    private String LinkedIn;
    private String Instagram;
    private Long UserID;
    private String PartyCategoryID;
    private String PartyTypeID;
    private String RegistrationTypeID;
    private String RegistrationTypeNumber;
    private Long CurrencyID;
    private String WorkflowActivationID;
    private Date CreatedDate;
    private Date ModifiedDate;
    private String IsApproved;
    private String Youtube;
    private String SecuredSecretKey;
    private String EncryptionIV;
    private Long EncryptionKey;
    private Long IPAddress;
    private Long IsCardEnabled;
    private Long isRecurring;
    private Long PayattitudeFee;
    private Long CardFee;
    private Long MaxFee;
    private Long VAT;
    private Long AddVAT;
    private boolean ReversalEnabled;
    private String EnableCardOnFile;
    private String OrderTimeOut;
    private String DisablePayattitude;
}
