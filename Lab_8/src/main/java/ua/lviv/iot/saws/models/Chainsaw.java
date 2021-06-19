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
            final SawMaterial sawMaterial, final Integer userId,
            final Double lengthInCm, final Double tankVolume
    ) {
        super(MaterialToSaw.WOOD, DriveType.INTERNAL_COMBUSTION_ENGINE,
                sawMaterial, userId, lengthInCm);
        this.tankVolume = tankVolume;
    }
}
