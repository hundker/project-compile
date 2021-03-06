package com.abeldevelop.compile.api.resources;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description="Identified of project")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProjectData {

	@ApiModelProperty(notes="Group of the proyect", example="com.abeldevelop.compile", required = true, position = 0)
	@NotNull(message = "group can not be null")
	@NotEmpty(message = "group can not be empty")
	private String group;
	
	@ApiModelProperty(notes="Name of the proyect", example="project-compile", required = true, position = 1)
	@NotNull(message = "name can not be null")
	@NotEmpty(message = "name can not be empty")
	private String name;
	
	@ApiModelProperty(notes="Version of the proyect", example="1.0.0", required = true, position = 2)
	@NotNull(message = "version can not be null")
	@NotEmpty(message = "version can not be empty")
	private String version;
	
}
