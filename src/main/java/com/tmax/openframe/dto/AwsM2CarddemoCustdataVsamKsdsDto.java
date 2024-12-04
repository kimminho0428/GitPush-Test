package com.tmaxsoft.openframe.dataset.dto;

import lombok.*;

public @Getter @Setter class AwsM2CarddemoCustdataVsamKsdsDto {
    private long custId;
    private String custFirstName;
    private String custMiddleName;
    private String custLastName;
    private String custAddrLine1;
    private String custAddrLine2;
    private String custAddrLine3;
    private String custAddrStateCd;
    private String custAddrCountryCd;
    private String custAddrZip;
    private String custPhoneNum1;
    private String custPhoneNum2;
    private long custSsn;
    private String custGovtIssuedId;
    private String custDobYyyymmdd;
    private String custEftAccountId;
    private String custPriCardHolderInd;
    private long custFicoCreditScore;
    private String filler;
}
