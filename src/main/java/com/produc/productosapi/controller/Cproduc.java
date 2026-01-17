/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.produc.productosapi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/productos")
@CrossOrigin("*")
public class Cproduc 
{
    @GetMapping("/name")
    public ResponseEntity<?> Name(@RequestParam(value="name",defaultValue="")String name_person)
    {
        Map<String,Object> response=new HashMap();
        try
        {
            response.put("name", "El nombre es: "+name_person);
        }
        catch(Exception ex)
        {
            return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK); 
    }
    
   
    @GetMapping("/producs")
    public ResponseEntity<?> Products()
    {
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        class Product{
            String name_produc;
            String description;
            float price;
        }
        
        Map<String,Object> response=new HashMap();
        try
        {
            List<Product> pp=new ArrayList<>();
            pp.add(new Product("Chocolate","Producto de ecuador",10.0f));
            pp.add(new Product("Chocolate", "Producto de Ecuador", 10.0f));
            pp.add(new Product("Pion", "Bebida energética ecuatoriana", 8.5f));
            pp.add(new Product("Coca Cola", "Gaseosa internacional", 9.0f));
            pp.add(new Product("Inca Kola", "Bebida tradicional andina", 8.0f));
            pp.add(new Product("Agua Cielo", "Agua purificada embotellada", 5.0f));
            pp.add(new Product("Doritos", "Snacks de maíz con sabor a queso", 7.5f));
            pp.add(new Product("Galletas Pingüino", "Galletas rellenas con crema de cacao", 6.0f));
            pp.add(new Product("Café Loja", "Café premium cultivado en el sur de Ecuador", 12.0f));
            pp.add(new Product("Leche Toni", "Leche entera pasteurizada", 7.0f));
            pp.add(new Product("Yogurt Alpina", "Yogurt natural con fruta", 6.5f));
            pp.add(new Product("eeeeeee", "eeeeeeeeeeee", 10.5f));
            pp.add(new Product("jhon", "eeeeeeeeeeee", 10.5f));

            pp.add(new Product("producto1", "ppp1", 20.5f));
            pp.add(new Product("producto2", "ppp2", 30.5f));

            pp.add(new Product("kkkkk", "kkkkk", 30.5f));
            pp.add(new Product("eeeeeee", "eeeeeeeee", 30.5f));

            response.put("products", pp);
        }
        catch(Exception ex)
        {
            return new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK); 
    }
    
    
}
