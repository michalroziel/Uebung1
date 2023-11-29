public class Cat {

    private double gewicht;
    private boolean hungrig;
    private boolean aktiv;
    private String color;
    private String name;

    private int health;
    private int damage;

    private boolean superSayin;


    public void setSuperSayin(boolean superSayin) {
        this.superSayin = superSayin;
    }

    public Cat(double pGewicht, boolean pHungrig, boolean pAktiv, String pColor, String pName,
               int pDamage, int pHealth) {
        this.gewicht = pGewicht;
        this.hungrig = pHungrig;
        this.aktiv = pAktiv;
        this.color = pColor;
        this.name = pName;
        this.superSayin = false;
        this.health = pHealth;
        this.damage = pDamage;
    }

    public void superSayin() {
        this.superSayin = this.health < 25;
    }
    public void fressen(double pFutter) {
        if (hungrig) {
            this.gewicht += pFutter;
        } else {
            System.out.println(" Cat is not hungry ! ");
        }
    }

    public void runMiau(double pDistance) {
        if (aktiv) {
            this.gewicht -= (pDistance * 0.05);
        } else {
            System.out.println("Cat is sleepy now ! ");
        }
    }

    public void printInformation() {
        superSayin();
        System.out.println(this.name + " ist " + this.gewicht + "g schwer!  " + "\n die farbe ist : " + this.color + " \n die katze ist hungrig : " + this.hungrig +
                "\n und der AktivStatus ist : " + this.aktiv +
                "\n HP ist :" + this.health + " der super status ist : " + this.superSayin +"\n\n"
        );

    }

    public void fallAsleep() {
        this.aktiv = false;
        this.hungrig = true;

    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isHungrig() {
        return hungrig;
    }

    public void setHungrig(boolean hungrig) {
        this.hungrig = hungrig;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public boolean isSuperSayin() {
        return superSayin;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }
}
