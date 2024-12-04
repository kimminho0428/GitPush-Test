package com.tmax.openframe.mapper;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.variable.group.AccountRecord;
import com.tmax.openframe.variable.group.CardXrefRecord;
import com.tmax.openframe.variable.group.Cbact04cAcctfileStatus;
import com.tmax.openframe.variable.group.Cbact04cDiscgrpStatus;
import com.tmax.openframe.variable.group.Cbact04cFdAcctfileRec;
import com.tmax.openframe.variable.group.Cbact04cFdDiscgrpRec;
import com.tmax.openframe.variable.group.Cbact04cFdTranCatBalRecord;
import com.tmax.openframe.variable.group.Cbact04cFdTranfileRec;
import com.tmax.openframe.variable.group.Cbact04cFdXreffileRec;
import com.tmax.openframe.variable.group.Cbact04cIoStatus;
import com.tmax.openframe.variable.group.Cbact04cIoStatus04;
import com.tmax.openframe.variable.group.Cbact04cTcatbalfStatus;
import com.tmax.openframe.variable.group.Cbact04cTranfileStatus;
import com.tmax.openframe.variable.group.Cbact04cXreffileStatus;
import com.tmax.openframe.variable.group.DisGroupRecord;
import com.tmax.openframe.variable.group.TranCatBalRecord;
import com.tmax.openframe.variable.group.TranRecord;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cbact04cMapperInterface {
    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cTranfileStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus}</li>
     * </ul>
     */
    class Cbact04cTranfileStatusToCbact04cIoStatus {
        public static void set(Cbact04cTranfileStatus source,
                Cbact04cIoStatus target) {
            target.setIoStat1(source.getTranfileStat1());
            target.setIoStat2(source.getTranfileStat2());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cFdTranCatBalRecord}</li>
     * <li>target class: {@link TranCatBalRecord}</li>
     * </ul>
     */
    class Cbact04cFdTranCatBalRecordToTranCatBalRecord {
        public static void set(Cbact04cFdTranCatBalRecord source,
                TranCatBalRecord target) {
            target.getTranCatKey().setTrancatAcctId(
                    source.getFdTranCatKey().getFdTrancatAcctId());
            target.getTranCatKey().setTrancatTypeCd(
                    source.getFdTranCatKey().getFdTrancatTypeCd());
            target.getTranCatKey().setTrancatCd(
                    source.getFdTranCatKey().getFdTrancatCd());
            target.setTranCatBal(CobStream.convZonedStringToBigDecimal(source
                    .getFdFdTranCatData().substring(0, 11), 11, 2));
            target.setFILLER_1(source.getFdFdTranCatData().substring(11, 33));
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link AccountRecord}</li>
     * <li>target class: {@link Cbact04cFdAcctfileRec}</li>
     * </ul>
     */
    class AccountRecordToCbact04cFdAcctfileRec {
        public static void set(AccountRecord source,
                Cbact04cFdAcctfileRec target) {
            target.setFdAcctId(source.getAcctId());
            target.setFdAcctActiveStatus(source.getAcctActiveStatus());
            target.setFdAcctCurrBal(source.getAcctCurrBal());
            target.setFdAcctCreditLimit(source.getAcctCreditLimit());
            target.setFdAcctCashCreditLimit(source.getAcctCashCreditLimit());
            target.setFdAcctOpenDate(source.getAcctOpenDate());
            target.setFdAcctExpiraionDate(source.getAcctExpiraionDate());
            target.setFdAcctReissueDate(source.getAcctReissueDate());
            target.setFdAcctCurrCycCredit(source.getAcctCurrCycCredit());
            target.setFdAcctCurrCycDebit(source.getAcctCurrCycDebit());
            target.setFdAcctAddrZip(source.getAcctAddrZip());
            target.setFdAcctGroupId(source.getAcctGroupId());
            target.setFILLER_1(source.getFILLER_1());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cFdDiscgrpRec}</li>
     * <li>target class: {@link DisGroupRecord}</li>
     * </ul>
     */
    class Cbact04cFdDiscgrpRecToDisGroupRecord {
        public static void set(Cbact04cFdDiscgrpRec source,
                DisGroupRecord target) {
            target.getDisGroupKey().setDisAcctGroupId(
                    source.getFdDiscgrpKey().getFdDisAcctGroupId());
            target.getDisGroupKey().setDisTranTypeCd(
                    source.getFdDiscgrpKey().getFdDisTranTypeCd());
            target.getDisGroupKey().setDisTranCatCd(
                    source.getFdDiscgrpKey().getFdDisTranCatCd());
            target.setDisIntRate(CobStream.convZonedStringToBigDecimal(source
                    .getFdDiscgrpData().substring(0, 6), 6, 2));
            target.setFILLER_1(source.getFdDiscgrpData().substring(6, 34));
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cDiscgrpStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus}</li>
     * </ul>
     */
    class Cbact04cDiscgrpStatusToCbact04cIoStatus {
        public static void set(Cbact04cDiscgrpStatus source,
                Cbact04cIoStatus target) {
            target.setIoStat1(source.getDiscgrpStat1());
            target.setIoStat2(source.getDiscgrpStat2());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link TranRecord}</li>
     * <li>target class: {@link Cbact04cFdTranfileRec}</li>
     * </ul>
     */
    class TranRecordToCbact04cFdTranfileRec {
        public static void set(TranRecord source, Cbact04cFdTranfileRec target) {
            target.setFdTransId(source.getTranId());
            target.setFdAcctData(source.getTranTypeCd()
                    + CobStream.convZonedIntToString(source.getTranCatCd(), 4)
                    + source.getTranSource()
                    + source.getTranDesc()
                    + CobStream.convZonedBigDecimalToString(
                            source.getTranAmt(), 11, 2)
                    + CobStream.convZonedIntToString(
                            source.getTranMerchantId(), 9)
                    + source.getTranMerchantName()
                    + source.getTranMerchantCity()
                    + source.getTranMerchantZip() + source.getTranCardNum()
                    + source.getTranOrigTs() + source.getTranProcTs()
                    + source.getFILLER_1());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cAcctfileStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus}</li>
     * </ul>
     */
    class Cbact04cAcctfileStatusToCbact04cIoStatus {
        public static void set(Cbact04cAcctfileStatus source,
                Cbact04cIoStatus target) {
            target.setIoStat1(source.getAcctfileStat1());
            target.setIoStat2(source.getAcctfileStat2());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cFdXreffileRec}</li>
     * <li>target class: {@link CardXrefRecord}</li>
     * </ul>
     */
    class Cbact04cFdXreffileRecToCardXrefRecord {
        public static void set(Cbact04cFdXreffileRec source,
                CardXrefRecord target) {
            target.setXrefCardNum(source.getFdXrefCardNum());
            target.setXrefCustId(source.getFdXrefCustNum());
            target.setXrefAcctId(source.getFdXrefAcctId());
            target.setFILLER_1(source.getFdXrefFiller());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cFdAcctfileRec}</li>
     * <li>target class: {@link AccountRecord}</li>
     * </ul>
     */
    class Cbact04cFdAcctfileRecToAccountRecord {
        public static void set(Cbact04cFdAcctfileRec source,
                AccountRecord target) {
            target.setAcctId(source.getFdAcctId());
            target.setAcctActiveStatus(source.getFdAcctActiveStatus());
            target.setAcctCurrBal(source.getFdAcctCurrBal());
            target.setAcctCreditLimit(source.getFdAcctCreditLimit());
            target.setAcctCashCreditLimit(source.getFdAcctCashCreditLimit());
            target.setAcctOpenDate(source.getFdAcctOpenDate());
            target.setAcctExpiraionDate(source.getFdAcctExpiraionDate());
            target.setAcctReissueDate(source.getFdAcctReissueDate());
            target.setAcctCurrCycCredit(source.getFdAcctCurrCycCredit());
            target.setAcctCurrCycDebit(source.getFdAcctCurrCycDebit());
            target.setAcctAddrZip(source.getFdAcctAddrZip());
            target.setAcctGroupId(source.getFdAcctGroupId());
            target.setFILLER_1(source.getFILLER_1());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cIoStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus04}</li>
     * </ul>
     */
    class Cbact04cIoStatusToCbact04cIoStatus04 {
        public static void set(Cbact04cIoStatus source,
                Cbact04cIoStatus04 target) {
            target.setIoStatus0401(CobStream.convZonedStringToInt(
                    source.getIoStat1(), 1));
            target.setIoStatus0403(CobStream.convZonedStringToInt(
                    source.getIoStat2(), 3));
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cTcatbalfStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus}</li>
     * </ul>
     */
    class Cbact04cTcatbalfStatusToCbact04cIoStatus {
        public static void set(Cbact04cTcatbalfStatus source,
                Cbact04cIoStatus target) {
            target.setIoStat1(source.getTcatbalfStat1());
            target.setIoStat2(source.getTcatbalfStat2());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact04cXreffileStatus}</li>
     * <li>target class: {@link Cbact04cIoStatus}</li>
     * </ul>
     */
    class Cbact04cXreffileStatusToCbact04cIoStatus {
        public static void set(Cbact04cXreffileStatus source,
                Cbact04cIoStatus target) {
            target.setIoStat1(source.getXreffileStat1());
            target.setIoStat2(source.getXreffileStat2());
        }
    }
}