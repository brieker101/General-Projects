public class Lucio extends Hero
{
    private static int cooldown1,
    cooldown2;

    public Lucio()
    {
        setName("Lucio");
        setHealth(200);
        setAmmo(20);
        setShield(0);
        setUltMeter(0);
    }

    //Lucio's main-fire that sends out 4 fast moving orbs
    public int sonicProjectiles(){
        if(getAmmo()==0){
            System.out.println("No ammo! Reloading!");
            crossfade();
            Reload(20);
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            if(getShield()>0){
                setShield(getShield() - 50);
                if(getShield()<0){
                    setShield(0);
                }
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
            return 0;
        }
        else{
            setAmmo(getAmmo() - 4);
            crossfade();
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            if(getShield()>0){
                setShield(getShield() - 50);
                if(getShield()<0){
                    setShield(0);
                }
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
            return 50;
        }

    }

    //Lucio's alt-fire that knocks people back
    public int soundWave(){
        if(getAmmo()==0){
            System.out.println("No ammo! Reloading!");
            Reload(20);
            crossfade();
            if(cooldown1>0){
                cooldown1--;
            }
            if(getShield()>0){
                setShield(getShield() - 50);
                if(getShield()<0){
                    setShield(0);
                }
                if(cooldown2>0){
                    cooldown2--;
                }
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
            return 0;
        }
        else{
            if(cooldown2>0){
                System.out.println("Sound wave is on cooldown! " + cooldown2 + " seconds left!");
                crossfade();
                if(cooldown1>0){
                    cooldown1--;
                }
                if(cooldown2>0){
                    cooldown2--;
                }
                if(getShield()>0){
                    setShield(getShield() - 50);
                    if(getShield()<0){
                        setShield(0);
                    }
                }
                if(getUltMeter()<100){
                    setUltMeter(getUltMeter() + 25);
                }
                return 0;
            }
            else{
                setAmmo(getAmmo() - 4);
                crossfade();
                if(cooldown1>0){
                    cooldown1--;
                }
                cooldown2 = 2;
                if(getShield()>0){
                    setShield(getShield() - 50);
                    if(getShield()<0){
                        setShield(0);
                    }
                }
                if(getUltMeter()<100){
                    setUltMeter(getUltMeter() + 25);
                }
                return 50;
            }
        }
    }

    //This ability is actually a toggle between two abilities. One is speed and the other is heal
    //I'm locking it on heal because speed doesn't really do anything in this case
    public void crossfade(){
        if(cooldown1>3){
            if(getHealth()<200){
                setHealth(getHealth() + 30);
            }
            else if (getHealth()>200){
                setHealth(200);
            }

        }
        else{
            if(getHealth()<200){
                setHealth(getHealth() + 15);
            }
            else if (getHealth()>200){
                setHealth(200);
            }
        }
        if(cooldown1>0){
            cooldown1--;
        }
        if(cooldown2>0){
            cooldown2--;
        }
        if(getShield()>0){
            setShield(getShield() - 50);
            if(getShield()<0){
                setShield(0);
            }
        }

    }

    //Enhances crossfade's effects
    public void ampItUp(){
        if(cooldown1>0){
            System.out.println("Amp it up is still on cooldown!" + cooldown1 + " seconds left.");
            crossfade();
            if(cooldown2>0){
                cooldown2--;
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
            if(getShield()>0){
                setShield(getShield() - 50);
                if(getShield()<0){
                    setShield(0);
                }
            }
        }
        else{
            cooldown1 = 6;
            crossfade();

            if(cooldown2>0){
                cooldown2--;
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
            //Checks the shield amount and corrects it every turn
            if(getShield()>0){
                setShield(getShield() - 50);
                if(getShield()<0){
                    setShield(0);
                }
            }
        }
    }

    //Gives lucio a shield that degrades quickly
    public void soundBarrier(){
        if(getUltMeter()<100){
            System.out.println("Sound Barrier isn't fully charget yet! " + getUltMeter() + "% charged.");
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
            if(getUltMeter()<100){
                setUltMeter(getUltMeter() + 25);
            }
        }
        else{
            System.out.println("Lucio drops the beat, shielding himself for 300!");
            setShield(300);
            if(cooldown1>0){
                cooldown1--;
            }
            if(cooldown2>0){
                cooldown2--;
            }
        }
    }
}
