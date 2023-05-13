package root.tasks.objects;

import root.tasks.LayoutMaker;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task1909 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Прочитать из файла список деталей и узлов. Узел может состоять из других узлов и деталей.");
        //нужна иерархия:
        //A из 3 B + 2 C
        //B из 5 E + 7 C
        //F из 4 B + 3 E
        //C и E это базовые детали, которые есть на складе
        //Поступил заказ на 50A и 20F
        //Создайте стек, поместите в него деталь A
        //Затем поместите в стек детали, из которых изготавливается деталь A
        //Затем поместите в стек детали, из которых изготавливается деталь B
        appendFooter();
    }

    private static class ProductionTask {
        public String name;
        public int amount;
    }

    private static class Recipe {
        public String name;
        public ProductionTask[] requirements;
    }

    public static void main(String[] args) {
        Recipe a = new Recipe();
        a.name = "A";
        ProductionTask aTaskB = new ProductionTask();
        aTaskB.amount = 3;
        aTaskB.name = "B";

        ProductionTask aTaskC = new ProductionTask();
        aTaskC.amount = 2;
        aTaskC.name = "C";
        a.requirements = new ProductionTask[]{
                aTaskB, aTaskC
        };

        Recipe b = new Recipe();
        b.name = "B";
        ProductionTask bTaskE = new ProductionTask();
        bTaskE.amount = 5;
        bTaskE.name = "E";
        ProductionTask bTaskC = new ProductionTask();
        bTaskC.amount = 7;
        bTaskC.name = "C";
        b.requirements = new ProductionTask[]{
                bTaskC, bTaskE
        };

        Recipe f = new Recipe();
        f.name = "F";
        ProductionTask fTaskB = new ProductionTask();
        fTaskB.amount = 4;
        fTaskB.name = "B";
        ProductionTask fTaskC = new ProductionTask();
        fTaskC.amount = 3;
        fTaskC.name = "E";
        f.requirements = new ProductionTask[]{
                fTaskB, fTaskC
        };
        Map<String, Recipe> recipeMap = new HashMap<String, Recipe>() {{
            put("A", a);
            put("B", b);
            put("F", f);
        }};

        Recipe order = new Recipe();
        order.name = "order";
        ProductionTask orderA = new ProductionTask();
        orderA.amount = 50;
        orderA.name = "A";
        ProductionTask orderF = new ProductionTask();
        orderF.amount = 20;
        orderF.name = "F";
        order.requirements = new ProductionTask[] {
                orderA, orderF
        };

        Stack<ProductionTask> stack = new Stack<>();
        pushTasks(order, 1, stack, recipeMap);

        Map<String, Integer> amounts = new HashMap<>();

        System.out.println("Order of production");
        for (int i = 0; !stack.empty(); i++) {
            ProductionTask task = stack.pop();
            if (amounts.containsKey(task.name)) {
                Integer amount = amounts.get(task.name);
                amounts.put(task.name, task.amount + amount);
            } else {
                amounts.put(task.name, task.amount);
            }
            System.out.println(task.name + task.amount);
        }

        System.out.println("Total amounts");
        for (String key: amounts.keySet()) {
            if (!recipeMap.containsKey(key)) {
                System.out.println(key + " " + amounts.get(key));
            }
        }
    }

    public static void pushTasks(Recipe r, int amount, Stack<ProductionTask> stack, Map<String, Recipe> map) {
        for (int i = 0; i < r.requirements.length; i++) {
            ProductionTask task = new ProductionTask();
            task.name = r.requirements[i].name;
            task.amount = r.requirements[i].amount * amount;
            stack.push(task);
            if (map.containsKey(task.name)) {
                pushTasks(map.get(task.name), task.amount, stack, map);
            }
        }
    }
}
