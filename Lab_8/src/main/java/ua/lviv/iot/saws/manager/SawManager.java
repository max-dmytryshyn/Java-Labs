package ua.lviv.iot.saws.manager;

import ua.lviv.iot.saws.models.DriveType;
import ua.lviv.iot.saws.models.Saw;
import ua.lviv.iot.saws.models.SawMaterial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Saw> searchByDriveType(DriveType driveType){
        return this.saws.stream().filter(saw -> saw.getDriveType().equals(driveType)).collect(Collectors.toList());
    }

    public List<Saw> searchBySawMaterial(SawMaterial sawMaterial){
        return this.saws.stream().filter(saw -> saw.getSawMaterial().equals(sawMaterial)).collect(Collectors.toList());
    }

    public void sortByLength(SortOrder sortOrder){
        if (sortOrder == SortOrder.ASC){
            saws.sort(Comparator.comparing(Saw::getLengthInCm));
        }
        else{
            saws.sort(Comparator.comparing(Saw::getLengthInCm).reversed());
        }
    }
}
