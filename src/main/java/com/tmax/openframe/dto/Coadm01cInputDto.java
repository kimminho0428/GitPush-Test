package com.tmax.openframe.dto;

import com.tmax.openframe.variable.group.*;
import com.tmax.openframe.variable.group.Coadm1ai;
import com.tmax.openframe.online.task.domain.dto.SystemDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.tmax.openframe.online.context.domain.storage.SystemDtoAccessable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coadm01cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COADM1AI")
  private Coadm1ai coadm1ai;
  private Coadm01cDfhcommarea dfhcommarea;
}