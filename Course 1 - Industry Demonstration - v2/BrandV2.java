package com.upgrad.ecommerce.domain.v2;

/** Extends keyword to make sure this class inherits the functionality of the StorableWebObject class **/
public class BrandV2 extends StorableWebObject {
  
  private String name;
  private String description;

  public BrandV2(String name) {
    /** Using super keyword to access 'StorableWebObject' class constructor **/
    super(name);
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /** Concrete implementation of preUpdate. Using super, we can call the 'StorableWebObject' class method **/
  @Override
  public void preUpdate() {
    super.generateUUID();
    super.updateLastUpdated();
  }

  /** Concrete implementation of preInsert **/
  @Override
  public void preInsert() {
    super.generateUUID();
    super.updateLastUpdated();
  }
}