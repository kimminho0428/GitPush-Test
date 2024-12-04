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
 * <p>  Generation date : 2024/03/20 15:15:16 KST</p>
 * <hr>
 * <p>Class that defines variables for COBOL group item WS-THIS-PROGCOMMAREA</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcWsThisProgcommarea {
    // [T-Up#INFO][COCRDUPC.cbl:275] CARD-UPDATE-SCREEN-DATA (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcCardUpdateScreenData cardUpdateScreenData = new CocrdupcCardUpdateScreenData();
    // [T-Up#INFO][COCRDUPC.cbl:291] CCUP-OLD-DETAILS (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcCcupOldDetails ccupOldDetails = new CocrdupcCcupOldDetails();
    // [T-Up#INFO][COCRDUPC.cbl:303] CCUP-NEW-DETAILS (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcCcupNewDetails ccupNewDetails = new CocrdupcCcupNewDetails();
    // [T-Up#INFO][COCRDUPC.cbl:314] CARD-UPDATE-RECORD (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcCardUpdateRecord cardUpdateRecord = new CocrdupcCardUpdateRecord();

    public static CocrdupcWsThisProgcommarea createDefaultValueInstance() {
        return new CocrdupcWsThisProgcommarea.builder()
                .cardUpdateScreenData(
                        CocrdupcCardUpdateScreenData
                                .createDefaultValueInstance())
                .ccupOldDetails(
                        CocrdupcCcupOldDetails.createDefaultValueInstance())
                .ccupNewDetails(
                        CocrdupcCcupNewDetails.createDefaultValueInstance())
                .cardUpdateRecord(
                        CocrdupcCardUpdateRecord.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 329), 329);
        getCardUpdateScreenData().set(source.substring(0, 1));
        getCcupOldDetails().set(source.substring(1, 90));
        getCcupNewDetails().set(source.substring(90, 179));
        getCardUpdateRecord().set(source.substring(179, 329));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCardUpdateScreenData().get());
        sb.append(getCcupOldDetails().get());
        sb.append(getCcupNewDetails().get());
        sb.append(getCardUpdateRecord().get());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCardUpdateScreenData().toString());
        sb.append(getCcupOldDetails().toString());
        sb.append(getCcupNewDetails().toString());
        sb.append(getCardUpdateRecord().toString());
        return sb.toString();
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCardUpdateScreenData {
        // [T-Up#INFO][COCRDUPC.cbl:276] CCUP-CHANGE-ACTION (level: 10)
        private @Getter @Builder.Default String ccupChangeAction = StringUtils
                .repeat((char) 0x00, 1);
        // [T-Up#INFO][COCRDUPC.cbl:278] CCUP-DETAILS-NOT-FETCHED (level: 88)
        public static final String CCUP_DETAILS_NOT_FETCHED_1 = StringUtils
                .repeat((char) 0x00, 1);
        public static final String CCUP_DETAILS_NOT_FETCHED_2 = " ";
        // [T-Up#INFO][COCRDUPC.cbl:281] CCUP-SHOW-DETAILS (level: 88)
        public static final String CCUP_SHOW_DETAILS = "S";
        // [T-Up#INFO][COCRDUPC.cbl:282] CCUP-CHANGES-MADE (level: 88)
        public static final String CCUP_CHANGES_MADE_1 = "E";
        public static final String CCUP_CHANGES_MADE_2 = "N";
        public static final String CCUP_CHANGES_MADE_3 = "C";
        public static final String CCUP_CHANGES_MADE_4 = "L";
        public static final String CCUP_CHANGES_MADE_5 = "F";
        // [T-Up#INFO][COCRDUPC.cbl:285] CCUP-CHANGES-NOT-OK (level: 88)
        public static final String CCUP_CHANGES_NOT_OK = "E";
        // [T-Up#INFO][COCRDUPC.cbl:286] CCUP-CHANGES-OK-NOT-CONFIRMED (level: 88)
        public static final String CCUP_CHANGES_OK_NOT_CONFIRMED = "N";
        // [T-Up#INFO][COCRDUPC.cbl:287] CCUP-CHANGES-OKAYED-AND-DONE (level: 88)
        public static final String CCUP_CHANGES_OKAYED_AND_DONE = "C";
        // [T-Up#INFO][COCRDUPC.cbl:288] CCUP-CHANGES-FAILED (level: 88)
        public static final String CCUP_CHANGES_FAILED_1 = "L";
        public static final String CCUP_CHANGES_FAILED_2 = "F";
        // [T-Up#INFO][COCRDUPC.cbl:289] CCUP-CHANGES-OKAYED-LOCK-ERROR (level: 88)
        public static final String CCUP_CHANGES_OKAYED_LOCK_ERROR = "L";
        // [T-Up#INFO][COCRDUPC.cbl:290] CCUP-CHANGES-OKAYED-BUT-FAILED (level: 88)
        public static final String CCUP_CHANGES_OKAYED_BUT_FAILED = "F";

        public static CocrdupcCardUpdateScreenData createDefaultValueInstance() {
            return new CocrdupcCardUpdateScreenData.builder().ccupChangeAction(
                    StringUtils.repeat(' ', 1)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
            setCcupChangeAction(source.substring(0, 1));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupChangeAction());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupChangeAction());
            return sb.toString();
        }

        public void setCcupChangeAction(String source) {
            ccupChangeAction = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupOldDetails {
        // [T-Up#INFO][COCRDUPC.cbl:292] CCUP-OLD-ACCTID (level: 10)
        private @Getter @Builder.Default String ccupOldAcctid = StringUtils
                .repeat(' ', 11);
        // [T-Up#INFO][COCRDUPC.cbl:293] CCUP-OLD-CARDID (level: 10)
        private @Getter @Builder.Default String ccupOldCardid = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDUPC.cbl:294] CCUP-OLD-CVV-CD (level: 10)
        private @Getter @Builder.Default String ccupOldCvvCd = StringUtils
                .repeat(' ', 3);
        // [T-Up#INFO][COCRDUPC.cbl:295] CCUP-OLD-CARDDATA (level: 10)
        private @Getter @Setter @Builder.Default CocrdupcCcupOldCarddata ccupOldCarddata = new CocrdupcCcupOldCarddata();

        public static CocrdupcCcupOldDetails createDefaultValueInstance() {
            return new CocrdupcCcupOldDetails.builder().ccupOldCarddata(
                    CocrdupcCcupOldCarddata.createDefaultValueInstance())
                    .build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 89), 89);
            setCcupOldAcctid(source.substring(0, 11));
            setCcupOldCardid(source.substring(11, 27));
            setCcupOldCvvCd(source.substring(27, 30));
            getCcupOldCarddata().set(source.substring(30, 89));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldAcctid());
            sb.append(getCcupOldCardid());
            sb.append(getCcupOldCvvCd());
            sb.append(getCcupOldCarddata().get());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldAcctid());
            sb.append(getCcupOldCardid());
            sb.append(getCcupOldCvvCd());
            sb.append(getCcupOldCarddata().toString());
            return sb.toString();
        }

        public void setCcupOldAcctid(String source) {
            ccupOldAcctid = StringUtils.truncate(
                    StringUtils.rightPad(source, 11), 11);
        }

        public void setCcupOldCardid(String source) {
            ccupOldCardid = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public void setCcupOldCvvCd(String source) {
            ccupOldCvvCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 3), 3);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupOldCarddata {
        // [T-Up#INFO][COCRDUPC.cbl:296] CCUP-OLD-CRDNAME (level: 20)
        private @Getter @Builder.Default String ccupOldCrdname = StringUtils
                .repeat(' ', 50);
        // [T-Up#INFO][COCRDUPC.cbl:297] CCUP-OLD-EXPIRAION-DATE (level: 20)
        private @Getter @Setter @Builder.Default CocrdupcCcupOldExpiraionDate ccupOldExpiraionDate = new CocrdupcCcupOldExpiraionDate();
        // [T-Up#INFO][COCRDUPC.cbl:301] CCUP-OLD-CRDSTCD (level: 20)
        private @Getter @Builder.Default String ccupOldCrdstcd = StringUtils
                .repeat(' ', 1);

        public static CocrdupcCcupOldCarddata createDefaultValueInstance() {
            return new CocrdupcCcupOldCarddata.builder().ccupOldExpiraionDate(
                    CocrdupcCcupOldExpiraionDate.createDefaultValueInstance())
                    .build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 59), 59);
            setCcupOldCrdname(source.substring(0, 50));
            getCcupOldExpiraionDate().set(source.substring(50, 58));
            setCcupOldCrdstcd(source.substring(58, 59));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldCrdname());
            sb.append(getCcupOldExpiraionDate().get());
            sb.append(getCcupOldCrdstcd());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldCrdname());
            sb.append(getCcupOldExpiraionDate().toString());
            sb.append(getCcupOldCrdstcd());
            return sb.toString();
        }

        public void setCcupOldCrdname(String source) {
            ccupOldCrdname = StringUtils.truncate(
                    StringUtils.rightPad(source, 50), 50);
        }

        public void setCcupOldCrdstcd(String source) {
            ccupOldCrdstcd = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupOldExpiraionDate {
        // [T-Up#INFO][COCRDUPC.cbl:298] CCUP-OLD-EXPYEAR (level: 25)
        private @Getter @Builder.Default String ccupOldExpyear = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][COCRDUPC.cbl:299] CCUP-OLD-EXPMON (level: 25)
        private @Getter @Builder.Default String ccupOldExpmon = StringUtils
                .repeat(' ', 2);
        // [T-Up#INFO][COCRDUPC.cbl:300] CCUP-OLD-EXPDAY (level: 25)
        private @Getter @Builder.Default String ccupOldExpday = StringUtils
                .repeat(' ', 2);

        public static CocrdupcCcupOldExpiraionDate createDefaultValueInstance() {
            return new CocrdupcCcupOldExpiraionDate.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
            setCcupOldExpyear(source.substring(0, 4));
            setCcupOldExpmon(source.substring(4, 6));
            setCcupOldExpday(source.substring(6, 8));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldExpyear());
            sb.append(getCcupOldExpmon());
            sb.append(getCcupOldExpday());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupOldExpyear());
            sb.append(getCcupOldExpmon());
            sb.append(getCcupOldExpday());
            return sb.toString();
        }

        public void setCcupOldExpyear(String source) {
            ccupOldExpyear = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setCcupOldExpmon(String source) {
            ccupOldExpmon = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }

        public void setCcupOldExpday(String source) {
            ccupOldExpday = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupNewDetails {
        // [T-Up#INFO][COCRDUPC.cbl:304] CCUP-NEW-ACCTID (level: 10)
        private @Getter @Builder.Default String ccupNewAcctid = StringUtils
                .repeat(' ', 11);
        // [T-Up#INFO][COCRDUPC.cbl:305] CCUP-NEW-CARDID (level: 10)
        private @Getter @Builder.Default String ccupNewCardid = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDUPC.cbl:306] CCUP-NEW-CVV-CD (level: 10)
        private @Getter @Builder.Default String ccupNewCvvCd = StringUtils
                .repeat(' ', 3);
        // [T-Up#INFO][COCRDUPC.cbl:307] CCUP-NEW-CARDDATA (level: 10)
        private @Getter @Setter @Builder.Default CocrdupcCcupNewCarddata ccupNewCarddata = new CocrdupcCcupNewCarddata();

        public static CocrdupcCcupNewDetails createDefaultValueInstance() {
            return new CocrdupcCcupNewDetails.builder().ccupNewCarddata(
                    CocrdupcCcupNewCarddata.createDefaultValueInstance())
                    .build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 89), 89);
            setCcupNewAcctid(source.substring(0, 11));
            setCcupNewCardid(source.substring(11, 27));
            setCcupNewCvvCd(source.substring(27, 30));
            getCcupNewCarddata().set(source.substring(30, 89));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewAcctid());
            sb.append(getCcupNewCardid());
            sb.append(getCcupNewCvvCd());
            sb.append(getCcupNewCarddata().get());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewAcctid());
            sb.append(getCcupNewCardid());
            sb.append(getCcupNewCvvCd());
            sb.append(getCcupNewCarddata().toString());
            return sb.toString();
        }

        public void setCcupNewAcctid(String source) {
            ccupNewAcctid = StringUtils.truncate(
                    StringUtils.rightPad(source, 11), 11);
        }

        public void setCcupNewCardid(String source) {
            ccupNewCardid = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public void setCcupNewCvvCd(String source) {
            ccupNewCvvCd = StringUtils.truncate(
                    StringUtils.rightPad(source, 3), 3);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupNewCarddata {
        // [T-Up#INFO][COCRDUPC.cbl:308] CCUP-NEW-CRDNAME (level: 20)
        private @Getter @Builder.Default String ccupNewCrdname = StringUtils
                .repeat(' ', 50);
        // [T-Up#INFO][COCRDUPC.cbl:309] CCUP-NEW-EXPIRAION-DATE (level: 20)
        private @Getter @Setter @Builder.Default CocrdupcCcupNewExpiraionDate ccupNewExpiraionDate = new CocrdupcCcupNewExpiraionDate();
        // [T-Up#INFO][COCRDUPC.cbl:313] CCUP-NEW-CRDSTCD (level: 20)
        private @Getter @Builder.Default String ccupNewCrdstcd = StringUtils
                .repeat(' ', 1);

        public static CocrdupcCcupNewCarddata createDefaultValueInstance() {
            return new CocrdupcCcupNewCarddata.builder().ccupNewExpiraionDate(
                    CocrdupcCcupNewExpiraionDate.createDefaultValueInstance())
                    .build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 59), 59);
            setCcupNewCrdname(source.substring(0, 50));
            getCcupNewExpiraionDate().set(source.substring(50, 58));
            setCcupNewCrdstcd(source.substring(58, 59));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewCrdname());
            sb.append(getCcupNewExpiraionDate().get());
            sb.append(getCcupNewCrdstcd());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewCrdname());
            sb.append(getCcupNewExpiraionDate().toString());
            sb.append(getCcupNewCrdstcd());
            return sb.toString();
        }

        public void setCcupNewCrdname(String source) {
            ccupNewCrdname = StringUtils.truncate(
                    StringUtils.rightPad(source, 50), 50);
        }

        public void setCcupNewCrdstcd(String source) {
            ccupNewCrdstcd = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCcupNewExpiraionDate {
        // [T-Up#INFO][COCRDUPC.cbl:310] CCUP-NEW-EXPYEAR (level: 25)
        private @Getter @Builder.Default String ccupNewExpyear = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][COCRDUPC.cbl:311] CCUP-NEW-EXPMON (level: 25)
        private @Getter @Builder.Default String ccupNewExpmon = StringUtils
                .repeat(' ', 2);
        // [T-Up#INFO][COCRDUPC.cbl:312] CCUP-NEW-EXPDAY (level: 25)
        private @Getter @Builder.Default String ccupNewExpday = StringUtils
                .repeat(' ', 2);

        public static CocrdupcCcupNewExpiraionDate createDefaultValueInstance() {
            return new CocrdupcCcupNewExpiraionDate.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 8), 8);
            setCcupNewExpyear(source.substring(0, 4));
            setCcupNewExpmon(source.substring(4, 6));
            setCcupNewExpday(source.substring(6, 8));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewExpyear());
            sb.append(getCcupNewExpmon());
            sb.append(getCcupNewExpday());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCcupNewExpyear());
            sb.append(getCcupNewExpmon());
            sb.append(getCcupNewExpday());
            return sb.toString();
        }

        public void setCcupNewExpyear(String source) {
            ccupNewExpyear = StringUtils.truncate(
                    StringUtils.rightPad(source, 4), 4);
        }

        public void setCcupNewExpmon(String source) {
            ccupNewExpmon = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }

        public void setCcupNewExpday(String source) {
            ccupNewExpday = StringUtils.truncate(
                    StringUtils.rightPad(source, 2), 2);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCardUpdateRecord {
        // [T-Up#INFO][COCRDUPC.cbl:315] CARD-UPDATE-NUM (level: 10)
        private @Getter @Builder.Default String cardUpdateNum = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDUPC.cbl:316] CARD-UPDATE-ACCT-ID (level: 10)
        private @Getter @Setter long cardUpdateAcctId;
        // [T-Up#INFO][COCRDUPC.cbl:317] CARD-UPDATE-CVV-CD (level: 10)
        private @Getter @Setter int cardUpdateCvvCd;
        // [T-Up#INFO][COCRDUPC.cbl:318] CARD-UPDATE-EMBOSSED-NAME (level: 10)
        private @Getter @Builder.Default String cardUpdateEmbossedName = StringUtils
                .repeat(' ', 50);
        // [T-Up#INFO][COCRDUPC.cbl:319] CARD-UPDATE-EXPIRAION-DATE (level: 10)
        private @Getter @Builder.Default String cardUpdateExpiraionDate = StringUtils
                .repeat(' ', 10);
        // [T-Up#INFO][COCRDUPC.cbl:320] CARD-UPDATE-ACTIVE-STATUS (level: 10)
        private @Getter @Builder.Default String cardUpdateActiveStatus = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCRDUPC.cbl:321] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_1 = StringUtils.repeat(
                ' ', 59);

        public static CocrdupcCardUpdateRecord createDefaultValueInstance() {
            return new CocrdupcCardUpdateRecord.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 150),
                    150);
            setCardUpdateNum(source.substring(0, 16));
            try {
                setCardUpdateAcctId(CobStream.convZonedStringToLong(
                        source.substring(16, 27), 11));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCardUpdateAcctId(0);
            }
            try {
                setCardUpdateCvvCd(CobStream.convZonedStringToInt(
                        source.substring(27, 30), 3));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setCardUpdateCvvCd(0);
            }
            setCardUpdateEmbossedName(source.substring(30, 80));
            setCardUpdateExpiraionDate(source.substring(80, 90));
            setCardUpdateActiveStatus(source.substring(90, 91));
            setFILLER_1(source.substring(91, 150));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardUpdateNum());
            sb.append(CobStream
                    .convZonedLongToString(getCardUpdateAcctId(), 11));
            sb.append(CobStream.convZonedIntToString(getCardUpdateCvvCd(), 3));
            sb.append(getCardUpdateEmbossedName());
            sb.append(getCardUpdateExpiraionDate());
            sb.append(getCardUpdateActiveStatus());
            sb.append(getFILLER_1());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardUpdateNum());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    getCardUpdateAcctId(), "00000000000"));
            sb.append(PictureFormatter.intFormatWithoutSign(
                    (long) getCardUpdateCvvCd(), "000"));
            sb.append(getCardUpdateEmbossedName());
            sb.append(getCardUpdateExpiraionDate());
            sb.append(getCardUpdateActiveStatus());
            sb.append(getFILLER_1());
            return sb.toString();
        }

        public void setCardUpdateNum(String source) {
            cardUpdateNum = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public void setCardUpdateEmbossedName(String source) {
            cardUpdateEmbossedName = StringUtils.truncate(
                    StringUtils.rightPad(source, 50), 50);
        }

        public void setCardUpdateExpiraionDate(String source) {
            cardUpdateExpiraionDate = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public void setCardUpdateActiveStatus(String source) {
            cardUpdateActiveStatus = StringUtils.truncate(
                    StringUtils.rightPad(source, 1), 1);
        }

        public void setFILLER_1(String source) {
            FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 59),
                    59);
        }
    }
}