package cms.backend.service;

import cms.backend.domain.Student;

public interface StudentRepository {

    void save();

    Student find();
}
