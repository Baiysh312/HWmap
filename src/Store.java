public class Store<O, H> {
    private O Name;
    private H ID;

    public Store(O name, H ID) {
        Name = name;
        this.ID = ID;
    }

    public O getName() {
        return Name;
    }

    public void setName(O name) {
        Name = name;
    }

    public H getID() {
        return ID;
    }

    public void setID(H ID) {
        this.ID = ID;
    }
}
