package com.workerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.workerapp.model.Worker;
import com.workerapp.repo.WorkerDAO;
@Service
public class WorkerCustomerService {

	@Autowired
	private WorkerDAO repository;
	public ResponseEntity<Object> createWorker(Worker worker) {
		
		return new ResponseEntity<Object>(repository.save(worker),HttpStatus.OK);
	}

}
