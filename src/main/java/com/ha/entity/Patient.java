package com.ha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ha.entity.Doctor;
@Entity
@Table (name="PatientDetails22")

public class Patient {
	
	@Id
	 @Column(name = "patient_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)

	
	int id;
	@Column(name = "patient_Name")
	String Name;
	@Column(name = "patient_Age")
	String Age;
	@Column(name = "pas_address")
	String address;
	@Column(name = "pas_pres")
	String presciption;
//	@Column(name = "pas_medical")
//	String medicalHistory;
	@Column(name = "pas_un")
	String UserName;
	@Column(name = "pas_pw")
	String password;
	@ManyToOne
	@JoinColumn(name = "DOCTOR_PATIENT")
	private Doctor doctor;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String name, String age, String address, String presciption, String userName, String password) {
		super();
		Name = name;
		Age = age;
		this.address = address;
		this.presciption = presciption;
		UserName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPresciption() {
		return presciption;
	}
	public void setPresciption(String presciption) {
		this.presciption = presciption;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", Name=" + Name + ", Age=" + Age + ", address=" + address + ", presciption="
				+ presciption + ", UserName=" + UserName + ", password=" + password + "]";
	}
}
