package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Hacksaw extends MechanicalSaw{
    String bladeManufacturer;

    public Hacksaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, String bladeManufacturer
    ){
        super(MaterialToSaw.METAL, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.bladeManufacturer = bladeManufacturer;
    }
}
