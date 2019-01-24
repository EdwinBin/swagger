package com.rog.front.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rog.front.bean.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "/Product", description = "interface接口实现",tags = "Products")
public interface Products {

    @RequestMapping(value = "ssss", method = RequestMethod.POST)
    @ApiOperation(value = "根据id获取产品信息", notes = "ID为Long类型", httpMethod = "POST", response = Products.class)
    public String getdsfasdffdaas(@ApiParam("id") Long id,@RequestHeader("ids") Long ids);
   
    @RequestMapping(value = "getdsss", method = RequestMethod.GET)
    @ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET", response = Products.class)
    public ResponseEntity<Product> getdadfafds(@ApiParam Long id);
    
    
    @RequestMapping(value = "getssss", method = RequestMethod.GET)
    @ApiOperation(value = "根据id获取产品信息", notes = "根据id获取产品信息", httpMethod = "GET", response = Products.class)
    public ResponseEntity<Product> getsafdsafdsfasf(@ApiParam Long id);
}
