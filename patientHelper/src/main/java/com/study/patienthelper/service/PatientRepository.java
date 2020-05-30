package com.study.patienthelper.service;

import java.util.List;

import com.study.patienthelper.model.PatientDetail;

public interface PatientRepository {
	public void savePatientDetail(PatientDetail patientDetail);
	
	public List<PatientDetail> getPatientDetail(int patientId);
}
