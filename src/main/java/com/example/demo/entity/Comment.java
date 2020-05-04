package com.example.demo.entity;

import javax.persistence.*;

import lombok.*;

import java.io.Serializable;

@Entity
@Table(name="comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Comment implements Serializable {
    @Id
    @SequenceGenerator(name="seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "description")
    private String Description;
    @ManyToOne
    @JoinColumn(name ="userId")
    private User user;


}
