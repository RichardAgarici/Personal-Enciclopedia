package sda.linkedlist;

/**
 * Ex 8
 * Create a class imitating a weapon magazine.
 * The class should be able to define the size of the magazine using the constructor.
 * <p>
 * Implement the methods:
 * <p>
 * loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges than the capacity of the magazine
 * <p>
 * isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
 * shot()
 * <p>
 * → each call shots one bullet (prints string value in console)
 * - the last loaded cartridge
 * - and prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty magazine" in the console
 */
public class Main {
    public static void main(String[] args) {

        var weapon = new WeaponMagazine(8);
        weapon.loadBullets("Bullet1");
        weapon.loadBullets("Bullet2");
        weapon.loadBullets("Bullet3");
        weapon.loadBullets("Bullet4");
        weapon.loadBullets("Bullet5");
        weapon.loadBullets("Bullet6");
        weapon.loadBullets("Bullet7");
        weapon.loadBullets("Bullet8");
        weapon.loadBullets("Bullet9");

        System.out.println(weapon.isLoaded());
        for (int i = 0; i <= 8; i++) {
            weapon.shot();
        }

        System.out.println(weapon.isLoaded());
    }
}
