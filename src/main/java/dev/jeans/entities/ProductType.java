package dev.jeans.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProductType {

    @Id
    private String id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    private String name;

    @JsonCreator()
    public ProductType(
            @JsonProperty("createdAt") Date createdAt,
            @JsonProperty("name") String name ) {
        this.createdAt = createdAt;
        this.name = name;
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
}
