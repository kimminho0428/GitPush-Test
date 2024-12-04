package com.tmax.openframe;

import static com.tmax.openframe.variable.Cbact03cVariableContainer.*;
import com.tmax.openframe.file.*;
import com.tmax.openframe.mapper.Cbact03cMapperInterface;
import com.tmax.openframe.runtime.cobol.CobStringUtils;
import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.runtime.flow.ControlManager;
import com.tmax.openframe.variable.Cbact03cVariableContainer;
import com.tmax.openframe.variable.group.Cbact03cFdXreffileRec;
import java.math.*;
import java.util.*;
import java.util.function.Consumer;
import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Java class for defining logics of COBOL program</p>
 * <ul>
 * <li>The name of COBOL program: CBACT03C.cbl</li>
 * <li>Variable container class: {@link Cbact03cVariableContainer}</li>
 * <li>The list of files used in the program</li>
 * <ul>
 * <li>XREFFILE-FILE: FD class {@code ->} {@link Cbact03cFdXreffileFile}, record class {@code -> } {@link Cbact03cFdXreffileRec}</li>
 * </ul>
 * </ul>
 */
@Service
@RequiredArgsConstructor
@Transactional
@Primary
public class Cbact03c {
    // *
    /** 
     * <p>Class that manages an execution flow of the program</p>
     */
    protected final ControlManager controlManager;
    Consumer<OpenFrameContext> unnamedSentence = this::unnamedSentence;
    Consumer<OpenFrameContext> _1000XreffileGetNext = this::_1000XreffileGetNext;
    Consumer<OpenFrameContext> _0000XreffileOpen = this::_0000XreffileOpen;
    Consumer<OpenFrameContext> _9000XreffileClose = this::_9000XreffileClose;
    Consumer<OpenFrameContext> _9999AbendProgram = this::_9999AbendProgram;
    Consumer<OpenFrameContext> _9910DisplayIoStatus = this::_9910DisplayIoStatus;
    /** 
     * <p>Execution flow of COBOL program that defined in the procedure division</p>
     */
    ArrayList<Consumer> methodList = new ArrayList<>();
    {
        methodList.add(unnamedSentence);
        methodList.add(_1000XreffileGetNext);
        methodList.add(_0000XreffileOpen);
        methodList.add(_9000XreffileClose);
        methodList.add(_9999AbendProgram);
        methodList.add(_9910DisplayIoStatus);
    }
    @Autowired
    private Cbact03cFileOpXreffileFile fdXreffileFile;

    /** 
     * <p>Method for executing a program logic that defined in the procedure division</p>
     * @param generalContext context that is necessary for executing program
     * @return return value of program
     */
    public int run(Map<String, Object> generalContext) {
        OpenFrameContext context = new OpenFrameContext(generalContext,
                methodList);
        if (context.getProgramVariableContainer("Cbact03c") == null) {
            Cbact03cVariableContainer container = new Cbact03cVariableContainer();
            context.setProgramVariableContainer("Cbact03c", container);
        }
        controlManager.run(context);
        return context.getReturnValue();
    }

    // ******************************************************************
    // * Program     : CBACT03C.CBL
    // * Application : CardDemo
    // * Type        : BATCH COBOL Program
    // * Function    : Read and print account cross reference data file.
    // ******************************************************************
    // * Copyright Amazon.com, Inc. or its affiliates.
    // * All Rights Reserved.
    // *
    // * Licensed under the Apache License, Version 2.0 (the "License").
    // * You may not use this file except in compliance with the License.
    // * You may obtain a copy of the License at
    // *
    // *    http://www.apache.org/licenses/LICENSE-2.0
    // *
    // * Unless required by applicable law or agreed to in writing,
    // * software distributed under the License is distributed on an
    // * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
    // * either express or implied. See the License for the specific
    // * language governing permissions and limitations under the License
    // ******************************************************************
    // *****************************************************************

