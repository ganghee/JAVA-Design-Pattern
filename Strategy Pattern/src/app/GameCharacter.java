package app;

public class GameCharacter{
    
    //접근 점
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        //델리게이트
        if(weapon==null){
            System.out.println("맨손 공격");
        }else{
            weapon.attack();
        }
    }

}