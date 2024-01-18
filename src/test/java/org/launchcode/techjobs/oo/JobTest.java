package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    //Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());

        assertTrue(testJob.getEmployer() instanceof Employer);
    }

    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJobOne, testJobTwo);
    }

    //toString() tests:
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.toString().startsWith("\n"));
        assertTrue(testJob.toString().endsWith("\n"));
    }
    //unsure if line separator should be in quotes or not

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedOutput = "\n" +
                "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency() + "\n";

        assertEquals(expectedOutput, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job emptyFieldJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(null));

        String expectedOutput = "\n" +
                "ID: " + emptyFieldJob.getId() + "\n" +
                "Name: " + emptyFieldJob.getName() + "\n" +
                "Employer: " + emptyFieldJob.getEmployer() + "\n" +
                "Location: " + emptyFieldJob.getLocation() + "\n" +
                "Position Type: " + emptyFieldJob.getPositionType() + "\n" +
                "Core Competency: Data not available" + "\n";

        assertEquals(expectedOutput, emptyFieldJob.toString());
    }

}

//still need to test equals method