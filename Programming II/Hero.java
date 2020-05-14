/**Brian Hauck
 * Lab 2
 * 
 * Preface:
 * I own overwatch and know a good amount about the game. 
 * I halved all of the cooldowns just to make the simulation easier.
 * I did not factor in headshots because that would make it harder to balance.
 * I didn't use armor but I factored it in anyway because it shows I know how the damage values work.
 * This was a very interesting and educational lab.
 * I couldn't figure out how to do this at first.
 * I just returned the damage values and used a Super method instead.
 */

public class Hero
{
    private int health;
    private int shield;
    private int armor;
    private int ammo;
    private int ultimateMeter;

    private String name;

    private boolean isJumping = false;
    private boolean isReloading = false;
    private boolean isCrouching = false;
    private boolean isUlting = false;

    public Hero(){
    }

    public void setName(String id){
        name = id;
    }

    public void setHealth(int hp){
        health = hp;
    }

    public void setShield(int shield){
        this.shield = shield;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public void setAmmo(int ammo){
        this.ammo = ammo;
    }

    public void setUltMeter(int ultMeter){
        ultimateMeter = ultMeter;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getShield(){
        return shield;
    }

    public int getArmor(){
        return armor;
    }

    public int getAmmo(){
        return ammo;
    }

    public int getUltMeter(){
        return ultimateMeter;
    }

    public void Jump(){
        isJumping = true;
        System.out.println(isJumping);
        isJumping = false;
        System.out.println(isJumping);
    }

    public void Crouch(){
        if(isCrouching == true){
            isCrouching = false;
        }
        else{
            isCrouching = true;
        }
    }

    public void Reload(int maxAmmo){
        if(getAmmo() < maxAmmo){
            isReloading = true;    
            System.out.println("Reloading...");
            ammo = maxAmmo;
            isReloading = false;
            System.out.println("Done.");
        }
    }

    public void Damage(int dmg){
        if(getArmor()>0){
            if(Math.max(getArmor(), .5*dmg) == dmg){
                dmg = dmg - (int)2*getArmor();
                if(Math.max(getShield(), dmg) == dmg){
                    dmg = dmg - getShield();
                    setShield(0);
                    setHealth(getHealth() - dmg);
                }
                else{
                    setShield(getShield() - dmg);
                }
            }
            else{
                setArmor(getArmor() - (int).5*dmg);
            }
        }
        else{
            if(Math.max(getShield(), dmg) == dmg){
                dmg = dmg - getShield();
                setShield(0);
                setHealth(getHealth() - dmg);
            }
            else{
                setShield(getShield() - dmg);
            }
        }
    }

    public void fight(){
        Lucio lucio = new Lucio();
        Roadhog roadhog = new Roadhog();

        while((lucio.getHealth()>0)&&(roadhog.getHealth()>0)){

            roadhog.Damage(lucio.sonicProjectiles());
            lucio.Damage(roadhog.scrapGunBlast());

            lucio.soundBarrier();
            roadhog.wholeHog();

            System.out.print("Lucio's Health: " + lucio.getHealth() + "\n");
            System.out.print("Lucio's Ammo: " + lucio.getAmmo() + "\n");
            System.out.print("Roadhog's Health: " + roadhog.getHealth() + "\n");
            System.out.print("Roadhog's Ammo: " + roadhog.getAmmo() + "\n" + "\n");

            roadhog.Damage(lucio.soundWave());
            lucio.Damage(roadhog.scrapGunBall());

            System.out.print("Lucio's Health: " + lucio.getHealth() + "\n");
            System.out.print("Lucio's Ammo: " + lucio.getAmmo() + "\n");
            System.out.print("Roadhog's Health: " + roadhog.getHealth() + "\n");
            System.out.print("Roadhog's Ammo: " + roadhog.getAmmo() + "\n" + "\n");

            lucio.ampItUp();
            roadhog.takeABreather();

            System.out.print("Lucio's Health: " + lucio.getHealth() + "\n");
            System.out.print("Lucio's Ammo: " + lucio.getAmmo() + "\n");
            System.out.print("Roadhog's Health: " + roadhog.getHealth() + "\n");
            System.out.print("Roadhog's Ammo: " + roadhog.getAmmo() + "\n" + "\n");

            lucio.Damage(roadhog.scrapGunBlast());
            roadhog.Damage(lucio.sonicProjectiles());

            lucio.soundBarrier();
            lucio.Damage(roadhog.wholeHog());

            System.out.print("Lucio's Shield: " + lucio.getShield() + "\n");
            System.out.print("Lucio's Health: " + lucio.getHealth() + "\n");
            System.out.print("Lucio's Ammo: " + lucio.getAmmo() + "\n");
            System.out.print("Roadhog's Health: " + roadhog.getHealth() + "\n");
            System.out.print("Roadhog's Ammo: " + roadhog.getAmmo() + "\n" + "\n");

        }
    }
}
