package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:15 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-VARIABLES</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cobil00cWsVariables {
    // [T-Up#INFO][COBIL00C.cbl:37] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "COBIL00C";
    // [T-Up#INFO][COBIL00C.cbl:38] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CB00";
    // [T-Up#INFO][COBIL00C.cbl:39] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][COBIL00C.cbl:40] WS-TRANSACT-FILE (level: 5)
    private @Getter String wsTransactFile = "TRANSACT";
    // [T-Up#INFO][COBIL00C.cbl:41] WS-ACCTDAT-FILE (level: 5)
    private @Getter String wsAcctdatFile = "ACCTDAT ";
    // [T-Up#INFO][COBIL00C.cbl:42] WS-CXACAIX-FILE (level: 5)
    private @Getter String wsCxacaixFile = "CXACAIX ";
    // [T-Up#INFO][COBIL00C.cbl:43] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][COBIL00C.cbl:44] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][COBIL00C.cbl:45] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][COBIL00C.cbl:46] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][COBIL00C.cbl:47] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][COBIL00C.cbl:48] WS-USR-MODIFIED (level: 5)
    private @Getter String wsUsrModified = "N";
    // [T-Up#INFO][COBIL00C.cbl:49] USR-MODIFIED-YES (level: 88)
    public static final String USR_MODIFIED_YES = "Y";
    // [T-Up#INFO][COBIL00C.cbl:50] USR-MODIFIED-NO (level: 88)
    public static final String USR_MODIFIED_NO = "N";
    // [T-Up#INFO][COBIL00C.cbl:51] WS-CONF-PAY-FLG (level: 5)
    private @Getter String wsConfPayFlg = "N";
    // [T-Up#INFO][COBIL00C.cbl:52] CONF-PAY-YES (level: 88)
    public static final String CONF_PAY_YES = "Y";
    // [T-Up#INFO][COBIL00C.cbl:53] CONF-PAY-NO (level: 88)
    public static final String CONF_PAY_NO = "N";
    // [T-Up#INFO][COBIL00C.cbl:55] WS-TRAN-AMT (level: 5)
    private @Getter String wsTranAmt = wsTranAmtFormat.apply(BigDecimal.ZERO);
    private final static Function<BigDecimal, String> wsTranAmtFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+00000000.00;-00000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][COBIL00C.cbl:56] WS-CURR-BAL (level: 5)
    private @Getter String wsCurrBal = wsCurrBalFormat.apply(BigDecimal.ZERO);
    private final static Function<BigDecimal, String> wsCurrBalFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+0000000000.00;-0000000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][COBIL00C.cbl:57] WS-TRAN-ID-NUM (level: 5)
    private @Getter @Setter long wsTranIdNum = (long) 0;
    // [T-Up#INFO][COBIL00C.cbl:58] WS-TRAN-DATE (level: 5)
    private @Getter String wsTranDate = "00/00/00";
    // [T-Up#INFO][COBIL00C.cbl:59] WS-ABS-TIME (level: 5)
    private @Getter @Setter long wsAbsTime = (long) 0;
    // [T-Up#INFO][COBIL00C.cbl:60] WS-CUR-DATE-X10 (level: 5)
    private @Getter String wsCurDateX10 = StringUtils.repeat(' ', 10);
    // [T-Up#INFO][COBIL00C.cbl:61] WS-CUR-TIME-X08 (level: 5)
    private @Getter String wsCurTimeX08 = StringUtils.repeat(' ', 8);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsTransactFile());
        sb.append(getWsAcctdatFile());
        sb.append(getWsCxacaixFile());
        sb.append(getWsErrFlg());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(getWsUsrModified());
        sb.append(getWsConfPayFlg());
        sb.append(getWsTranAmt());
        sb.append(getWsCurrBal());
        sb.append(PictureFormatter.intFormatWithoutSign(getWsTranIdNum(),
                "0000000000000000"));
        sb.append(getWsTranDate());
        sb.append(String.valueOf(getWsAbsTime()));
        sb.append(getWsCurDateX10());
        sb.append(getWsCurTimeX08());
        return sb.toString();
    }

    public void setWsPgmname(String source) {
        wsPgmname = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsTranid(String source) {
        wsTranid = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setWsMessage(String source) {
        wsMessage = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
    }

    public void setWsTransactFile(String source) {
        wsTransactFile = StringUtils.truncate(StringUtils.rightPad(source, 8),
                8);
    }

    public void setWsAcctdatFile(String source) {
        wsAcctdatFile = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsCxacaixFile(String source) {
        wsCxacaixFile = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsUsrModified(String source) {
        wsUsrModified = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsConfPayFlg(String source) {
        wsConfPayFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsTranAmt(String source) {
        wsTranAmt = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
    }

    public void setWsTranAmt(BigDecimal source) {
        wsTranAmt = wsTranAmtFormat.apply(source);
    }

    public void setWsCurrBal(String source) {
        wsCurrBal = StringUtils.truncate(StringUtils.rightPad(source, 14), 14);
    }

    public void setWsCurrBal(BigDecimal source) {
        wsCurrBal = wsCurrBalFormat.apply(source);
    }

    public void setWsTranDate(String source) {
        wsTranDate = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsCurDateX10(String source) {
        wsCurDateX10 = StringUtils.truncate(StringUtils.rightPad(source, 10),
                10);
    }

    public void setWsCurTimeX08(String source) {
        wsCurTimeX08 = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }
}
