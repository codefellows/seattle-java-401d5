package demo;

import java.util.LinkedList;
import java.util.List;

public class ServiceAnimalHandler {
    ServiceAnimal myAnimal;

    public ServiceAnimalHandler(ServiceAnimal myAnimal) {
        this.myAnimal = myAnimal;
    }
}












class Review {
    Reviewable subject;

    public Review(Reviewable subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
        Review r = new Review(new Restaurant());
        r.subject.addReview(r);
        Review secondReview = new Review(new Shop());
    }


}

interface Reviewable {
    public void addReview(Review r);
}

class Restaurant implements Reviewable {
    List<Review> rs;
    @Override
    public void addReview(Review r) {
        this.rs.add(r);
        r.subject = this;
    }

    public Restaurant() {
        this.rs = new LinkedList<>();
    }

    public String getFood() {
        return "food";
    }
}

class Shop implements Reviewable {
    @Override
    public void addReview(Review r) {

    }
}


















