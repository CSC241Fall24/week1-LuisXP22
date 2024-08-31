public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        this.id = 1;
        this.level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        this.level = lv;
        if (this.level >= 16 && this.level < 32) {
            this.id = 2;
        } else if (this.level >= 32) {
            this.id = 3;
    }

    // getLevel method
    public int getLevel() {
        return this.level;
    }

    // getName method
    public String getName() {
        switch (this.id) {
            case 1:
                return "Bulbasaur";
            case 2:
                return "Ivysaur";
            case 3:
                return "Venusaur";
            default:
                return "Unknown";
        )
    }

    // getID method
    public int getID() {
        return this.id;
    }

    // toString method
    @Override
    public String toString() {
        return "Bulbasaur(id=" + this.id + ", level=" + this.level + ')';
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (other == null) return false;
        return this.id == other.id && this.level == other.level;
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur newBulbasaur = new Bulbasaur();
        newBulbasaur.id = this.id;
        newBulbasaur.level = this.level;
        return newBulbasaur;
    }
}
