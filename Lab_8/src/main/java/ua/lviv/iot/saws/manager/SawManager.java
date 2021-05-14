package ua.lviv.iot.saws.manager;

import ua.lviv.iot.saws.models.Saw;

import java.util.ArrayList;
import java.util.List;

public class SawManager {
    private List<Saw> saws;

    public  SawManager(){
        this.saws = new ArrayList<Saw>();
    }

    public SawManager(List<Saw> saws){
        this.saws = saws;
    }

    public void addSaws(List<Saw> sawsToAdd){
        saws.addAll(sawsToAdd);
    }

    public void removeSawByIndex(int index){
        saws.remove(index);
    }

    public void clearSawsList(){
        saws.clear();
    }

    public Saw getSawByIndex(int index) {
        return saws.get(index);
    }

    public List<Saw> getAllSaws(){
        return this.saws;
    }

}
