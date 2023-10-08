package ait.product.dao;

import ait.product.model.Product;

public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product[capacity];

    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;
    }

    public Product findProduct(long barCode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barCode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barCode, double price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarcode() == barCode) {
                products[i].setPrice(price);
            }
        }

        return null;
    }

    public boolean removeProduct(long barCode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarcode() == barCode) {
                products[i] = products[products.length - 1];
                 products [products.length-1]=null;
                quantity--;
                return true;

            }
        }

        return false;
    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
