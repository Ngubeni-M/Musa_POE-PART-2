public class Task {
    String input="";
    public boolean checkTaskDescription(String taskDescription) {
        return taskDescription.length() <= 50;
    }

    public String createTaskID(String taskName, int taskNumber, String developerLastName) {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" +
                developerLastName.substring(developerLastName.length() - 3).toUpperCase();
        return taskID;
    }

    public String printTaskDetails(String taskStatus, String developerFirstName, String developerLastName, int taskNumber,
                                   String taskName, String taskDescription, String taskID, int taskDuration) {
        String details = "Task Status: " + taskStatus + "\nDeveloper: " + developerFirstName + " " + developerLastName +
                "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " +
                taskDescription + "\nTask ID: " + taskID + "\nTask Duration: " + taskDuration + " hours";
        return details;
    }

    public int returnTotalHours(int... durations) {
        int total = 0;
        for (int duration : durations) {
            total += duration;
        }
        return total;
    }
}
