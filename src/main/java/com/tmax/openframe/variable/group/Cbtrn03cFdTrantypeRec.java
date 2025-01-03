package com.tmax.openframe.variable.group;

import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:11 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item FD-TRANTYPE-REC</p>
 */
public @AllArgsConstructor @NoArgsConstructor class Cbtrn03cFdTrantypeRec {
    // [T-Up#INFO][CBTRN03C.cbl:74] FD-TRAN-TYPE (level: 5)
    private @Getter String fdTranType = StringUtils.repeat(' ', 2);
    // [T-Up#INFO][CBTRN03C.cbl:75] FD-TRAN-DATA (level: 5)
    private @Getter String fdTranData = StringUtils.repeat(' ', 58);

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 60), 60);
        setFdTranType(source.substring(0, 2));
        setFdTranData(source.substring(2, 60));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFdTranType());
        sb.append(getFdTranData());
        return sb.toString();
    }

    public void setFdTranType(String source) {
        fdTranType = StringUtils.truncate(StringUtils.rightPad(source, 2), 2);
    }

    public void setFdTranData(String source) {
        fdTranData = StringUtils.truncate(StringUtils.rightPad(source, 58), 58);
    }
}
