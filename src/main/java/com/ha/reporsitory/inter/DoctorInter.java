package com.ha.reporsitory.inter;

import com.ha.entity.Doctor;
import com.ha.entity.Patient;

public interface DoctorInter {

  public void addDoctor(Doctor doctor);
	public String viewPatientMedicalHistory(int id);

	public Doctor findDocterbyId(int id);

	public void addPrescriptions(int id , String prescription);

}
