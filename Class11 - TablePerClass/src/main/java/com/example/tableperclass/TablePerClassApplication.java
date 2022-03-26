package com.example.tableperclass;

import com.example.tableperclass.model.FireSpell;
import com.example.tableperclass.model.FrostSpell;
import com.example.tableperclass.model.Spell;
import com.example.tableperclass.repository.FireSpellRepository;
import com.example.tableperclass.repository.FrostSpellRepository;
import com.example.tableperclass.repository.SpellRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TablePerClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(TablePerClassApplication.class, args);

		SpellRepository spellRepository =
				configurableApplicationContext.getBean(SpellRepository.class);
		SpellRepository frostSpellRepository =
				configurableApplicationContext.getBean(FrostSpellRepository.class);
		SpellRepository fireSpellRepository =
				configurableApplicationContext.getBean(FireSpellRepository.class);

		Spell arcaneSpark =
				new Spell("Arcane Spark", 50, 60);
		Spell fireBall =
				new FireSpell("Fireball", 100, 100, 100, 2000);
		Spell meteorShower =
				new FireSpell("Meteor Shower", 400, 300, 300, 3000);
		Spell frostBolt =
				new FrostSpell("Frost Bolt", 80, 80, true, 300);

		spellRepository.save(arcaneSpark);
		fireSpellRepository.save(fireBall);
		fireSpellRepository.save(meteorShower);
		frostSpellRepository.save(frostBolt);


	}

}
