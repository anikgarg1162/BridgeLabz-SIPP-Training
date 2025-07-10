class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev;
    Movie next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieList {
    private Movie head;
    private Movie tail;

    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        int index = 0;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }

    public void removeByTitle(String title) {
        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = temp.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = temp.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie removed successfully.");
    }

    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found by that director.");
    }

    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found with that rating.");
    }

    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        temp.rating = newRating;
        System.out.println("Rating updated.");
    }

    public void displayForward() {
        Movie temp = head;
        if (temp == null) {
            System.out.println("Movie list is empty.");
            return;
        }
        System.out.println("Movies (Forward):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Movie temp = tail;
        if (temp == null) {
            System.out.println("Movie list is empty.");
            return;
        }
        System.out.println("Movies (Reverse):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    private void displayMovie(Movie movie) {
        System.out.println("Title: " + movie.title +
                ", Director: " + movie.director +
                ", Year: " + movie.year +
                ", Rating: " + movie.rating);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addAtPosition(1, "The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addAtEnd("Tenet", "Christopher Nolan", 2020, 7.5);

        movieList.displayForward();
        movieList.displayReverse();

        movieList.searchByDirector("Christopher Nolan");
        movieList.searchByRating(8.6);

        movieList.updateRating("Tenet", 8.0);
        movieList.displayForward();

        movieList.removeByTitle("Inception");
        movieList.displayForward();
    }
}
