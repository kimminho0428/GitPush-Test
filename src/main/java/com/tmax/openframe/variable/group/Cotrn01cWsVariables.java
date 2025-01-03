package com.tmax.openframe.variable.group;

import java.math.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:18 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-VARIABLES</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cotrn01cWsVariables {
    // [T-Up#INFO][COTRN01C.cbl:36] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "COTRN01C";
    // [T-Up#INFO][COTRN01C.cbl:37] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CT01";
    // [T-Up#INFO][COTRN01C.cbl:38] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][COTRN01C.cbl:39] WS-TRANSACT-FILE (level: 5)
    private @Getter String wsTransactFile = "TRANSACT";
    // [T-Up#INFO][COTRN01C.cbl:40] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][COTRN01C.cbl:41] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][COTRN01C.cbl:42] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][COTRN01C.cbl:43] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][COTRN01C.cbl:44] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][COTRN01C.cbl:45] WS-USR-MODIFIED (level: 5)
    private @Getter String wsUsrModified = "N";
    // [T-Up#INFO][COTRN01C.cbl:46] USR-MODIFIED-YES (level: 88)
    public static final String USR_MODIFIED_YES = "Y";
    // [T-Up#INFO][COTRN01C.cbl:47] USR-MODIFIED-NO (level: 88)
    public static final String USR_MODIFIED_NO = "N";
    // [T-Up#INFO][COTRN01C.cbl:49] WS-TRAN-AMT (level: 5)
    private @Getter String wsTranAmt = wsTranAmtFormat.apply(BigDecimal.ZERO);
    private final static Function<BigDecimal, String> wsTranAmtFormat = (data) -> {
        DecimalFormat nf = new DecimalFormat();
        nf.setNegativePrefix("");
        nf.applyPattern("+00000000.00;-00000000.00");
        return nf.format(data);
    };
    // [T-Up#INFO][COTRN01C.cbl:50] WS-TRAN-DATE (level: 5)
    private @Getter String wsTranDate = "00/00/00";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsTransactFile());
        sb.append(getWsErrFlg());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(getWsUsrModified());
        sb.append(getWsTranAmt());
        sb.append(getWsTranDate());
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

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsUsrModified(String source) {
        wsUsrModified = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsTranAmt(String source) {
        wsTranAmt = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
    }

    public void setWsTranAmt(BigDecimal source) {
        wsTranAmt = wsTranAmtFormat.apply(source);
    }

    public void setWsTranDate(String source) {
        wsTranDate = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }
}
