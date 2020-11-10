package org.myntra.bharat.bnpl.controller;

import lombok.Data;
import lombok.SneakyThrows;
import org.myntra.bharat.bnpl.model.entity.Order;
import org.myntra.bharat.bnpl.model.entity.Product;
import org.myntra.bharat.bnpl.model.entity.User;

import java.util.List;
import com.fasterxml.jackson.databind.*;
import org.myntra.bharat.bnpl.utils.FileResourcesUtils;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 04:22 PM
 **/
@Data
public class MyntraDriverApp {

    // helper dependencies
    ObjectMapper objectMapper = new ObjectMapper();
    FileResourcesUtils fru = new FileResourcesUtils();

    // in memory data
    List<Product> inventory;
    List<User> users;
    List<Order> orders;

    @SneakyThrows
    public List<Product> initializeInventory () {
        return objectMapper.readValue(fru.getFileContents("products.json"), List.class);
    }

    @SneakyThrows
    public List<User> onboardSomeUsers() {
        return objectMapper.readValue(fru.getFileContents("users.json"), List.class);
    }


    public MyntraDriverApp() {
        this.inventory = initializeInventory();
        this.users = onboardSomeUsers();
    }


    public static void main(String[] args) {

        MyntraDriverApp myntraDriverApp = new MyntraDriverApp();
        System.out.println(myntraDriverApp.getInventory());
    }

}
