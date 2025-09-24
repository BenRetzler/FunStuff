import java.util.Random;

public class Monster
{
  private int health, level;
  private Weapon attack;
  private Random random;

  public Monster()
  {
    health = 100;
    level = 0;
    random = new Random();
    attack = new Weapon();
  }
  public Monster(int h, int lvl)
  {
    heatlh = h;
    level = lvl;
    random = new Random();
    attack = new Weapon("",random.nextInt(2*(0.2*level))+1,
  }
}
