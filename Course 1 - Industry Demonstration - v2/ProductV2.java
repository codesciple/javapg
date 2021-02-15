package com.upgrad.ecommerce.domain.v2;

public class ProductV2 extends StorableWebObject {

  private String name;
  private BrandV2 brand;
  private String description;

  public ProductV2(BrandV2 brand, String name) {
    super(name);
    this.name = name;
    this.brand = brand;
  }
  
  public String getName() {
    return name;
  }

  public BrandV2 getBrand() {
    return brand;
  }
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /** Overriding the implementation of generateUUID **/
  @Override
  protected void generateUUID() {
    this.uuid = this.brand.getUUID() + "-" + this.name.replaceAll(" ", "-");
  }

  @Override
  public void preUpdate() {
    super.generateUUID();
    super.updateLastUpdated();
  }

  @Override
  public void preInsert() {
    super.generateUUID();
    super.updateLastUpdated();
  }
}