    void unnamedSentence(OpenFrameContext context) {
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        // [T-Up#INFO][CBACT03C.cbl:71] DISPLAY statement
        System.out.println("START OF EXECUTION OF PROGRAM CBACT03C");
        // [T-Up#INFO][CBACT03C.cbl:72] PERFORM statement
        controlManager.run(context, _0000XreffileOpen);
        if (controlManager.isTerminate(context)) {
            return;
        }
        // [T-Up#INFO][CBACT03C.cbl:74] PERFORM statement
        while (!(CobStringUtils.compare(container.getEndOfFile(), "Y") == 0)) {
            // [T-Up#INFO][CBACT03C.cbl:75] IF statement
            if (CobStringUtils.compare(container.getEndOfFile(), "N") == 0) {
                // [T-Up#INFO][CBACT03C.cbl:76] PERFORM statement
                controlManager.run(context, _1000XreffileGetNext);
                if (controlManager.isTerminate(context)) {
                    return;
                }
                // [T-Up#INFO][CBACT03C.cbl:77] IF statement
                if (CobStringUtils.compare(container.getEndOfFile(), "N") == 0) {
                    // [T-Up#INFO][CBACT03C.cbl:78] DISPLAY statement
                    System.out.println(container.getCardXrefRecord());
                }
            }
        }
        // [T-Up#INFO][CBACT03C.cbl:83] PERFORM statement
        controlManager.run(context, _9000XreffileClose);
        if (controlManager.isTerminate(context)) {
            return;
        }
        // [T-Up#INFO][CBACT03C.cbl:85] DISPLAY statement
        System.out.println("END OF EXECUTION OF PROGRAM CBACT03C");
        // [T-Up#INFO][CBACT03C.cbl:87] GOBACK statement
        context.setReturnFlag(true);
        return;
    }

    // *****************************************************************
    // * I/O ROUTINES TO ACCESS A KSDS, VSAM DATA SET...               *
    // *****************************************************************

    /** 
     * <p>[T-Up#INFO][CBACT03C.cbl:92] 1000-XREFFILE-GET-NEXT Paragraph</p>
     */
    void _1000XreffileGetNext(OpenFrameContext context) {
        Cbact03cFdXreffileRec tempCbact03cFdXreffileRec1;
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        tempCbact03cFdXreffileRec1 = fdXreffileFile.readNext(context);
        if (tempCbact03cFdXreffileRec1 != null) {
            container.setFdXreffileRec(tempCbact03cFdXreffileRec1);
            Cbact03cMapperInterface.Cbact03cFdXreffileRecToCardXrefRecord
                    .set(container.getFdXreffileRec(),
                            container.getCardXrefRecord());
        }
        // [T-Up#INFO][CBACT03C.cbl:94] IF statement
        if (CobStringUtils.compare(container.getXreffileStatus().get(), "00") == 0) {
            // [T-Up#INFO][CBACT03C.cbl:95] MOVE statement
            container.setApplResult(0);
            // [T-Up#INFO][CBACT03C.cbl:96] DISPLAY statement
            System.out.println(container.getCardXrefRecord());
        } else {
            // [T-Up#INFO][CBACT03C.cbl:98] IF statement
            if (CobStringUtils.compare(container.getXreffileStatus().get(),
                    "10") == 0) {
                // [T-Up#INFO][CBACT03C.cbl:99] MOVE statement
                container.setApplResult(16);
            } else {
                // [T-Up#INFO][CBACT03C.cbl:101] MOVE statement
                container.setApplResult(12);
            }
        }
        // [T-Up#INFO][CBACT03C.cbl:104] IF statement
        if (container.getApplResult() == APPL_AOK) {
            // [T-Up#INFO][CBACT03C.cbl:105] CONTINUE statement
        } else {
            // [T-Up#INFO][CBACT03C.cbl:107] IF statement
            if (container.getApplResult() == APPL_EOF) {
                // [T-Up#INFO][CBACT03C.cbl:108] MOVE statement
                container.setEndOfFile("Y");
            } else {
                // [T-Up#INFO][CBACT03C.cbl:110] DISPLAY statement
                System.out.println("ERROR READING XREFFILE");
                // [T-Up#INFO][CBACT03C.cbl:111] MOVE statement
                Cbact03cMapperInterface.Cbact03cXreffileStatusToCbact03cIoStatus
                        .set(container.getXreffileStatus(),
                                container.getIoStatus());
                // [T-Up#INFO][CBACT03C.cbl:112] PERFORM statement
                controlManager.run(context, _9910DisplayIoStatus);
                if (controlManager.isTerminate(context)) {
                    return;
                }
                // [T-Up#INFO][CBACT03C.cbl:113] PERFORM statement
                controlManager.run(context, _9999AbendProgram);
                if (controlManager.isTerminate(context)) {
                    return;
                }
            }
        }
        // [T-Up#INFO][CBACT03C.cbl:116] EXIT statement
    }

