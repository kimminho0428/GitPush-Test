package com.tmaxsoft.openframe.dataset.dto;

import lombok.*;

public @Getter @Setter class AwsM2CarddemoCarddataVsamKsdsDto {
    private String cardNum;
    private long cardAcctId;
    private long cardCvvCd;
    private String cardEmbossedName;
    private String cardExpiraionDate;
    private String cardActiveStatus;
    private String filler;
}
