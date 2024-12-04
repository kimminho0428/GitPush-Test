package com.tmax.openframe.variable.group;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.runtime.cobol.PictureFormatter;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class DisGroupRecord {
    // [T-Up#INFO][CVTRA02Y.cpy:6] DIS-GROUP-KEY (level: 5)
    private @Getter @Setter @Builder.Default DisGroupKey disGroupKey = new DisGroupKey();
    // [T-Up#INFO][CVTRA02Y.cpy:10] DIS-INT-RATE (level: 5)
    private @Getter @Builder.Default BigDecimal disIntRate = BigDecimal.ZERO;
    // [T-Up#INFO][CVTRA02Y.cpy:11] FILLER (level: 5)
    private @Getter @Builder.Default String FILLER_1 = StringUtils.repeat(' ',
            28);

    public static DisGroupRecord createDefaultValueInstance() {
        return new DisGroupRecord.builder().disGroupKey(
                DisGroupKey.createDefaultValueInstance()).build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 50), 50);
        getDisGroupKey().set(source.substring(0, 16));
        try {
            setDisIntRate(CobStream.convZonedStringToBigDecimal(
                    source.substring(16, 22), 6, 2));
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            setDisIntRate(BigDecimal.ZERO);
        }
        setFILLER_1(source.substring(22, 50));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDisGroupKey().get());
        sb.append(CobStream.convZonedBigDecimalToString(getDisIntRate(), 6, 2));
        sb.append(getFILLER_1());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDisGroupKey().toString());
        sb.append(PictureFormatter.decimalFormatWithSign(getDisIntRate(),
                "0000.00"));
        sb.append(getFILLER_1());
        return sb.toString();
    }

    public void setDisIntRate(BigDecimal source) {
        disIntRate = source.setScale(2, RoundingMode.DOWN);
    }

    public void setFILLER_1(String source) {
        FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 28), 28);
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class DisGroupKey {
        // [T-Up#INFO][CVTRA02Y.cpy:7] DIS-ACCT-GROUP-ID (level: 10)
        private @Getter @Builder.Default String disAcctGroupId = StringUtils
                .repeat(' ', 10);
        // [T-Up#INFO][CVTRA02Y.cpy:8] DIS-TRAN-TYPE-CD (level: 10)
        private @Getter @Builder.Default String disTranTypeCd = StringUtils
                .repeat(' ', 2);
        // [T-Up#INFO][CVTRA02Y.cpy:9] DIS-TRAN-CAT-CD (level: 10)
        private @Getter @Setter int disTranCatCd;

        public static DisGroupKey createDefaultValueInstance() {
            return new DisGroupKey.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            setDisAcctGroupId(source.substring(0, 10));
            setDisTranTypeCd(source.substring(10, 12));
            try {
                setDisTranCatCd(CobStream.convZonedStringToInt(
                        source.substring(12, 16), 4));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setDisTranCatCd(0);
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getDisAcctGroupId());
            sb.append(getDisTranTypeCd());
            sb.append(CobStream.convZonedIntToString(getDisTranCatCd(), 4));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getDisAcctGroupId());
            sb.append(getDisTranTypeCd());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) getDisTranCatCd(), "0000"));
            return sb.toString();
        }

        public void setDisAcctGroupId(String source) {
            disAcctGroupId = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public void setDisTranTypeCd(String source) {
            disTranTypeCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }
    }
}