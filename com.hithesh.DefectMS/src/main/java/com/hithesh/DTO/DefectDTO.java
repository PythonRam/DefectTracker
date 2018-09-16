package com.hithesh.DTO;

public class DefectDTO {
	private Integer defectId;

	public Integer getDefectId() {
		return defectId;
	}
	public void setDefectId(Integer defectId) {
		this.defectId = defectId;
	}
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
	public DefectDTO(String defectCategory, String desc, Integer priority, String status, String chgStatus) {
		super();
		this.defectCategory = defectCategory;
		this.desc = desc;
		this.priority = priority;
		this.status = status;
		this.chgStatus = chgStatus;
	}
	public DefectDTO(Integer defectId, String defectCategory, String desc, Integer priority, String status,
			String chgStatus) {
		super();
		this.defectId = defectId;
		this.defectCategory = defectCategory;
		this.desc = desc;
		this.priority = priority;
		this.status = status;
		this.chgStatus = chgStatus;
	}
	public DefectDTO() {
		super();
	}
	
}
