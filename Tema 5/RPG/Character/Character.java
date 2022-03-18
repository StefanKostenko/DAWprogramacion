package RPG.Character;

import RPG.Character.Job.Job;
import RPG.Character.Race.Race;
import RPG.Character.Stat.Constitution;
import RPG.Character.Stat.Dexterity;
import RPG.Character.Stat.Intelligence;
import RPG.Character.Stat.Strength;

public class Character implements IDamageable {
    
    private String name;
    private Race race;
    private Job job;
    private double health;

    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;

    public Character(String name, Race race, Job job, int strength, int dexterity, int constitution,
    int intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.health = 250.0;
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

    public double getHeal() {
        return health;
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
        return "My name is " + name + ". I'm an " + race + job + " My stats are: " + strength + " Dexterity: " + dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Velocity: " + velocity() + " Power: " + power() + " Magic: " + magic() + " Health: " + health; 
    }

    public double maxHealth(){
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25;
    }

    public double health(){
        return health;
    }

    @Override
    public boolean isDead() {
        if(health < 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void receivesDamage(double amount) {
        health = health - amount;
        System.out.println(health);
    }

    @Override
    public void heals(double amount) {
        health = health + amount;
    }
}
