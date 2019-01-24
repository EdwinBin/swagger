package com.rog.front.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rog.front.bean.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = { "/ProductController/"})
@Api(value = "/ProductController",description = "class类实现",tags = "ProductController")
public class ProductController {

    @RequestMapping(value = "sadsa/", method = RequestMethod.POST)
    @ApiOperation(value = "根据id获取产品信息", notes = "ID为Long类型", httpMethod = "POST", response = Product.class)
    public String get(@RequestParam("id") Long id,@RequestParam("ids") Long ids) {
        Product product = new Product();
        product.setName("空气净化器");
        product.setId(1L);
        product.setProductClass("filters");
        product.setProductId("T12345");
        return "sadsadas";
    }
    @RequestMapping(value = "getd", method = RequestMethod.GET)
    @ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET", response = Product.class)
    public ResponseEntity<Product> getd(@RequestParam Long id) {
        Product product = new Product();
        product.setName("空气净化器");
        product.setId(1L);
        product.setProductClass("filters");
        product.setProductId("T12345");
        System.out.println(1111);
        return ResponseEntity.ok(product);
    }
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    @ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET", response = Product.class)
    public ResponseEntity<Product> gets(@RequestParam Long id) {
        Product product = new Product();
        product.setName("空气净化器");
        product.setId(1L);
        product.setProductClass("filters");
        product.setProductId("T12345");
        return ResponseEntity.ok(product);
    }
}
