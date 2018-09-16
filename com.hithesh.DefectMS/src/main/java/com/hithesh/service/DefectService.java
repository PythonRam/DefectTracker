package com.hithesh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hithesh.DTO.DefectDTO;
import com.hithesh.entity.Defect;
import com.hithesh.repository.DefectRepository;

@Service
public class DefectService {

	@Autowired
	DefectRepository defectRepository;

	public List<DefectDTO> getAllDefects() {
		List<Defect> defects = defectRepository.findAll();
		List<DefectDTO> response = new ArrayList<DefectDTO>();
		for (Defect defect : defects) {
			response.add(new DefectDTO(defect.getDefectId(), defect.getCategory(), defect.getStatus(),
					defect.getPriority(), defect.getStatus(), defect.getChgstatus()));
		}
		return response;
	}

	public void closeDefect(Integer defectId) {
		Optional<Defect> opDefect = defectRepository.findById(defectId);
		if (opDefect.isPresent()) {
			Defect defect = opDefect.get();
			defect.setStatus("Closed");
			defect.setChgstatus("Closed Defect");
			defectRepository.saveAndFlush(defect);
		}
	}

	public Defect addDefect(DefectDTO defectForm) {
		Defect defect = new Defect(defectForm.getDefectCategory(), defectForm.getChgStatus(), defectForm.getDesc(),
				defectForm.getPriority(), defectForm.getStatus());
		defectRepository.saveAndFlush(defect);
		return defect;
	}

}
