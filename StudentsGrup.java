public class StudentsGrup {
} import java.util.ArrayList;
  import java.util.List;
  public class StudentsGrup{
      private Student leader;
      private List<Student> students;
      private List<String> tasks;
  }
  public StudentGroup(Student leader)
        this.leader = leader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
public void changeLeader(Student newLeader) {
        this.leader = newLeader;
        }

public void addStudent(Student student) {
        students.add(student);
        }

public void removeStudent(Student student) {
        students.remove(student);
        }

public void addTask(String task) {
        tasks.add(task);
        }

public void markTaskAsDone(Student student, String task) {
        if (students.contains(student) && tasks.contains(task)) {
        // Якщо студент є у групі та завдання є в списку
        // можна виконати додаткові дії, наприклад,
        // зберегти інформацію про виконання завдання студентом
        } else {
        // Обробка помилки, якщо студент або завдання відсутні
        }
        }
        }

