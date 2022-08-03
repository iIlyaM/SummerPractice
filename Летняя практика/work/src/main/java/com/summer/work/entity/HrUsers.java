package com.summer.work.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "hr_users")
public class HrUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String hrName;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies company;

    @Override
    public String toString() {
        return "HrUsers{" +
                "id=" + id +
                ", hrName='" + hrName + '\'' +
                ", company=" + company +
                '}';
    }
}
