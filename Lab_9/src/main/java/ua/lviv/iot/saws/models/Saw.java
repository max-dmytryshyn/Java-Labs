package ua.lviv.iot.saws.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saw {
    protected MaterialToSaw materialToSaw;
    protected DriveType driveType;
    protected SawMaterial sawMaterial;
    protected Person user;
    protected Double lengthInCm;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected Integer id;

    Saw(final MaterialToSaw materialToSaw, final DriveType driveType, final SawMaterial sawMaterial,
        final Person person, final Double lengthInCm){
        this(materialToSaw, driveType, sawMaterial, person, lengthInCm, null);
    }
}
