package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Fretsaw extends MechanicalSaw {
    private Double arcLengthInCm;
    private String bladeManufacturer;

    public Fretsaw(
            final SawMaterial sawMaterial, final Person person, final Double lengthInCm,
            final Double toothSizeInMm, final Double arcLengthInCm, final String bladeManufacturer
            ) {
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.arcLengthInCm = arcLengthInCm;
        this.bladeManufacturer = bladeManufacturer;
    }
}
