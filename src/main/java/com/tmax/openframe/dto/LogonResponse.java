
package com.tmax.openframe.dto;

import lombok.Getter;
import lombok.Builder;
import java.util.List;

@Getter
@Builder
public class LogonResponse {
  private String pageName;
  private List<TransactionInfo> transactionInfoList;

  @Getter
  class TransactionInfo {
    private String name;
    private String desc;
  }
}
