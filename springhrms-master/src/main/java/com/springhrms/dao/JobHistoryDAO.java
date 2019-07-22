package com.springhrms.dao;

import com.springhrms.model.JobHistory;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface JobHistoryDAO {

    public long createJobHistory(JobHistory jobHistory);

    public JobHistory updateJobHistory(JobHistory jobHistory);

    public void deleteJobHistory(long id);

    public List<JobHistory> getAllJobHistories();

    public JobHistory getJobHistory(long id);
}
