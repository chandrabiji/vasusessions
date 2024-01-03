package com.chandra.pms.query;

public interface ProductQuery {
  public static final String CREATE_PRODUCT = "INSERT INTO PRODUCT VALUES(?,?,?,?)";
  public static final String VIEW_ALL_PRODUCTS = "SELECT * FROM PRODUCT";
  public static final String VIEW_PRODUCT = "SELECT * FROM PRODUCT WHERE PID = ?";
  public static final String UPDATE_PRODUCT = "UPDATE PRODUCT SET PNAME=?,QTY=?,PRICE=? WHERE PID=?";
  public static final String DELETE_PRODUCT = "DELETE  FROM PRODUCT WHERE pid = ?";
  
}
