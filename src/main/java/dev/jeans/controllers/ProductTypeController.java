package dev.jeans.controllers;

import dev.jeans.entities.ProductType;
import dev.jeans.services.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class ProductTypeController {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @RequestMapping( value = "/product-types", method = GET)
    private Page<ProductType> findAll(Pageable pageable) {
        return productTypeRepository.findAll(pageable);
    }

    @RequestMapping( value = "/product-types/{id}", method = GET)
    private ProductType find(@PathVariable String id) {
        return productTypeRepository.findOne(id);
    }

    @RequestMapping( value = "/product-types", method = POST)
    private ProductType create(@RequestBody ProductType productType) {
        if ( productType != null ) {
            return productTypeRepository.save(productType);
        }

        return null;
    }

    @RequestMapping( value = "/product-types/{id}", method = PUT)
    private ProductType update(@PathVariable String id, @RequestBody ProductType productType) {
        if ( productType != null ) {
            return productTypeRepository.save(productType);
        }

        return null;
    }

    @RequestMapping(value = "/product-types/{id}", method = DELETE)
    private void delete(@PathVariable("id") String id) {
        productTypeRepository.delete(id);
    }

}
