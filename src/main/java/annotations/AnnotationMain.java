package annotations;

import annotations.sample.AnnotationWithValue;
import annotations.sample.CustomToString;
import annotations.sample.SampleEntity;
import java.lang.reflect.Field;

public class AnnotationMain {
    public static void main(String[] args) {
        SampleEntity sampleEntity = new SampleEntity(1L, "자바카페");
        System.out.println(customToString(sampleEntity));


        // Retention Class
        SampleEntity sampleEntity2 = new SampleEntity(1L, null);
        sampleEntity2.setName(null); // 오른쪽 노랑줄
        System.out.println(sampleEntity2.getName());

    }

    private static String customToString(Object obj) {
        Class<?> cl = obj.getClass();
        CustomToString customToString = cl.getAnnotation(CustomToString.class);

        if (customToString == null) return obj.toString();

        StringBuffer result = new StringBuffer();
        if (customToString.includeName()) result.append(cl.getName() + " ");
        result.append("[");

        boolean first = true;
        for (Field field : cl.getDeclaredFields()) {

            field.setAccessible(true);

            try {
                if (!first) result.append(", ");
                result.append(field.getName());
                result.append(" : ");
                result.append(field.get(obj));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

            if (first) first = false;
        }
        result.append("]");

        return result.toString();
    }

    @AnnotationWithValue(value = "aa",elementName1 = 5)
    private static void annotationWithValue(){

    }
}
