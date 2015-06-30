package dev.jeans.services;

import dev.jeans.entities.ProductType;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductTypeRepository extends MongoRepository<ProductType, String> {
}
