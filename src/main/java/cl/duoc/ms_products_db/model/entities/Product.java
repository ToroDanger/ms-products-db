package cl.duoc.ms_products_db.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id_product;
    @Column(name = "name_product")
    private String name_product;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private int price;
    @Column(name = "description")
    private String description;
}
