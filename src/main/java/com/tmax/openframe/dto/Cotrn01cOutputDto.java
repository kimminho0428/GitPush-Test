package com.tmax.openframe.dto;

import com.tmax.openframe.variable.Cotrn01cVariableContainer.Cotrn1ao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import com.tmax.openframe.online.context.domain.storage.SystemDtoAccessable;
import com.tmax.openframe.online.task.domain.dto.SystemDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cotrn01cOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("COTRN1AO")
  private Cotrn1ao cotrn1ao;
}