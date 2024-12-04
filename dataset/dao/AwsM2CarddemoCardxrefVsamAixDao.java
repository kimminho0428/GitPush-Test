package com.tmaxsoft.openframe.dataset.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import com.tmaxsoft.openframe.dataset.dto.AwsM2CarddemoCardxrefVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCardxrefVsamAixDao {
	@Results(id = "Aix11", value = {
		@Result(property = "xrefCardNum", column = "XREF_CARD_NUM"),
		@Result(property = "xrefCustId", column = "XREF_CUST_ID"),
		@Result(property = "xrefAcctId", column = "XREF_ACCT_ID"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllAscAix11();
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readAllDescAix11();
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1Aix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1Aix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1Aix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1Aix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1Aix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWaitAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInfAix11(@Param("xrefAcctId") long xrefAcctId);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId}")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1DtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1DtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1DtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1DtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1DtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateNoWaitDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE XREF_ACCT_ID = #{xrefAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readEqByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) > ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGtByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) >= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readGeByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) < ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLtByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
	@ResultMap("Aix11")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDXREF_VSAM_KSDS " +
			" WHERE (XREF_ACCT_ID) <= ( #{xrefAcctId}) ORDER BY XREF_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCardxrefVsamKsdsDto> readLeByKey1ForUpdateInfDtoAix11(AwsM2CarddemoCardxrefVsamKsdsDto dto);
	
}