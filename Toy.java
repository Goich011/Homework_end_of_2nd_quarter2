package homework2;

public class Toy {
    private int id;
    private String toyName;
    private int amountRemaining;
    private int dropRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyname(String toyName) {
        this.toyName = toyName;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }

    public Toy() {
    }

    public Toy(int id, String toyName, int amountRemaining, int dropRate) {
        this.id = id;
        this.toyName = toyName;
        this.amountRemaining = amountRemaining;
        this.dropRate = dropRate;
    }

    public void printToyInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("id: %d\nНазвание игрушки: %s\nКоличество игрушек: %d\nВероятность выйгрыша: %d%%\n\n",
                this.getId(), this.getToyName(), this.getAmountRemaining(), this.getDropRate()));
        System.out.print(sb);
    }
}