package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init(){
       studentList = new StudentList();
       studentList.addNewStudent("00","Rei",100);
       studentList.addNewStudent("01","Shinji");
       studentList.addNewStudent("02","Asuka");

    }

    @Test
    @DisplayName("There must be four students in StudentList")
    void testAddNewStudent(){
        studentList.addNewStudent("06","Kaworu");
        assertEquals(4, studentList.getStudents().size());
    }

    @Test
    @DisplayName("There must be four students in StudentList when adding by score")
    void testAddNewStudentWithScore(){
        studentList.addNewStudent("06","Kaworu",1234);
        assertEquals(4, studentList.getStudents().size());
    }

    @Test
    @DisplayName("There must be student in StudentList")
    void testStudentListFindStudent(){
        assertNotNull(studentList.findStudentById("01"));
    }

    @Test
    @DisplayName("Score")
    void testStudentListGiveScore(){
        studentList.findStudentById("00").addScore(100);
        assertEquals(200, studentList.findStudentById("00").getScore());
    }

    @Test
    @DisplayName("There must be a grade!")
    void testViewGradeOfId() {
        assertNotNull(studentList.viewGradeOfId("02"));
    }

}