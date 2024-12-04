package com.tmax.openframe.file;

import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileBaseOperation;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.variable.group.CodsSecUserData;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/03/20 15:15:17 KST</p>
 * <hr>
 * <p>Class that defines file I/O methods</p>
 * <ul>
 * <li>File description name: USRSEC-FILE</li>
 * <li>file record class: {@link CodsSecUserData}</li>
 * <li>key field: {@link CodsSecUserData#secUsrId}</li>
 * </ul>
 */
public abstract class CodsFileOpUsrsecFile implements
        FileBaseOperation<CodsSecUserData, String> {
    public CodsSecUserData readNext(OpenFrameContext context) {
        if (getFileStatus(context) == FileStatus.AT_END_CONDITION_SEQ_READ) {
            setFileStatus(context, FileStatus.ALREADY_AT_END_CONDITION);
            return null;
        } else {
            return readNextRecord(context);
        }
    }

    public void setFileStatus(OpenFrameContext context, FileStatus status) {
        context.setFileStatus("Cods", "UsrsecFile", status);
    }

    public FileStatus getFileStatus(OpenFrameContext context) {
        return context.getFileStatus("Cods", "UsrsecFile");
    }
}