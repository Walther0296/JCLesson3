// **Урок 3. Классы и объекты**

import java.time.LocalDate;

        public class Main {
            public static void main(String[] args) {
                Employees alex = new Employees("Шавыкин", "Алексей", "Викентьевич", LocalDate.of(1997, 5, 15), "Менеджер проекта", 320);
                Employees anatolii = new Employees("Савушкин", "Анатолий", "Сергеевич", LocalDate.of(1998, 8, 24), "Бухгалтер", 110);
                Employees daniil = new Employees("Шкубулианов", "Даниил", "Мирзаевич", LocalDate.of(2000, 5, 15), "Менеджер продукта", 320);
                Employees maria = new Employees("Климкина", "Мария", "Викторовна", LocalDate.of(2003, 1, 8), "Эксперт по связям с общественностью", 170);
                Employees dmitrii = new Employees("Прудиков", "Дмитрий", "Александрович", LocalDate.of(1989, 3, 8), "Программист", 235);
                Employees anastasia = new Employees("Петрова", "Анастасия", "Алексеевна", LocalDate.of(2000, 12, 5), "Дизайнер", 210);
                Employees vadim = new Employees("Потапов", "Вадим", "Александрович", LocalDate.of(1978, 11, 10), "Главный бухгалтер", 180);
                Employees klim = new Employees("Жуковский", "Клим", "Петрович", LocalDate.of(1989, 1, 8), "Экономист", 150);

//1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные
// в виде трёх чисел гггг-мм-дд, без использования условного оператора.

                System.out.println("Задача №1.");
                if (Employees.birthDateComparator().compare(alex, anastasia) > 0) {
                    System.out.println(alex.getFirstName() + " старше, чем " + anastasia.getFirstName());
                    System.out.println(" ");
                } else if (Employees.birthDateComparator().compare(alex, anastasia) < 0) {
                    System.out.println(alex.getFirstName() + " младше, чем " + anastasia.getFirstName());
                    System.out.println(" ");
                } else {
                    System.out.println(alex.getFirstName() + " и " + anastasia.getFirstName() + " родились в один день");
                    System.out.println(" ");
                }

//2. Опишите класс руководителя, наследник от сотрудника .
// Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
// чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя
// и поместите его в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
                System.out.println("Задача №2.");
                Manager savelov = new Manager("Савелов", "Евгений", "Борисович", LocalDate.of(1968, 11, 18), "Руководитель организации", 410);

                // Создаем массив сотрудников, включая руководителя
                Employees[] employees = {alex, anatolii, daniil, maria, dmitrii, anastasia, vadim, klim, savelov};

                // Выводим информацию о зарплате каждого сотрудника до повышения, для дальнейшего контроля
                for (Employees employee : employees) {
                    System.out.println(employee.getSurname() + " " + employee.getFirstName() + ", '" + employee.getPosition() + "' " + ": " +
                            "до повышения - " + employee.getSalary());
                }
                System.out.println(" ");


                // Повышаем зарплату всем сотрудникам
                Manager.increaseSalary(employees, 10);

                // Выводим информацию о зарплате каждого сотрудника после повышения
                for (Employees employee : employees) {
                    System.out.println(employee.getSurname() + " " + employee.getFirstName() + ", '" + employee.getPosition() + "' " + ": " +
                            "после повышения - " + employee.getSalary());
                }
            }
}