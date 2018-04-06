package Lab15.solution.task1753;

/**
 * @author akryukov
 *         28.11.2017
 */
public class Route1753 {
    private String first;
    private String second;
    private String third;
    private int distance;

    public Route1753(Edge1753 left, Edge1753 right){
        if (left.isBefore(right)) {
            first = left.getSource();
            second = left.getDestination();
            third = right.getDestination();
            distance = left.getDistance() + right.getDistance();
        } else if (right.isBefore(left)) {
            first = left.getDestination();
            second = right.getDestination();
            third = right.getSource();
            distance = left.getDistance() + right.getDistance();
        } else if (left.isBeforeReverse(right)) {
            first = left.getDestination();
            second = left.getSource();
            third = right.getDestination();
            distance = left.getDistance() + right.getDistance();
        } else if (right.isBeforeReverse(left)){
            first = left.getSource();
            second = left.getDestination();
            third = right.getSource();
            distance = left.getDistance() + right.getDistance();
        } else {
            throw new IllegalArgumentException("Маршруты не смежные");
        }
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getThird() {
        return third;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return first + " - " +
            second + " - " +
            third + " (" + distance + " км}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route1753 route1753 = (Route1753) o;

        if (distance != route1753.distance) return false;
        if (!first.equals(route1753.first)) return false;
        if (!second.equals(route1753.second)) return false;
        return third.equals(route1753.third);
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + second.hashCode();
        result = 31 * result + third.hashCode();
        result = 31 * result + distance;
        return result;
    }
}
