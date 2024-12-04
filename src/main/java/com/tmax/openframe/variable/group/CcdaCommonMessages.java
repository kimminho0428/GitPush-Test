package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:20 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CcdaCommonMessages {
    // [T-Up#INFO][CSMSG01Y.cpy:19] CCDA-MSG-THANK-YOU (level: 5)
    private @Getter @Builder.Default String ccdaMsgThankYou = "Thank you for using CardDemo application...      "
            + StringUtils.repeat(' ', 1);
    // [T-Up#INFO][CSMSG01Y.cpy:21] CCDA-MSG-INVALID-KEY (level: 5)
    private @Getter @Builder.Default String ccdaMsgInvalidKey = "Invalid key pressed. Please see below...         "
            + StringUtils.repeat(' ', 1);

    public static CcdaCommonMessages createDefaultValueInstance() {
        return new CcdaCommonMessages.builder()
                .ccdaMsgThankYou(StringUtils.repeat(' ', 50))
                .ccdaMsgInvalidKey(StringUtils.repeat(' ', 50)).build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 100), 100);
        setCcdaMsgThankYou(source.substring(0, 50));
        setCcdaMsgInvalidKey(source.substring(50, 100));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcdaMsgThankYou());
        sb.append(getCcdaMsgInvalidKey());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCcdaMsgThankYou());
        sb.append(getCcdaMsgInvalidKey());
        return sb.toString();
    }

    public void setCcdaMsgThankYou(String source) {
        ccdaMsgThankYou = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }

    public void setCcdaMsgInvalidKey(String source) {
        ccdaMsgInvalidKey = StringUtils.truncate(
                StringUtils.rightPad(source, 50), 50);
    }
}