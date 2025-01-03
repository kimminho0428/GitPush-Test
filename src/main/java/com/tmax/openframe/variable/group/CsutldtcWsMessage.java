package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:20 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-MESSAGE</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CsutldtcWsMessage {
    // [T-Up#INFO][CSUTLDTC.cbl:43] WS-SEVERITY (level: 2)
    private @Getter @Builder.Default String wsSeverity = StringUtils.repeat(
            ' ', 4);
    // [T-Up#INFO][CSUTLDTC.cbl:45] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_1 = "Mesg Code:"
            + StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CSUTLDTC.cbl:46] WS-MSG-NO (level: 2)
    private @Getter @Builder.Default String wsMsgNo = StringUtils
            .repeat(' ', 4);
    // [T-Up#INFO][CSUTLDTC.cbl:48] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_2 = " ";
    // [T-Up#INFO][CSUTLDTC.cbl:49] WS-RESULT (level: 2)
    private @Getter @Builder.Default String wsResult = StringUtils.repeat(' ',
            15);
    // [T-Up#INFO][CSUTLDTC.cbl:50] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_3 = " ";
    // [T-Up#INFO][CSUTLDTC.cbl:51] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_4 = "TstDate:"
            + StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CSUTLDTC.cbl:52] WS-DATE (level: 2)
    private @Getter @Builder.Default String wsDate = StringUtils
            .repeat(' ', 10);
    // [T-Up#INFO][CSUTLDTC.cbl:53] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_5 = " ";
    // [T-Up#INFO][CSUTLDTC.cbl:54] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_6 = "Mask used:";
    // [T-Up#INFO][CSUTLDTC.cbl:55] WS-DATE-FMT (level: 2)
    private @Getter @Builder.Default String wsDateFmt = StringUtils.repeat(' ',
            10);
    // [T-Up#INFO][CSUTLDTC.cbl:56] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_7 = " ";
    // [T-Up#INFO][CSUTLDTC.cbl:57] FILLER (level: 2)
    private @Getter @Builder.Default String FILLER_8 = StringUtils.repeat(' ',
            3);

    public static CsutldtcWsMessage createDefaultValueInstance() {
        return new CsutldtcWsMessage.builder().wsDate(
                StringUtils.repeat(' ', 10)).build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
        setWsSeverity(source.substring(0, 4));
        setFILLER_1(source.substring(4, 15));
        setWsMsgNo(source.substring(15, 19));
        setFILLER_2(source.substring(19, 20));
        setWsResult(source.substring(20, 35));
        setFILLER_3(source.substring(35, 36));
        setFILLER_4(source.substring(36, 45));
        setWsDate(source.substring(45, 55));
        setFILLER_5(source.substring(55, 56));
        setFILLER_6(source.substring(56, 66));
        setWsDateFmt(source.substring(66, 76));
        setFILLER_7(source.substring(76, 77));
        setFILLER_8(source.substring(77, 80));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsSeverity());
        sb.append(getFILLER_1());
        sb.append(getWsMsgNo());
        sb.append(getFILLER_2());
        sb.append(getWsResult());
        sb.append(getFILLER_3());
        sb.append(getFILLER_4());
        sb.append(getWsDate());
        sb.append(getFILLER_5());
        sb.append(getFILLER_6());
        sb.append(getWsDateFmt());
        sb.append(getFILLER_7());
        sb.append(getFILLER_8());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsSeverity());
        sb.append(getFILLER_1());
        sb.append(getWsMsgNo());
        sb.append(getFILLER_2());
        sb.append(getWsResult());
        sb.append(getFILLER_3());
        sb.append(getFILLER_4());
        sb.append(getWsDate());
        sb.append(getFILLER_5());
        sb.append(getFILLER_6());
        sb.append(getWsDateFmt());
        sb.append(getFILLER_7());
        sb.append(getFILLER_8());
        return sb.toString();
    }

    public void setWsSeverity(String source) {
        wsSeverity = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public int getWsSeverityN() {
        try {
            return CobStream.convZonedStringToInt(getWsSeverity(), 4);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setWsSeverityN(int source) {
        setWsSeverity(CobStream.convZonedIntToString(source, 4));
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 11), 11);
    }

    public void setWsMsgNo(String source) {
        wsMsgNo = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
    }

    public int getWsMsgNoN() {
        try {
            return CobStream.convZonedStringToInt(getWsMsgNo(), 4);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setWsMsgNoN(int source) {
        setWsMsgNo(CobStream.convZonedIntToString(source, 4));
    }

    public void setFILLER_2(String source) {
        FILLER_2 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsResult(String source) {
        wsResult = StringUtils.truncate(StringUtils.rightPad(source, 15), 15);
    }

    public void setFILLER_3(String source) {
        FILLER_3 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setFILLER_4(String source) {
        FILLER_4 = StringUtils.truncate(StringUtils.rightPad(source, 9), 9);
    }

    public void setWsDate(String source) {
        wsDate = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setFILLER_5(String source) {
        FILLER_5 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setFILLER_6(String source) {
        FILLER_6 = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setWsDateFmt(String source) {
        wsDateFmt = StringUtils.truncate(StringUtils.rightPad(source, 10), 10);
    }

    public void setFILLER_7(String source) {
        FILLER_7 = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setFILLER_8(String source) {
        FILLER_8 = StringUtils.truncate(StringUtils.rightPad(source, 3), 3);
    }
}
