package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fretsaw extends MechanicalSaw{
    private Double arcLengthInCm;
    private String bladeManufacturer;


    @Builder
    public Fretsaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, Double arcLengthInCm, String bladeManufacturer
            ){
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.arcLengthInCm = arcLengthInCm;
        this.bladeManufacturer = bladeManufacturer;
    }
}
