package edu.uoc.epcsd.productcatalog.domain.service;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String email) {
        super("User with email '" + email + "' not found");
    }
}
