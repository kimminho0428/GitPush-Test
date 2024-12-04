package com.tmaxsoft.openframe.dataset.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoTransactVsamKsdsDto {
    private String tranId;
    private String tranTypeCd;
    private long tranCatCd;
    private String tranSource;
    private String tranDesc;
    private BigDecimal tranAmt;
    private long tranMerchantId;
    private String tranMerchantName;
    private String tranMerchantCity;
    private String tranMerchantZip;
    private String tranCardNum;
    private String tranOrigTs;
    private String tranProcTs;
    private String filler;
}
