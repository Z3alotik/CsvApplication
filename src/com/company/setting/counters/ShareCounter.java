package com.company.setting.counters;

import com.company.model.Computer;
import java.util.List;

public class ShareCounter {

    private double totalUnits;

    public void countShares(List<Computer> computers) {
        double individualPercentage;
        for (Computer computer : computers) {
            totalUnits += computer.getUnits();
        }
        for (Computer computer : computers) {
            individualPercentage = (computer.getUnits() / totalUnits) * 100;
            computer.setShare(individualPercentage);
        }
    }

    public double getTotalUnits() {
        return totalUnits;
    }
}
