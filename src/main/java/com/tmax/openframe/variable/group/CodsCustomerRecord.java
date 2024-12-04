package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:17 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item CUSTOMER-RECORD</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CodsCustomerRecord {
    // [T-Up#INFO][CODS.cbl:94] CUST-ID (level: 5)
    private @Getter @Setter int custId;
    // [T-Up#INFO][CODS.cbl:95] CUST-FIRST-NAME (level: 5)
    private @Getter String custFirstName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CODS.cbl:96] CUST-MIDDLE-NAME (level: 5)
    private @Getter String custMiddleName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CODS.cbl:97] CUST-LAST-NAME (level: 5)
    private @Getter String custLastName = StringUtils.repeat(' ', 25);
    // [T-Up#INFO][CODS.cbl:98] CUST-ADDR-LINE-1 (level: 5)
    private @Getter String custAddrLine1 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CODS.cbl:99] CUST-ADDR-LINE-2 (level: 5)
    private @Getter String custAddrLine2 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CODS.cbl:100] CUST-ADDR-LINE-3 (level: 5)
    private @Getter String custAddrLine3 = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CODS.cbl:101] CUST-ADDR-STATE-CD (level: 5)
    private @Getter String custAddrStateCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CODS.cbl:102] CUST-ADDR-COUNTRY-CD (level: 5)
    private @Getter String custAddrCountryCd = StringUtils.repeat(' ', 3);
    // [T-Up#INFO][CODS.cbl:103] CUST-ADDR-ZIP (level: 5)
    private @Getter String custAddrZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CODS.cbl:104] CUST-PHONE-NUM-1 (level: 5)
    private @Getter String custPhoneNum1 = StringUtils.repeat(' ', 15);
    // [T-Up#INFO][CODS.cbl:105] CUST-PHONE-NUM-2 (level: 5)
    private @Getter String custPhoneNum2 = StringUtils.repeat(' ', 15);
    // [T-Up#INFO][CODS.cbl:106] CUST-SSN (level: 5)
    private @Getter @Setter int custSsn;
    // [T-Up#INFO][CODS.cbl:107] CUST-GOVT-ISSUED-ID (level: 5)
    private @Getter String custGovtIssuedId = StringUtils.repeat(' ', 20);
    // [T-Up#INFO][CODS.cbl:108] CUST-DOB-YYYYMMDD (level: 5)
    private @Getter String custDobYyyymmdd = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CODS.cbl:109] CUST-EFT-ACCOUNT-ID (level: 5)
    private @Getter String custEftAccountId = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CODS.cbl:110] CUST-PRI-CARD-HOLDER-IND (level: 5)
    private @Getter String custPriCardHolderInd = StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CODS.cbl:111] CUST-FICO-CREDIT-SCORE (level: 5)
    private @Getter @Setter int custFicoCreditScore;
    // [T-Up#INFO][CODS.cbl:112] FILLER (level: 5)
    private @Getter String FILLER_1 = StringUtils.repeat(' ', 168);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 500), 500);
        try {
            setCustId(CobStream.convZonedStringToInt(source.substring(0, 9), 9));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCustId(0);
        }
        setCustFirstName(source.substring(9, 34));
        setCustMiddleName(source.substring(34, 59));
        setCustLastName(source.substring(59, 84));
        setCustAddrLine1(source.substring(84, 134));
        setCustAddrLine2(source.substring(134, 184));
        setCustAddrLine3(source.substring(184, 234));
        setCustAddrStateCd(source.substring(234, 236));
        setCustAddrCountryCd(source.substring(236, 239));
        setCustAddrZip(source.substring(239, 249));
        setCustPhoneNum1(source.substring(249, 264));
        setCustPhoneNum2(source.substring(264, 279));
        try {
            setCustSsn(CobStream.convZonedStringToInt(
                    source.substring(279, 288), 9));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCustSsn(0);
        }
        setCustGovtIssuedId(source.substring(288, 308));
        setCustDobYyyymmdd(source.substring(308, 318));
        setCustEftAccountId(source.substring(318, 328));
        setCustPriCardHolderInd(source.substring(328, 329));
        try {
            setCustFicoCreditScore(CobStream.convZonedStringToInt(
                    source.substring(329, 332), 3));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setCustFicoCreditScore(0);
        }
        setFILLER_1(source.substring(332, 500));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PictureFormatter.intFormatWithoutSign((long) getCustId(),
                "000000000"));
        sb.append(getCustFirstName());
        sb.append(getCustMiddleName());
        sb.append(getCustLastName());
        sb.append(getCustAddrLine1());
        sb.append(getCustAddrLine2());
        sb.append(getCustAddrLine3());
        sb.append(getCustAddrStateCd());
        sb.append(getCustAddrCountryCd());
        sb.append(getCustAddrZip());
        sb.append(getCustPhoneNum1());
        sb.append(getCustPhoneNum2());
        sb.append(PictureFormatter.intFormatWithoutSign((long) getCustSsn(),
                "000000000"));
        sb.append(getCustGovtIssuedId());
        sb.append(getCustDobYyyymmdd());
        sb.append(getCustEftAccountId());
        sb.append(getCustPriCardHolderInd());
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getCustFicoCreditScore(), "000"));
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setCustFirstName(String source) {
        custFirstName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustMiddleName(String source) {
        custMiddleName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustLastName(String source) {
        custLastName = StringUtils.truncate(StringUtils.rightPad(source, 25),
                25);
    }

    public void setCustAddrLine1(String source) {
        custAddrLine1 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrLine2(String source) {
        custAddrLine2 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrLine3(String source) {
        custAddrLine3 = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setCustAddrStateCd(String source) {
        custAddrStateCd = StringUtils.truncate(StringUtils.rightPad(source, 2),
                2);
    }

    public void setCustAddrCountryCd(String source) {
        custAddrCountryCd = StringUtils.truncate(
                StringUtils.rightPad(source, 3), 3);
    }

    public void setCustAddrZip(String source) {
        custAddrZip = StringUtils
                .truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setCustPhoneNum1(String source) {
        custPhoneNum1 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                15);
    }

    public void setCustPhoneNum2(String source) {
        custPhoneNum2 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                15);
    }

    public void setCustGovtIssuedId(String source) {
        custGovtIssuedId = StringUtils.truncate(
                StringUtils.rightPad(source, 20), 20);
    }

    public void setCustDobYyyymmdd(String source) {
        custDobYyyymmdd = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setCustEftAccountId(String source) {
        custEftAccountId = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setCustPriCardHolderInd(String source) {
        custPriCardHolderInd = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 168), 168);
    }
}