package com.tmax.openframe.file;

import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileBaseOperation;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.variable.Cbact04cVariableContainer;
import com.tmax.openframe.variable.group.Cbact04cFdTranCatBalRecord;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:10 KST</p>
 * <hr>
 * <p>Class that defines file I/O methods</p>
 * <ul>
 * <li>File description name: TCATBAL-FILE</li>
 * <li>file record class: {@link Cbact04cFdTranCatBalRecord}</li>
 * <li>key field: {@link Cbact04cFdTranCatBalRecord#fdTranCatKey}</li>
 * </ul>
 */
public abstract class Cbact04cFileOpTcatbalFile
        implements
        FileBaseOperation<Cbact04cFdTranCatBalRecord, Cbact04cFdTranCatBalRecord.Cbact04cFdTranCatKey> {
    public Cbact04cFdTranCatBalRecord readNext(OpenFrameContext context) {
        if (getFileStatus(context) == FileStatus.AT_END_CONDITION_SEQ_READ) {
            setFileStatus(context, FileStatus.ALREADY_AT_END_CONDITION);
            return null;
        } else {
            return readNextRecord(context);
        }
    }

    public void setFileStatus(OpenFrameContext context, FileStatus status) {
        Cbact04cVariableContainer container = (Cbact04cVariableContainer) context
                .getProgramVariableContainer("Cbact04c");
        container.getTcatbalfStatus().set(status.getValue());
        context.setFileStatus("Cbact04c", "TcatbalFile", status);
    }

    public FileStatus getFileStatus(OpenFrameContext context) {
        return context.getFileStatus("Cbact04c", "TcatbalFile");
    }
}
