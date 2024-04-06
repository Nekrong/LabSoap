package org.donstu.domain2;

import java.io.Serializable;
import java.util.List;

public class ComputerClub implements Serializable {
    private List<Package> Packages;

    private List<Computer> computers;

    private List<Reservation> reservations;

    public List<Package> getPaths() {
        return Packages;
    }

    public void setPaths(List<Package> aPackages) {
        this.Packages = aPackages;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
