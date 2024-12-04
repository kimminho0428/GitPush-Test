package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:17 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item DFHCOMMAREA</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Comen01cDfhcommarea {
    // [T-Up#INFO][COMEN01C.cbl:68] LK-COMMAREA (level: 5)
    private @Getter String lkCommarea = StringUtils.repeat(' ', 32767);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
        setLkCommarea(source.substring(0, 32767));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getLkCommarea());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getLkCommarea());
        return sb.toString();
    }

    public void setLkCommarea(String source) {
        lkCommarea = StringUtils.truncate(StringUtils.rightPad(source, 32767),
                32767);
    }
}