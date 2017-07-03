package Game;

/*public class Run {
public static void main(String args[]){
	Hero hero = new Hero();
	hero.name= "超人";
	hero.bloodCount
	hero.level
	hero.attac
	
	
	Monstar monstar = new Monstar();
	monstar.name ="哥斯拉";
	
	Weapon k = new knife();

	while (true){
		hero.attack(monstar);
		if(hero.bloodCount<=0){
			System.out.println("您输了");
		break;	
		}
		if(monstar.bloodCount<=0){
			System.out.println("您胜了");
		break;	
		}
		
		
		
	}
}
}
//动物园
//动物父类 青蛙 鱼 狗 移动方法 吃的方法
//陆生动物 水生动物两接口
//测试类  共七个文件
*/
public class Run {

	public static void main(String[] args) {
		
		Hero superman = new Hero("superman",100,1,10);
		Monstar monster=new Monstar("monster",150,5,22);
		Knife xiaoDao=new Knife();
		while(true){
			
			monster.attack(superman,xiaoDao);
			if(monster.bloodCount<0||superman.bloodCount<0){
				break;
			}
			
		}
		if(monster.bloodCount>0){
			System.out.println("你输了，重新挑战吧");
		}else{
			System.out.println("你赢了，继续冒险吧");
		}
	}

}
