package main;


     class Cat extends Animal{
         public Cat(String name, double speedRun, int endurance) {
             super(name, speedRun, 0, endurance);
         }

         public double run(int distance) {
             if (endurance < distance) {
                 System.out.println(name + " устал!");
                 return -1;
             }
             endurance -= distance;
             double time = distance / speedRun;
             System.out.println(name + " пробежал " + distance + " м за " + time + " секунд.");
             return time;
         }

         public double swim(int distance) {
             System.out.println(name + " не умеет плавать!");
             return -1;
         }
     }




