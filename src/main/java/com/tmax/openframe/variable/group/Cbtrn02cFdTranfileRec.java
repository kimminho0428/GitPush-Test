package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item FD-TRANFILE-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn02cFdTranfileRec {
    // [T-Up#INFO][CBTRN02C.cbl:73] FD-TRANS-ID (level: 5)
    private @Getter String fdTransId = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN02C.cbl:74] FD-TRAN-TYPE-CD (level: 5)
    private @Getter String fdTranTypeCd = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CBTRN02C.cbl:75] FD-TRAN-CAT-CD (level: 5)
    private @Getter @Setter int fdTranCatCd;
    // [T-Up#INFO][CBTRN02C.cbl:76] FD-TRAN-SOURCE (level: 5)
    private @Getter String fdTranSource = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBTRN02C.cbl:77] FD-TRAN-DESC (level: 5)
    private @Getter String fdTranDesc = StringUtils.repeat(' ', 100);
    // [T-Up#INFO][CBTRN02C.cbl:78] FD-TRAN-AMT (level: 5)
    private @Getter BigDecimal fdTranAmt = BigDecimal.ZERO;
    // [T-Up#INFO][CBTRN02C.cbl:79] FD-TRAN-MERCHANT-ID (level: 5)
    private @Getter @Setter int fdTranMerchantId;
    // [T-Up#INFO][CBTRN02C.cbl:80] FD-TRAN-MERCHANT-NAME (level: 5)
    private @Getter String fdTranMerchantName = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CBTRN02C.cbl:81] FD-TRAN-MERCHANT-CITY (level: 5)
    private @Getter String fdTranMerchantCity = StringUtils.repeat(' ', 50);
    // [T-Up#INFO][CBTRN02C.cbl:82] FD-TRAN-MERCHANT-ZIP (level: 5)
    private @Getter String fdTranMerchantZip = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][CBTRN02C.cbl:83] FD-TRAN-CARD-NUM (level: 5)
    private @Getter String fdTranCardNum = StringUtils.repeat(' ', 16);
    // [T-Up#INFO][CBTRN02C.cbl:84] FD-TRAN-ORIG-TS (level: 5)
    private @Getter String fdTranOrigTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CBTRN02C.cbl:85] FD-TRAN-PROC-TS (level: 5)
    private @Getter String fdTranProcTs = StringUtils.repeat(' ', 26);
    // [T-Up#INFO][CBTRN02C.cbl:86] FILLER (level: 5)
    private @Getter String FILLER_1 = StringUtils.repeat(' ', 20);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 350), 350);
        setFdTransId(source.substring(0, 16));
        setFdTranTypeCd(source.substring(16, 18));
        try {
            setFdTranCatCd(CobStream.convZonedStringToInt(
                    source.substring(18, 22), 4));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdTranCatCd(0);
        }
        setFdTranSource(source.substring(22, 32));
        setFdTranDesc(source.substring(32, 132));
        try {
            setFdTranAmt(CobStream.convZonedStringToBigDecimal(
                    source.substring(132, 143), 11, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdTranAmt(BigDecimal.ZERO);
        }
        try {
            setFdTranMerchantId(CobStream.convZonedStringToInt(
                    source.substring(143, 152), 9));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setFdTranMerchantId(0);
        }
        setFdTranMerchantName(source.substring(152, 202));
        setFdTranMerchantCity(source.substring(202, 252));
        setFdTranMerchantZip(source.substring(252, 262));
        setFdTranCardNum(source.substring(262, 278));
        setFdTranOrigTs(source.substring(278, 304));
        setFdTranProcTs(source.substring(304, 330));
        setFILLER_1(source.substring(330, 350));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdTransId());
        sb.append(getFdTranTypeCd());
        sb.append(CobStream.convZonedIntToString(getFdTranCatCd(), 4));
        sb.append(getFdTranSource());
        sb.append(getFdTranDesc());
        sb.append(CobStream.convZonedBigDecimalToString(getFdTranAmt(), 11, 2));
        sb.append(CobStream.convZonedIntToString(getFdTranMerchantId(), 9));
        sb.append(getFdTranMerchantName());
        sb.append(getFdTranMerchantCity());
        sb.append(getFdTranMerchantZip());
        sb.append(getFdTranCardNum());
        sb.append(getFdTranOrigTs());
        sb.append(getFdTranProcTs());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdTransId());
        sb.append(getFdTranTypeCd());
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getFdTranCatCd(), "0000"));
        sb.append(getFdTranSource());
        sb.append(getFdTranDesc());
        sb.append(PictureFormatter.decimalFormatWithSign(getFdTranAmt(),
                "000000000.00"));
        sb.append(PictureFormatter.intFormatWithoutSign(
                (long) getFdTranMerchantId(), "000000000"));
        sb.append(getFdTranMerchantName());
        sb.append(getFdTranMerchantCity());
        sb.append(getFdTranMerchantZip());
        sb.append(getFdTranCardNum());
        sb.append(getFdTranOrigTs());
        sb.append(getFdTranProcTs());
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setFdTransId(String source) {
        fdTransId = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
    }

    public void setFdTranTypeCd(String source) {
        fdTranTypeCd = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
    }

    public void setFdTranSource(String source) {
        fdTranSource = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setFdTranDesc(String source) {
        fdTranDesc = StringUtils.truncate(StringUtils.rightPad(source, 100),
                100);
    }

    public void setFdTranAmt(BigDecimal source) {
        fdTranAmt = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFdTranMerchantName(String source) {
        fdTranMerchantName = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setFdTranMerchantCity(String source) {
        fdTranMerchantCity = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setFdTranMerchantZip(String source) {
        fdTranMerchantZip = StringUtils.truncate(
                StringUtils.rightPad(source, 10), 10);
    }

    public void setFdTranCardNum(String source) {
        fdTranCardNum = StringUtils.truncate(StringUtils.rightPad(source, 16),
                16);
    }

    public void setFdTranOrigTs(String source) {
        fdTranOrigTs = StringUtils.truncate(StringUtils.rightPad(source, 26),
                26);
    }

    public void setFdTranProcTs(String source) {
        fdTranProcTs = StringUtils.truncate(StringUtils.rightPad(source, 26),
                26);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 20), 20);
    }
}