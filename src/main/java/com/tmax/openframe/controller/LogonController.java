package com.tmax.openframe.controller;

import com.tmax.openframe.dto.LogoffRequest;
import com.tmax.openframe.dto.LogonRequest;
import com.tmax.openframe.dto.LogonResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2")
@Slf4j
public class LogonController {
  @CrossOrigin(origins = "*")
  @PostMapping("/{workstation}/logon")
  public ResponseEntity<LogonResponse> logon(@PathVariable String workstation, @RequestBody LogonRequest logonRequest) {
    LogonResponse logonResponse = LogonResponse.builder().pageName("transaction-page").build();

    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CAUP", "CREDIT CARD DEMO ACCOUNT UPDATE"));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CAVW", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CA00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CB00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CCDL", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CCLI", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CCUP", "CREDIT CARD UPDATE TRANSACTION"));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CC00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CDV1", "DEVELOPER TRANSACTION - 1"));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CM00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CR00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CT00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CT01", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CT02", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CU00", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CU01", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CU02", ""));
    logonResponse.getTransactionInfoList().add(new LogonResponse.TransactionInfo("CU03", ""));

    return new ResponseEntity<LogonResponse>(logonResponse, HttpStatus.OK);
  }

  @CrossOrigin(origins = "*")
  @PostMapping("/{workstation}/logoff")
  public ResponseEntity<Void> logoff(@PathVariable String workstation, @RequestBody LogoffRequest logoffRequest) {
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
