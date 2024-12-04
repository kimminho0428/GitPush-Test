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
 * <p>Class that defines variables for COBOL group item WS-MISC-STORAGE</p>
 */
public @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcWsMiscStorage {
    // ******************************************************************
    // * General CICS related
    // ******************************************************************
    // [T-Up#INFO][COCRDUPC.cbl:40] WS-CICS-PROCESSNG-VARS (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcWsCicsProcessngVars wsCicsProcessngVars = new CocrdupcWsCicsProcessngVars();
    // ******************************************************************
    // *      Input edits
    // ******************************************************************
    // [T-Up#INFO][COCRDUPC.cbl:53] WS-INPUT-FLAG (level: 5)
    private @Getter @Builder.Default String wsInputFlag = StringUtils.repeat(
            ' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:54] INPUT-OK (level: 88)
    public static final String INPUT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:55] INPUT-ERROR (level: 88)
    public static final String INPUT_ERROR = "1";
    // [T-Up#INFO][COCRDUPC.cbl:56] INPUT-PENDING (level: 88)
    public static final String INPUT_PENDING = StringUtils.repeat((char) 0x00,
            1);
    // [T-Up#INFO][COCRDUPC.cbl:57] WS-EDIT-ACCT-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditAcctFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:58] FLG-ACCTFILTER-NOT-OK (level: 88)
    public static final String FLG_ACCTFILTER_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:59] FLG-ACCTFILTER-ISVALID (level: 88)
    public static final String FLG_ACCTFILTER_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:60] FLG-ACCTFILTER-BLANK (level: 88)
    public static final String FLG_ACCTFILTER_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:61] WS-EDIT-CARD-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:62] FLG-CARDFILTER-NOT-OK (level: 88)
    public static final String FLG_CARDFILTER_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:63] FLG-CARDFILTER-ISVALID (level: 88)
    public static final String FLG_CARDFILTER_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:64] FLG-CARDFILTER-BLANK (level: 88)
    public static final String FLG_CARDFILTER_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:65] WS-EDIT-CARDNAME-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardnameFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:66] FLG-CARDNAME-NOT-OK (level: 88)
    public static final String FLG_CARDNAME_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:67] FLG-CARDNAME-ISVALID (level: 88)
    public static final String FLG_CARDNAME_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:68] FLG-CARDNAME-BLANK (level: 88)
    public static final String FLG_CARDNAME_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:69] WS-EDIT-CARDSTATUS-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardstatusFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:70] FLG-CARDSTATUS-NOT-OK (level: 88)
    public static final String FLG_CARDSTATUS_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:71] FLG-CARDSTATUS-ISVALID (level: 88)
    public static final String FLG_CARDSTATUS_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:72] FLG-CARDSTATUS-BLANK (level: 88)
    public static final String FLG_CARDSTATUS_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:73] WS-EDIT-CARDEXPMON-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardexpmonFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:74] FLG-CARDEXPMON-NOT-OK (level: 88)
    public static final String FLG_CARDEXPMON_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:75] FLG-CARDEXPMON-ISVALID (level: 88)
    public static final String FLG_CARDEXPMON_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:76] FLG-CARDEXPMON-BLANK (level: 88)
    public static final String FLG_CARDEXPMON_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:77] WS-EDIT-CARDEXPYEAR-FLAG (level: 5)
    private @Getter @Builder.Default String wsEditCardexpyearFlag = StringUtils
            .repeat(' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:78] FLG-CARDEXPYEAR-NOT-OK (level: 88)
    public static final String FLG_CARDEXPYEAR_NOT_OK = "0";
    // [T-Up#INFO][COCRDUPC.cbl:79] FLG-CARDEXPYEAR-ISVALID (level: 88)
    public static final String FLG_CARDEXPYEAR_ISVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:80] FLG-CARDEXPYEAR-BLANK (level: 88)
    public static final String FLG_CARDEXPYEAR_BLANK = " ";
    // [T-Up#INFO][COCRDUPC.cbl:81] WS-RETURN-FLAG (level: 5)
    private @Getter @Builder.Default String wsReturnFlag = StringUtils.repeat(
            ' ', 1);
    // [T-Up#INFO][COCRDUPC.cbl:82] WS-RETURN-FLAG-OFF (level: 88)
    public static final String WS_RETURN_FLAG_OFF = StringUtils.repeat(
            (char) 0x00, 1);
    // [T-Up#INFO][COCRDUPC.cbl:83] WS-RETURN-FLAG-ON (level: 88)
    public static final String WS_RETURN_FLAG_ON = "1";
    // [T-Up#INFO][COCRDUPC.cbl:84] WS-PFK-FLAG (level: 5)
    private @Getter @Builder.Default String wsPfkFlag = StringUtils.repeat(' ',
            1);
    // [T-Up#INFO][COCRDUPC.cbl:85] PFK-VALID (level: 88)
    public static final String PFK_VALID = "0";
    // [T-Up#INFO][COCRDUPC.cbl:86] PFK-INVALID (level: 88)
    public static final String PFK_INVALID = "1";
    // [T-Up#INFO][COCRDUPC.cbl:87] CARD-NAME-CHECK (level: 5)
    private @Getter @Builder.Default String cardNameCheck = StringUtils.repeat(
            (char) 0x00, 50);
    // [T-Up#INFO][COCRDUPC.cbl:89] FLG-YES-NO-CHECK (level: 5)
    private @Getter @Builder.Default String flgYesNoCheck = "N";
    // [T-Up#INFO][COCRDUPC.cbl:91] FLG-YES-NO-VALID (level: 88)
    public static final String FLG_YES_NO_VALID_1 = "Y";
    public static final String FLG_YES_NO_VALID_2 = "N";
    // [T-Up#INFO][COCRDUPC.cbl:92] CARD-MONTH-CHECK (level: 5)
    private @Getter @Builder.Default String cardMonthCheck = StringUtils
            .repeat(' ', 2);
    // [T-Up#INFO][COCRDUPC.cbl:95] VALID-MONTH (level: 88)
    public static final int VALID_MONTH_START = 1;
    public static final int VALID_MONTH_END = 12;
    // [T-Up#INFO][COCRDUPC.cbl:96] CARD-YEAR-CHECK (level: 5)
    private @Getter @Builder.Default String cardYearCheck = StringUtils.repeat(
            ' ', 4);
    // [T-Up#INFO][COCRDUPC.cbl:99] VALID-YEAR (level: 88)
    public static final int VALID_YEAR_START = 1950;
    public static final int VALID_YEAR_END = 2099;
    // ******************************************************************
    // * Output edits
    // ******************************************************************
    // [T-Up#INFO][COCRDUPC.cbl:103] CICS-OUTPUT-EDIT-VARS (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcCicsOutputEditVars cicsOutputEditVars = new CocrdupcCicsOutputEditVars();
    // ******************************************************************
    // *      File and data Handling
    // ******************************************************************
    // [T-Up#INFO][COCRDUPC.cbl:128] WS-CARD-RID (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcWsCardRid wsCardRid = new CocrdupcWsCardRid();
    // [T-Up#INFO][COCRDUPC.cbl:133] WS-FILE-ERROR-MESSAGE (level: 5)
    private @Getter @Setter @Builder.Default CocrdupcWsFileErrorMessage wsFileErrorMessage = new CocrdupcWsFileErrorMessage();
    // ******************************************************************
    // *      Output Message Construction
    // ******************************************************************
    // [T-Up#INFO][COCRDUPC.cbl:156] WS-LONG-MSG (level: 5)
    private @Getter @Builder.Default String wsLongMsg = StringUtils.repeat(' ',
            500);
    // [T-Up#INFO][COCRDUPC.cbl:157] WS-INFO-MSG (level: 5)
    private @Getter @Builder.Default String wsInfoMsg = StringUtils.repeat(' ',
            40);
    // [T-Up#INFO][COCRDUPC.cbl:158] WS-NO-INFO-MESSAGE (level: 88)
    public static final String WS_NO_INFO_MESSAGE_1 = StringUtils.repeat(' ',
            40);
    public static final String WS_NO_INFO_MESSAGE_2 = StringUtils.repeat(
            (char) 0x00, 40);
    // [T-Up#INFO][COCRDUPC.cbl:160] FOUND-CARDS-FOR-ACCOUNT (level: 88)
    public static final String FOUND_CARDS_FOR_ACCOUNT = "Details of selected card shown above";
    // [T-Up#INFO][COCRDUPC.cbl:162] PROMPT-FOR-SEARCH-KEYS (level: 88)
    public static final String PROMPT_FOR_SEARCH_KEYS = "Please enter Account and Card Number";
    // [T-Up#INFO][COCRDUPC.cbl:164] PROMPT-FOR-CHANGES (level: 88)
    public static final String PROMPT_FOR_CHANGES = "Update card details presented above.";
    // [T-Up#INFO][COCRDUPC.cbl:166] PROMPT-FOR-CONFIRMATION (level: 88)
    public static final String PROMPT_FOR_CONFIRMATION = "Changes validated.Press F5 to save";
    // [T-Up#INFO][COCRDUPC.cbl:168] CONFIRM-UPDATE-SUCCESS (level: 88)
    public static final String CONFIRM_UPDATE_SUCCESS = "Changes committed to database";
    // [T-Up#INFO][COCRDUPC.cbl:170] INFORM-FAILURE (level: 88)
    public static final String INFORM_FAILURE = "Changes unsuccessful. Please try again";
    // [T-Up#INFO][COCRDUPC.cbl:173] WS-RETURN-MSG (level: 5)
    private @Getter @Builder.Default String wsReturnMsg = StringUtils.repeat(
            ' ', 75);
    // [T-Up#INFO][COCRDUPC.cbl:174] WS-RETURN-MSG-OFF (level: 88)
    public static final String WS_RETURN_MSG_OFF = StringUtils.repeat(' ', 75);
    // [T-Up#INFO][COCRDUPC.cbl:175] WS-EXIT-MESSAGE (level: 88)
    public static final String WS_EXIT_MESSAGE = "PF03 pressed.Exiting              ";
    // [T-Up#INFO][COCRDUPC.cbl:177] WS-PROMPT-FOR-ACCT (level: 88)
    public static final String WS_PROMPT_FOR_ACCT = "Account number not provided";
    // [T-Up#INFO][COCRDUPC.cbl:179] WS-PROMPT-FOR-CARD (level: 88)
    public static final String WS_PROMPT_FOR_CARD = "Card number not provided";
    // [T-Up#INFO][COCRDUPC.cbl:181] WS-PROMPT-FOR-NAME (level: 88)
    public static final String WS_PROMPT_FOR_NAME = "Card name not provided";
    // [T-Up#INFO][COCRDUPC.cbl:183] WS-NAME-MUST-BE-ALPHA (level: 88)
    public static final String WS_NAME_MUST_BE_ALPHA = "Card name can only contain alphabets and spaces";
    // [T-Up#INFO][COCRDUPC.cbl:185] NO-SEARCH-CRITERIA-RECEIVED (level: 88)
    public static final String NO_SEARCH_CRITERIA_RECEIVED = "No input received";
    // [T-Up#INFO][COCRDUPC.cbl:187] NO-CHANGES-DETECTED (level: 88)
    public static final String NO_CHANGES_DETECTED = "No change detected with respect to values fetched.";
    // [T-Up#INFO][COCRDUPC.cbl:189] SEARCHED-ACCT-ZEROES (level: 88)
    public static final String SEARCHED_ACCT_ZEROES = "Account number must be a non zero 11 digit number";
    // [T-Up#INFO][COCRDUPC.cbl:191] SEARCHED-ACCT-NOT-NUMERIC (level: 88)
    public static final String SEARCHED_ACCT_NOT_NUMERIC = "Account number must be a non zero 11 digit number";
    // [T-Up#INFO][COCRDUPC.cbl:193] SEARCHED-CARD-NOT-NUMERIC (level: 88)
    public static final String SEARCHED_CARD_NOT_NUMERIC = "Card number if supplied must be a 16 digit number";
    // [T-Up#INFO][COCRDUPC.cbl:195] CARD-STATUS-MUST-BE-YES-NO (level: 88)
    public static final String CARD_STATUS_MUST_BE_YES_NO = "Card Active Status must be Y or N";
    // [T-Up#INFO][COCRDUPC.cbl:197] CARD-EXPIRY-MONTH-NOT-VALID (level: 88)
    public static final String CARD_EXPIRY_MONTH_NOT_VALID = "Card expiry month must be between 1 and 12";
    // [T-Up#INFO][COCRDUPC.cbl:199] CARD-EXPIRY-YEAR-NOT-VALID (level: 88)
    public static final String CARD_EXPIRY_YEAR_NOT_VALID = "Invalid card expiry year";
    // [T-Up#INFO][COCRDUPC.cbl:201] DID-NOT-FIND-ACCT-IN-CARDXREF (level: 88)
    public static final String DID_NOT_FIND_ACCT_IN_CARDXREF = "Did not find this account in cards database";
    // [T-Up#INFO][COCRDUPC.cbl:203] DID-NOT-FIND-ACCTCARD-COMBO (level: 88)
    public static final String DID_NOT_FIND_ACCTCARD_COMBO = "Did not find cards for this search condition";
    // [T-Up#INFO][COCRDUPC.cbl:205] COULD-NOT-LOCK-FOR-UPDATE (level: 88)
    public static final String COULD_NOT_LOCK_FOR_UPDATE = "Could not lock record for update";
    // [T-Up#INFO][COCRDUPC.cbl:207] DATA-WAS-CHANGED-BEFORE-UPDATE (level: 88)
    public static final String DATA_WAS_CHANGED_BEFORE_UPDATE = "Record changed by some one else. Please review";
    // [T-Up#INFO][COCRDUPC.cbl:209] LOCKED-BUT-UPDATE-FAILED (level: 88)
    public static final String LOCKED_BUT_UPDATE_FAILED = "Update of record failed";
    // [T-Up#INFO][COCRDUPC.cbl:211] XREF-READ-ERROR (level: 88)
    public static final String XREF_READ_ERROR = "Error reading Card Data File";
    // [T-Up#INFO][COCRDUPC.cbl:213] CODING-TO-BE-DONE (level: 88)
    public static final String CODING_TO_BE_DONE = "Looks Good.... so far";

    public static CocrdupcWsMiscStorage createDefaultValueInstance() {
        return new CocrdupcWsMiscStorage.builder()
                .wsCicsProcessngVars(
                        CocrdupcWsCicsProcessngVars
                                .createDefaultValueInstance())
                .cardNameCheck(StringUtils.repeat(' ', 50))
                .flgYesNoCheck(StringUtils.repeat(' ', 1))
                .cicsOutputEditVars(
                        CocrdupcCicsOutputEditVars.createDefaultValueInstance())
                .wsCardRid(CocrdupcWsCardRid.createDefaultValueInstance())
                .wsFileErrorMessage(
                        CocrdupcWsFileErrorMessage.createDefaultValueInstance())
                .build();
    }

    public void set(String source) {
        source = StringUtils.truncate(StringUtils.rightPad(source, 895), 895);
        getWsCicsProcessngVars().set(source.substring(0, 16));
        setWsInputFlag(source.substring(16, 17));
        setWsEditAcctFlag(source.substring(17, 18));
        setWsEditCardFlag(source.substring(18, 19));
        setWsEditCardnameFlag(source.substring(19, 20));
        setWsEditCardstatusFlag(source.substring(20, 21));
        setWsEditCardexpmonFlag(source.substring(21, 22));
        setWsEditCardexpyearFlag(source.substring(22, 23));
        setWsReturnFlag(source.substring(23, 24));
        setWsPfkFlag(source.substring(24, 25));
        setCardNameCheck(source.substring(25, 75));
        setFlgYesNoCheck(source.substring(75, 76));
        setCardMonthCheck(source.substring(76, 78));
        setCardYearCheck(source.substring(78, 82));
        getCicsOutputEditVars().set(source.substring(82, 173));
        getWsCardRid().set(source.substring(173, 200));
        getWsFileErrorMessage().set(source.substring(200, 280));
        setWsLongMsg(source.substring(280, 780));
        setWsInfoMsg(source.substring(780, 820));
        setWsReturnMsg(source.substring(820, 895));
    }

    public String get() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsCicsProcessngVars().get());
        sb.append(getWsInputFlag());
        sb.append(getWsEditAcctFlag());
        sb.append(getWsEditCardFlag());
        sb.append(getWsEditCardnameFlag());
        sb.append(getWsEditCardstatusFlag());
        sb.append(getWsEditCardexpmonFlag());
        sb.append(getWsEditCardexpyearFlag());
        sb.append(getWsReturnFlag());
        sb.append(getWsPfkFlag());
        sb.append(getCardNameCheck());
        sb.append(getFlgYesNoCheck());
        sb.append(getCardMonthCheck());
        sb.append(getCardYearCheck());
        sb.append(getCicsOutputEditVars().get());
        sb.append(getWsCardRid().get());
        sb.append(getWsFileErrorMessage().get());
        sb.append(getWsLongMsg());
        sb.append(getWsInfoMsg());
        sb.append(getWsReturnMsg());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getWsCicsProcessngVars().toString());
        sb.append(getWsInputFlag());
        sb.append(getWsEditAcctFlag());
        sb.append(getWsEditCardFlag());
        sb.append(getWsEditCardnameFlag());
        sb.append(getWsEditCardstatusFlag());
        sb.append(getWsEditCardexpmonFlag());
        sb.append(getWsEditCardexpyearFlag());
        sb.append(getWsReturnFlag());
        sb.append(getWsPfkFlag());
        sb.append(getCardNameCheck());
        sb.append(getFlgYesNoCheck());
        sb.append(getCardMonthCheck());
        sb.append(getCardYearCheck());
        sb.append(getCicsOutputEditVars().toString());
        sb.append(getWsCardRid().toString());
        sb.append(getWsFileErrorMessage().toString());
        sb.append(getWsLongMsg());
        sb.append(getWsInfoMsg());
        sb.append(getWsReturnMsg());
        return sb.toString();
    }

    public void setWsInputFlag(String source) {
        wsInputFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsEditAcctFlag(String source) {
        wsEditAcctFlag = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsEditCardFlag(String source) {
        wsEditCardFlag = StringUtils.truncate(StringUtils.rightPad(source, 1),
                1);
    }

    public void setWsEditCardnameFlag(String source) {
        wsEditCardnameFlag = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setWsEditCardstatusFlag(String source) {
        wsEditCardstatusFlag = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setWsEditCardexpmonFlag(String source) {
        wsEditCardexpmonFlag = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setWsEditCardexpyearFlag(String source) {
        wsEditCardexpyearFlag = StringUtils.truncate(
                StringUtils.rightPad(source, 1), 1);
    }

    public void setWsReturnFlag(String source) {
        wsReturnFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setWsPfkFlag(String source) {
        wsPfkFlag = StringUtils.truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setCardNameCheck(String source) {
        cardNameCheck = StringUtils.truncate(StringUtils.rightPad(source, 50),
                50);
    }

    public void setFlgYesNoCheck(String source) {
        flgYesNoCheck = StringUtils
                .truncate(StringUtils.rightPad(source, 1), 1);
    }

    public void setCardMonthCheck(String source) {
        cardMonthCheck = StringUtils.truncate(StringUtils.rightPad(source, 2),
                2);
    }

    public int getCardMonthCheckN() {
        try {
            return CobStream.convZonedStringToInt(getCardMonthCheck(), 2);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setCardMonthCheckN(int source) {
        setCardMonthCheck(CobStream.convZonedIntToString(source, 2));
    }

    public void setCardYearCheck(String source) {
        cardYearCheck = StringUtils
                .truncate(StringUtils.rightPad(source, 4), 4);
    }

    public int getCardYearCheckN() {
        try {
            return CobStream.convZonedStringToInt(getCardYearCheck(), 4);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            return 0;
        }
    }

    public void setCardYearCheckN(int source) {
        setCardYearCheck(CobStream.convZonedIntToString(source, 4));
    }

    public void setWsLongMsg(String source) {
        wsLongMsg = StringUtils
                .truncate(StringUtils.rightPad(source, 500), 500);
    }

    public void setWsInfoMsg(String source) {
        wsInfoMsg = StringUtils.truncate(StringUtils.rightPad(source, 40), 40);
    }

    public void setWsReturnMsg(String source) {
        wsReturnMsg = StringUtils
                .truncate(StringUtils.rightPad(source, 75), 75);
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcWsCicsProcessngVars {
        // [T-Up#INFO][COCRDUPC.cbl:41] WS-RESP-CD (level: 7)
        private @Getter @Setter @Builder.Default int wsRespCd = 0;
        // [T-Up#INFO][COCRDUPC.cbl:43] WS-REAS-CD (level: 7)
        private @Getter @Setter @Builder.Default int wsReasCd = 0;
        // [T-Up#INFO][COCRDUPC.cbl:45] WS-TRANID (level: 7)
        private @Getter @Builder.Default String wsTranid = StringUtils.repeat(
                ' ', 4);
        // [T-Up#INFO][COCRDUPC.cbl:47] WS-UCTRANS (level: 7)
        private @Getter @Builder.Default String wsUctrans = StringUtils.repeat(
                ' ', 4);

        public static CocrdupcWsCicsProcessngVars createDefaultValueInstance() {
            return new CocrdupcWsCicsProcessngVars.builder().wsRespCd(0)
                    .wsReasCd(0).wsTranid(StringUtils.repeat(' ', 4))
                    .wsUctrans(StringUtils.repeat(' ', 4)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 16), 16);
            try {
                setWsRespCd(CobStream.convStringToInt(source.substring(0, 4)));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setWsRespCd(0);
            }
            try {
                setWsReasCd(CobStream.convStringToInt(source.substring(4, 8)));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setWsReasCd(0);
            }
            setWsTranid(source.substring(8, 12));
            setWsUctrans(source.substring(12, 16));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(CobStream.convIntToString(getWsRespCd()));
            sb.append(CobStream.convIntToString(getWsReasCd()));
            sb.append(getWsTranid());
            sb.append(getWsUctrans());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(getWsRespCd()));
            sb.append(String.valueOf(getWsReasCd()));
            sb.append(getWsTranid());
            sb.append(getWsUctrans());
            return sb.toString();
        }

        public void setWsTranid(String source) {
            wsTranid = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
        }

        public void setWsUctrans(String source) {
            wsUctrans = StringUtils
                    .truncate(StringUtils.rightPad(source, 4), 4);
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcCicsOutputEditVars {
        // [T-Up#INFO][COCRDUPC.cbl:104] CARD-ACCT-ID-X (level: 10)
        private @Getter @Builder.Default String cardAcctIdX = StringUtils
                .repeat(' ', 11);
        // [T-Up#INFO][COCRDUPC.cbl:107] CARD-CVV-CD-X (level: 10)
        private @Getter @Builder.Default String cardCvvCdX = StringUtils
                .repeat(' ', 3);
        // [T-Up#INFO][COCRDUPC.cbl:110] CARD-CARD-NUM-X (level: 10)
        private @Getter @Builder.Default String cardCardNumX = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDUPC.cbl:113] CARD-NAME-EMBOSSED-X (level: 10)
        private @Getter @Builder.Default String cardNameEmbossedX = StringUtils
                .repeat(' ', 50);
        // [T-Up#INFO][COCRDUPC.cbl:114] CARD-STATUS-X (level: 10)
        private @Getter @Builder.Default String cardStatusX = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCRDUPC.cbl:115] CARD-EXPIRAION-DATE-X (level: 10)
        private @Getter @Builder.Default String cardExpiraionDateX = StringUtils
                .repeat(' ', 10);

        public static CocrdupcCicsOutputEditVars createDefaultValueInstance() {
            return new CocrdupcCicsOutputEditVars.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 91), 91);
            setCardAcctIdX(source.substring(0, 11));
            setCardCvvCdX(source.substring(11, 14));
            setCardCardNumX(source.substring(14, 30));
            setCardNameEmbossedX(source.substring(30, 80));
            setCardStatusX(source.substring(80, 81));
            setCardExpiraionDateX(source.substring(81, 91));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardAcctIdX());
            sb.append(getCardCvvCdX());
            sb.append(getCardCardNumX());
            sb.append(getCardNameEmbossedX());
            sb.append(getCardStatusX());
            sb.append(getCardExpiraionDateX());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardAcctIdX());
            sb.append(getCardCvvCdX());
            sb.append(getCardCardNumX());
            sb.append(getCardNameEmbossedX());
            sb.append(getCardStatusX());
            sb.append(getCardExpiraionDateX());
            return sb.toString();
        }

        public void setCardAcctIdX(String source) {
            cardAcctIdX = StringUtils.truncate(
                    StringUtils.rightPad(source, 11), 11);
        }

        public long getCardAcctIdN() {
            try {
                return CobStream.convZonedStringToLong(getCardAcctIdX(), 11);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardAcctIdN(long source) {
            setCardAcctIdX(CobStream.convZonedLongToString(source, 11));
        }

        public void setCardCvvCdX(String source) {
            cardCvvCdX = StringUtils.truncate(StringUtils.rightPad(source, 3),
                    3);
        }

        public int getCardCvvCdN() {
            try {
                return CobStream.convZonedStringToInt(getCardCvvCdX(), 3);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardCvvCdN(int source) {
            setCardCvvCdX(CobStream.convZonedIntToString(source, 3));
        }

        public void setCardCardNumX(String source) {
            cardCardNumX = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public long getCardCardNumN() {
            try {
                return CobStream.convZonedStringToLong(getCardCardNumX(), 16);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardCardNumN(long source) {
            setCardCardNumX(CobStream.convZonedLongToString(source, 16));
        }

        public void setCardNameEmbossedX(String source) {
            cardNameEmbossedX = StringUtils.truncate(
                    StringUtils.rightPad(source, 50), 50);
        }

        public void setCardStatusX(String source) {
            cardStatusX = StringUtils.truncate(StringUtils.rightPad(source, 1),
                    1);
        }

        public void setCardExpiraionDateX(String source) {
            cardExpiraionDateX = StringUtils.truncate(
                    StringUtils.rightPad(source, 10), 10);
        }

        public _FILLER_REDEFINE_1 getFILLER_REDEFINE_1() {
            return _FILLER_REDEFINE_1.builder()
                    .cardExpiryYear(getCardExpiryYear())
                    .FILLER_REDEFINE_2(getFILLER_REDEFINE_2())
                    .cardExpiryMonth(getCardExpiryMonth())
                    .FILLER_REDEFINE_3(getFILLER_REDEFINE_3())
                    .cardExpiryDay(getCardExpiryDay()).build();
        }

        public void setFILLER_REDEFINE_1(String source) {
            setCardExpiryYear(source.substring(0, 4));
            setFILLER_REDEFINE_2(source.substring(4, 5));
            setCardExpiryMonth(source.substring(5, 7));
            setFILLER_REDEFINE_3(source.substring(7, 8));
            setCardExpiryDay(source.substring(8, 10));
        }

        public void setFILLER_REDEFINE_1(_FILLER_REDEFINE_1 source) {
            setFILLER_REDEFINE_1(source.get());
        }

        public String getCardExpiryYear() {
            return getCardExpiraionDateX().substring(0, 4);
        }

        public void setCardExpiryYear(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 0, 4));
        }

        public String getFILLER_REDEFINE_2() {
            return getCardExpiraionDateX().substring(4, 5);
        }

        public void setFILLER_REDEFINE_2(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 4, 5));
        }

        public String getCardExpiryMonth() {
            return getCardExpiraionDateX().substring(5, 7);
        }

        public void setCardExpiryMonth(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 5, 7));
        }

        public String getFILLER_REDEFINE_3() {
            return getCardExpiraionDateX().substring(7, 8);
        }

        public void setFILLER_REDEFINE_3(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 7, 8));
        }

        public String getCardExpiryDay() {
            return getCardExpiraionDateX().substring(8, 10);
        }

        public void setCardExpiryDay(String source) {
            setCardExpiraionDateX(StringUtils.overlay(getCardExpiraionDateX(),
                    source, 8, 10));
        }

        public long getCardExpiraionDateN() {
            try {
                return CobStream.convZonedStringToLong(getCardExpiraionDateX(),
                        10);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                return 0;
            }
        }

        public void setCardExpiraionDateN(long source) {
            setCardExpiraionDateX(CobStream.convZonedLongToString(source, 10));
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class _FILLER_REDEFINE_1 {
        // [T-Up#INFO][COCRDUPC.cbl:117] CARD-EXPIRY-YEAR (level: 20)
        private @Getter @Builder.Default String cardExpiryYear = StringUtils
                .repeat(' ', 4);
        // [T-Up#INFO][COCRDUPC.cbl:118] FILLER (level: 20)
        private @Getter @Builder.Default String FILLER_REDEFINE_2 = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCRDUPC.cbl:119] CARD-EXPIRY-MONTH (level: 20)
        private @Getter @Builder.Default String cardExpiryMonth = StringUtils
                .repeat(' ', 2);
        // [T-Up#INFO][COCRDUPC.cbl:120] FILLER (level: 20)
        private @Getter @Builder.Default String FILLER_REDEFINE_3 = StringUtils
                .repeat(' ', 1);
        // [T-Up#INFO][COCRDUPC.cbl:121] CARD-EXPIRY-DAY (level: 20)
        private @Getter @Builder.Default String cardExpiryDay = StringUtils
                .repeat(' ', 2);

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(cardExpiryYear);
            sb.append(FILLER_REDEFINE_2);
            sb.append(cardExpiryMonth);
            sb.append(FILLER_REDEFINE_3);
            sb.append(cardExpiryDay);
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getCardExpiryYear());
            sb.append(FILLER_REDEFINE_2);
            sb.append(getCardExpiryMonth());
            sb.append(FILLER_REDEFINE_3);
            sb.append(getCardExpiryDay());
            return sb.toString();
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcWsCardRid {
        // [T-Up#INFO][COCRDUPC.cbl:129] WS-CARD-RID-CARDNUM (level: 10)
        private @Getter @Builder.Default String wsCardRidCardnum = StringUtils
                .repeat(' ', 16);
        // [T-Up#INFO][COCRDUPC.cbl:130] WS-CARD-RID-ACCT-ID (level: 10)
        private @Getter @Setter long wsCardRidAcctId;

        public static CocrdupcWsCardRid createDefaultValueInstance() {
            return new CocrdupcWsCardRid.builder().build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 27), 27);
            setWsCardRidCardnum(source.substring(0, 16));
            try {
                setWsCardRidAcctId(CobStream.convZonedStringToLong(
                        source.substring(16, 27), 11));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setWsCardRidAcctId(0);
            }
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCardRidCardnum());
            sb.append(CobStream.convZonedLongToString(getWsCardRidAcctId(), 11));
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getWsCardRidCardnum());
            sb.append(PictureFormatter.intFormatWithoutSign(
                    getWsCardRidAcctId(), "00000000000"));
            return sb.toString();
        }

        public void setWsCardRidCardnum(String source) {
            wsCardRidCardnum = StringUtils.truncate(
                    StringUtils.rightPad(source, 16), 16);
        }

        public String getWsCardRidAcctIdX() {
            return CobStream.convZonedLongToString(getWsCardRidAcctId(), 11);
        }

        public void setWsCardRidAcctIdX(String source) {
            try {
                setWsCardRidAcctId(CobStream.convZonedStringToLong(source, 11));
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
                setWsCardRidAcctId(0);
            }
        }
    }

    public static @AllArgsConstructor @NoArgsConstructor @Builder(builderClassName = "builder") class CocrdupcWsFileErrorMessage {
        // [T-Up#INFO][COCRDUPC.cbl:134] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_1 = "File Error: ";
        // [T-Up#INFO][COCRDUPC.cbl:136] ERROR-OPNAME (level: 10)
        private @Getter @Builder.Default String errorOpname = StringUtils
                .repeat(' ', 8);
        // [T-Up#INFO][COCRDUPC.cbl:138] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_2 = " on ";
        // [T-Up#INFO][COCRDUPC.cbl:140] ERROR-FILE (level: 10)
        private @Getter @Builder.Default String errorFile = StringUtils.repeat(
                ' ', 9);
        // [T-Up#INFO][COCRDUPC.cbl:142] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_3 = " returned RESP ";
        // [T-Up#INFO][COCRDUPC.cbl:145] ERROR-RESP (level: 10)
        private @Getter @Builder.Default String errorResp = StringUtils.repeat(
                ' ', 10);
        // [T-Up#INFO][COCRDUPC.cbl:147] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_4 = ",RESP2 ";
        // [T-Up#INFO][COCRDUPC.cbl:149] ERROR-RESP2 (level: 10)
        private @Getter @Builder.Default String errorResp2 = StringUtils
                .repeat(' ', 10);
        // [T-Up#INFO][COCRDUPC.cbl:151] FILLER (level: 10)
        private @Getter @Builder.Default String FILLER_5 = StringUtils.repeat(
                ' ', 5);

        public static CocrdupcWsFileErrorMessage createDefaultValueInstance() {
            return new CocrdupcWsFileErrorMessage.builder()
                    .errorOpname(StringUtils.repeat(' ', 8))
                    .errorFile(StringUtils.repeat(' ', 9))
                    .errorResp(StringUtils.repeat(' ', 10))
                    .errorResp2(StringUtils.repeat(' ', 10)).build();
        }

        public void set(String source) {
            source = StringUtils.truncate(StringUtils.rightPad(source, 80), 80);
            setFILLER_1(source.substring(0, 12));
            setErrorOpname(source.substring(12, 20));
            setFILLER_2(source.substring(20, 24));
            setErrorFile(source.substring(24, 33));
            setFILLER_3(source.substring(33, 48));
            setErrorResp(source.substring(48, 58));
            setFILLER_4(source.substring(58, 65));
            setErrorResp2(source.substring(65, 75));
            setFILLER_5(source.substring(75, 80));
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(getFILLER_1());
            sb.append(getErrorOpname());
            sb.append(getFILLER_2());
            sb.append(getErrorFile());
            sb.append(getFILLER_3());
            sb.append(getErrorResp());
            sb.append(getFILLER_4());
            sb.append(getErrorResp2());
            sb.append(getFILLER_5());
            return sb.toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getFILLER_1());
            sb.append(getErrorOpname());
            sb.append(getFILLER_2());
            sb.append(getErrorFile());
            sb.append(getFILLER_3());
            sb.append(getErrorResp());
            sb.append(getFILLER_4());
            sb.append(getErrorResp2());
            sb.append(getFILLER_5());
            return sb.toString();
        }

        public void setFILLER_1(String source) {
            FILLER_1 = StringUtils.truncate(StringUtils.rightPad(source, 12),
                    12);
        }

        public void setErrorOpname(String source) {
            errorOpname = StringUtils.truncate(StringUtils.rightPad(source, 8),
                    8);
        }

        public void setFILLER_2(String source) {
            FILLER_2 = StringUtils.truncate(StringUtils.rightPad(source, 4), 4);
        }

        public void setErrorFile(String source) {
            errorFile = StringUtils
                    .truncate(StringUtils.rightPad(source, 9), 9);
        }

        public void setFILLER_3(String source) {
            FILLER_3 = StringUtils.truncate(StringUtils.rightPad(source, 15),
                    15);
        }

        public void setErrorResp(String source) {
            errorResp = StringUtils.truncate(StringUtils.rightPad(source, 10),
                    10);
        }

        public void setFILLER_4(String source) {
            FILLER_4 = StringUtils.truncate(StringUtils.rightPad(source, 7), 7);
        }

        public void setErrorResp2(String source) {
            errorResp2 = StringUtils.truncate(StringUtils.rightPad(source, 10),
                    10);
        }

        public void setFILLER_5(String source) {
            FILLER_5 = StringUtils.truncate(StringUtils.rightPad(source, 5), 5);
        }
    }
}