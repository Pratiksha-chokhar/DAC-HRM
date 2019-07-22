package com.springhrms.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.springhrms.model.Job;
import com.springhrms.service.JobService;

public class StringToJob implements Converter<String, Job> {

	@Autowired
	JobService jobService;

	@Override
	public Job convert(String jobId) {
		return jobService.getJob(jobId);
	}

}
