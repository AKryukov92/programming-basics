package Lab15;

import Lab15.task1753.Edge1753;
import Lab15.task1753.Route1753;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author akryukov
 *         16.11.2017
 */
public class Task1753solution {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("1753");
        for (int i = 0; i < 9; i++){
            task1753(".\\task1753\\test" + (i + 1) + ".csv");
        }
    }

    public static void task1753(String filename){
        File target = new File(filename);
        try (Scanner scanner = new Scanner(target)) {
            logic1753(scanner);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует: " + target.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void logic1753(Scanner scanner) throws Exception {
        Set<Edge1753> edges = new HashSet<>();
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arr = line.split(";");
            Edge1753 route = Edge1753.make(arr);
            if (route.getDistance() <= 0){
                throw new Exception("Расстояние должно быть неотрицательно");
            }
            edges.add(route);
        }
        List<Route1753> routes = new ArrayList<>();
        for (Edge1753 left: edges) {
            for (Edge1753 right: edges) {
                if (left.equals(right)){
                    continue;
                }
                if (right.isBefore(left) || left.isBefore(right)){
                    routes.add(new Route1753(left, right));
                }
                if (left.isBeforeReverse(right) || right.isBeforeReverse(left)){
                    routes.add(new Route1753(left, right));
                }
            }
        }
        if (routes.size() < 2){
            throw new Exception("Недостаточно данных");
        }
        routes.sort((left, right) -> {
            int dDist = left.getDistance() - right.getDistance();
            if (dDist != 0){
                return dDist;
            }
            int comparison = left.getFirst().compareTo(right.getFirst());
            if (comparison != 0){
                return comparison;
            }
            comparison = left.getSecond().compareTo(right.getSecond());
            if (comparison != 0){
                return comparison;
            }
            return left.getThird().compareTo(right.getThird());
        });
        for (Route1753 route : routes) {
            System.out.println(route);
        }
        System.out.println();
    }
}
