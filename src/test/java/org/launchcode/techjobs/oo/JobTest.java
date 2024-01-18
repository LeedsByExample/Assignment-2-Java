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
        assertTrue(testJob.toString().startsWith(System.lineSeparator()));
        assertTrue(testJob.toString().endsWith(System.lineSeparator()));
    }
    //unsure if line separator should be in quotes or not

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedOutput = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: " + testJob.getName() + System.lineSeparator() +
                "Employer: " + testJob.getEmployer() + System.lineSeparator() +
                "Location: " + testJob.getLocation() + System.lineSeparator() +
                "Position Type: " + testJob.getPositionType() + System.lineSeparator() +
                "Core Competency: " + testJob.getCoreCompetency() + System.lineSeparator();

        assertEquals(expectedOutput, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job emptyFieldJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(null));

        String expectedOutput = System.lineSeparator() +
                "ID: " + emptyFieldJob.getId() + System.lineSeparator() +
                "Name: " + emptyFieldJob.getName() + System.lineSeparator() +
                "Employer: " + emptyFieldJob.getEmployer() + System.lineSeparator() +
                "Location: " + emptyFieldJob.getLocation() + System.lineSeparator() +
                "Position Type: " + emptyFieldJob.getPositionType() + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();

        assertEquals(expectedOutput, emptyFieldJob.toString());
    }

//    @Test
//    public void testToStringWithEmptyJob() {
//        Job emptyJob = new Job();
//
//        String expectedOutput = "OOPS! This job does not seem to exist.";
//
//        assertEquals(expectedOutput, emptyJob.toString());
//    }
//this test is optional, add it if you have time

    //
    //    (Optional) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
}

//still need to test equals method