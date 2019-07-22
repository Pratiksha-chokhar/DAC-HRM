package com.springhrms.service;

import com.springhrms.model.Region;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface RegionService {

    public long createRegion(Region region);

    public Region updateRegion(Region region);

    public void deleteRegion(long id);

    public List<Region> getAllRegions();

    public Region getRegion(long id);
}
