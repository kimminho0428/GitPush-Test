package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:19 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-VARIABLES</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cousr00cWsVariables {
    // [T-Up#INFO][COUSR00C.cbl:36] WS-PGMNAME (level: 5)
    private @Getter String wsPgmname = "COUSR00C";
    // [T-Up#INFO][COUSR00C.cbl:37] WS-TRANID (level: 5)
    private @Getter String wsTranid = "CU00";
    // [T-Up#INFO][COUSR00C.cbl:38] WS-MESSAGE (level: 5)
    private @Getter String wsMessage = StringUtils.repeat(' ', 80);
    // [T-Up#INFO][COUSR00C.cbl:39] WS-USRSEC-FILE (level: 5)
    private @Getter String wsUsrsecFile = "USRSEC  ";
    // [T-Up#INFO][COUSR00C.cbl:40] WS-ERR-FLG (level: 5)
    private @Getter String wsErrFlg = "N";
    // [T-Up#INFO][COUSR00C.cbl:41] ERR-FLG-ON (level: 88)
    public static final String ERR_FLG_ON = "Y";
    // [T-Up#INFO][COUSR00C.cbl:42] ERR-FLG-OFF (level: 88)
    public static final String ERR_FLG_OFF = "N";
    // [T-Up#INFO][COUSR00C.cbl:43] WS-USER-SEC-EOF (level: 5)
    private @Getter String wsUserSecEof = "N";
    // [T-Up#INFO][COUSR00C.cbl:44] USER-SEC-EOF (level: 88)
    public static final String USER_SEC_EOF = "Y";
    // [T-Up#INFO][COUSR00C.cbl:45] USER-SEC-NOT-EOF (level: 88)
    public static final String USER_SEC_NOT_EOF = "N";
    // [T-Up#INFO][COUSR00C.cbl:46] WS-SEND-ERASE-FLG (level: 5)
    private @Getter String wsSendEraseFlg = "Y";
    // [T-Up#INFO][COUSR00C.cbl:47] SEND-ERASE-YES (level: 88)
    public static final String SEND_ERASE_YES = "Y";
    // [T-Up#INFO][COUSR00C.cbl:48] SEND-ERASE-NO (level: 88)
    public static final String SEND_ERASE_NO = "N";
    // [T-Up#INFO][COUSR00C.cbl:50] WS-RESP-CD (level: 5)
    private @Getter @Setter int wsRespCd = 0;
    // [T-Up#INFO][COUSR00C.cbl:51] WS-REAS-CD (level: 5)
    private @Getter @Setter int wsReasCd = 0;
    // [T-Up#INFO][COUSR00C.cbl:52] WS-REC-COUNT (level: 5)
    private @Getter @Setter int wsRecCount = 0;
    // [T-Up#INFO][COUSR00C.cbl:53] WS-IDX (level: 5)
    private @Getter @Setter int wsIdx = 0;
    // [T-Up#INFO][COUSR00C.cbl:54] WS-PAGE-NUM (level: 5)
    private @Getter @Setter int wsPageNum = 0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsPgmname());
        sb.append(getWsTranid());
        sb.append(getWsMessage());
        sb.append(getWsUsrsecFile());
        sb.append(getWsErrFlg());
        sb.append(getWsUserSecEof());
        sb.append(getWsSendEraseFlg());
        sb.append(String.valueOf(getWsRespCd()));
        sb.append(String.valueOf(getWsReasCd()));
        sb.append(String.valueOf(getWsRecCount()));
        sb.append(String.valueOf(getWsIdx()));
        sb.append(String.valueOf(getWsPageNum()));
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

    public void setWsUsrsecFile(String source) {
        wsUsrsecFile = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setWsErrFlg(String source) {
        wsErrFlg = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsUserSecEof(String source) {
        wsUserSecEof = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsSendEraseFlg(String source) {
        wsSendEraseFlg = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }
}
