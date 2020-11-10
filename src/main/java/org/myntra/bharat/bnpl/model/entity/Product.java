package org.myntra.bharat.bnpl.model.entity;

import lombok.Data;
import org.myntra.bharat.bnpl.model.ProductStatus;

import java.util.List;
import java.util.Map;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:38 PM
 **/
@Data
public class Product {

    private String productId;
    private String name;
    private String desc;
    private List<String> productPictures;
    // inventory
    private int count;
    private double price;
    private ProductStatus productStatus;
    private List<Map<String,String>> features;

}
