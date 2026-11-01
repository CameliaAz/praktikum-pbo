package id.ac.polinema.polimorfisme.zombie;

public class MainTugas2 {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        // Menyimpan dalam array bertipe Destroyable
        Destroyable[] elements = {wz, jz, b};

        // Hancurkan semua elemen array sebanyak 4 kali
        for (int i = 0; i < 4; i++) {
            for (Destroyable d : elements) {
                p.doDestroy(d);
            }
        }

        // Telusuri array, periksa instanceof, cast, dan panggil method
        for (Destroyable d : elements) {
            if (d instanceof Zombie) {
                Zombie z = (Zombie) d; // Casting ke Zombie
                z.heal();              // Panggil method heal()
                System.out.println(z.getZombieInfo());
            } else if (d instanceof Barrier) {
                Barrier barrier = (Barrier) d; // Casting ke Barrier
                System.out.println(barrier.getBarrierInfo());
            }
        }
    }
}
