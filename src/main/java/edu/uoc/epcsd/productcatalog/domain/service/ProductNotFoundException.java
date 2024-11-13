package edu.uoc.epcsd.productcatalog.domain.service;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product with id '" + id + "' not found");
    }
}
