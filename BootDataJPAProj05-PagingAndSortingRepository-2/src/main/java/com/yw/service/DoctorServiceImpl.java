package com.yw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.yw.entities.Doctor;
import com.yw.repository.IDoctorRepository;

public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Override
	public void showDataThroughPagination(int pageSize) {
		long count = doctorRepo.count();
		long pagesCount = count/pageSize;
		if(count%pagesCount != 0)
			pagesCount++;
		
		for(int i=0; i<pagesCount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize);
			
			Page<Doctor> page = doctorRepo.findAll(pageable);
			
			System.out.println("page :: "+(page.getNumber()+1)+" records of "+page.getTotalPages());
			page.getContent().forEach(System.out::println);
			System.out.println("-------------------------------------------------------");
		}
	}

	@Override
	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo, int pageSize, boolean ascOrder, String props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		Page<Doctor> page = doctorRepo.findAll(pageable);
		return page;
	}

}
