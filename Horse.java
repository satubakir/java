package main;


    class Horse extends Animal {
        public Horse(String name, double speedRun, double speedSwim, int endurance) {
            super(name, speedRun, speedSwim, endurance);
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
            int cost = distance * 4; // затраты на плавание
            if (endurance < cost) {
                System.out.println(name + " устал!");
                return -1;
            }
            endurance -= cost;
            double time = distance / speedSwim;
            System.out.println(name + " проплыл " + distance + " м за " + time + " секунд.");
            return time;
        }
    }

