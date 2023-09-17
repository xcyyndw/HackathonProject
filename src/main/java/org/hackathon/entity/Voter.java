package org.hackathon.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Voter")
public class Voter implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public Voter() {
    }
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voter{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
