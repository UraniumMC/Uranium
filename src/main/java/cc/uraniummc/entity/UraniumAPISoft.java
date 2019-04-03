package cc.uraniummc.entity;

import com.google.gson.JsonArray;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class UraniumAPISoft implements Serializable {
    private long id;
    private String name;
    private JsonArray types;
    private String ci;
    private String version;
    private int least_build;
}
