package com.springhrms.service;

import com.springhrms.model.JobHistory;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface JobHistoryService {

    public long createJobHistory(JobHistory jobHistory);

    public JobHistory updateJobHistory(JobHistory jobHistory);

    public void deleteJobHistory(long id);

    public List<JobHistory> getAllJobHistories();

    public JobHistory getJobHistory(long id);
}
