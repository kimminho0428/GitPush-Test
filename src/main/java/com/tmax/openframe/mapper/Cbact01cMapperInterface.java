package com.tmax.openframe.mapper;

import com.tmax.openframe.runtime.cobol.CobStream;
import com.tmax.openframe.variable.group.AccountRecord;
import com.tmax.openframe.variable.group.Cbact01cAcctfileStatus;
import com.tmax.openframe.variable.group.Cbact01cFdAcctfileRec;
import com.tmax.openframe.variable.group.Cbact01cIoStatus;
import com.tmax.openframe.variable.group.Cbact01cIoStatus04;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:09 KST</p>
 * <hr>
 * <p>Mapper class for converting data between different classes</p>
 */
public interface Cbact01cMapperInterface {
    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact01cFdAcctfileRec}</li>
     * <li>target class: {@link AccountRecord}</li>
     * </ul>
     */
    class Cbact01cFdAcctfileRecToAccountRecord {
        public static void set(Cbact01cFdAcctfileRec source,
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
     * <li>source class: {@link Cbact01cAcctfileStatus}</li>
     * <li>target class: {@link Cbact01cIoStatus}</li>
     * </ul>
     */
    class Cbact01cAcctfileStatusToCbact01cIoStatus {
        public static void set(Cbact01cAcctfileStatus source,
                Cbact01cIoStatus target) {
            target.setIoStat1(source.getAcctfileStat1());
            target.setIoStat2(source.getAcctfileStat2());
        }
    }

    /** 
     * <p>Mapper class to convert data for COBOL group variable to COBOL group variable</p>
     * <ul>
     * <li>source class: {@link Cbact01cIoStatus}</li>
     * <li>target class: {@link Cbact01cIoStatus04}</li>
     * </ul>
     */
    class Cbact01cIoStatusToCbact01cIoStatus04 {
        public static void set(Cbact01cIoStatus source,
                Cbact01cIoStatus04 target) {
            target.setIoStatus0401(CobStream.convZonedStringToInt(
                    source.getIoStat1(), 1));
            target.setIoStatus0403(CobStream.convZonedStringToInt(
                    source.getIoStat2(), 3));
        }
    }
}
