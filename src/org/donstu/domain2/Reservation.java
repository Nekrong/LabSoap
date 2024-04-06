package org.donstu.domain2;

import org.donstu.domain2.Package;

import java.io.Serializable;
import java.util.List;

public class Reservation implements Serializable {
    private org.donstu.domain2.Package Package;

    private List<Computer> computers;

    public Package getPath() {
        return Package;
    }

    public void setPath(Package path) {
        this.Package = path;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
