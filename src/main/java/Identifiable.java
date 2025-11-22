public interface Identifiable {
    /** Get the unique identifier */
    String getID();
    
    /** Get the name  */
    String getName();
    
    /** Get a short profile summary */
    String getProfile();

    /** Verify if the ID matches */
    boolean verifyID(String id);
}
