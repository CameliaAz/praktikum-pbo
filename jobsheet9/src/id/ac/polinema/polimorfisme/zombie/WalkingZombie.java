package id.ac.polinema.polimorfisme.zombie;

public class WalkingZombie extends Zombie{
    
    public WalkingZombie (int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        int bonus = 0;
        switch (level) {
            case 1:
                bonus = health * 10 / 100;
                break;
            case 2:
                bonus = health * 30 / 100;
                break;
            case 3:
                bonus = health * 40 / 100;
                break;
        }
        // Menambahkan bonus lalu membatasi maksimal health 100
        this.health = Math.min(this.health + bonus, 100);
    }

    @Override
    public void destroyed() {
        this.health -= this.health * 20 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}
