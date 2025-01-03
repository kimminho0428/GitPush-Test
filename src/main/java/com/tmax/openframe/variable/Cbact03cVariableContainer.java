package com.tmax.openframe.variable;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.variable.group.*;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables that defined in the data division of COBOL program</p>
 */
public class Cbact03cVariableContainer {
    // *****************************************************************
    //       *COPY CVACT03Y.
    // *(/home/oflab/repository/pds/TEST/COBOL_COPYBOOK/CVACT03Y.cpy)
    // *****************************************************************
    // *    Data-structure for card xref (RECLN 50)
    // *****************************************************************
    // [T-Up#INFO][CVACT03Y.cpy:5] CARD-XREF-RECORD (level: 1)
    private @Getter @Setter CardXrefRecord cardXrefRecord = new CardXrefRecord();
    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:16:00 CDT
    // *
    // [T-Up#INFO][CBACT03C.cbl:46] XREFFILE-STATUS (level: 1)
    private @Getter @Setter Cbact03cXreffileStatus xreffileStatus = new Cbact03cXreffileStatus();
    // [T-Up#INFO][CBACT03C.cbl:50] IO-STATUS (level: 1)
    private @Getter @Setter Cbact03cIoStatus ioStatus = new Cbact03cIoStatus();
    // [T-Up#INFO][CBACT03C.cbl:53] TWO-BYTES-BINARY (level: 1)
    private @Getter @Setter int twoBytesBinary;
    // [T-Up#INFO][CBACT03C.cbl:57] IO-STATUS-04 (level: 1)
    private @Getter @Setter Cbact03cIoStatus04 ioStatus04 = new Cbact03cIoStatus04();
    // [T-Up#INFO][CBACT03C.cbl:61] APPL-RESULT (level: 1)
    private @Getter @Setter int applResult;
    // [T-Up#INFO][CBACT03C.cbl:62] APPL-AOK (level: 88)
    public static final int APPL_AOK = 0;
    // [T-Up#INFO][CBACT03C.cbl:63] APPL-EOF (level: 88)
    public static final int APPL_EOF = 16;
    // [T-Up#INFO][CBACT03C.cbl:65] END-OF-FILE (level: 1)
    private @Getter String endOfFile = "N";
    // [T-Up#INFO][CBACT03C.cbl:66] ABCODE (level: 1)
    private @Getter @Setter int abcode;
    // [T-Up#INFO][CBACT03C.cbl:67] TIMING (level: 1)
    private @Getter @Setter int timing;
    // [T-Up#INFO][CBACT03C.cbl:38] FD-XREFFILE-REC (level: 1)
    private @Getter @Setter Cbact03cFdXreffileRec fdXreffileRec = new Cbact03cFdXreffileRec();

    public Cbact03cTwoBytesAlpha getTwoBytesAlpha() {
        return Cbact03cTwoBytesAlpha.builder().twoBytesLeft(getTwoBytesLeft())
                .twoBytesRight(getTwoBytesRight()).build();
    }

    public void setTwoBytesAlpha(String source) {
        setTwoBytesLeft(source.substring(0, 1));
        setTwoBytesRight(source.substring(1, 2));
    }

    public void setTwoBytesAlpha(Cbact03cTwoBytesAlpha source) {
        setTwoBytesAlpha(source.get());
    }

    public String getTwoBytesLeft() {
        return CobStream.convShortToString((short) getTwoBytesBinary())
                .substring(0, 1);
    }

    public void setTwoBytesLeft(String source) {
        try {
            setTwoBytesBinary(CobStream.convStringToShort(StringUtils.overlay(
                    CobStream.convShortToString((short) getTwoBytesBinary()),
                    source, 0, 1)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTwoBytesBinary(0);
        }
    }

    public String getTwoBytesRight() {
        return CobStream.convShortToString((short) getTwoBytesBinary())
                .substring(1, 2);
    }

    public void setTwoBytesRight(String source) {
        try {
            setTwoBytesBinary(CobStream.convStringToShort(StringUtils.overlay(
                    CobStream.convShortToString((short) getTwoBytesBinary()),
                    source, 1, 2)));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setTwoBytesBinary(0);
        }
    }

    public void setEndOfFile(String source) {
        endOfFile = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class Cbact03cTwoBytesAlpha {
        // [T-Up#INFO][CBACT03C.cbl:55] TWO-BYTES-LEFT (level: 5)
        private @Getter String twoBytesLeft = StringUtils.repeat(' ', 1);
        // [T-Up#INFO][CBACT03C.cbl:56] TWO-BYTES-RIGHT (level: 5)
        private @Getter String twoBytesRight = StringUtils.repeat(' ', 1);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(twoBytesLeft);
            sb.append(twoBytesRight);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getTwoBytesLeft());
            sb.append(getTwoBytesRight());
            return sb.toString();
        }
    }
}
