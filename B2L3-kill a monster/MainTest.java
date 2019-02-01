public class MainTest {
		public static void main(String args[]){

			MainTest GUI = new MainTest();
			GUI.init();
	}

		public void init() {
			// TODO Auto-generated method stub
			OutMan outMan = new OutMan(550, "altman", 300);
			LittleBoss little = new LittleBoss(1000, "littlemonster", 20);
			BigBoss boss = new BigBoss(2500, "Boss", 50);
			while(!(outMan.getHp()<=0|boss.getHp()<=0)){
				if(boss.getHp()>0){
					if(little.getHp()<0){
						outMan.outManHit(little, boss);
					}
					else{
						outMan.outManHit(little, boss);
					}
				}
				if(outMan.getHp()>0){
					little.littleBossHit(outMan);
					boss.BigBossHit(outMan,little);
				}
			}
			if(outMan.getHp()>0){
				System.out.println("boss die");
			}
			else{
				System.out.println("out die");
			}
		}
}
