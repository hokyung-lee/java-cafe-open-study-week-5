package annotations.sample;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@CustomToString
@Getter
@Setter
public class SampleEntity {
    private Long id;
    @NonNull
    private String name;

    public SampleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
