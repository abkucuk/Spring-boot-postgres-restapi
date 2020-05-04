package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Product {
    @Id
    @SequenceGenerator(name="seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int price;
    private String imageName;
    private String description;
    @OneToMany
    @JoinColumn(name = "products_comment_id" )
    private List<Comment> comments;

}
