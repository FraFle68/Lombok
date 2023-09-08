import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
