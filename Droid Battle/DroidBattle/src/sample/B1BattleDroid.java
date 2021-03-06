package sample;

public class B1BattleDroid {

  double Health=500;
  double Armor=1000;
  double Shield=500;

  static final double Dexterity =0.3;
  static final double AttackSpeed=1.2;
  static final double CritChance=0.2;

  double mod;


  /**Getters*/
  public double getHealth() {
    return Health;
  }

  public double getArmor() {
    return Armor;
  }

  public double getShield(double shield) {
    return Shield;
  }
  public double getAttackSpeed() {
    return AttackSpeed;
  }
  public double getLuck() {
    return Luck;
  }
  public double getCritChance() {
    return CritChance;
  }

  /**Setters*/
  public void setHealth(double mod,double health) {
    Health = health-mod;
  }

  public void setArmor(double mod,double armor) {
    Armor = armor-mod;
  }

  public void setShield(double mod,double shield) {
    Shield = shield-mod;
  }


  /**ClassInfo*/
  public void PrintInfo(){
    System.out.println("B1BattleDroid is light droid class with hight attackspeed,");
  }

  @Override
  public String toString()
  {
    return String.format("B1BattleDroid Health is"+Health+"B1BattleDroid Armor is"+Armor+"B1BattleDroid Shield is"+Shield);
  }
   //**Constructor */
   public  B1BattleDroid (double health,double armor, double shield)
   {this.Health=health;
    this.Armor=armor;
    this.Shield=shield;
   }

/**ClassMethods*/

  /**Attack*/
  public void Attack(double Health,double Armor,double Shield)
  {
    double mod = (Math.random() * 10 + 30);
    setHealth(mod,Health);
    setArmor(mod,Armor);
    setShield(mod,Shield);
    System.out.printf("B1SuperBattleDroid Supper Atacked  for %f  Health Armor for %f Shield for %f \n",mod,mod,mod);
  }

  public void CustomAttack(double Health,double Armor,double Shield)

  {
    double mod = (Math.random() * 20 + 50);
    setHealth(mod,Health);
    setArmor(mod,Armor);
    setShield(mod,Shield);
    System.out.printf("B1SuperBattleDroid Supper Atacked  for  %f Health for %f Armor  and for %f Shield  \n"mod,mod,mod);

  }

  /**Defence*/
  public double Defence()
  {
    double mod = (Math.random() * 30 + 10);
    System.out.printf("B1SuperBattleDroid Defence mitigated Damage for %f Health for %f Armor and for %f Shield \n",mod,mod,mod);
    return mod;

  }

  public double CustomDefence ( )
  {
    double mod = (Math.random() * 50 + 30);
    System.out.printf("B1SuperBattleDroid Defence mitigated Damage for %f Health for %f Armor and for %f Shield \n",mod,mod,mod);
    return mod;

  }



}
