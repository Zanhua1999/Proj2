public class OutMan {
	private int hp=0;
	private String name;
	private int power;
	public OutMan(int hp,String name,int power){
		this.name = name;
		this.hp = hp;
		this.power = power;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public int getHp(){
		return hp;
	}
	public void outManHit(LittleBoss lname,BigBoss bname){
		if(hp<=0){
			System.out.println("out die");
			return ;
		}
		else if(lname.getHp()>0){
			lname.setHp(lname.getHp()-power);
			System.out.println("Outman hit little monster, monster -hp"+power+"hp left"+lname.getHp());
		}
		else {
			bname.setHp(bname.getHp()-power);
			System.out.println("Outman hit boss, boss -hp"+power+"hp left"+lname.getHp());
		}
	}
}
