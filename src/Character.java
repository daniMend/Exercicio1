public abstract class Character implements WeaponBehavior{

    private WeaponBehavior weapon;

    public abstract void fight();

    private void setWeapon(WeaponBehavior w)
    {
        this.weapon = w;
    }

    @Override
    public void useWeapon() {
        /*Your code here*/
    }
}
