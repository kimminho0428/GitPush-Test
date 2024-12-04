package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:16 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-CONSTANTS</p>
 */
public @AllArgsConstructor @NoArgsConstructor class CocrdlicWsConstants {
    // [T-Up#INFO][COCRDLIC.cbl:176] WS-MAX-SCREEN-LINES (level: 5)
    private @Getter @Setter int wsMaxScreenLines = 7;
    // [T-Up#INFO][COCRDLIC.cbl:178] LIT-THISPGM (level: 5)
    private @Getter String litThispgm = "COCRDLIC";
    // [T-Up#INFO][COCRDLIC.cbl:180] LIT-THISTRANID (level: 5)
    private @Getter String litThistranid = "CCLI";
    // [T-Up#INFO][COCRDLIC.cbl:182] LIT-THISMAPSET (level: 5)
    private @Getter String litThismapset = "COCRDLI";
    // [T-Up#INFO][COCRDLIC.cbl:184] LIT-THISMAP (level: 5)
    private @Getter String litThismap = "CCRDLIA";
    // [T-Up#INFO][COCRDLIC.cbl:186] LIT-MENUPGM (level: 5)
    private @Getter String litMenupgm = "COMEN01C";
    // [T-Up#INFO][COCRDLIC.cbl:188] LIT-MENUTRANID (level: 5)
    private @Getter String litMenutranid = "CM00";
    // [T-Up#INFO][COCRDLIC.cbl:190] LIT-MENUMAPSET (level: 5)
    private @Getter String litMenumapset = "COMEN01";
    // [T-Up#INFO][COCRDLIC.cbl:192] LIT-MENUMAP (level: 5)
    private @Getter String litMenumap = "COMEN1A";
    // [T-Up#INFO][COCRDLIC.cbl:194] LIT-CARDDTLPGM (level: 5)
    private @Getter String litCarddtlpgm = "COCRDSLC";
    // [T-Up#INFO][COCRDLIC.cbl:196] LIT-CARDDTLTRANID (level: 5)
    private @Getter String litCarddtltranid = "CCDL";
    // [T-Up#INFO][COCRDLIC.cbl:198] LIT-CARDDTLMAPSET (level: 5)
    private @Getter String litCarddtlmapset = "COCRDSL";
    // [T-Up#INFO][COCRDLIC.cbl:200] LIT-CARDDTLMAP (level: 5)
    private @Getter String litCarddtlmap = "CCRDSLA";
    // [T-Up#INFO][COCRDLIC.cbl:202] LIT-CARDUPDPGM (level: 5)
    private @Getter String litCardupdpgm = "COCRDUPC";
    // [T-Up#INFO][COCRDLIC.cbl:204] LIT-CARDUPDTRANID (level: 5)
    private @Getter String litCardupdtranid = "CCUP";
    // [T-Up#INFO][COCRDLIC.cbl:206] LIT-CARDUPDMAPSET (level: 5)
    private @Getter String litCardupdmapset = "COCRDUP";
    // [T-Up#INFO][COCRDLIC.cbl:208] LIT-CARDUPDMAP (level: 5)
    private @Getter String litCardupdmap = "CCRDUPA";
    // [T-Up#INFO][COCRDLIC.cbl:212] LIT-CARD-FILE (level: 5)
    private @Getter String litCardFile = "CARDDAT ";
    // [T-Up#INFO][COCRDLIC.cbl:214] LIT-CARD-FILE-ACCT-PATH (level: 5)
    private @Getter String litCardFileAcctPath = "CARDAIX ";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(getWsMaxScreenLines()));
        sb.append(getLitThispgm());
        sb.append(getLitThistranid());
        sb.append(getLitThismapset());
        sb.append(getLitThismap());
        sb.append(getLitMenupgm());
        sb.append(getLitMenutranid());
        sb.append(getLitMenumapset());
        sb.append(getLitMenumap());
        sb.append(getLitCarddtlpgm());
        sb.append(getLitCarddtltranid());
        sb.append(getLitCarddtlmapset());
        sb.append(getLitCarddtlmap());
        sb.append(getLitCardupdpgm());
        sb.append(getLitCardupdtranid());
        sb.append(getLitCardupdmapset());
        sb.append(getLitCardupdmap());
        sb.append(getLitCardFile());
        sb.append(getLitCardFileAcctPath());
        return sb.toString();
    }

    public void setLitThispgm(String source) {
        litThispgm = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitThistranid(String source) {
        litThistranid = StringUtils
                .truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setLitThismapset(String source) {
        litThismapset = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitThismap(String source) {
        litThismap = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitMenupgm(String source) {
        litMenupgm = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitMenutranid(String source) {
        litMenutranid = StringUtils
                .truncate(StringUtils.rightPad(source, 4), 4);
    }

    public void setLitMenumapset(String source) {
        litMenumapset = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitMenumap(String source) {
        litMenumap = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCarddtlpgm(String source) {
        litCarddtlpgm = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCarddtltranid(String source) {
        litCarddtltranid = StringUtils.truncate(
                StringUtils.rightPad(source, 4), 4);
    }

    public void setLitCarddtlmapset(String source) {
        litCarddtlmapset = StringUtils.truncate(
                StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCarddtlmap(String source) {
        litCarddtlmap = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCardupdpgm(String source) {
        litCardupdpgm = StringUtils
                .truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCardupdtranid(String source) {
        litCardupdtranid = StringUtils.truncate(
                StringUtils.rightPad(source, 4), 4);
    }

    public void setLitCardupdmapset(String source) {
        litCardupdmapset = StringUtils.truncate(
                StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCardupdmap(String source) {
        litCardupdmap = StringUtils
                .truncate(StringUtils.rightPad(source, 7), 7);
    }

    public void setLitCardFile(String source) {
        litCardFile = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
    }

    public void setLitCardFileAcctPath(String source) {
        litCardFileAcctPath = StringUtils.truncate(
                StringUtils.rightPad(source, 8), 8);
    }
}