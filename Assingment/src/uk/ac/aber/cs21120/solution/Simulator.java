package uk.ac.aber.cs21120.solution;

import uk.ac.aber.cs21120.hospital.IJob;
import uk.ac.aber.cs21120.hospital.ISimulator;

import java.util.PriorityQueue;
import java.util.Set;

public class Simulator implements ISimulator {

    private int ambulances;
    private int tick;


    public Simulator(int numberAmbulances){
        ambulances = numberAmbulances;
    }

    @Override
    public void add(IJob j) {

    }

    @Override
    public void tick() {

    }

    @Override
    public int getTime() {
        return tick;
    }

    @Override
    public boolean allDone() {
        return false;
    }

    @Override
    public Set<Integer> getRunningJobs() {
        return null;
    }

    @Override
    public double getAverageJobCompletionTime(int priority) {
        return 0;
    }
}
