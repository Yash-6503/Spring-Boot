package com.yw.service;

import org.springframework.data.domain.Page;

import com.yw.entities.Doctor;

public interface IDoctorService {
	public void showDataThroughPagination(int pageSize);
	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props);}
