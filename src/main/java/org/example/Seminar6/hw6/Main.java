package org.example.Seminar6.hw6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebooks nout1 = new Notebooks("Apple", "D321dk", 4000, 500, "Linux", "White");
        Notebooks nout2 = new Notebooks("LG", "Qupo4311d", 8000, 1000, "Windows", "Black");
        Notebooks nout3 = new Notebooks("Samsung", "K477dk", 8000, 500, "Windows", "White");
        Notebooks nout4 = new Notebooks("Apple", "D321sd4", 8000, 1000, "Linux", "Black");
        Notebooks nout5 = new Notebooks("LG", "Kfd443", 4000, 1000, "Windows", "Black");
        Notebooks nout6 = new Notebooks("MSI", "Dragon7", 16000, 1000, "Windows", "Black");

        Set<Notebooks> laptopSet = new HashSet<>();
        laptopSet.add(nout1);
        laptopSet.add(nout2);
        laptopSet.add(nout3);
        laptopSet.add(nout4);
        laptopSet.add(nout5);
        laptopSet.add(nout6);

        Map<Integer, Set<Notebooks>> findLaptop = new HashMap<>();
        boolean controlEnd = true;
        System.out.print("Выберите критерии поиска для ноутбука: " +
                "\n1. Название ноутбука " +
                "\n2. Модель ноутбука" +
                "\n3. Оперативная память" +
                "\n4. Объем жесткого диска" +
                "\n5. Опепрационная система" +
                "\n6. Цвет \n"
        );

        while (controlEnd) {
            System.out.print("Введите пункт меню поиска: ");
            int whatSearch = mainChoose();
            if (whatSearch == 1) {
                findLaptop.put(1, searchName(laptopSet));
            }
            if (whatSearch == 2) {
                findLaptop.put(2, searchModel(laptopSet));
            }
            if (whatSearch == 3) {
                findLaptop.put(3, searchOZU(laptopSet));
            }
            if (whatSearch == 4) {
                findLaptop.put(4, searchHD(laptopSet));
            }
            if (whatSearch == 5) {
                findLaptop.put(5, searchSystem(laptopSet));
            }
            if (whatSearch == 6) {
                findLaptop.put(6, searchColor(laptopSet));
            }
            controlEnd = circleAnswer();
        }

        Set<Notebooks> tmpSet = new HashSet<>(findLaptop.values().iterator().next());
        for (Map.Entry<Integer, Set<Notebooks>> entry : findLaptop.entrySet()) {
            tmpSet.retainAll(entry.getValue());
        }
        int numbers = 1;
        if (!tmpSet.isEmpty()) {
            System.out.println("Ноутбуки по выбранным параментам: ");
            for (Notebooks text : tmpSet) {
                System.out.println(numbers + ". " + text);
                numbers++;
            }
        } else System.out.println("Ноутбуков по выбранным параметрам нет");
    }


    public static Integer mainChoose() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int nunMenu = scanner.nextInt();
            if (nunMenu > 0 && nunMenu < 7) return nunMenu;
            else {
                System.out.print("Введен неверный пункт меню, повторите ввод: ");
                return mainChoose();
            }
        } else {
            System.out.print("Введен неверный пункт меню, повторите ввод: ");
            return mainChoose();
        }
    }


    public static Set<Notebooks> searchName(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите название ноутбука: ");
        String whatLookingFor = scanner.next();
        for (Notebooks note : someSet) {
            if (note.getName().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Notebooks> searchModel(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите модель ноутбука: ");
        String whatLookingFor = scanner.next();
        for (Notebooks note : someSet) {
            if (note.getModel().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Notebooks> searchOZU(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите объем оперативной памяти: ");
        int whatLookingFor = scanner.nextInt();
        for (Notebooks note : someSet) {
            if (note.getOzu() == whatLookingFor) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Notebooks> searchHD(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите объем жесткого диска: ");
        int whatLookingFor = scanner.nextInt();
        for (Notebooks note : someSet) {
            if (note.getHardDrive() == whatLookingFor) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Notebooks> searchSystem(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите перационную систему: ");
        String whatLookingFor = scanner.nextLine();
        for (Notebooks note : someSet) {
            if (note.getSystem().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Notebooks> searchColor(Set<Notebooks> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Notebooks> control = new HashSet<>();
        System.out.print("Выберите цвет ноутбука: ");
        String whatLookingFor = scanner.nextLine();
        for (Notebooks note : someSet) {
            if (note.getColor().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }


    public static boolean circleAnswer() {
        System.out.print("Вы хотите попробовать добавить ещё один критерий поиска ноутбука? Ответьте Да или Нет: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        if (text.equals("да")) {
            return true;
        } else if (text.equals("нет")) {
            return false;
        } else {
            System.out.println("Введено неверное значение");
            return circleAnswer();
        }
    }

}

