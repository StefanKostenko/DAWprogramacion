package RPG.Character;

import RPG.Character.Job.Job;
import RPG.Character.Race.Race;
import RPG.Character.Stat.Constitution;
import RPG.Character.Stat.Dexterity;
import RPG.Character.Stat.Intelligence;
import RPG.Character.Stat.Strength;

public class Character {
    
    private String name;
    private Race race;
    private Job job;

    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;

    public Character(String name, Race race, Job job, int strength, int dexterity, int constitution,
    int intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(strength);
        this.dexterity = new Dexterity(dexterity);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence);
    }

    public String getName() {
        return name;
    }
    public Race getRace() {
        return race;
    }
    public Job getJob() {
        return job;
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity(){
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2.0f;
    }
    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power(){
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2.0f;
    }
    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic(){
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) * 2.0f;
    }

    @Override
    public String toString() {
        return "Character [constitution=" + constitution + ", dexterity=" + dexterity + ", intelligence=" + intelligence
                + ", job=" + job + ", name=" + name + ", race=" + race + ", strength=" + strength + "]";
    }
}
