package com.tobeto.rentacar.entities.concretes;

import com.tobeto.rentacar.core.entitites.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="fuels")
public class Fuel extends BaseEntity {
    @Column(name="name")
    private String name;
}
