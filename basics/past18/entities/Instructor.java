package past18.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
    public static Integer studentsCount(Set<Student>... classes) {
        Set<Student> setResult = new HashSet<>();

        for (Set<Student> course : classes) {
            setResult.addAll(course);
        }

        return setResult.size();
    }
}
