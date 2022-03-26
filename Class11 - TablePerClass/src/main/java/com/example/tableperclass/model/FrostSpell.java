package com.example.tableperclass.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FROST_SPELL")
public class FrostSpell extends Spell{


    private boolean freezing;

    private Integer freezingDuration;

    public FrostSpell() {
    }

    public FrostSpell(String name, Integer energyCost, Integer damage, boolean freezing, Integer freezingDuration) {
        super(name, energyCost, damage);
        this.freezing = freezing;
        this.freezingDuration = freezingDuration;
    }
}
