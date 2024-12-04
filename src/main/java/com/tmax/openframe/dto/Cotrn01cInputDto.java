package com.tmax.openframe.dto;

import com.tmax.openframe.variable.group.*;
import com.tmax.openframe.variable.group.Cotrn1ai;
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
public class Cotrn01cInputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  @JsonProperty("COTRN1AI")
  private Cotrn1ai cotrn1ai;
  private Cotrn01cDfhcommarea dfhcommarea;
}