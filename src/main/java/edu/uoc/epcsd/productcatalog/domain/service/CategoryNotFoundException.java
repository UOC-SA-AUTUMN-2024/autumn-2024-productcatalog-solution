package edu.uoc.epcsd.productcatalog.domain.service;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super("Category with id '" + id + "' not found");
    }
}
