package sda.linkedlist;

import java.util.LinkedList;

/**
 * daca e final nu e musai sa fie initializat in line. se poate initializa si in constructor.
 */
public class WeaponMagazine {
    private final int maxSize;
    private final LinkedList<String> bullets = new LinkedList<>();

    public WeaponMagazine(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void loadBullets(String bullet) {
        if (bullets.size() < maxSize) {
            bullets.addLast(bullet);
        } else {
            System.out.println("Max size " + maxSize + " reached!");
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            System.out.println(bullets.removeFirst());
        } else {
            System.out.println("Empty magazine!");
        }
    }
}