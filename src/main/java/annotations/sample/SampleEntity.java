package annotations.sample;

@CustomToString
public class SampleEntity {
    private Long id;
    private String name;

    public SampleEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
