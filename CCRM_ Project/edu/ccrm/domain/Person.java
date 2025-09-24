package edu.ccrm.domain;

public abstract class Person {
    private String id;
    private String fullName;
    private String email;

    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters and Setters for private fields
    public String getFullName() {
        return fullName;
    }
    
    public String getEmail() {
        return email;
    }
    
    // Abstract method that subclasses MUST implement
    public abstract String getProfileDetails();

    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", email=" + email + "]";
    }
}
