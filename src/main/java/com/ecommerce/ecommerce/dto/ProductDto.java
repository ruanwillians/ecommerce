package com.ecommerce.ecommerce.dto;

import com.ecommerce.ecommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDto {
    private Long id;
    
    @Size(max = 80, min = 3, message = "O nome precisa ter de 3 a 80 carcateres")
    @NotBlank(message = "Campo obrigatório")
    private String Name;
    @Size( min = 10, message = "Descrição precisa ter no minimo 10 caracteres")
    private String description;
    @Positive(message = "O preço deve serálido")
    private Double price;
    private String imgUrl;


    public ProductDto(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        Name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
    
    public ProductDto(Product entity) {
        id = entity.getId();
        Name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
