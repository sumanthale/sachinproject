package com.ha.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "DoctorDetails99")
public class Doctor {
	@Id
	@Column(name = "DOCTOR_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Doctorid;
	@Column(name = "DOCTOR_NAME")
	private String Doctorname;
	@Column(name = "DOCTOR_DEPARTEMENT")
	private String Doctordepartement;
	@Column(name = "DOCTOR_PHONENUMBER")
	private String Doctorphnemumber;
	@Column(name = "DOCTOR_EMAIL")
	private String Doctoremail;
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	private Set<Patient> patient = new HashSet();

	public Doctor(String doctorname, String doctordepartement, String doctorphnemumber, String doctoremail) {
		super();
		Doctorname = doctorname;
		Doctordepartement = doctordepartement;
		Doctorphnemumber = doctorphnemumber;
		Doctoremail = doctoremail;
	}
public Doctor() {
	// TODO Auto-generated constructor stub
}
	public String getDoctorname() {
		return Doctorname;
	}

	public void setDoctorname(String doctorname) {
		Doctorname = doctorname;
	}

	public String getDoctordepartement() {
		return Doctordepartement;
	}

	public void setDoctordepartement(String doctordepartement) {
		Doctordepartement = doctordepartement;
	}

	public String getDoctorphnemumber() {
		return Doctorphnemumber;
	}

	public void setDoctorphnemumber(String doctorphnemumber) {
		Doctorphnemumber = doctorphnemumber;
	}

	public String getDoctoremail() {
		return Doctoremail;
	}

	public void setDoctoremail(String doctoremail) {
		Doctoremail = doctoremail;
	}

	public Set<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}

	public long getDoctorid() {
		return Doctorid;
	}

	public void setDoctorid(long doctorid) {
		Doctorid = doctorid;
	}

	@Override
	public String toString() {
		return "Doctor22 [Doctorid=" + Doctorid + ", Doctorname=" + Doctorname + ", Doctordepartement="
				+ Doctordepartement + ", Doctorphnemumber=" + Doctorphnemumber + ", Doctoremail=" + Doctoremail + "]";
	}

}
