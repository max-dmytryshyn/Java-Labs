package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hacksaw extends MechanicalSaw{
    String bladeManufacturer;

    @Builder
    public Hacksaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, String bladeManufacturer
    ){
        super(MaterialToSaw.METAL, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.bladeManufacturer = bladeManufacturer;
    }
}
