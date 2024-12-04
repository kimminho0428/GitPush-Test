package com.tmaxsoft.openframe.dataset.dto;

import java.math.BigDecimal;
import lombok.*;

public @Getter @Setter class AwsM2CarddemoAcctdataVsamKsdsDto {
    private long acctId;
    private String acctActiveStatus;
    private BigDecimal acctCurrBal;
    private BigDecimal acctCreditLimit;
    private BigDecimal acctCashCreditLimit;
    private String acctOpenDate;
    private String acctExpiraionDate;
    private String acctReissueDate;
    private BigDecimal acctCurrCycCredit;
    private BigDecimal acctCurrCycDebit;
    private String acctAddrZip;
    private String acctGroupId;
    private String filler;
}
