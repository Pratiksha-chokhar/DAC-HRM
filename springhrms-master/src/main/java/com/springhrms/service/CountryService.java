package com.springhrms.service;

import com.springhrms.model.Country;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface CountryService {

    public long createCountry(Country country);

    public Country updateCountry(Country country);

    public void deleteCountry(long id);

    public List<Country> getAllCountries();

    public Country getCountry(long id);
}
