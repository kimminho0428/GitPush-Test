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
 * <p>  Generation date : 2024/03/20 15:15:20 KST</p>
 * <hr>
 * <p>Class that defines variables for COPYBOOK item</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CarddemoCommarea {
    // [T-Up#INFO][COCOM01Y.cpy:21] CDEMO-GENERAL-INFO (level: 5)
    private @Getter @Setter @Builder.Default CdemoGeneralInfo cdemoGeneralInfo = new CdemoGeneralInfo();
    // [T-Up#INFO][COCOM01Y.cpy:33] CDEMO-CUSTOMER-INFO (level: 5)
    private @Getter @Setter @Builder.Default CdemoCustomerInfo cdemoCustomerInfo = new CdemoCustomerInfo();
    // [T-Up#INFO][COCOM01Y.cpy:38] CDEMO-ACCOUNT-INFO (level: 5)
    private @Getter @Setter @Builder.Default CdemoAccountInfo cdemoAccountInfo = new CdemoAccountInfo();
    // [T-Up#INFO][COCOM01Y.cpy:41] CDEMO-CARD-INFO (level: 5)
    private @Getter @Setter @Builder.Default CdemoCardInfo cdemoCardInfo = new CdemoCardInfo();
    // [T-Up#INFO][COCOM01Y.cpy:43] CDEMO-MORE-INFO (level: 5)
    private @Getter @Setter @Builder.Default CdemoMoreInfo cdemoMoreInfo = new CdemoMoreInfo();

    public static CarddemoCommarea createDefaultValueInstance() {
        return new CarddemoCommarea.builder()
                .cdemoGeneralInfo(CdemoGeneralInfo.createDefaultValueInstance())
                .cdemoCustomerInfo(
                        CdemoCustomerInfo.createDefaultValueInstance())
                .cdemoAccountInfo(CdemoAccountInfo.createDefaultValueInstance())
                .cdemoCardInfo(CdemoCardInfo.createDefaultValueInstance())
                .cdemoMoreInfo(CdemoMoreInfo.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 160), 160);
        getCdemoGeneralInfo().set(source.substring(0, 34));
        getCdemoCustomerInfo().set(source.substring(34, 118));
        getCdemoAccountInfo().set(source.substring(118, 130));
        getCdemoCardInfo().set(source.substring(130, 146));
        getCdemoMoreInfo().set(source.substring(146, 160));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCdemoGeneralInfo().get());
        sb.append(getCdemoCustomerInfo().get());
        sb.append(getCdemoAccountInfo().get());
        sb.append(getCdemoCardInfo().get());
        sb.append(getCdemoMoreInfo().get());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCdemoGeneralInfo().toString());
        sb.append(getCdemoCustomerInfo().toString());
        sb.append(getCdemoAccountInfo().toString());
        sb.append(getCdemoCardInfo().toString());
        sb.append(getCdemoMoreInfo().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoGeneralInfo {
        // [T-Up#INFO][COCOM01Y.cpy:22] CDEMO-FROM-TRANID (level: 10)
        private @Getter @Builder.Default String cdemoFromTranid = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][COCOM01Y.cpy:23] CDEMO-FROM-PROGRAM (level: 10)
        private @Getter @Builder.Default String cdemoFromProgram = StringUtils
                .repeat(' ', 8);
        // [T-Up#INFO][COCOM01Y.cpy:24] CDEMO-TO-TRANID (level: 10)
        private @Getter @Builder.Default String cdemoToTranid = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][COCOM01Y.cpy:25] CDEMO-TO-PROGRAM (level: 10)
        private @Getter @Builder.Default String cdemoToProgram = StringUtils
                .repeat(' ', 8);
        // [T-Up#INFO][COCOM01Y.cpy:26] CDEMO-USER-ID (level: 10)
        private @Getter @Builder.Default String cdemoUserId = StringUtils
                .repeat(' ', 8);
        // [T-Up#INFO][COCOM01Y.cpy:27] CDEMO-USER-TYPE (level: 10)
        private @Getter @Builder.Default String cdemoUserType = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCOM01Y.cpy:28] CDEMO-USRTYP-ADMIN (level: 88)
        public static final String CDEMO_USRTYP_ADMIN = "A";
        // [T-Up#INFO][COCOM01Y.cpy:29] CDEMO-USRTYP-USER (level: 88)
        public static final String CDEMO_USRTYP_USER = "U";
        // [T-Up#INFO][COCOM01Y.cpy:30] CDEMO-PGM-CONTEXT (level: 10)
        private @Getter @Setter int cdemoPgmContext;
        // [T-Up#INFO][COCOM01Y.cpy:31] CDEMO-PGM-ENTER (level: 88)
        public static final int CDEMO_PGM_ENTER = 0;
        // [T-Up#INFO][COCOM01Y.cpy:32] CDEMO-PGM-REENTER (level: 88)
        public static final int CDEMO_PGM_REENTER = 1;

        public static CdemoGeneralInfo createDefaultValueInstance() {
            return new CdemoGeneralInfo.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 34), 34);
            setCdemoFromTranid(source.substring(0, 4));
            setCdemoFromProgram(source.substring(4, 12));
            setCdemoToTranid(source.substring(12, 16));
            setCdemoToProgram(source.substring(16, 24));
            setCdemoUserId(source.substring(24, 32));
            setCdemoUserType(source.substring(32, 33));
            try {
                setCdemoPgmContext(CobStream.convZonedStringToInt(
                        source.substring(33, 34), 1));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCdemoPgmContext(0);
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoFromTranid());
            sb.append(getCdemoFromProgram());
            sb.append(getCdemoToTranid());
            sb.append(getCdemoToProgram());
            sb.append(getCdemoUserId());
            sb.append(getCdemoUserType());
            sb.append(CobStream.convZonedIntToString(getCdemoPgmContext(), 1));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoFromTranid());
            sb.append(getCdemoFromProgram());
            sb.append(getCdemoToTranid());
            sb.append(getCdemoToProgram());
            sb.append(getCdemoUserId());
            sb.append(getCdemoUserType());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) getCdemoPgmContext(), "0"));
            return sb.toString();
        }

        public void setCdemoFromTranid(String source) {
            cdemoFromTranid = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setCdemoFromProgram(String source) {
            cdemoFromProgram = StringUtils.truncate(
                    StringUtils.rightPad(source, 8), 8);
        }

        public void setCdemoToTranid(String source) {
            cdemoToTranid = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setCdemoToProgram(String source) {
            cdemoToProgram = StringUtils.truncate(
                    StringUtils.rightPad(source, 8), 8);
        }

        public void setCdemoUserId(String source) {
            cdemoUserId = StringUtils.truncate(StringUtils.rightPad(source, 8),
                    8);
        }

        public void setCdemoUserType(String source) {
            cdemoUserType = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoCustomerInfo {
        // [T-Up#INFO][COCOM01Y.cpy:34] CDEMO-CUST-ID (level: 10)
        private @Getter @Setter int cdemoCustId;
        // [T-Up#INFO][COCOM01Y.cpy:35] CDEMO-CUST-FNAME (level: 10)
        private @Getter @Builder.Default String cdemoCustFname = StringUtils
                .repeat(' ', 25);
        // [T-Up#INFO][COCOM01Y.cpy:36] CDEMO-CUST-MNAME (level: 10)
        private @Getter @Builder.Default String cdemoCustMname = StringUtils
                .repeat(' ', 25);
        // [T-Up#INFO][COCOM01Y.cpy:37] CDEMO-CUST-LNAME (level: 10)
        private @Getter @Builder.Default String cdemoCustLname = StringUtils
                .repeat(' ', 25);

        public static CdemoCustomerInfo createDefaultValueInstance() {
            return new CdemoCustomerInfo.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 84), 84);
            try {
                setCdemoCustId(CobStream.convZonedStringToInt(
                        source.substring(0, 9), 9));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCdemoCustId(0);
            }
            setCdemoCustFname(source.substring(9, 34));
            setCdemoCustMname(source.substring(34, 59));
            setCdemoCustLname(source.substring(59, 84));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(CobStream.convZonedIntToString(getCdemoCustId(), 9));
            sb.append(getCdemoCustFname());
            sb.append(getCdemoCustMname());
            sb.append(getCdemoCustLname());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) getCdemoCustId(), "000000000"));
            sb.append(getCdemoCustFname());
            sb.append(getCdemoCustMname());
            sb.append(getCdemoCustLname());
            return sb.toString();
        }

        public void setCdemoCustFname(String source) {
            cdemoCustFname = StringUtils.truncate(
                    StringUtils.rightPad(source, 25), 25);
        }

        public void setCdemoCustMname(String source) {
            cdemoCustMname = StringUtils.truncate(
                    StringUtils.rightPad(source, 25), 25);
        }

        public void setCdemoCustLname(String source) {
            cdemoCustLname = StringUtils.truncate(
                    StringUtils.rightPad(source, 25), 25);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoAccountInfo {
        // [T-Up#INFO][COCOM01Y.cpy:39] CDEMO-ACCT-ID (level: 10)
        private @Getter @Setter long cdemoAcctId;
        // [T-Up#INFO][COCOM01Y.cpy:40] CDEMO-ACCT-STATUS (level: 10)
        private @Getter @Builder.Default String cdemoAcctStatus = StringUtils
                .repeat(' ', 1);

        public static CdemoAccountInfo createDefaultValueInstance() {
            return new CdemoAccountInfo.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 12), 12);
            try {
                setCdemoAcctId(CobStream.convZonedStringToLong(
                        source.substring(0, 11), 11));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCdemoAcctId(0);
            }
            setCdemoAcctStatus(source.substring(11, 12));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(CobStream.convZonedLongToString(getCdemoAcctId(), 11));
            sb.append(getCdemoAcctStatus());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign(getCdemoAcctId(),
                    "00000000000"));
            sb.append(getCdemoAcctStatus());
            return sb.toString();
        }

        public void setCdemoAcctStatus(String source) {
            cdemoAcctStatus = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoCardInfo {
        // [T-Up#INFO][COCOM01Y.cpy:42] CDEMO-CARD-NUM (level: 10)
        private @Getter @Setter long cdemoCardNum;

        public static CdemoCardInfo createDefaultValueInstance() {
            return new CdemoCardInfo.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            try {
                setCdemoCardNum(CobStream.convZonedStringToLong(
                        source.substring(0, 16), 16));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCdemoCardNum(0);
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(CobStream.convZonedLongToString(getCdemoCardNum(), 16));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(PictureFormatter.intFormatWithoutSign(getCdemoCardNum(),
                    "0000000000000000"));
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CdemoMoreInfo {
        // [T-Up#INFO][COCOM01Y.cpy:44] CDEMO-LAST-MAP (level: 10)
        private @Getter @Builder.Default String cdemoLastMap = StringUtils
                .repeat(' ', 7);
        // [T-Up#INFO][COCOM01Y.cpy:45] CDEMO-LAST-MAPSET (level: 10)
        private @Getter @Builder.Default String cdemoLastMapset = StringUtils
                .repeat(' ', 7);

        public static CdemoMoreInfo createDefaultValueInstance() {
            return new CdemoMoreInfo.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 14), 14);
            setCdemoLastMap(source.substring(0, 7));
            setCdemoLastMapset(source.substring(7, 14));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoLastMap());
            sb.append(getCdemoLastMapset());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCdemoLastMap());
            sb.append(getCdemoLastMapset());
            return sb.toString();
        }

        public void setCdemoLastMap(String source) {
            cdemoLastMap = StringUtils.truncate(
                    StringUtils.rightPad(source, 7), 7);
        }

        public void setCdemoLastMapset(String source) {
            cdemoLastMapset = StringUtils.truncate(
                    StringUtils.rightPad(source, 7), 7);
        }
    }
}
