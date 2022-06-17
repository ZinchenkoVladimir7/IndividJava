package com.Zinchenko.homework.oop;

public class Main {
//    1. Создайте тип данных Участник и несколько его реализаций: Человек, Кот, Робот.
//
//2. Классы из п.2 должны обладать поведением бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//            3. Создайте тип данных Препятствие и несколько его реализаций: Беговая Дорожка и Стена.
//
//            4. Классы из п.3 должны обладать поведением преодолеть препятствие (overcome).
//
//            5. Наладить взаимодействие между Участником и Препятствием.
//    Другими словами, участники при прохождении через препятствия должны выполнять соответствующие действия (бежать или прыгать).
//    Например: Человек пробежал беговую дорожку.
//
//            6. Создайте два массива: с участниками и препятствиями.
//
//            7. Каждый элемент из массива с участниками должен пройти каждое препятствие из массива с препятствиями.
//
//            8. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//    Если участник не смог пройти одно из препятствий, то к следующему он не приступает (полностью выбывает из участия в серии препятствий).
//
//            9. * Результат выполнения участником конкретного препятствия выводить в консоль. Например: "Участник[ИМЯ] прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]"
//            "Участник[ИМЯ] не прошел препятствие[НАЗВАНИЕ] на дистанции[ЗНАЧЕНИЕ]. Пройдено[ЗНАЧЕНИЕ]"

    public static void main(String[] args) {
        Human human = new Human("Alex",10000,2.0);
        Cat cat = new Cat("Vaska",1000,2.3);
        Robot robot = new Robot("R2D2",30000,3.0);

        Wall wall = new Wall(2.1);
        Treadmill treadmill = new Treadmill(10000);

        Competitor [] competitors = new Competitor[]{human,cat,robot};
        Obstacle[] obstacles = new Obstacle[]{treadmill,wall};

        for (Competitor competitor : competitors){
            for (Obstacle obstacle : obstacles){
                if(!obstacle.overcome(competitor)){
                    break;
                    //     for (int i = 0;i < competitors.length;i++){
                    //        for (int j = 0; j < obstacles.length ; j++) {
                    //            if(competitors[i].run()<= obstacles[j])
//

                }
            }

        }


    }
}
