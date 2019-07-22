package com.springhrms.dao;

import com.springhrms.model.Location;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface LocationDAO {

    public long createLocation(Location location);

    public Location updateLocation(Location location);

    public void deleteLocation(long id);

    public List<Location> getAllLocations();

    public Location getLocation(long id);
}
