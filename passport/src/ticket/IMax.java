package ticket;

public class IMax {
    static int rows = 0;
    static int seats = 0;
    String movie;

    public IMax(String movie) {
        this.movie = movie;
    }

    public void movie() {

        for (rows = 0; rows <= 100; rows++) {
            rows = rows++;
            System.out.println("rows: " + rows);
        }
        for (seats = 0; seats <= 100; seats++) {
            seats = seats++;
            System.out.println("seats: " + seats);

        }


    }
    @Override
    public String  toString() {
        return "IMax{" +
                "movie='" + movie + '\'' +
                '}';
    }
}

