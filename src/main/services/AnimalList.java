package main.services;

import main.data.Cat;
import main.data.Dog;
import main.data.Rat;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * Список животных.
 */
public class AnimalList <Animal> {
    private List<Animal> animals = new ArrayList<>();

    /**
     * Добавить животное в список.
     * @param animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Удалить животное из списка.
     * @param animal
     * @return
     */
    public boolean removeAnimal(Animal animal){
        return animals.remove(animal);
    }

    /**
     * Получить список животных.
     * @return
     */
    public List<Animal> getAnimals(){
        return animals;
    }

    /**
     * Получить только кошек.
     * @return
     */
    public List<Animal> getCats(){
        return animals.stream().filter(x -> x instanceof Cat).toList();
    }

    /**
     * Получить только собак.
     * @return
     */
    public List<Animal> getDogs(){
        return animals.stream().filter(x -> x instanceof Dog).toList();
    }

    /**
     * Получить только крыс.
     * @return
     */
    public List<Animal> getRats(){
        return animals.stream().filter(x -> x instanceof Rat).toList();
    }

    public Cat findCat(String name){
        List<Cat> cats = (List<Cat>) this.getCats();
        Cat cat = null;

        try {
            cat = cats.stream().filter(c -> c.getName().equals(name)).findFirst().get();
        }
        catch (NoSuchElementException ex){
            cat = null;
        }
        return cat;
    }

    public Dog findDog(String name){
        List<Dog> dogs = (List<Dog>) this.getDogs();
        Dog dog = null;

        try {
            dog = dogs.stream().filter(c -> c.getName().equals(name)).findFirst().get();
        }
        catch (NoSuchElementException ex){
            dog = null;
        }
        return dog;
    }

    public Rat findRat(String name){
        List<Rat> rats = (List<Rat>) this.getRats();
        Rat rat = null;

        try {
            rat = rats.stream().filter(c -> c.getName().equals(name)).findFirst().get();
        }
        catch (NoSuchElementException ex){
            rat = null;
        }
        return rat;
    }

}
