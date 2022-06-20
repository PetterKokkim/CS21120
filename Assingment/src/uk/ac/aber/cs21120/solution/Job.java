package uk.ac.aber.cs21120.solution;

import uk.ac.aber.cs21120.hospital.IJob;

public class Job implements IJob, Comparable<IJob>{

    private int ID;
    private int priority;
    private int duration;

    private int tick;
    private boolean status = false;

    public Job(int new_ID, int new_priority, int new_duration){
        ID = new_ID;
        priority = new_priority;
        duration = new_duration;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void tick() {
        if (this.tick == duration){
            status = true;
        }else {
            this.tick ++;
        }
    }

    @Override
    public boolean isDone() {
        return status;
    }

    @Override
    public int getTimeSinceSubmit(int now) {
        return now % tick;
    }

    @Override
    public void setSubmitTime(int time) {
        tick = time;
    }


    @Override
    public int compareTo(IJob o) {
        return Integer.compare(this.priority, o.getPriority());
    }
}
