package com.upgrad.ecommerce.domain.v2;

import java.util.Date;

/** Abstract class for Storable Web Objects. This implements the interface WebObject as well**/
public abstract class StorableWebObject implements WebObject {

  /** Attributes needed for storing an object **/
  private long id;
  private Date dateCreated;
  private Date lastUpdated;
  
  /** Attributes needed for the generation of default uuid **/
  private String key;
  protected String uuid;
  
  /** To avoid the code duplication, images attribute  **/
  private Image[] images;

  public StorableWebObject(String key) {
    this.key = key;
    this.dateCreated = new Date();
    this.lastUpdated = new Date();
    this.images = new Image[3];
    this.generateUUID();
  }
  
  /** This function implementation can be over riden **/
  protected void generateUUID() {
    this.uuid = this.key.replaceAll(" ", "-");
  }
  
  @Override
  public String getUUID() {
    return this.uuid;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }
  
  protected void updateLastUpdated() {
    this.lastUpdated = new Date();
  }

  public Image[] getImages() {
    return images;
  }

  public void setImages(Image[] images) {
    this.images = images;
  }
  
  public void addImage(Image image) {
    for (int i = 0; i < this.images.length; i++) {
      if (null == this.images[i]) {
        this.images[i] = image;
        return;
      }
    }
  }
  
  public Image getDefaultImage() {
    for (int i = 0; i < this.images.length; i++) {
      if (this.images[i].isDefaultImg()) {
        return this.images[i];
      }
    }
    return null;
  }
  
  /** Abstract methods to be implemented by sub-classes **/
  public abstract void preUpdate();
  
  public abstract void preInsert();
}