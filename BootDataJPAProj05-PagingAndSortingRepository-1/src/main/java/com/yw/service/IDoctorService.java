package com.yw.service;

import com.yw.entities.Doctor;

public interface IDoctorService 
{
	public Iterable<Doctor> showDoctorsBySorting(boolean asc, String... props);
}
