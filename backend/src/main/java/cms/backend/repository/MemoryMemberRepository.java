package cms.backend.repository;

import cms.backend.domain.Student;
import cms.backend.repository.StudentRepository;

public class MemoryStudentRepository implements StudentRepository {

    @Override
    public void save() {

    }

    @Override
    public Student find() {
        return null;
    }
}
