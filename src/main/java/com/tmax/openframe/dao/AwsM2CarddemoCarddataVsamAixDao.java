package com.tmaxsoft.openframe.dataset.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import com.tmaxsoft.openframe.dataset.dto.AwsM2CarddemoCarddataVsamKsdsDto;

@Mapper
public interface AwsM2CarddemoCarddataVsamAixDao {
	@Results(id = "Aix10", value = {
		@Result(property = "cardNum", column = "CARD_NUM"),
		@Result(property = "cardAcctId", column = "CARD_ACCT_ID"),
		@Result(property = "cardCvvCd", column = "CARD_CVV_CD"),
		@Result(property = "cardEmbossedName", column = "CARD_EMBOSSED_NAME"),
		@Result(property = "cardExpiraionDate", column = "CARD_EXPIRAION_DATE"),
		@Result(property = "cardActiveStatus", column = "CARD_ACTIVE_STATUS"),
		@Result(property = "filler", column = "FILLER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllAscAix10();
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readAllDescAix10();
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1Aix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1Aix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1Aix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1Aix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1Aix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWaitAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInfAix10(@Param("cardAcctId") long cardAcctId);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId}")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1DtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1DtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1DtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1DtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1DtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateNoWaitDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE CARD_ACCT_ID = #{cardAcctId} FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readEqByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) > ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGtByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) >= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readGeByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) < ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLtByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
	@ResultMap("Aix10")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_CARDDATA_VSAM_KSDS " +
			" WHERE (CARD_ACCT_ID) <= ( #{cardAcctId}) ORDER BY CARD_ACCT_ID DESC FOR UPDATE")
	Cursor<AwsM2CarddemoCarddataVsamKsdsDto> readLeByKey1ForUpdateInfDtoAix10(AwsM2CarddemoCarddataVsamKsdsDto dto);
	
}