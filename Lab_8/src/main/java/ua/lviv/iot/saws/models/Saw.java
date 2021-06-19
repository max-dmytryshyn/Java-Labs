package ua.lviv.iot.saws.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saw {
    protected Integer id;
    protected MaterialToSaw materialToSaw;
    protected DriveType driveType;
    protected SawMaterial sawMaterial;
    protected Integer userId;
    protected Double lengthInCm;

    public String getHeaders() {
        return "id,material_to_saw,drive_type," + this.sawMaterial.getHeaders() + ",user_id,length_in_cm";
    }

    public String toCSV(){
        return this.id.toString() + "," + this.materialToSaw.toString() + "," + this.driveType.toString() + "," +
                this.sawMaterial.toCSV() + "," + this.userId.toString() + "," + this.lengthInCm.toString();
    }
}
