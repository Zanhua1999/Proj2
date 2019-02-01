

public class BigBoss {
	private int hp=0;
	private String name;
	private int power=0;
	public BigBoss(int hp,String name,int power){
		this.hp = hp;
		this.name = name;
		this.power = power;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return hp;
	}
	public void BigBossHit(OutMan outManName,LittleBoss little){
		if(hp<=0){
			return;
		}
		else if(little.getHp()>0){
			return;
		}
		else{
			outManName.setHp(outManName.getHp()-power);
			System.out.println("BigBoss hit outman -hp"+power+"hp left"+outManName.getHp());
		}
	}
}
