import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(25, 61);//

        int salary = random.nextInt(50000, 110000);

        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;


    }

    static Freelancer generateFreelancer() {


        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};




        double salary = 1000 * (random.nextInt(2, 241)); //Ставка 1000 рублей в час.
        int age = random.nextInt(25, 61);//Генерируем возраст работника


        Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return freelancer;
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++){
            int index = random.nextInt(2);
            if(index == 0){
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new ageComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new ageComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
