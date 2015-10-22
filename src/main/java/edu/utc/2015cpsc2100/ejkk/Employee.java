/**
 * Copyright 2015 Emma Perez, jamiahx, Kate Siprelle, Kaleb Sanchez
 * jamiahx@gmail.com
 * kalebsanchez23@yahoo.com
 * ksiprelle@gmail.com
 * 
 * This file is a part of CPSC2100_ORS.
 *
 * CPSC2100_ORS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.

 * CPSC2100_ORS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with CPSC2100_ORS.  If not, see <http://www.gnu.org/licenses/>.
 */


package edu.utc._2015cpsc2100.ejkk;

import java.nio.file.attribute.GroupPrincipal;


public final class Employee implements GroupPrinciple extends Vehicle
{
    private String reservation;
    private String vehicle;
    private String newVehicle;
    /**
     * 
     * @param aReservation the reservation that is going to be updated
     * @param aVehicle the vehicle that is going to to be updated
     * @param aNewVehicle the new vehicle that needs to be registered
     */
    public Employee(String aReservation, String aVehicle, String aNewVehicle)
    {
        this.reservation = aReservation;
        this.vehicle = aVehicle;
        this.newVehicle = aNewVehicle;
    }
    /**
     * 
     * @return newVehicle that needs to be registered in the system 
     */

    public String registerNewVehicle()
    {
      
	return newVehicle;
    }
    
    /**
     * 
     * @return vehicle that can be updated in the list already
     */
    public String updateExistingVehicle()
    {
    	
	return vehicle;
    }
    /**
     * 
     * @return reservation that has been updated
     */
    public String updateReservation()
    {
	return reservation;
    }
}
