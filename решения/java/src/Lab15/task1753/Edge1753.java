package Lab15.task1753;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Edge1753 {
    private String source;
    private String destination;
    private int distance;

    public Edge1753(String source, String destination, int distance){
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Edge1753{" +
            "source='" + source + '\'' +
            ", destination='" + destination + '\'' +
            ", distance=" + distance +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge1753 edge1753 = (Edge1753) o;

        if (distance != edge1753.distance) return false;
        if (source.equals(edge1753.source)) return true;
        if (source.equals(edge1753.destination)) return true;
        if (destination.equals(edge1753.source)) return true;
        return destination.equals(edge1753.destination);
    }

    @Override
    public int hashCode() {
        int result = source.hashCode();
        result = 31 * result + destination.hashCode();
        result = 31 * result + distance;
        return result;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isBefore(Edge1753 other){
        return this.destination.equals(other.source);
    }

    public boolean isBeforeReverse(Edge1753 other){
        return this.destination.equals(other.destination)
            || this.source.equals(other.source);
    }

    public static Edge1753 make(String[] arr) throws Exception {
        if (arr.length != 3){
            throw new Exception("Некорректный формат");
        }
        String source = arr[0];
        String destination = arr[1];
        int distance = Integer.parseInt(arr[2]);
        return new Edge1753(source, destination, distance);
    }
}
