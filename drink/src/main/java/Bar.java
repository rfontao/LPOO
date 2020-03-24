import java.util.ArrayList;
import java.util.List;

abstract class Bar {

    private List<BarObserver> observers;
    private boolean happyHour;

    public Bar(){
        this.happyHour = false;
        this.observers = new ArrayList<>();
    }

    public boolean isHappyHour() {
        return this.happyHour;
    }

    public void startHappyHour() {
        this.happyHour = true;
        this.notifyObservers();
    }

    public void endHappyHour() {
        happyHour = false;
        this.notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
