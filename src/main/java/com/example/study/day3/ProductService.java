package com.example.study.day3;

import com.example.study.day8.InsufficientStockException;
import com.example.study.day8.ProductNotFoundException;

public class ProductService {

    public void findProduct(Long productId) {

        if (productId != 1L) {
            throw new ProductNotFoundException(
                    "PRODUCT_NOT_FOUND",
                    "상품을 찾을 수 없습니다. id=" + productId
            );
        }

        System.out.println("상품을 찾았습니다.");
    }

    public void orderProduct(int stock, int quantity) {

        if (stock < quantity) {
            throw new InsufficientStockException(
                    "INSUFFICIENT_STOCK",
                    "재고가 부족합니다. stock=" + stock
            );
        }

        System.out.println("주문이 완료되었습니다.");
    }
}
