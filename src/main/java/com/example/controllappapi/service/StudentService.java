package com.example.controllappapi.service;

import com.example.controllappapi.Repository.StudentInterface;
import com.example.controllappapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public record StudentService(
        StudentInterface studentInterface
) {
    public List<Student> getStudents() {
        /* generated fake data to test our API */
        List<Student> students = new ArrayList<>();

        students.add(new Student(16734L, "Alice Johnson", 1200.50));
        students.add(new Student(16735L, "Bob Smith", 950.75));
        students.add(new Student(16736L, "Charlie Brown", 1100.00));
        students.add(new Student(16737L, "Diana Prince", 1300.25));
        students.add(new Student(16738L, "Edward Blake", 870.00));
        students.add(new Student(16739L, "Fiona Apple", 980.40));
        students.add(new Student(16740L, "George Carter", 1450.00));
        students.add(new Student(16741L, "Hannah Lee", 1160.90));
        students.add(new Student(16742L, "Ian Grey", 1235.55));
        students.add(new Student(16743L, "Jane Doe", 1090.10));
        students.add(new Student(16744L, "Kevin Harris", 1000.00));
        students.add(new Student(16745L, "Laura Wilson", 1105.80));
        students.add(new Student(16746L, "Mike Davis", 950.25));
        students.add(new Student(16747L, "Nina Adams", 1125.60));
        students.add(new Student(16748L, "Oscar Mitchell", 990.30));
        students.add(new Student(16749L, "Paula Green", 875.50));
        students.add(new Student(16750L, "Quincy Adams", 1230.75));
        students.add(new Student(16751L, "Rachel Young", 1085.45));
        students.add(new Student(16752L, "Steve Brown", 1250.20));
        students.add(new Student(16753L, "Tina Morris", 1150.00));
        return students;

    }
}
