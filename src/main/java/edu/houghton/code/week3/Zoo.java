/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code.week3;

/**
 *
 * @author Logan
 */
public class Zoo {
    
    private Animal[] cages;
    
    public Zoo() {
        cages = new Animal[10];
    }
    
    public void addAnimal(Animal animal) {
        for(int i = 0; i < cages.length; i++) {
            if(cages[i] == null) {
                cages[i] = animal;
                return;
            }
        }
        expand();
        addAnimal(animal);
    }
    
    @Override
    public String toString() {
        String rtn = "Animals in zoo: \n";
        for(int i = 0; i < cages.length; i++) {
            if(cages[i] == null) continue;
            rtn += i + ": " + cages[i] + "\n";
        }
        rtn += "Zoo max: " + cages.length;
        return rtn;
    }
    
    public void print() {
        System.out.println(toString());
    }
    
    public int numberOfAnimals() {
        int rtn = 0;
        for(Animal animal : cages) {
            if(animal != null) rtn++;
        }
        return rtn;
    }
    
    public int totalMass() {
        int rtn = 0;
        for(Animal animal : cages) {
            if(animal != null) {
                rtn += animal.getMass();
            }
        }
        return rtn;
    }
    public int totalLegs() {
        int rtn = 0;
        for(Animal animal : cages) {
            if(animal != null) {
                rtn += animal.getLegs();
            }
        }
        return rtn;
    }
    public void removeAnimal(int i) {
        cages[i].die();
        cages[i] = null;
    }
    public void reorder() {
        int first = 0;
        for(int i = 0; i < cages.length; i++) {
            if(cages[i] != null) {
                cages[first] = cages[i];
                first++;
            }
        }
    }
    public void makeBaby() {
        //if(numberOfAnimals() == cages.length) {
        //    return;
        //}
        for(int first = 0; first < cages.length; first++) {
            if(cages[first] == null) continue;
            for(int second = first + 1; second < cages.length; second++) {
                if(cages[second] == null) continue;
                if(cages[first].getName().equals(cages[second].getName())) {
                    addAnimal(new Animal((cages[first].getMass()+cages[second].getMass())/20f, cages[first].getName(), cages[first].getLegs()));
                }
            }
        }
    }
    
    public void expand() {
        Animal[] newCages = new Animal[(int)((cages.length)*(1.5))];
        for(int i = 0; i < cages.length; i++) {
            newCages[i] = cages[i];
        }
        cages = newCages;
    }
}
