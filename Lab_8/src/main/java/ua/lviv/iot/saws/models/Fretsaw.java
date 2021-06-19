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
            final Integer id, final SawMaterial sawMaterial, final Integer userId, final Double lengthInCm,
            final Double toothSizeInMm, final Double arcLengthInCm, final String bladeManufacturer
            ) {
        super(id, MaterialToSaw.WOOD, sawMaterial, userId, lengthInCm, toothSizeInMm);
        this.arcLengthInCm = arcLengthInCm;
        this.bladeManufacturer = bladeManufacturer;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",arcLength_in_cm,blade_manufacturer";
    }
}
