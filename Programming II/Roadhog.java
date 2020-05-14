public class Roadhog extends Hero
{
    private static int cooldown1,
    cooldown2;
    public Roadhog()
    {
        setName("Roadhog");
        setHealth(600);
        setAmmo(4);
        setShield(0);
        setUltMeter(0);
    }
    //Both of these attacks deal up to 250. I'm nerfing the hell out of them.
    public int scrapGunBlast(){
        if(getUltMeter()<100){
            setUltMeter(getUltMeter() + 25);
        }
        if(getAmmo()==0){
            System.out.println("No ammo! Reloading!");
            Reload(4);
            return 0;
        }
        else{
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            setAmmo(getAmmo() - 1);
            return 50;
        }
    }

    public int scrapGunBall(){
        if(getUltMeter()<100){
            setUltMeter(getUltMeter() + 25);
        }
        if(getAmmo()==0){
            System.out.println("No ammo! Reloading!");
            Reload(4);
            return 0;
        }
        else{
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            setAmmo(getAmmo() - 1);
            return 50;
        }
    }

    public int chainHook(Object target){
        if(getUltMeter()<100){
            setUltMeter(getUltMeter() + 25);
        }
        if(cooldown1>0){
            System.out.println("Chain Hook is on cooldown! " + cooldown1 + " seconds left.");
            return 0;
        }
        else{
            cooldown1 = 3;
            if(cooldown2>0){
                cooldown2--;
            }
            return 50;
        }
    }

    public void takeABreather(){
        if(getUltMeter()<100){
            setUltMeter(getUltMeter() + 25);
        }
        if(cooldown2>0){
            System.out.println("Take A Breather is on cooldown! " + cooldown2 + " seconds left.");            
        }
        else{
            setHealth(getHealth() + 100);
            if(getHealth()>600){
                setHealth(600);
            }
            if(cooldown1>0){
                cooldown1--;
            }
            cooldown2 = 4;
        }
    }

    public int wholeHog(){
        if(getUltMeter()<100){
            System.out.println("Whole Hog isn't fully charget yet! " + getUltMeter() + "% charged.");
            return 0;
        }
        else{
            System.out.println("Roadhog blasts scraps of metal dealing 200 damage!");
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            setUltMeter(0);
            setAmmo(0);
            return 200;
        }
    }
}
