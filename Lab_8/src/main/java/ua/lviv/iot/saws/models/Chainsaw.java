package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Chainsaw extends Saw {
    private Double tankVolume;

    public Chainsaw(
            final Integer id, final SawMaterial sawMaterial, final Integer userId,
            final Double lengthInCm, final Double tankVolume
    ) {
        super(id, MaterialToSaw.WOOD, DriveType.INTERNAL_COMBUSTION_ENGINE,
                sawMaterial, userId, lengthInCm);
        this.tankVolume = tankVolume;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",tank_volume";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.tankVolume.toString();
    }
}
