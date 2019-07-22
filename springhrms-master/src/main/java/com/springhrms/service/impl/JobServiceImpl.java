package com.springhrms.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhrms.dao.JobDAO;
import com.springhrms.model.Job;
import com.springhrms.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDAO jobDAO;

	@Override
	@Transactional
	public long createJob(Job job) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public Job updateJob(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteJob(String jobId) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(readOnly = true)
	public List<Job> getAllJobs() {
		return jobDAO.getAllJobs();
	}

	@Override
	@Transactional(readOnly = true)
	public Job getJob(String jobId) {
		return jobDAO.getJob(jobId);
	}

}
