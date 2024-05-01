package lesson13;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    // Constructor
    public Family(Human mother, Human father) {
        if (mother == null || father == null) {
            throw new IllegalArgumentException("Both mother and father must be present to create a family.");
        }
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    // Getters
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    // Setters
    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Redefining toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family Info:\n");
        sb.append("Mother: ").append(mother).append("\n");
        sb.append("Father: ").append(father).append("\n");
        sb.append("Children:\n");
        for (Human child : children) {
            sb.append(child).append("\n");
        }
        sb.append("Pet: ").append(pet);
        return sb.toString();
    }
}
