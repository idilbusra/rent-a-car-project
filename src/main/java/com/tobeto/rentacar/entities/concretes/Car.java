package com.tobeto.rentacar.entities.concretes;

import com.tobeto.rentacar.core.entitites.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cars")
public class Car extends BaseEntity {
    @Column(name="modelYear")
    private String modelYear;

    @Column(name="plate")
    private String plate;

    @Column(name="state")
    private int state;

    @Column(name="dailyPrice")
    private double dailyPrice;

    @ManyToOne()
    @JoinColumn(name = "model_id")
    private List<Model> models;

}
