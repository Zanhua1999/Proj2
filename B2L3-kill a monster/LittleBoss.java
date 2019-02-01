public class LittleBoss {
	private int hp=0;
	private String name;
	private int power;
 	public LittleBoss(int hp,String name,int power){
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
	public void littleBossHit(OutMan outManName){
		if(hp<=0){
			return;
		}
		else{
			outManName.setHp(outManName.getHp()-power);
			System.out.println("little monster hit outman, -hp"+power+"hp left"+outManName.getHp());
		}
	}
}
