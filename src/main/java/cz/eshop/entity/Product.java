package cz.eshop.entity;

import org.hibernate.annotations.*;

import org.hibernate.annotations.CascadeType;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", unique = true)
    private Long id;

    @Column(name = "PRODUCT_NAME", unique = true)
    @NotNull
    @Size(min = 3, max = 50)
    private String name;

    @Column(name = "PRODUCT_PRICE")
    @NotNull
    private BigDecimal price;

    @Column(name = "DESCRIPTION")
    private String Description;

    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "PRODUCT_TO_CATEGORY", joinColumns = {
            @JoinColumn(name = "PRODUCT_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "CATEGORY_ID",
                    nullable = false, updatable = false) })
    private Set<Category> categories = new HashSet<Category>();

    public void setCategory(Category c) {
        categories.add(c);
        c.addProduct(this);
    }

    public void removeCategory(Category category)
    {
        this.categories.remove(category);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Set<Category> getCategories() {
        return categories;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (!name.equals(product.name)) return false;
        if (!price.equals(product.price)) return false;
        if (Description != null ? !Description.equals(product.Description) : product.Description != null) return false;
        if (!addedDate.equals(product.addedDate)) return false;
        return categories != null ? categories.equals(product.categories) : product.categories == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + name.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + (Description != null ? Description.hashCode() : 0);
        result = 31 * result + addedDate.hashCode();
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Description='" + Description + '\'' +
                ", addedDate=" + addedDate +
                ", categories=" + categories +
                '}';
    }
}
