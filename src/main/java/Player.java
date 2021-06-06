public class Player {
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", symbol=" + symbol +
                '}';
    }

    String name;
    char symbol;

    public Player(String name, char symbol ){
        this.symbol = symbol;
        this.name = name;
    }
    //ckj
}
