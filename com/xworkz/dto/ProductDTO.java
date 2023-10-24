package com.xworkz.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {


        private int productId;
        private String productName;
        private double price;

        @Override
        public String toString(){
            return "[Product ID = "+this.productId+", Product Name = "+this.productName+", Price = "+this.price+"]";
        }


}
