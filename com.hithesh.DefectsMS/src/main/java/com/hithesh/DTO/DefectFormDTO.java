package com.hithesh.DTO;

public class DefectFormDTO {
	private String defectCategory;
	private String desc;
	private Integer priority;
	private String status;
	private String chgStatus;
	public String getDefectCategory() {
		return defectCategory;
	}
	public void setDefectCategory(String defectCategory) {
		this.defectCategory = defectCategory;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChgStatus() {
		return chgStatus;
	}
	public void setChgStatus(String chgStatus) {
		this.chgStatus = chgStatus;
	}
	public DefectFormDTO(String defectCategory, String desc, Integer priority, String status, String chgStatus) {
		super();
		this.defectCategory = defectCategory;
		this.desc = desc;
		this.priority = priority;
		this.status = status;
		this.chgStatus = chgStatus;
	}
	public DefectFormDTO() {
		super();
	}
	
}
