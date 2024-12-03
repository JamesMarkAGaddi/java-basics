package org.acumen.training.codes.test;

import org.acumen.training.codes.Statistics;

public class TestStatistics {
    public static void main(String[] args) {

        Statistics stats1 = new Statistics(100, 1, 2, 3, 10, 50);
        stats1.computeData();

        Statistics stats2 = new Statistics(10, 20, 30, 40, 50);
        stats2.computeData();

        Statistics stats3 = new Statistics(5, 102, 345);
        stats3.computeData();

        Statistics stats4 = new Statistics(8, 120, 140, 18);
        stats4.computeData();

        Statistics stats5 = new Statistics(2, 35, 7, 10, 9, 4);
        stats5.computeData();
    }
}
