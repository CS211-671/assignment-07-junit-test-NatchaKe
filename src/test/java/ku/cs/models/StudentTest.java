package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("61xxxxx","StudentTest");
    }

    @Test
    void testAddScore(){
        //s1 = new Student("61xxxxx","StudentTest");
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
        s1.addScore(50);
        assertEquals(60.5, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        //s1 = new Student("61xxxxx","StudentTest");
        s1.addScore(70);
        assertEquals("B", s1.grade());

    }

}