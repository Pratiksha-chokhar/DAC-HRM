package com.springhrms.service;

import com.springhrms.model.Location;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface LocationService {

    public long createLocation(Location location);

    public Location updateLocation(Location location);

    public void deleteLocation(long id);

    public List<Location> getAllLocations();

    public Location getLocation(long id);
}
