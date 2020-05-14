package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class User {
    // burası diff brachte olup master da olmaması lazım
    @Id
    // MySql de bu işlem otomatik gerçekletştirilebilirken
    // postgresql de sequence'lerin yazılması gerekiyor.
    @SequenceGenerator(name="seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String surname;
    private String password;
    private String email;
    @OneToMany()
    @JoinColumn(name="commentId") //
    private List<Comment> comments;

}
