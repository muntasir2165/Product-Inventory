package com.example.android.productinventory.data;

import android.provider.BaseColumns;

/**
 * API Contract for the Product Inventory app.
 */
public final class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {}

    /**
     * Inner class that defines constant values for the products database table.
     * Each entry in the table represents a single product.
     */
    public static final class ProductEntry implements BaseColumns {

        /** Name of database table for products */
        public final static String TABLE_NAME = "products";

        /**
         * Unique ID number for the product (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the product.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME ="name";

        /**
         * Price of the product.
         *
         * Type: REAL
         */
        public final static String COLUMN_PRODUCT_PRICE = "price";

        /**
         * Quantitye of the product in stock.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";


        /**
         * Name of the supplier of the product.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_SUPPLIER_NAME = "supplier_name";

        /**
         * Phone number of the supplier of the product.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_SUPPLIER_PHONE_NUMBER = "supplier_phone_number";
    }

}