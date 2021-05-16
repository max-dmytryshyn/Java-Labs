package ua.lviv.iot.saws.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saw {
    @NonNull
    protected MaterialToSaw materialToSaw;
    @NonNull
    protected DriveType driveType;
    @NonNull
    protected SawMaterial sawMaterial;
    protected Person user;
    @NonNull
    protected Double lengthInCm;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected Integer id;

    Saw(final MaterialToSaw materialToSaw, final DriveType driveType, final SawMaterial sawMaterial,
        final Person person, final Double lengthInCm){
        this(materialToSaw, driveType, sawMaterial, person, lengthInCm, null);
    }
}
