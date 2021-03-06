package dev.jeans.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {

    @Id
    private String id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt =  new Date();

    private String name;
    private Double cost;
    private Double price;
    private String description;

    @JsonCreator()
    public Product(
            @JsonProperty("createdAt") Date createdAt,
            @JsonProperty("name") String name,
            @JsonProperty("cost") Double cost,
            @JsonProperty("price") Double price,
            @JsonProperty("description") String description) {
        this.createdAt = createdAt;
        this.name = name;
        this.cost = cost;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
