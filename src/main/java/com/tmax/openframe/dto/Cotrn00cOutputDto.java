package com.tmax.openframe.dto;

import com.tmax.openframe.variable.Cotrn00cVariableContainer.Cotrn0ao;

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
public class Cotrn00cOutputDto implements SystemDtoAccessable {
  private SystemDto systemDto = new SystemDto();
  private String pageName;
  @JsonProperty("COTRN0AO")
  private Cotrn0ao cotrn0ao;
}