    // *---------------------------------------------------------------*

    /** 
     * <p>[T-Up#INFO][CBACT03C.cbl:118] 0000-XREFFILE-OPEN Paragraph</p>
     */
    void _0000XreffileOpen(OpenFrameContext context) {
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        // [T-Up#INFO][CBACT03C.cbl:119] MOVE statement
        container.setApplResult(8);
        // [T-Up#INFO][CBACT03C.cbl:120] OPEN statement
        fdXreffileFile.open(context);
        // [T-Up#INFO][CBACT03C.cbl:121] IF statement
        if (CobStringUtils.compare(container.getXreffileStatus().get(), "00") == 0) {
            // [T-Up#INFO][CBACT03C.cbl:122] MOVE statement
            container.setApplResult(0);
        } else {
            // [T-Up#INFO][CBACT03C.cbl:124] MOVE statement
            container.setApplResult(12);
        }
        // [T-Up#INFO][CBACT03C.cbl:126] IF statement
        if (container.getApplResult() == APPL_AOK) {
            // [T-Up#INFO][CBACT03C.cbl:127] CONTINUE statement
        } else {
            // [T-Up#INFO][CBACT03C.cbl:129] DISPLAY statement
            System.out.println("ERROR OPENING XREFFILE");
            // [T-Up#INFO][CBACT03C.cbl:130] MOVE statement
            Cbact03cMapperInterface.Cbact03cXreffileStatusToCbact03cIoStatus
                    .set(container.getXreffileStatus(), container.getIoStatus());
            // [T-Up#INFO][CBACT03C.cbl:131] PERFORM statement
            controlManager.run(context, _9910DisplayIoStatus);
            if (controlManager.isTerminate(context)) {
                return;
            }
            // [T-Up#INFO][CBACT03C.cbl:132] PERFORM statement
            controlManager.run(context, _9999AbendProgram);
            if (controlManager.isTerminate(context)) {
                return;
            }
        }
        // [T-Up#INFO][CBACT03C.cbl:134] EXIT statement
    }

    // *---------------------------------------------------------------*

    /** 
     * <p>[T-Up#INFO][CBACT03C.cbl:136] 9000-XREFFILE-CLOSE Paragraph</p>
     */
    void _9000XreffileClose(OpenFrameContext context) {
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        // [T-Up#INFO][CBACT03C.cbl:137] ADD statement
        container.setApplResult(8);
        // [T-Up#INFO][CBACT03C.cbl:138] CLOSE statement
        fdXreffileFile.close(context);
        // [T-Up#INFO][CBACT03C.cbl:139] IF statement
        if (CobStringUtils.compare(container.getXreffileStatus().get(), "00") == 0) {
            // [T-Up#INFO][CBACT03C.cbl:140] SUBTRACT statement
            container.setApplResult(container.getApplResult()
                    - container.getApplResult());
        } else {
            // [T-Up#INFO][CBACT03C.cbl:142] ADD statement
            container.setApplResult(12);
        }
        // [T-Up#INFO][CBACT03C.cbl:144] IF statement
        if (container.getApplResult() == APPL_AOK) {
            // [T-Up#INFO][CBACT03C.cbl:145] CONTINUE statement
        } else {
            // [T-Up#INFO][CBACT03C.cbl:147] DISPLAY statement
            System.out.println("ERROR CLOSING XREFFILE");
            // [T-Up#INFO][CBACT03C.cbl:148] MOVE statement
            Cbact03cMapperInterface.Cbact03cXreffileStatusToCbact03cIoStatus
                    .set(container.getXreffileStatus(), container.getIoStatus());
            // [T-Up#INFO][CBACT03C.cbl:149] PERFORM statement
            controlManager.run(context, _9910DisplayIoStatus);
            if (controlManager.isTerminate(context)) {
                return;
            }
            // [T-Up#INFO][CBACT03C.cbl:150] PERFORM statement
            controlManager.run(context, _9999AbendProgram);
            if (controlManager.isTerminate(context)) {
                return;
            }
        }
        // [T-Up#INFO][CBACT03C.cbl:152] EXIT statement
    }

