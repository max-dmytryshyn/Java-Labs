package ua.lviv.iot.saws.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Saw {

    @NonNull
    @Enumerated
    protected MaterialToSaw materialToSaw;

    @NonNull
    @Enumerated
    protected DriveType driveType;

    @NonNull
    protected SawMaterial sawMaterial;

    protected Person user;

    @NonNull
    protected Double lengthInCm;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    public Saw(final MaterialToSaw materialToSaw, final DriveType driveType, final SawMaterial sawMaterial,
               final Person person, final Double lengthInCm) {
        this(materialToSaw, driveType, sawMaterial, person, lengthInCm, null);
    }
}
