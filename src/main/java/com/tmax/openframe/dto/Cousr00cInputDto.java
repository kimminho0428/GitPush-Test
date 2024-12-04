package com.tmax.openframe.dto;

import com.tmax.openframe.variable.group.*;
import com.tmax.openframe.variable.group.Cousr0ai;
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
public class Cousr00cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COUSR0AI")
  private Cousr0ai cousr0ai;
  private Cousr00cDfhcommarea dfhcommarea;
}