    /** 
     * <p>[T-Up#INFO][CBACT03C.cbl:154] 9999-ABEND-PROGRAM Paragraph</p>
     */
    void _9999AbendProgram(OpenFrameContext context) {
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        // [T-Up#INFO][CBACT03C.cbl:155] DISPLAY statement
        System.out.println("ABENDING PROGRAM");
        // [T-Up#INFO][CBACT03C.cbl:156] MOVE statement
        container.setTiming(0);
        // [T-Up#INFO][CBACT03C.cbl:157] MOVE statement
        container.setAbcode(999);
        // [T-Up#INFO][CBACT03C.cbl:158] CALL statement
        throw new RuntimeException();
    }

    // *****************************************************************

    /** 
     * <p>[T-Up#INFO][CBACT03C.cbl:161] 9910-DISPLAY-IO-STATUS Paragraph</p>
     */
    void _9910DisplayIoStatus(OpenFrameContext context) {
        Cbact03cVariableContainer container = (Cbact03cVariableContainer) context
                .getProgramVariableContainer("Cbact03c");
        // [T-Up#INFO][CBACT03C.cbl:162] IF statement
        if (!StringUtils.isNumeric(container.getIoStatus().toString())
                || CobStringUtils.compare(container.getIoStatus().getIoStat1(),
                        "9") == 0) {
            // [T-Up#INFO][CBACT03C.cbl:164] MOVE statement
            container.getIoStatus04().set(
                    StringUtils.overlay(container.getIoStatus04().get(),
                            container.getIoStatus().getIoStat1(), 0, 1));
            // [T-Up#INFO][CBACT03C.cbl:165] MOVE statement
            container.setTwoBytesBinary(0);
            // [T-Up#INFO][CBACT03C.cbl:166] MOVE statement
            container.setTwoBytesRight(container.getIoStatus().getIoStat2());
            // [T-Up#INFO][CBACT03C.cbl:167] MOVE statement
            container.getIoStatus04().setIoStatus0403(
                    container.getTwoBytesBinary());
            // [T-Up#INFO][CBACT03C.cbl:168] DISPLAY statement
            System.out.print("FILE STATUS IS: NNNN");
            System.out.println(container.getIoStatus04());
        } else {
            // [T-Up#INFO][CBACT03C.cbl:170] MOVE statement
            container.getIoStatus04().set("0000");
            // [T-Up#INFO][CBACT03C.cbl:171] MOVE statement
            container.getIoStatus04().set(
                    StringUtils.overlay(container.getIoStatus04().get(),
                            container.getIoStatus().get(), 2, 4));
            // [T-Up#INFO][CBACT03C.cbl:172] DISPLAY statement
            System.out.print("FILE STATUS IS: NNNN");
            System.out.println(container.getIoStatus04());
        }
        // [T-Up#INFO][CBACT03C.cbl:174] EXIT statement
    }

    // *
    // * Ver: CardDemo_v1.0-15-g27d6c6f-68 Date: 2022-07-19 23:12:31 CDT
    // *
}