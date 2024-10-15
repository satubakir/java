package main;

 class Animal {
    protected String name;
    protected double speedRun; // скорость бега (м/с)
    protected double speedSwim; // скорость плавания (м/с)
    protected int endurance; // выносливость (ед.)

    public Animal(String name, double speedRun, double speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun + " м/с");
        System.out.println("Скорость плавания: " + speedSwim + " м/с");
        System.out.println("Выносливость: " + endurance);
    }
}


