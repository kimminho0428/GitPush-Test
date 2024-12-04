package com.tmaxsoft.openframe.dataset.dao;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.cursor.Cursor;
import java.util.List;

import java.math.BigDecimal;
import org.apache.ibatis.executor.BatchResult;
import com.tmaxsoft.openframe.dataset.dto.AwsM2CarddemoDalyrejsDto;

@Mapper
public interface AwsM2CarddemoDalyrejsDao {
	@Results(id = "AwsM2CarddemoDalyrejsDto", value = {
		@Result(property = "seqId", column = "SEQ_ID"),
		@Result(property = "fdRejectRecord", column = "FD_REJECT_RECORD"),
		@Result(property = "fdValidationTrailer", column = "FD_VALIDATION_TRAILER")
	})
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readAllAsc();
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readAllDesc();
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId}")
	Cursor<AwsM2CarddemoDalyrejsDto> readEq(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readGt(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readGe(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readLt(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readLe(@Param("seqId") long seqId);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYREJS(SEQ_ID,FD_REJECT_RECORD,FD_VALIDATION_TRAILER) " +
			"VALUES(NEXTVAL('AWS_M2_CARDDEMO_DALYREJS_seq'),#{fdRejectRecord},#{fdValidationTrailer})")
	int write(@Param("fdRejectRecord") String fdRejectRecord, @Param("fdValidationTrailer") String fdValidationTrailer);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYREJS SET FD_REJECT_RECORD= #{fdRejectRecord},FD_VALIDATION_TRAILER= #{fdValidationTrailer} " +
			" WHERE SEQ_ID = #{seqId}")
	int rewrite(@Param("fdRejectRecord") String fdRejectRecord, @Param("fdValidationTrailer") String fdValidationTrailer, @Param("seqId") long seqId);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId}")
	int delete(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId}")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeDto(AwsM2CarddemoDalyrejsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYREJS(SEQ_ID,FD_REJECT_RECORD,FD_VALIDATION_TRAILER) " +
			"VALUES(NEXTVAL('AWS_M2_CARDDEMO_DALYREJS_seq'),#{fdRejectRecord},#{fdValidationTrailer})")
	int writeDto(AwsM2CarddemoDalyrejsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYREJS SET FD_REJECT_RECORD= #{fdRejectRecord},FD_VALIDATION_TRAILER= #{fdValidationTrailer} " +
			" WHERE SEQ_ID = #{seqId}")
	int rewriteDto(AwsM2CarddemoDalyrejsDto dto);
	
	@Update("UPDATE AWS_M2_CARDDEMO_DALYREJS SET FD_REJECT_RECORD= #{param2.fdRejectRecord},FD_VALIDATION_TRAILER= #{param2.fdValidationTrailer} " +
			" WHERE SEQ_ID = #{param1}")
	int rewriteDtoWithKey(long seqId, AwsM2CarddemoDalyrejsDto dto);
	
	@Delete("DELETE FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId}")
	int deleteDto(AwsM2CarddemoDalyrejsDto dto);
	
	@Insert("INSERT INTO AWS_M2_CARDDEMO_DALYREJS(SEQ_ID,FD_REJECT_RECORD,FD_VALIDATION_TRAILER) " +
			"VALUES(NEXTVAL('AWS_M2_CARDDEMO_DALYREJS_seq'),#{fdRejectRecord},#{fdValidationTrailer})")
	@SelectKey(statement = "SELECT CURRVAL('AWS_M2_CARDDEMO_DALYREJS_SEQ')", keyProperty = "seqId", before = false, resultType = int.class)
	int writeDtoReturnLastKey(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdate(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdate(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdate(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdate(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdate(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdateDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdateDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdateDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdateDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE WAIT 1")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdateDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdateNoWait(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdateNoWait(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdateNoWait(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdateNoWait(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdateNoWait(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE NOWAIT ")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdateNoWaitDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdateNoWaitDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdateNoWaitDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdateNoWaitDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE NOWAIT")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdateNoWaitDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdateInf(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdateInf(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdateInf(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdateInf(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdateInf(@Param("seqId") long seqId);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID = #{seqId} FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readEqForUpdateInfDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID > #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readGtForUpdateInfDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID >= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readGeForUpdateInfDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID < #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readLtForUpdateInfDto(AwsM2CarddemoDalyrejsDto dto);
	
	@ResultMap("AwsM2CarddemoDalyrejsDto")
	@Select("SELECT * FROM AWS_M2_CARDDEMO_DALYREJS " +
			" WHERE SEQ_ID <= #{seqId} ORDER BY SEQ_ID FOR UPDATE")
	Cursor<AwsM2CarddemoDalyrejsDto> readLeForUpdateInfDto(AwsM2CarddemoDalyrejsDto dto);
	
	@Flush
	List<BatchResult> flush();
	
}