/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author filip
 */
public class ExerciseManagementTest {

    private ExerciseManagement manager;

    @Before
    public void init() {
        this.manager = new ExerciseManagement();
    }

    @Test
    public void listEmptyAtBegining() {

        assertEquals(0, manager.exerciseList().size());
    }

    @Test
    public void addindExerciseGrowsByOne() {

        manager.add("Hello");
        assertEquals(1, manager.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInTheList() {

        manager.add("Hello");
        assertTrue(manager.exerciseList().contains("Hello"));
    }
    @Test
    public void exerciseCanBeMarkAsCompleted() {
        manager.add("New exercise");
        manager.markAsCompleted("New exercise");
        assertTrue(manager.isCompleted("New exercise"));
    }
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        manager.add("New exercise");
        manager.markAsCompleted("New exercise");
        assertFalse(manager.isCompleted("Some exercise"));
        
    }

}
