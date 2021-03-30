package com.workerapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workerapp.model.Worker;

@Repository
public interface WorkerDAO extends JpaRepository<Worker, Long> {

}
