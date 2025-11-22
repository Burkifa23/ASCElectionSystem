public interface Contactable {
    /** Get the email address */
    String getEmail();
    
    /** Set the email address */
    void setEmail(String email);
    
    /** Get formatted contact information */
    String getContactInfo();
    
    /** Validate email format */
    boolean hasValidEmail();
}
