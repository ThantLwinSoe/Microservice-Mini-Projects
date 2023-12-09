package com.example.affablebeanui.config;

import com.example.affablebeanui.data.DeliveryRequest;
import com.example.affablebeanui.data.OrderProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "${delivery.backend.url}",value = "delivery-feign-client")
public interface DeliveryFeignClient {
    @PostMapping("/delivery/process-delivery")
    ResponseEntity<String> makeDelivery(@RequestBody DeliveryRequest request);

    @GetMapping("/delivery/checkout/info/{id}")
    OrderProductResponse getOrderProductInfo(@PathVariable("id") String id);
}
