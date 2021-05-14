package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Fretsaw extends MechanicalSaw{
    private Double arcLengthInCm;
    private String bladeManufacturer;

    public Fretsaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, Double arcLengthInCm, String bladeManufacturer
            ){
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.arcLengthInCm = arcLengthInCm;
        this.bladeManufacturer = bladeManufacturer;
    }
}
