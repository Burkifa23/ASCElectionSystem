public interface Schedulable {
    /** Get the start date as a string */
    String getStartDate();
    
    /** Get the end date as a string */
    String getEndDate();
    
    /** Get the time information as a string
     */
    String getTime();
    
    /** Get formatted schedule information as a formatted schedule string */
    String getScheduleInfo();
    
    /** Check if the event is currently active by collecting the currentDate to check against it */
    boolean isActive(String currentDate);
    
    /** Get the duration in days */
    int getDuration();
}
