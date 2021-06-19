package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class MechanicalSaw extends Saw {
    private Double toothSizeInMm;

    public MechanicalSaw(
            final Integer id, final MaterialToSaw materialToSaw, final SawMaterial sawMaterial,
            final Integer userId, final Double lengthInCm, final Double toothSizeInMm
    ) {
        super(id, materialToSaw, DriveType.MECHANICAL, sawMaterial, userId, lengthInCm);
        this.toothSizeInMm = toothSizeInMm;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",tooth_size_in_mm";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.toothSizeInMm.toString();
    }
}
